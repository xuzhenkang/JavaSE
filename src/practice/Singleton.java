package practice;

public class Singleton {

}

/*
// ����ʽ
private static Singleton instance = new Singleton();
private Singleton() {}
public static Singleton getInstance() {
	return instance;
}
*/
/*
// ����ʽ
private static Singleton instance = null;
private Singleton() {}
public static synchronized Singleton getInstance() {
	if (instance == null)
		return new Singleton();
	else return instance;
}
*/