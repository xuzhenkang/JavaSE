package reflect.dynamicproxy.classloader;

public class TestDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("���������" + d.getClass().getClassLoader().getClass().getName());
	}
}
/**

���������sun.misc.Launcher$AppClassLoader
*/
/***
��ʵ��java�������������������

1��Bootstrap ClassLoader �˼���������c++��д��һ�㿪���к��ټ���

2��Extension ClassLoader ����������չ��ļ��أ�һ���Ӧ����jre\lib\extĿ¼�е���

3��AppClassLoader ����classpathָ�����࣬����õļ�������ͬʱҲ��java��Ĭ�ϵļ�������

�����Ҫ��ɶ�̬����������Ҫ����һ��InvocationHandler�ӿڵ����࣬����ɴ���ľ��������
*/