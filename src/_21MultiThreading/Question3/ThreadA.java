package _21MultiThreading.Question3;

public class ThreadA extends Thread{
	Common common;
	String name;
	
	
	public ThreadA(Common common, String name) {
		super();
		this.common = common;
		this.name = name;
	}


	@Override
	public void run() {
		common.fun1(name);
	}
	
}
