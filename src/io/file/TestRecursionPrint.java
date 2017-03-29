package io.file;

import java.io.File;
import java.util.Scanner;

public class TestRecursionPrint {
	public static void main(String[] args) {
		File dir = getFile();
		printJavaFile(dir);
	}
	
	private static void printJavaFile(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			} else if (file.isDirectory()) {
				printJavaFile(file);
			}
		}
	}

	private static File getFile() {
		Scanner cin = new Scanner(System.in);
		System.out.println("������һ��·����");
		while (true) {
			String line = cin.nextLine();
			File dir = new File(line);
			if (!dir.exists()) {
				System.out.println("�ļ���·�������ڣ�������¼�룺");
			} else if (dir.isFile()) {
				System.out.println("��·��Ϊ�ļ���������¼�룺");
			} else {
				cin.close();
				return dir;
			}
		}
	}
}
