package _21MultiThreading.Question3;

public class Main {

	public static void main(String[] args) {
		Common c =  new Common();
		
		ThreadA t1 = new ThreadA(c, "Rahul");
		t1.start();
	}
}
