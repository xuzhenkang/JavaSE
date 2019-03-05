package aop.dynamicproxypattern;

public class TestProxy {
	public static void main(String[] args) {
        // 绑定代理，这种方式会在所有的方法都加上切面方法
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("Proxy Test", "代理"));
        iTalk.talk("业务说明");
    }
}
/**
	动态代理模式在设计模式中有相关介绍。在designpattern.proxy包下。
*/