package _8ChildClass;

public class Animal {
	public void makeNoise() {
		System.out.println("Animal making Noise");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

	public void walk() {
		System.out.println("Animal is walking");
	}
		
}

class Dog extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Dog is barking");
	}

}

class Cat extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Cat is meawing");
	}

}

class Tiger extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Tiger is roaring");
	}

}
