package reflect.invoke;

public class StudentDemo {
    private int id;  
    private String name;  
    private String sex;  
    private String age;  
    private String birthday;  
    private String address;
    
	public StudentDemo() {
	}
	public StudentDemo(int id, String name, String sex, String age, String brithday, String address) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.birthday = brithday;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}  
}
