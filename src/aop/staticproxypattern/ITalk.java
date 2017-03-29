package aop.staticproxypattern;

/**
 * 抽象主题角色：声明了真实主题和代理主题的共同接口。
 * @author lenovo
 *
 */
public interface ITalk {
	public void talk(String msg);
}
