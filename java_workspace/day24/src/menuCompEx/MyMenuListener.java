package menuCompEx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		// System.out.println(e.getActionCommand());
		// "����Ʈ ����" "�ݱ�"
		switch (e.getActionCommand()) {
		case "�ݱ�":
			System.exit(0);
			break;

		case "����Ʈ ����":
			System.out.println("����Ʈ����ȭ�� �̵�");
			break;
		}

	}

}
