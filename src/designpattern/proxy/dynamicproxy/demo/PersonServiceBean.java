package designpattern.proxy.dynamicproxy.demo;

public class PersonServiceBean implements PersonService {
	// 业务需求，拦截该业务bean里面的所有方法， 判断
	// 如果用户user是否为null，如果是null，则无权限调用该业务bean里面的方法，如果user不是null，则有权限调用。
	private String user = null;

	public PersonServiceBean() {
	}
	
	public PersonServiceBean(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	@Override
	public void save(String name) {
		System.out.println("我是save()方法");
	}

	@Override
	public void update(String name, Integer personid) {
		System.out.println("我是update()方法");
	}

	@Override
	public String getPersonName(Integer personid) {
		System.out.println("我是getPersonName()方法");
		return "xxx";
	}

}
