package aop.staticproxypattern;

/**
 * ��ʵ�����ɫ��������ʵ�Ķ���
 * @author lenovo
 *
 */
public class PeopleTalk implements ITalk {
    private String username;
    private String age;

	public PeopleTalk(String username, String age) {
		this.username = username;
		this.age = age;
	}

	@Override
	public void talk(String msg) {
		System.out.println(msg + "!���,����" + username + "����������" + age);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
