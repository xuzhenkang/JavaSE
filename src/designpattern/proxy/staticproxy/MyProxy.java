package designpattern.proxy.staticproxy;

public class MyProxy implements Sourceable {
	
	private SourceBean sourceBean;
	
	public MyProxy() {
		sourceBean = new SourceBean();
	}

	private void before() {
		System.out.println("����MyProxy��before����");
	}
	
	private void after() {
		System.out.println("����MyProxy��after����");
	}
	
	@Override
	public void method() {
		before();
		this.sourceBean.method();
		after();
	}

}
