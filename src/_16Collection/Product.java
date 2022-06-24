package _16Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import _18Map.Student;


public class Product  {
	
	private int productId;
	private String productName;
	private double productPrice;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product() {
		
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		
	}
	
}


class Main{
	public static void main(String[] args) {
		try {
			List<Product> list = new ArrayList<>();
			Scanner scanner = new Scanner(System.in);
			for(int i=0;i<3;i++)
			{
				System.out.println("Enter ProductId: ");
				int a = scanner.nextInt();
				System.out.println("Enter Product Name: ");
				String string = scanner.next();
				System.out.println("Enter Product Price: ");
				double p = scanner.nextDouble();
				list.add(new Product(a,string,p));
				
				
			}
			
			
//			list.add(new Product(4,"Powder",99));
//			list.add(new Product(45,"Cream",35));
//			list.add(new Product(3,"HairStyle Gel",20));
//			list.add(new Product(89,"Apple",122.77));
			
			
			
			System.out.println("Enter the choice:");
			System.out.println("1 for sorting the product according to the productPrice");
			System.out.println("2 for sorting the product according to the productName");
			System.out.println("3 for sorting the product according to the productId");
			
			int choice = scanner.nextInt();
			if(choice==1)
			{
				Collections.sort(list, new sortByprice());
				for(Product p:list)
				{
					System.out.println("*****************************************");
					System.out.println("Product ID: "+p.getProductId());
					System.out.println("Product Name: "+p.getProductName());
					System.out.println("Product Price: "+p.getProductPrice());
					System.out.println("******************************************");
				}
			}
			else if(choice==2)
			{
				Collections.sort(list, new sortByname());
				for(Product p:list)
				{
					System.out.println("*****************************************");
					System.out.println("Product ID: "+p.getProductId());
					System.out.println("Product Name: "+p.getProductName());
					System.out.println("Product Price: "+p.getProductPrice());
					System.out.println("******************************************");
				}
			}
			else if(choice==3)
			{
				Collections.sort(list, new sortById());
				for(Product p:list)
				{
					System.out.println("*****************************************");
					System.out.println("Product ID: "+p.getProductId());
					System.out.println("Product Name: "+p.getProductName());
					System.out.println("Product Price: "+p.getProductPrice());
					System.out.println("******************************************");
				}
			}
			else {
				Collections.sort(list, new sortById());
				for(Product p:list)
				{
					System.out.println("*****************************************");
					System.out.println("Product ID: "+p.getProductId());
					System.out.println("Product Name: "+p.getProductName());
					System.out.println("Product Price: "+p.getProductPrice());
					System.out.println("******************************************");
				}
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}




//productId: Integer
// productName: String
// productPrice: double