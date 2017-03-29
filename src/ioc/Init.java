package ioc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Init {
	public static Properties getPro() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		File f = new File("iocFolder/fruit.properties");
		if (f.exists()) {
			pro.load(new FileInputStream(f));
		} else {
			pro.setProperty("apple", "ioc.Apple");
			pro.setProperty("orange", "ioc.Orange");
			pro.setProperty("banana", "ioc.Banana");
			pro.store(new FileOutputStream(f), "FRUIT CLASS");
		}
		return pro;
	}
}
