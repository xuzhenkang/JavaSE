package designpattern.proxy.dynamicproxy.cglib;

public class PersonServiceBean {
	// ҵ���������ظ�ҵ��bean��������з����� �ж�
	// ����û�user�Ƿ�Ϊnull�������null������Ȩ�޵��ø�ҵ��bean����ķ��������user����null������Ȩ�޵��á�
	private String user = null;

	public PersonServiceBean() {
	}
	
	public PersonServiceBean(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void save(String name) {
		System.out.println("����save()����");
	}

	public void update(String name, Integer personid) {
		System.out.println("����update()����");
	}

	public String getPersonName(Integer personid) {
		System.out.println("����getPersonName()����");
		return "xxx";
	}

}
