package ioc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = Init.getPro();
		Fruit f = Factory.getInstance(pro.getProperty("apple"));
		if (f != null) {
			f.eat();
		}
	}
}
/**
	ioc也是spring的核心之一。
	ioc的实现依赖于反射机制
*/