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
 	TextField : ���� ���� �Է� - TextListener, KeyListener
 	TextArea : ���� ������ �Է�
 	Panel : Container - FlowLayout
 	
 	---------------------------------------
 	|				North : Panel(TextField, ��ư)
 	|
 	|				Center : TextArea
 	|
 	|
 	|				South : Panel(�����ư, reset, ���� + �ҷ�����)
 	----------------------------------------
 	
 	
 	
 */
public class ComponentTest_�鼺�� {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(600, 200, 400, 500);
		f.setBackground(Color.CYAN);

		Font font = new Font("gulim", Font.PLAIN, 20);

		// #1. ����
		Panel p_north = new Panel(); // �⺻ layout - FlowLayout
		p_north.setBackground(Color.GREEN);
		// #1-1. �ؽ�Ʈ �ʵ�, ��ư
		TextField tf = new TextField("", 10); // 10�� �ؽ�Ʈ�ʵ��� ���̸� ������ �� ���� �Ű�����
												// ������ FlowLayout�� ���󰡱� ������ �ʺ� �������� ���Ѵ�.
												// ������ ũ�⳪ ��Ʈ ������ �÷������� �����ϰ� ������ �ʴ´�.

		Button btn = new Button("�Է�");
		btn.setEnabled(false); // ��ư�� ���� ����(click)�� ��Ȱ��ȭ ��Ű�ڴ�. ó������ �ƹ��� ���ڰ� �Էµ��� �ʱ⶧����

		p_north.add(tf);
		p_north.add(btn);
		p_north.setFont(font);

		// #2. �߾�
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY); // ���� ��ũ�ѹٸ� �����ϰڴ�.
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false); // ����ڿ� ���� �����Ұ�!

		// #3. ����
		Panel p_south = new Panel();
		p_south.setFont(font);
		p_south.setBackground(Color.MAGENTA);

		Button btnSave = new Button("����");
		Button btnReset = new Button("�ʱ�ȭ");
		Button btnClose = new Button("�ݱ�");
		Button btnOpen = new Button("�ҷ�����");

		p_south.add(btnOpen);
		p_south.add(btnSave);
		p_south.add(btnReset);
		p_south.add(btnClose);

		// #4. ����ǰ ���̱�
		f.add(p_north, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(p_south, BorderLayout.SOUTH);

		f.setVisible(true);
		f.setResizable(false); // Frame�� ������ �������� ���ڴ�

		// #5. �̺�Ʈ ��
		// #5-1. tf �����Է��� �����Ǹ�.. tf���� ���ڿ��� get�� ����.
		// �ش� ������ "" ���ڿ��� �׷��� �ʴ� ���� ��������
		// ���ڿ��� �ƴϸ�, ��ư�� Ȱ��ȭ ����
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().equals("")) { // tf�� ��¥�� �����
					btn.setEnabled(false);

				} else {
					btn.setEnabled(true);
				}
			}
		});
		// #5-2. tf�� ���Ͱ��� �����Ǹ�, ta(TextArea)�� ������ �߰�����!
		// �̶�, ���Ͱ����� �߰��� �ؾ� �����ٷ� �ٲ�� �ȴ�.
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// 1.Ű���带 ������ �̺�Ʈ�� �߻��� �ȴ�!
				// 2.�׷� � Ű���带 �������� e ��ü���� ������� �Ѵ�.
				// 3.���� Ű���尪���� ��Ī�Ǿ� �ִ� �����, e��ü�� ������ ���� ������
				// (e��ü�� ������ �� : ���� == ���Ϳ� ��Ī�Ǿ� �ִ� ����� ��)
				// 4.tf�� ���ڸ� �����ͼ� ta ��ü�� �߰� ��Ű��(�߰��Ҷ� \n���� ����)
				// 5.�� ��, tf�� ������ ������!

				// �ѱ��� ������ ��� �̺�Ʈ �߻�
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					// append �߰��ϴ�
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
					// tf�� Ŀ���� �ٽ� �ű���!
					tf.requestFocus();
				}

			}
		});

		// �ݱ� ��ư
		// �ݱ� ���� "����?" �����!
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!ta.getText().equals("")) {
					int select = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION);
					if (select == 0) {
						try {
							FileDialog fd = new FileDialog(f, "����", FileDialog.SAVE);
							fd.setVisible(true); // ���� �ش� ������ ������ ��! ���� ������ �����Ѵ�!

							// ������� ���ϸ�
							String path = fd.getDirectory() + fd.getFile(); // path ��θ� ����
							String msg = ta.getText();

							if (!msg.equals("")) {
								// ���� ������ path�� ���⸦ �ؾ� �ϴµ�...
								// �ѱ� ���� ���� ������,, char ��Ʈ���� �̿��� ����!
								FileWriter fw = new FileWriter(path);
								BufferedWriter bw = new BufferedWriter(fw);

								bw.write(msg);

								if (fd.getFile() != null) {
									JOptionPane.showMessageDialog(f, path + "\n��ο� ���� ����");
								}
								bw.flush(); // bw�� �ִ� ��� ������ �����!
								// Ȥ�� ���� �ʰ� �뷮 ������ �� "����" �� ���� ���� �ִ�!
								// ���ۿ� ���� �ִٸ�, ��� ���ڸ� ���Ͽ� "����" ����
								if (bw != null)
									bw.close();
								if (fw != null)
									fw.close();
							}
						} catch (IOException e1) {
							e1.printStackTrace();
						}

					} else {
						JOptionPane.showMessageDialog(f, "�����մϴ�");
						System.exit(0);
					}
				} else {
					System.exit(0);
				}
			}
		});

		// �����ư
		// 1. ta�� �ִ� ��� ���ڸ� ������ ����!
		// 2. ������ ��θ� ����� -> FileDialog �����̳� ���
		// 3. ��������� -> ����Ʈ��Ʈ��(x) --> char ��Ʈ��(���ڿ� ���� ��Ʈ��)
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f, "����", FileDialog.SAVE);
					fd.setVisible(true); // ���� �ش� ������ ������ ��! ���� ������ �����Ѵ�!

					// ������� ���ϸ�
					String path = fd.getDirectory() + fd.getFile(); // path ��θ� ����
					String msg = ta.getText();

					if (!msg.equals("")) {
						// ���� ������ path�� ���⸦ �ؾ� �ϴµ�...
						// �ѱ� ���� ���� ������,, char ��Ʈ���� �̿��� ����!
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);

						bw.write(msg);

						if (fd.getFile() != null) {
							JOptionPane.showMessageDialog(f, path + "\n��ο� ���� ����");
						}
						bw.flush(); // bw�� �ִ� ��� ������ �����!
									// Ȥ�� ���� �ʰ� �뷮 ������ �� "����" �� ���� ���� �ִ�!
									// ���ۿ� ���� �ִٸ�, ��� ���ڸ� ���Ͽ� "����" ����
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
		// btnReset �̺�Ʈ ó��
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!ta.getText().equals("")) {
					ta.setText("");
				}
			}
		});

		// btnOpen ��ư
		btnOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
					fd.setVisible(true);

					String path = fd.getDirectory() + fd.getFile();
					//System.out.println(fd.getDirectory());

					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);

					if (fd.getFile() != null) {
						JOptionPane.showMessageDialog(f, path + "\n����� ������ �ҷ��ɴϴ�.");
					}

					String tmp = "", msg = "";
					while ((tmp = br.readLine()) != null) {
						// System.out.println(tmp);
						msg += tmp + "\n";
					}
					// System.out.println(msg);
					ta.setText(msg.trim());
					/*
					 * int temp = 0; while((temp = br.read()) != -1) { //br�� char Stream�̶� �����ϴ�!
					 * String msg = (char)temp //(char) ����ȯ!!! �ѱ۾ȱ�����! }
					 */

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		f.addWindowListener(new WindowAdapter() {
			// X��ư�� ������, ���α׷� ���� --> �̰� �ϱ��� "����"�� �ؾ��Ѵ�!
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
