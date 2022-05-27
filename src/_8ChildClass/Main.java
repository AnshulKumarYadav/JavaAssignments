package _8ChildClass;

public class Main{
    public static void main(String[] args){
//  <<-----------------Bird and parrot class------------------->>
       Bird b1 = new Parrot();
       b1.fly();
       Parrot p = (Parrot)b1;
       p.sing();
//  <<--------------------------------------------------------->>
       
       
//  <<----------------------Animal class----------------------->>
       
       Animal[] animal = new Animal[3];
       animal[0]=new Dog();
       animal[1]=new Cat();
       animal[2]=new Tiger();
       
       for(int i=0;i<3;i++)
       {
    	   animal[i].eat();
    	   animal[i].walk();
    	   animal[i].makeNoise();
    	   System.out.println("-----------------------------------");
       }
       
//       System.out.println("-----------------------------------");
//       animal[0].eat();
//       animal[0].walk();
//       animal[0].makeNoise();
//       
//       System.out.println("-----------------------------------");
//
//       animal[1].eat();
//       animal[1].walk();
//       animal[1].makeNoise();
//       
//       System.out.println("-----------------------------------");
//
//       animal[2].eat();
//       animal[2].walk();
//       animal[2].makeNoise();
       
//  <<--------------------------------------------------------->>
       
   }
}
