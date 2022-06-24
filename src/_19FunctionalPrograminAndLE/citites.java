package _19FunctionalPrograminAndLE;

public class citites {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public citites() {
		
	}

	public citites(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "citites [city=" + city + "]";
	}
	
	
}
