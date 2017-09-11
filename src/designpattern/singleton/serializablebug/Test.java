package designpattern.singleton.serializablebug;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * �������л������л�©���ƽⵥ��ģʽ
 * ����ʾ������ʽ����ģʽ���ƽ⡣
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			Singleton s1 = Singleton.getInstance();
			Singleton s2 = Singleton.getInstance();
			oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
			oos.writeObject(s1);
			ois = new ObjectInputStream(new FileInputStream("obj.txt"));
			Singleton s3 = (Singleton) ois.readObject();
			System.out.println(s1 + "\n" + s2 + "\n" + s3);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
