package designpattern.proxy.staticproxy;

public class MyProxy implements Sourceable {
	
	private SourceBean sourceBean;
	
	public MyProxy() {
		sourceBean = new SourceBean();
	}

	private void before() {
		System.out.println("我是MyProxy的before方法");
	}
	
	private void after() {
		System.out.println("我是MyProxy的after方法");
	}
	
	@Override
	public void method() {
		before();
		this.sourceBean.method();
		after();
	}

}
