package _10Interface;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	@Override
	void getPercentage() {
		System.out.println("The name is: "+name);
		int result = (getChemistryMarks()+getMathsMarks()+getPhysicsMarks())/300;
		System.out.println("The percentage is : "+result);
	}
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
	
	
}
