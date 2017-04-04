package practice;

public class TestRunnable {
	public static void main(String[] args) {
		TicketRunnable ticketRunnable = new TicketRunnable();
		new Thread(ticketRunnable).start();
		new Thread(ticketRunnable).start();
		new Thread(ticketRunnable).start();
		new Thread(ticketRunnable).start();
	}
}

class TicketRunnable implements Runnable {
	private int ticket = 100;

	@Override
	public void run() {
		synchronized (this) {
			while (true) {
				if (ticket == 0)
					break;
				else {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
					System.out.println(Thread.currentThread().getName() + "...µÚ" + ticket-- + "ÕÅÆ±");
				}
			}
		}
	}

}