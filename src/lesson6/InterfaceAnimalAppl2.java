package lesson6;

interface Animal_2 {
	void voice();
	void feed();
	String getName();
}
abstract class Beast implements Animal_2 {
	private String name;

	public Beast(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
}
class Dog_2 extends Beast  {
	
	public Dog_2(String name) {
		super(name);
	}
	@Override
	public void voice() {
		System.out.println("Gav");
	}
	@Override
	public void feed() {
		System.out.println("Pedigree");
	}
	@Override
	public String toString() {
		return "Dog";
	}	
}

class Cat_2 extends Beast {	
	
	public Cat_2(String name) {
		super(name);
	}
		
	@Override
	public void voice() {
		System.out.println("May");
	}
	@Override
	public void feed() {
		System.out.println("Wiskas");
	}
	@Override
	public String toString() {
		return "Cat";
	}
	
}

public class InterfaceAnimalAppl2 {

	public static void main(String[] args) {
		Animal_2[] animals = { new Cat_2("Murka"), new Cat_2("Pushok"), new Dog_2("Tuzik") };
		for (Animal_2 current : animals) {
			System.out.println("This is " + current + " with name " + current.getName());
				current.voice();
				current.feed();
		}

	}

}

