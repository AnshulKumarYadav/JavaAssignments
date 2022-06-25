package _23SerializeDeSerialize;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student(13, "Harshit Goshale", new Address("Uttar Pradesh", "Aligarh", "202001") , "rishu@gmail.com", "123456");
//		System.out.println(s.getAddress());
		
//		<<-------------------------------------Serialiszation-------------------------------------->>
		
		
			FileOutputStream fos = new FileOutputStream("student.txt") ;
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			
			oos.close();
			
			System.out.println("Serialization is  done.........");
//			
			
//			<<--------------------------------Deserialization--------------------------------------->>
//			
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			
			Student student = (Student)o;
			
			System.out.println(student);
			System.out.println("Deserialization is done.............");
			ois.close();
			
			
		
	}
}
