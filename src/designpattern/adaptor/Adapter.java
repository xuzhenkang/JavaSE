package designpattern.adaptor;

/**
 * ������
 * (�൱��USB��PS/2��ת����)
 * @author lenovo
 * 
 */
public class Adapter extends Adaptee implements Target {
	
	@Override
	public void handleReq() {
		this.request();
	}
	
}
