package _11InterfaceEnum;

public class ZImpl implements Z {

	@Override
	public void func1() {
		System.out.println("I am in func1 of X from ZImpl");
	}

	@Override
	public void func2() {
		System.out.println("I am in func2 of Y from ZImpl");
	}

	@Override
	public void func1OfY() {
		System.out.println("I am in func1 of Y from ZImpl");
	}

	@Override
	public void funcZ() {
		System.out.println("I am in func Z of Z from ZImpl");
	}

	@Override
	public void func2OfY() {
		// TODO Auto-generated method stub
		
	}
	

}
