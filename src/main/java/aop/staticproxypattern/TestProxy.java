package aop.staticproxypattern;

public class TestProxy {
	public static void main(String[] args) {
		ITalk people = new PeopleTalk("AOP", "18");
		people.talk("No Proxy Test");
		System.out.println("----------------");
		
		TalkProxy talker = new TalkProxy(people);
		talker.proxyTalk("Proxy Test", "代理");
	}
}
// 以上是静态代理：就是设计模式中的proxy模式
// 再从这段代码看：1、要实现代理方式，必须要定义接口。2、每个业务类，需要一个代理类。
// 静态代理模式在设计模式中有相关介绍。在designpattern.proxy包下。