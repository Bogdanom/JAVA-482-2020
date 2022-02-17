package lesson6;

interface Animal1 {
	void voice();
	void feed();
}
class Cat1 implements Animal1 {
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
		return "Cat1";
	}
}
class Dog1 implements Animal1 {
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
		return "Dog1";
	}

}

public class InterfaceAnimalAppl {

	public static void main(String[] args) {
		Animal1[] animals = { new Cat1(), new Cat1(), new Dog1() };
		for (Animal1 current : animals) {
			System.out.println(current);
			current.feed();
			current.voice();
		}

	}

}
