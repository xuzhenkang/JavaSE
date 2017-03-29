package aop.staticproxypattern;

/**
 * 代理主题角色：内部包含对真实主题的引用，并且提供和真实主题角色相同的接口。
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
		System.out.println("唱歌：" + singname);
	}
	
	

}
