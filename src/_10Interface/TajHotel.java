package _10Interface;

public class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("Take chickenBriyani from TajHotel");
	}

	@Override
	public void masalaDosa() {
		System.out.println("Take masalaDosa from TajHotel");
	}

	public void welcomeDrink() {
		System.out.println("Welcome Drink from the TajHotel");
	}
	

}
