package lesson6;
abstract class Figure {
	public abstract double getArea();
}
public class Appl_Abstract_Figure {

	public static void main(String[] args) {
		Figure[] fig = { new Circle(3), new Circle(2), new Rectangle(3, 11) };
		for (Figure currentFig : fig) {
			System.out.println("Area = " + currentFig.getClass().getName() + "  " + currentFig.getArea());
		}}}
class Circle extends Figure {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (3.14 * radius * 2);
	}
}
class Rectangle extends Figure {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return (width * length);
	}
}