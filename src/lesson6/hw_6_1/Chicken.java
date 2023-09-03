package lesson6.hw_6_1;
public class Chicken extends NonFlyingBird {
	@Override
	public void fly() {
		System.out.print("I'm an Chicken. I don't fly - ");
		flyN();
	}
}