package practice;

public class TestLiveLock {
	static class Spoon {
		private Diner owner;

		public Spoon(Diner owner) {
			this.owner = owner;
		}

		public synchronized Diner getOwner() {
			return owner;
		}

		public synchronized void setOwner(Diner owner) {
			this.owner = owner;
		}
		
		public void use() {
			System.out.println("汤勺正在使用中...");
		}
		
	}
	static class Diner {
		private String name;
		private boolean isHungry;
		
		public synchronized boolean isHungry() {
			return isHungry;
		}
		public Diner(String name) {
			this.name = name;
			this.isHungry = true;
		}
		public String getName() {
			return name;
		}
		
		// 拿着汤勺spoon和spouse一起喝汤
		public void eatWith(Spoon spoon, Diner spouse) {
			while (isHungry) {
				if (spoon.owner != this) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						continue;
					}
					continue;
				}
				
				if (spouse.isHungry()) {
					spoon.setOwner(spouse);
					System.out.println(name + ": 你喝吧！" + spouse.getName() + ".");
					continue;
				}
				
				spoon.use();
				this.isHungry = false;
				spoon.setOwner(spouse);
				System.out.println("我喝完了，你喝吧" + spouse.getName());
				
			}
		}
		public static void main(String[] args) {
			Diner husband = new Diner("Bob");
			Diner wife = new Diner("Alice");
			Spoon s = new Spoon(husband);
			
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
