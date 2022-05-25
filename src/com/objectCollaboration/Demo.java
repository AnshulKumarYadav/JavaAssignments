package com.objectCollaboration;

public class Demo {
	private String s;
	private int i;
	private float f;
	
	public Demo()
	{
		s="Garim";
		i=44;
		f=8.4f;
	}
	
	public Demo(String s)
	{
		this.s = s;
	}
	public Demo(int i)
	{
		this.i = i;
	}
	public Demo(float f)
	{
		this.f = f;
	}
	
	
	
	
	public void showDetails()
	{
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Demo demo = new Demo("Ram");
//		demo(14);
//		demo(8.45f);
		demo.showDetails();
	}

}
