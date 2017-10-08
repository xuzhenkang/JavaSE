package javase.thread.synchronized_keyword;

// ���������ӣ��ɷ��������ͼ����������ֻ��һ�����ӣ����ǻ���̫��ò������ǫ�ã� һֱ����ȥ��
public class Demo6_LiveLock {
	static class Spoon {
		private Diner owner;
		public Spoon(Diner d) {
			owner = d;
		}
		public Diner getOwner() {
			return owner;
		}
		public synchronized void setOwner(Diner d) {
			owner = d;
		}
		public synchronized void use() {
			System.out.println(owner.name + " has eaten!");
		}
	}
	
	static class Diner {
		private String name;
		private boolean isHungry;
		
		public Diner(String n) {
			name = n;
			isHungry = true;
		}
		public String getName() {
			return name;
		}
		public boolean isHungry() {
			return isHungry;
		}
		public void eatWith(Spoon spoon, Diner spouse) {
			while (isHungry) {
				// Don't have the spoon, so wait patiently for spouse.
				if (spoon.owner != this) { // �����׵ĳ����߲��ǵ�ǰ������ȴ�
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						continue;
					}
					continue;
				}
				
				// If spouse is hungry, insist upon passing the spoon.
				if (spouse.isHungry()) { // ���Է��ܶ������öԷ��ԣ������׸��ڶԷ���
					System.out.println(name + ": You eat first my darling " + spouse.getName());
					spoon.setOwner(spouse);
					continue;
				}
				
				// Spouse wasn't hungry, so finally eat. �Է������Ļ�����ǰ����ԣ��Ժ󣬵�ǰ���󲻶��ˣ�Ȼ�����׽����Է���
				spoon.use();
				isHungry = false;
				System.out.println(name + ": I am stuffed, my darling " + spouse.getName());
				spoon.setOwner(spouse);
			}
			
		}
		public static void main(String[] args) {
			final Diner husband = new Diner("Bob");
			final Diner wife = new Diner("Alice");
			final Spoon s = new Spoon(husband); // ֻ��һ�����ӣ� �����������ɷ�����
			
			new Thread(new Runnable() {
				public void run() {
					husband.eatWith(s, wife);
				}
			}).start();
			new Thread(new Runnable() {
				public void run() {
					wife.eatWith(s, husband);
				}
			}).start();
			
		}
	}
}
