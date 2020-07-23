package hangman2;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class TimerTest2 extends JPanel implements Runnable {
	private long startTime;
	private final static java.text.SimpleDateFormat timerFormat = new java.text.SimpleDateFormat("mm : ss");
	private final JLabel timer = new JLabel();
	private Thread updater;
	private boolean isRunning = false;

	// 테두리 설정
	BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
	BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);

	Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);
	
	private final Runnable displayUpdater = new Runnable() {

		public void run() {
			displayElapsedTime(TimerTest2.this.startTime - System.currentTimeMillis());
			if (timer.getText().contains("00 : 00")) {
				System.out.println("확인");
				updater.interrupt();
			}
		}
	};

	private void displayElapsedTime(long elapsedTime) {
		timer.setText(timerFormat.format(new java.util.Date(elapsedTime)));
	}

	public void run() {
		try {
			while (isRunning) {
				SwingUtilities.invokeAndWait(displayUpdater);
				Thread.sleep(50);
			}
		} catch (java.lang.reflect.InvocationTargetException ite) {
			ite.printStackTrace(System.err);
			// Should never happen!
		} catch (InterruptedException ie) {
		}
		// Ignore and return!
	}

	public TimerTest2() {
		long elapsed = 0;
		if (isRunning) {
			elapsed = startTime - System.currentTimeMillis();

			isRunning = false;
			try {
				updater.join();
				// Wait for updater to finish
			} catch (InterruptedException ie) {
			}
			displayElapsedTime(elapsed);
			// Display the end-result

		} else {
			startTime = 2 * 60 * 1000 + System.currentTimeMillis();
			isRunning = true;
			updater = new Thread(this);
			updater.start();
		}
		timer.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		add(timer);
		setBorder(border);
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());
		//370 -> north1 패널 x좌표 + width 값
		//20 -> north1 패널 y좌표 값
		setBounds(370 + 250, 20, timer.getWidth()+150, timer.getHeight()+50);
	}
}














