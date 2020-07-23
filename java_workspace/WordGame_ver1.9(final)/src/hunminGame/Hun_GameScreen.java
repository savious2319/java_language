package hunminGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import main.Login;

@SuppressWarnings("serial")
public class Hun_GameScreen extends JFrame implements Runnable{

	private static final Border Border = null;
	private ImageIcon img_bubble;
	private ImageIcon img_player;
	private ImageIcon img_life;
	private ImageIcon img_box;
	private ImageIcon img_clock;
	private ImageIcon img_inputBtn;
	private ImageIcon img_inputBox;
	private ImageIcon img_gameStart;
	private ImageIcon img_chage;

	private JPanel west;
	private JLabel [] w_i_life;
	private JLabel w_i_bubble;
	private JLabel [] w_answers;
	private JLabel w_i_textBox;
	private JTextField w_tf;
	private JButton w_btn_input;
	private JLabel w_i_player;
	
	private JPanel east;
	private JLabel [] e_i_life;
	private JLabel e_i_bubble;
	private JLabel [] e_answers;
	private JLabel e_i_textBox;
	private JTextField e_tf;
	private JButton e_btn_input;
	private JLabel e_i_player;

	private JPanel center;
	private JLabel c_theme;
	private JLabel c_i_box;
	private JButton c_btn_gameStart;
	private JButton c_btn_chage;
	private JLabel c_i_clock;
	private JLabel c_time;
	private JLabel c_whoTurn;
	
	Thread thread = new Thread(this);
	
	public Hun_GameScreen(Question q) {
		
		
		//이미지파일들 추가 ====================================================================
		img_bubble = new ImageIcon("src\\image\\말풍선.png");
		img_player = new ImageIcon("src\\image\\사람.png");
		img_life = new ImageIcon("src\\image\\하트.png");
		img_box = new ImageIcon("src\\image\\네모.png");
		img_clock = new ImageIcon("src\\image\\시계.png");
		img_inputBtn = new ImageIcon("src\\image\\입력버튼.png");
		img_inputBox = new ImageIcon("src\\image\\텍스트상자.png");
		img_gameStart = new ImageIcon("src\\image\\시작하기버튼.png");
		img_chage = new ImageIcon("src\\image\\새로고침.png");
		
		
		
		
		//프레임설정 ===========================================================================
		setTitle("훈민정음 게임");
		setSize(807, 500);
		setLocationRelativeTo(null);	//모니터 중앙에 팝업
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//기본 종료
		setVisible(true);
		setResizable(false);
		setLayout(null);
		
		
		
		//패널 =================================================================================
		//west설계 --------------------------------------------------------------
		west = new JPanel();
		west.setLayout(null);
		west.setBackground(Color.WHITE);
		west.setBounds(0, 0, 250, 470);
		//west목숨이미지
		w_i_life = new JLabel[3];
		for(int i = 0 ; i < w_i_life.length; i++) {
			w_i_life[i] = new JLabel(img_life);
			w_i_life[i].setBounds(10 + 60*i, 10, 55, 50);
			west.add(w_i_life[i]);
		}
		//west말풍선
		w_answers = new JLabel[3];
		w_answers[0] = new JLabel("");
		w_answers[0].setFont(new Font("굴림",Font.BOLD, 20));
		w_answers[0].setBounds(105, 80, 100, 100);
		w_answers[1] = new JLabel("");
		w_answers[1].setFont(new Font("굴림",Font.BOLD, 20));
		w_answers[1].setBounds(105, 105, 100, 100);
		w_answers[2] = new JLabel("");
		w_answers[2].setFont(new Font("굴림",Font.BOLD, 20));
		w_answers[2].setBounds(105, 130, 100, 100);
		w_i_bubble = new JLabel(img_bubble);
		w_i_bubble.setBounds(25, 60, 200, 200);
		//west사람이미지
		w_i_player = new JLabel(img_player);
		w_i_player.setBounds(25, 220, 200, 200);
		//west텍스트필드, 입력버튼
		w_tf = new JTextField("", 10);
		w_tf.setBorder(Border);
		w_tf.setFont(new Font("굴림",Font.BOLD, 20));
		w_tf.setBounds(35, 425, 130, 25);
		w_tf.setEnabled(false);
		w_i_textBox = new JLabel(img_inputBox);
		w_i_textBox.setBounds(25, 420, 150, 35);
		w_btn_input = new JButton(img_inputBtn);
		w_btn_input.setContentAreaFilled(false);
		w_btn_input.setBorderPainted(false);		//버튼 배경 테두리 없애기
		w_btn_input.setBounds(180, 423, 67, 37);
		w_btn_input.setEnabled(false);
		//west구성품 add
		west.add(w_answers[0]);
		west.add(w_answers[1]);
		west.add(w_answers[2]);
		west.add(w_i_textBox);
		west.add(w_tf);
		west.add(w_btn_input);
		west.add(w_i_bubble);
		west.add(w_i_player);
		
		//east설계 --------------------------------------------------------------
		east = new JPanel();
		east.setLayout(null);
		east.setBackground(Color.WHITE);
		east.setBounds(550, 0, 250, 470);
		//east목숨이미지
		e_i_life = new JLabel[3];
		for(int i = 0 ; i < e_i_life.length; i++) {
			e_i_life[i] = new JLabel(img_life);
			e_i_life[i].setBounds(65 + 60*i, 10, 55, 50);
			east.add(e_i_life[i]);
		}
		//east말풍선
		e_answers = new JLabel[3];
		e_answers[0] = new JLabel("");
		e_answers[0].setFont(new Font("굴림",Font.BOLD, 20));
		e_answers[0].setBounds(105, 80, 100, 100);
		e_answers[1] = new JLabel("");
		e_answers[1].setFont(new Font("굴림",Font.BOLD, 20));
		e_answers[1].setBounds(105, 105, 100, 100);
		e_answers[2] = new JLabel("");
		e_answers[2].setFont(new Font("굴림",Font.BOLD, 20));
		e_i_bubble = new JLabel(img_bubble);
		e_i_bubble.setBounds(30, 60, 200, 200);
		e_answers[2].setBounds(105, 130, 100, 100);
		//east사람이미지
		e_i_player = new JLabel(img_player);
		e_i_player.setBounds(30, 220, 200, 200);
		//east텍스트필드, 입력버튼
		e_tf = new JTextField("", 10);
		e_tf.setBorder(Border);
		e_tf.setBounds(585, 425, 130, 25);
		e_tf.setFont(new Font("굴림",Font.BOLD, 20));
		e_tf.setEnabled(false);
		e_i_textBox = new JLabel(img_inputBox);
		e_i_textBox.setBounds(25, 420, 150, 35);
		e_btn_input = new JButton(img_inputBtn);
		e_btn_input.setContentAreaFilled(false);
		e_btn_input.setBorderPainted(false);
		e_btn_input.setBounds(729, 423, 67, 37);
		e_btn_input.setEnabled(false);
		//east구성품 add
		east.add(e_answers[0]);
		east.add(e_answers[1]);
		east.add(e_answers[2]);
		east.add(e_i_textBox);
		add(e_tf);
		add(e_btn_input);
		east.add(e_i_bubble);
		east.add(e_i_player);
		
		//center설계 ------------------------------------------------------------
		center = new JPanel();
		center.setLayout(null);
		center.setBackground(Color.WHITE);
		center.setBounds(250, 0, 300, 470);
		//center단어제시
		c_theme = new JLabel(q.theme);
		c_theme.setFont(new Font("굴림",Font.BOLD, 40));
		c_theme.setBounds(105, 60, 150, 150);
		c_i_box = new JLabel(img_box);
		c_i_box.setBounds(0, 40, 300, 200);
		//게임시작버튼
		c_btn_gameStart = new JButton(img_gameStart);
		c_btn_gameStart.setBounds(24, 220, 250, 150);
		c_btn_gameStart.setBorderPainted(false);
		c_btn_gameStart.setContentAreaFilled(false);
		c_btn_gameStart.setFocusPainted(false);
		//단어바꾸기버튼
		c_btn_chage = new JButton(img_chage);
		c_btn_chage.setBounds(100, 0, 100, 70);
//		c_btn_chage.setBorderPainted(false);
		c_btn_chage.setContentAreaFilled(false);
		c_btn_chage.setFocusPainted(false);
		//타이머
		c_time = new JLabel();
		c_i_clock = new JLabel(img_clock);
		c_i_clock.setBounds(52, 200, 200, 200);
		//차례표시
		c_whoTurn = new JLabel("");
		c_whoTurn.setBounds(90, 300, 200, 200);
		c_whoTurn.setFont(new Font("굴림",Font.BOLD, 20));
		c_whoTurn.setForeground(Color.GRAY);
		//center구성품 add
		center.add(c_theme);
		center.add(c_btn_gameStart);
		center.add(c_btn_chage);
		center.add(c_time);
		center.add(c_whoTurn);
		center.add(c_i_box);
		
		
		
		//이벤트처리 ===========================================================================
		//west이벤트 --------------------------------------------------------------
		w_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				boolean westCheck = q.Check(q.consonant_1, q.consonant_2, w_tf.getText());
				
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					if(westCheck && q.answers.add(w_tf.getText())) {
						q.answers.add(w_tf.getText());
						GameStart.p1.p_answers.add(w_tf.getText());
						w_answers[2].setText(GameStart.p1.p_answers.get(GameStart.p1.p_answers.size()-1));
						w_answers[1].setText(GameStart.p1.p_answers.get(GameStart.p1.p_answers.size()-2));
						w_answers[0].setText(GameStart.p1.p_answers.get(GameStart.p1.p_answers.size()-3));
						GameStart.whoTurn = !GameStart.whoTurn;
						GameStart.tCount = 10;
					}else {
						decreaselife();
					}
					w_tf.setText("");
				}
			}
		});
		w_btn_input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean westCheck = q.Check(q.consonant_1, q.consonant_2, w_tf.getText());
				
				if(!w_tf.getText().equals("")) {
					w_btn_input.setEnabled(true);
					if(westCheck && q.answers.add(w_tf.getText())) {
						q.answers.add(w_tf.getText());
						GameStart.p1.p_answers.add(w_tf.getText());
						w_answers[2].setText(GameStart.p1.p_answers.get(GameStart.p1.p_answers.size()-1));
						w_answers[1].setText(GameStart.p1.p_answers.get(GameStart.p1.p_answers.size()-2));
						w_answers[0].setText(GameStart.p1.p_answers.get(GameStart.p1.p_answers.size()-3));
						GameStart.whoTurn = !GameStart.whoTurn;
						GameStart.tCount = 10;
					}else {
						decreaselife();
					}
					w_tf.setText("");
				}
			}
		});		
		//east이벤트 --------------------------------------------------------------
		e_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				boolean eastCheck = q.Check(q.consonant_1, q.consonant_2, e_tf.getText());
				
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					if(eastCheck && q.answers.add(e_tf.getText())) {
						q.answers.add(e_tf.getText());
						GameStart.p2.p_answers.add(e_tf.getText());
						e_answers[2].setText(GameStart.p2.p_answers.get(GameStart.p2.p_answers.size()-1));
						e_answers[1].setText(GameStart.p2.p_answers.get(GameStart.p2.p_answers.size()-2));
						e_answers[0].setText(GameStart.p2.p_answers.get(GameStart.p2.p_answers.size()-3));
						GameStart.tCount = 10;
						GameStart.whoTurn = !GameStart.whoTurn;
					}else {
						decreaselife();
					}
					e_tf.setText("");
				}
			}
		});		
		e_btn_input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean eastCheck = q.Check(q.consonant_1, q.consonant_2, e_tf.getText());
				
				if(!e_tf.getText().equals("")) {
					e_btn_input.setEnabled(true);
					if(eastCheck && q.answers.add(e_tf.getText())) {
						q.answers.add(e_tf.getText());
						GameStart.p2.p_answers.add(e_tf.getText());
						e_answers[2].setText(GameStart.p2.p_answers.get(GameStart.p2.p_answers.size()-1));
						e_answers[1].setText(GameStart.p2.p_answers.get(GameStart.p2.p_answers.size()-2));
						e_answers[0].setText(GameStart.p2.p_answers.get(GameStart.p2.p_answers.size()-3));
						GameStart.whoTurn = !GameStart.whoTurn;
						GameStart.tCount = 10;
					}else {
						decreaselife();
					}
					e_tf.setText("");
				}
			}
		});		
		//center이벤트 ------------------------------------------------------------
		c_btn_chage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q.newQuestion();
				c_theme.setText(q.theme);
			}
		});
		c_btn_gameStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				center.add(c_i_clock);
				thread.start();
				c_btn_gameStart.setVisible(false);
				c_btn_chage.setVisible(false);
				center.remove(c_btn_gameStart);
				center.remove(c_btn_chage);
			}
		});
		
		
		
		//프레임에 패널 추가 ====================================================================
		add(west);
		add(east);
		add(center);
		
	}//end_constructor
	
	
	
	//1초단위 프레임제어
	@Override
	public void run() {
		
		StringBuffer stb = new StringBuffer();
		c_time.setFont(new Font("굴림",Font.BOLD, 30));
		c_time.setBounds(140, 250, 100, 100);
		
		while(true) {
			//게임 종료 제어
			if(GameStart.whoTurn) {
				if(GameStart.p1.life <= 0) {
					JOptionPane.showMessageDialog(null, "player2님 승리!");
					dispose();
					main.Member.hunmin_play++;
					new Hun_MainScreen();
					reset();
					break;
				}
				stb = new StringBuffer(Login.nickname + "님 차례");
				c_whoTurn.setText(stb.toString());
				e_tf.setEnabled(false);
				e_btn_input.setEnabled(false);
				w_btn_input.setEnabled(true);
				w_tf.setEnabled(true);
				w_tf.requestFocus();
			}else {
				if(GameStart.p2.life <= 0) {
					JOptionPane.showMessageDialog(null, Login.nickname + "님 승리!");
					dispose();
					main.Member.hunmin_play++;
					main.Member.hunmin_win++;
					new Hun_MainScreen();
					reset();
					break;
				}
				stb = new StringBuffer("player2님의 차례");
				c_whoTurn.setText(stb.toString());
				w_tf.setEnabled(false);
				w_btn_input.setEnabled(false);
				e_btn_input.setEnabled(true);
				e_tf.setEnabled(true);
				e_tf.requestFocus();
			}
			
			if(GameStart.tCount == 0) {
				decreaselife();
				GameStart.tCount = 10;
			}
			GameStart.tCount--;
			
			
			stb = new StringBuffer(String.valueOf(GameStart.tCount));
			c_time.setText(stb.toString());
			c_time.setForeground(Color.GRAY);
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		}
		
	}
	
	//라이프감소 메서드
	private void decreaselife() {
		if(GameStart.whoTurn) {
			if(GameStart.p1.life == 3) {
				w_i_life[2].setVisible(false);
			}else if(GameStart.p1.life == 2) {
				w_i_life[1].setVisible(false);
			}else {
				w_i_life[0].setVisible(false);
			}
			GameStart.p1.life--;
		}else {
			if(GameStart.p2.life == 3) {
				e_i_life[2].setVisible(false);
			}else if(GameStart.p2.life == 2) {
				e_i_life[1].setVisible(false);
			}else {
				e_i_life[0].setVisible(false);
			}
			GameStart.p2.life--;
		}
		GameStart.tCount = 10;
	}
	
	//게임종료후 초기화 메서드
	private void reset() {
		GameStart.p1.life = 3;
		GameStart.p2.life = 3;
		GameStart.p1.p_answers.removeAll(GameStart.p1.p_answers);
		GameStart.p2.p_answers.removeAll(GameStart.p2.p_answers);
		GameStart.p1.p_answers.add("");
		GameStart.p1.p_answers.add("");
		GameStart.p2.p_answers.add("");
		GameStart.p2.p_answers.add("");
		GameStart.tCount = 10;
	}
	
}
