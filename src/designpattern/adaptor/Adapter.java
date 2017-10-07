package designpattern.adaptor;

/**
 * 适配器
 * (相当于USB和PS/2的转接器)
 * @author lenovo
 * 
 */
public class Adapter extends Adaptee implements Target {
	
	@Override
	public void handleReq() {
		this.request();
	}
	
}
