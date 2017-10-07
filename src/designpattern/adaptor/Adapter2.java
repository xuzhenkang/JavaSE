package designpattern.adaptor;

public class Adapter2 implements Target {
	
	private Adaptee adaptee;

	@Override
	public void handleReq() {
		adaptee.request();
	}

	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
}
