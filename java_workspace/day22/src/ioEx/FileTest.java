package ioEx;

import java.io.File;

/*
 	File Ŭ����
 		-������
 		-���� �޼���
 		
 */
public class FileTest {

	public static void main(String[] args) {

		String path = "C:\\";
		path = "z:\\GB_0900_05_BSM(�ٸ� ������ ���� ���������ּ���)\\java_language\\java_memo";
		File f = new File(path);
		if (f.exists()) {
			System.out.println(f.isDirectory()); // ������?
			System.out.println(f.isFile()); // �����̴�?
			System.out.println(f.getPath());
			System.out.println(f.getName()); // �ش� ����� ������ ��ġ �̸��� ������ �ش�
			System.out.println(f.getAbsolutePath());
		} else {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�");
			System.exit(0); // �� ���α׷��� �޸𸮿��� ���� ����
		}
	}

}
