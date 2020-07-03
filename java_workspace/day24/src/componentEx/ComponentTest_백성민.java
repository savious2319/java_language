package componentEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/*
 	TextField : 문장 한줄 입력 - TextListener, KeyListener
 	TextArea : 문장 여러줄 입력
 	Panel : Container - FlowLayout
 	
 	---------------------------------------
 	|				North : Panel(TextField, 버튼)
 	|
 	|				Center : TextArea
 	|
 	|
 	|				South : Panel(저장버튼, reset, 종료 + 불러오기)
 	----------------------------------------
 	
 	
 	
 */
public class ComponentTest_백성민 {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(600, 200, 400, 500);
		f.setBackground(Color.CYAN);

		Font font = new Font("gulim", Font.PLAIN, 20);

		// #1. 북쪽
		Panel p_north = new Panel(); // 기본 layout - FlowLayout
		p_north.setBackground(Color.GREEN);
		// #1-1. 텍스트 필드, 버튼
		TextField tf = new TextField("", 10); // 10은 텍스트필드의 길이를 조절할 때 쓰는 매개변수
												// 지금은 FlowLayout을 따라가기 때문에 너비를 조절하진 못한다.
												// 글자의 크기나 폰트 등으로 컬럼갯수가 일정하게 잡히진 않는다.

		Button btn = new Button("입력");
		btn.setEnabled(false); // 버튼의 누름 동작(click)을 비활성화 시키겠다. 처음에는 아무런 문자가 입력되지 않기때문에

		p_north.add(tf);
		p_north.add(btn);
		p_north.setFont(font);

		// #2. 중앙
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY); // 수직 스크롤바만 지원하겠다.
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false); // 사용자에 의해 수정불가!

		// #3. 남쪽
		Panel p_south = new Panel();
		p_south.setFont(font);
		p_south.setBackground(Color.MAGENTA);

		Button btnSave = new Button("저장");
		Button btnReset = new Button("초기화");
		Button btnClose = new Button("닫기");
		Button btnOpen = new Button("불러오기");

		p_south.add(btnOpen);
		p_south.add(btnSave);
		p_south.add(btnReset);
		p_south.add(btnClose);

		// #4. 구성품 붙이기
		f.add(p_north, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(p_south, BorderLayout.SOUTH);

		f.setVisible(true);
		f.setResizable(false); // Frame의 사이즈 재조정을 막겠다

		// #5. 이벤트 단
		// #5-1. tf 글자입력이 감지되면.. tf에서 문자열을 get한 다음.
		// 해당 내용을 "" 빈문자열과 그렇지 않는 경우로 구분하자
		// 빈문자열이 아니면, 버튼을 활성화 하자
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().equals("")) { // tf의 글짜를 갖고와
					btn.setEnabled(false);

				} else {
					btn.setEnabled(true);
				}
			}
		});
		// #5-2. tf에 엔터값이 감지되면, ta(TextArea)에 내용을 추가하자!
		// 이때, 엔터값까지 추가를 해야 다음줄로 바뀌게 된다.
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// 1.키보드를 누르는 이벤트가 발생이 된다!
				// 2.그럼 어떤 키보드를 눌렀는지 e 객체에게 물어봐야 한다.
				// 3.이후 키보드값으로 매칭되어 있는 상수와, e객체로 가져온 값을 비교하자
				// (e객체로 가져온 값 : 엔터 == 엔터와 매칭되어 있는 상수값 비교)
				// 4.tf의 문자를 가져와서 ta 객체에 추가 시키자(추가할때 \n까지 포함)
				// 5.그 후, tf에 내용을 지우자!

				// 한글자 단위로 계속 이벤트 발생
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					// append 추가하다
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}

			}
		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!tf.getText().equals("")) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
					// tf로 커서를 다시 옮기자!
					tf.requestFocus();
				}

			}
		});

		// 닫기 버튼
		// 닫기 전에 "저장?" 물어보자!
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!ta.getText().equals("")) {
					int select = JOptionPane.showConfirmDialog(f, "저장하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
					if (select == 0) {
						try {
							FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
							fd.setVisible(true); // 먼저 해당 내용을 보여준 뒤! 하위 내용을 시작한다!

							// 상위경로 파일명
							String path = fd.getDirectory() + fd.getFile(); // path 경로를 만듬
							String msg = ta.getText();

							if (!msg.equals("")) {
								// 위에 지정된 path에 쓰기를 해야 하는데...
								// 한글 깨짐 등의 문제로,, char 스트림을 이용해 적자!
								FileWriter fw = new FileWriter(path);
								BufferedWriter bw = new BufferedWriter(fw);

								bw.write(msg);

								if (fd.getFile() != null) {
									JOptionPane.showMessageDialog(f, path + "\n경로에 저장 성공");
								}
								bw.flush(); // bw에 있는 모든 내용을 비워라!
								// 혹시 버퍼 초과 용량 때문에 다 "쓰기" 를 못할 수도 있다!
								// 버퍼에 남아 있다면, 모든 문자를 파일에 "쓰기" 하자
								if (bw != null)
									bw.close();
								if (fw != null)
									fw.close();
							}
						} catch (IOException e1) {
							e1.printStackTrace();
						}

					} else {
						JOptionPane.showMessageDialog(f, "종료합니다");
						System.exit(0);
					}
				} else {
					System.exit(0);
				}
			}
		});

		// 저장버튼
		// 1. ta에 있는 모든 글자를 저장해 놓자!
		// 2. 저장할 경로를 물어보자 -> FileDialog 컨테이너 사용
		// 3. 파일입출력 -> 바이트스트림(x) --> char 스트림(문자열 전용 스트림)
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
					fd.setVisible(true); // 먼저 해당 내용을 보여준 뒤! 하위 내용을 시작한다!

					// 상위경로 파일명
					String path = fd.getDirectory() + fd.getFile(); // path 경로를 만듬
					String msg = ta.getText();

					if (!msg.equals("")) {
						// 위에 지정된 path에 쓰기를 해야 하는데...
						// 한글 깨짐 등의 문제로,, char 스트림을 이용해 적자!
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);

						bw.write(msg);

						if (fd.getFile() != null) {
							JOptionPane.showMessageDialog(f, path + "\n경로에 저장 성공");
						}
						bw.flush(); // bw에 있는 모든 내용을 비워라!
									// 혹시 버퍼 초과 용량 때문에 다 "쓰기" 를 못할 수도 있다!
									// 버퍼에 남아 있다면, 모든 문자를 파일에 "쓰기" 하자
						if (bw != null)
							bw.close();
						if (fw != null)
							fw.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		// btnReset 이벤트 처리
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!ta.getText().equals("")) {
					ta.setText("");
				}
			}
		});

		// btnOpen 버튼
		btnOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
					fd.setVisible(true);

					String path = fd.getDirectory() + fd.getFile();
					//System.out.println(fd.getDirectory());

					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);

					if (fd.getFile() != null) {
						JOptionPane.showMessageDialog(f, path + "\n경로의 파일을 불러옵니다.");
					}

					String tmp = "", msg = "";
					while ((tmp = br.readLine()) != null) {
						// System.out.println(tmp);
						msg += tmp + "\n";
					}
					// System.out.println(msg);
					ta.setText(msg.trim());
					/*
					 * int temp = 0; while((temp = br.read()) != -1) { //br이 char Stream이라서 가능하다!
					 * String msg = (char)temp //(char) 형변환!!! 한글안깨진다! }
					 */

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		f.addWindowListener(new WindowAdapter() {
			// X버튼을 누를때, 프로그램 종료 --> 이거 하기전 "저장"을 해야한다!
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
