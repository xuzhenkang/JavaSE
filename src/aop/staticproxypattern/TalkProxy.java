package aop.staticproxypattern;

/**
 * ���������ɫ���ڲ���������ʵ��������ã������ṩ����ʵ�����ɫ��ͬ�Ľӿڡ�
 * @author lenovo
 *
 */
public class TalkProxy implements ITalk {
	
	private ITalk talker;

	public TalkProxy(ITalk talker) {
		this.talker = talker;
	}

	@Override
	public void talk(String msg) {
		talker.talk(msg);
	}
	
	public void proxyTalk(String msg, String singname) {
		talker.talk(msg);
		sing(singname);
	}

	private void sing(String singname) {
		System.out.println("���裺" + singname);
	}
	
	

}
