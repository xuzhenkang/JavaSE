package javase.thread.synchronized_keyword;

public class Demo5_DeadLock {

	/** ͬ������鲻ҪǶ�ף��������ײ���������
	 * @param args
	 */
	private static String s1 = "������";
	private static String s2 = "������";

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "...��ȡ" + s1 + "�ȴ�" + s2);
						synchronized(s2) {
							System.out.println(getName() + "...�õ�" + s2 + "����");
						}
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "...��ȡ" + s2 + "�ȴ�" + s1);
						synchronized(s1) {
							System.out.println(getName() + "...�õ�" + s1 + "����");
						}
					}
				}
			}
		}.start();
	}
}
