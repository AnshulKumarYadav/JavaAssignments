package _10Interface;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
	@Override
	void getPercentage() {
		System.out.println("The name is: "+name);
		System.out.println("The address of student is: "+address);
		double tmarks = (double)this.physicsMarks+ (double)this.chemistryMarks + (double)this.mathsMarks;
		double result = (tmarks/300)*100;
		System.out.println("The percentage is : "+result+"%");
	}
	
	
	
}
