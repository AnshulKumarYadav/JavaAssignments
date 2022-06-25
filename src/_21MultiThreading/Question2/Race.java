package _21MultiThreading.Question2;

public class Race {

	/*
	 * Race Condition:- A condition in which two or more threads acompete together to get certain shared resources.
	 * 
	 * if thread A is reading data from the list and another thread B is trying to sort the same data.
	 * This process leads to a race condition that may result in run time error
	 * 
	 * For solving this condition we use synchronized keyword (for thread safety).
	 * 
	 * */
	
	public static void main(String[] args) {
		
		CommonLine c = new CommonLine();
		c.fun1("Shyam");
		ThreadA t1 = new ThreadA(c, "Ram");
		t1.start();
		ThreadB t2 = new ThreadB(c, "Madan");
		t2.start();
	}
	
	
}
