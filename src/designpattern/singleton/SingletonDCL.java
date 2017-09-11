package designpattern.singleton;


/**
 * ˫�ؼ��������ģʽ��DCL, Double Checked Locking Singleton��
 * ע�⣺��ģʽ�������⣬ĳЩ������޷�ʹ�á�
 * ԭ������ָ�������� ��ʼ��һ������ʹһ������ָ������������̲���ԭ�ӵġ�
 *     �����˿��ܻ��������ָ���˶���δ��ʼ���õ��ǿ��ڴ棬ʹ��volatile���ζ������ã���ֹ�����򼴿ɽ����
 *     sc = new SingletonDCL();
 *     �����������ԭ�ӵģ��Ӷ�������JVM������Ļ��ᡣJVM��������Ҳ����ԭ��ģ��ڵ��߳��У�������ô�ţ���֤���ս��һ�¡�
 *     ���̵߳������ָ��������ͻ������Ա�������⡣��������������Բ��ɣ�
 *       1. ջ�ڴ濪�ٿռ�׼����ʼ������
 *       2. ���ڴ濪�ٿռ�׼����ʼ������
 *       3. ��ʼ������
 *       4. ջ������ָ��������ڴ�ռ��ַ��
 *     ָ��������󣬿��ܻ���1��2��4��3������������֮�󣬶Ե����߳���˵Ч����һ���ģ�����JVM��Ϊ�ǺϷ��������򣬵����ڶ��̻߳����¾ͻ�������⡣
 *     ���ﵽ4��ʱ��sc�Ѿ�ָ����һ����ڴ棨!=null����ֻ�������ڴ滹û��ʼ���ͷ����ˣ�ʹ�õ�ʱ����NullPointException��
 *     ��Ȼ����ļ������貢����������ָ�ָ�������ֻ��������С�����ǿ���˵�����⡣
 *     ����volatile�ؼ���֮�󣬲鿴��������Է��ֶ���һ�� lock addl $0x0,(%esp) �൱��һ���ڴ����ϡ�
 *     volatile�ؼ������ã�
 *       1. ��֤�ڴ�ɼ���
 *          ԭ��ʹ�øñ�����������ȥ���ڴ��ȡ���޸ĸñ����Ļ���������ˢ�����ڴ档
 *       2. ��ָֹ��������
 *          ԭ��ͨ�������ڴ�����
 *       3. ���ܱ�֤������ԭ���ԣ�ע�⣩
 *     
 * @author lenovo
 *
 */
public class SingletonDCL {
	private static /*volatile*/ SingletonDCL instance = null;
	
	private SingletonDCL() {}
	
	public static SingletonDCL getInstance() {
		if (instance == null) {
			SingletonDCL sc;
			synchronized (SingletonDCL.class) {
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDCL.class) {
						if (sc == null) {
							sc = new SingletonDCL();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}



