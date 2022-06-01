package _10Interface;

import java.util.Scanner;

public class AllStudents {
	public static void main(String[] args) {
		Student student = new ScienceStudent();
		Student s1 = new HistoryStudent();
		
		System.out.println("No. of students : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter the Name of student: ");
			String nameString = sc.next();
			System.out.println("Enter the address: ");
			String addString = sc.next();
			System.out.println("Enter the stream: ");
			String stream = sc.next();
			student.name=nameString;
			student.address=addString;
			s1.name = nameString;
			s1.address = addString;
			if(stream.equals("Science"))
			{
				System.out.println("Enter marks in Physics: ");
				int p = sc.nextInt();
				System.out.println("Enter marks in Chemistry: ");
				int c = sc.nextInt();
				System.out.println("Enter marks in Maths: ");
				int m = sc.nextInt();
				ScienceStudent scienceStudent = (ScienceStudent) student;
				scienceStudent.setPhysicsMarks(p);
				scienceStudent.setChemistryMarks(c);
				scienceStudent.setMathsMarks(m);
				scienceStudent.getPercentage();
			}
			else if(stream.equals("History"))
			{
				System.out.println("Enter marks in History: ");
				int h = sc.nextInt();
				System.out.println("Enter marks in Civics: ");
				int civic = sc.nextInt();
				HistoryStudent historyStudent = (HistoryStudent) s1;
				historyStudent.setHistoryMarks(h);
				historyStudent.setCivicsMarks(civic);
				historyStudent.getPercentage();
				
				
			}
			else {
				System.out.println("Enter a valid stream (Science or History)");
			}
		}
		sc.close();
		
	}
}
