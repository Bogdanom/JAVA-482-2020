package lesson6.hw_6_1;
public class Penguin extends NonFlyingBird {
	@Override
	public void fly() {
		System.out.print("I'm an Penguin. I don't fly - ");
		flyN();
	}
}