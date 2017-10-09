package javase.thread.synchronized_keyword;

// 活锁的例子：丈夫和妻子试图喝汤，但是只有一个勺子，他们互相太礼貌，互相谦让， 一直让下去。
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
				if (spoon.owner != this) { // 若汤勺的持有者不是当前对象，则等待
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
				if (spouse.isHungry()) { // 若对方很饿，则让对方吃，将汤勺给于对方。
					System.out.println(name + ": You eat first my darling " + spouse.getName());
					spoon.setOwner(spouse);
					continue;
				}
				
				// Spouse wasn't hungry, so finally eat. 对方不饿的话，则当前对象吃，吃后，当前对象不饿了，然后将汤勺交给对方。
				spoon.use();
				isHungry = false;
				System.out.println(name + ": I am stuffed, my darling " + spouse.getName());
				spoon.setOwner(spouse);
			}
			
		}
		public static void main(String[] args) {
			final Diner husband = new Diner("Bob");
			final Diner wife = new Diner("Alice");
			final Spoon s = new Spoon(husband); // 只有一把勺子， 首先勺子在丈夫手中
			
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
