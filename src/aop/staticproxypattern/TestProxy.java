package aop.staticproxypattern;

public class TestProxy {
	public static void main(String[] args) {
		ITalk people = new PeopleTalk("AOP", "18");
		people.talk("No Proxy Test");
		System.out.println("----------------");
		
		TalkProxy talker = new TalkProxy(people);
		talker.proxyTalk("Proxy Test", "����");
	}
}
// �����Ǿ�̬�����������ģʽ�е�proxyģʽ
// �ٴ���δ��뿴��1��Ҫʵ�ִ���ʽ������Ҫ����ӿڡ�2��ÿ��ҵ���࣬��Ҫһ�������ࡣ
// ��̬����ģʽ�����ģʽ������ؽ��ܡ���designpattern.proxy���¡�