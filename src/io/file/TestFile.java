package io.file;

import java.io.File;
import java.io.FilenameFilter;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("D:/");
		String[] list = f.list(new FilenameFilter() { // Ê¹ÓÃ¹ýÂËÆ÷
			
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".txt"))
					return true;
				else return false;
			}
		});
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

	@SuppressWarnings("unused")
	private static void method2() {
		File f = new File("D:/");
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			if (file.isFile() && file.getName().endsWith(".txt")) {
				System.out.println(file);
			}
		}
	}

	@SuppressWarnings("unused")
	private static void method1() {
		File f = new File("D:/");
		String[] list = f.list();
		for (String filename : list) {
			if (filename.endsWith(".txt")) {
				System.out.println(filename);
			}
		}
	}

	@SuppressWarnings("unused")
	private static void demo1() {
		File f = new File("C:/");
		for (String filename : f.list()) {
			System.out.println(filename);
		}
		System.out.println("=======================");
		for (File file : f.listFiles()) {
			System.out.println(file);
		}
	}
}
