package _21MultiThreading.Question1;

public class Calculate implements Runnable {

	@Override
	public void run() {
		int pro = 3*10*4*4*3*2*1*4*9*3;
		System.out.println("Calculation is: "+pro);
	}
	
	public static void main(String[] args) {
		// main thread
		Calculate calculate = new Calculate();
		Thread t1 = new Thread(calculate);
		t1.start();
		
	}

}
