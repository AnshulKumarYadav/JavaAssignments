package _10Interface;

public class HistoryStudent extends Student {
	
	int historyMarks;
	int civicsMarks;
	
	@Override
	void getPercentage() {
		System.out.println(name+ " is a HistoryStudent and there percentage of marks is: "+((historyMarks+civicsMarks)/200) + "and belong to "+ address);
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	
	
}
