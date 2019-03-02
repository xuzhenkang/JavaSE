package designpattern.proxy.staticproxy;

public class SourceBean implements Sourceable {

	@Override
	public void method() {
		System.out.println("我是SourceBean的method方法！");
	}

}
