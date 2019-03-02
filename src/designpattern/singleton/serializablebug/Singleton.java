package designpattern.singleton.serializablebug;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	/*反序列化对象*/
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
