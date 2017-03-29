package thread;

public class Sync {
	
	private int x;
	private int y;
	private synchronized void setX(int i) {
		this.x = 1;
	}
	private synchronized void setY(int i) {
		this.y = 1;
	}
	public void setXY(int i) {
		this.setX(i);
		this.setY(i);
	}
	
	public synchronized boolean check() {
		return this.x != this.y;
	}
}
