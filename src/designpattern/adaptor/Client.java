package designpattern.adaptor;

/**
 * �ͻ�����
 * (�൱�������еıʼǱ���ֻ��USB�ӿ�)
 * @author lenovo
 *
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
		
		Target t = new Adapter();
		c.test1(t);
		
		Target t2 = new Adapter2(a); // δ�̳е�
		t2.handleReq();
		
	}
}
