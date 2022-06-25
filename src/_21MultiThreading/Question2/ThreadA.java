package _21MultiThreading.Question2;

public class ThreadA extends Thread {
	
	CommonLine c;
	String name;
	
	public ThreadA(CommonLine c, String name) {
		super();
		this.c = c;
		this.name = name;
	}

	@Override
	public void run() {
		c.fun1(name);
	}
}
