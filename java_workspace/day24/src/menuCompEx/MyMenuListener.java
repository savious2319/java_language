package menuCompEx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		// System.out.println(e.getActionCommand());
		// "프린트 설정" "닫기"
		switch (e.getActionCommand()) {
		case "닫기":
			System.exit(0);
			break;

		case "프린트 설정":
			System.out.println("프린트설정화면 이동");
			break;
		}

	}

}
