package jvm.gc;

import java.lang.ref.WeakReference;

// ���õķ��ࣺǿ����������
// ǿ���ò��ܱ�gc����
// �����õ���gc�ͻᱻgc����
public class RefDemo {
	public static void main(String[] args) {
		String str = new String("kangkang");// �ö���λ�ڶѿռ�
		WeakReference<String> wrf = new WeakReference<String>(str);
		System.out.println("gc����ǰ" + wrf.get());
		str = null; // �Ͽ�����
		System.gc(); // ֪ͨ����
		System.runFinalization();
		System.out.println("gc���к�" + wrf.get()); // ���з��֣�������Ȼ���ڣ� ���ܻ���
	}
	@SuppressWarnings("unused")
	private void testStrongRef() {
		String str = "kangkang";// �ַ���λ�ڳ����أ��������ܻ��գ�������ǿ����
		WeakReference<String> wrf = new WeakReference<String>(str);
		System.out.println("gc����ǰ" + wrf.get());
		str = null; // �Ͽ�����
		System.gc(); // ֪ͨ����
		System.runFinalization();
		System.out.println("gc���к�" + wrf.get()); // ���з��֣�������Ȼ���ڣ� ���ܻ���
	}
}

/**
 * ǿ���ã�StringReference��������ָ�����GC����ʱ������
 * �����ã�SoftReference����GC����ʱ���ܻ��գ�JVM�ڴ治��ʱ��
 * �����ã�WeakReference����GC����ʱ��������
 * �����ã�PhantomReference���������������ã���Ҫ���ٶ��󱻻��յ�״̬�����ܵ���ʹ�ã����������ö��У�ReferenceQueue������ʹ�á�
 */

