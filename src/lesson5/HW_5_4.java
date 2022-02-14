package lesson5;
import java.util.Scanner;

class Cars {

	private String typeCars;
	private int yearProduction;
	private double engineCapacity;

	public Cars(String typeCars, int yearProduction, double engineCapacity) {
		this.typeCars = typeCars;
		this.yearProduction = yearProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getTypeCars() {
		return typeCars;
	}

	public void setTypeCars(String typeCars) {
		this.typeCars = typeCars;
	}

	public int getYearProduction() {
		return yearProduction;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Cars [typeCars=" + typeCars + ", yearProduction=" + yearProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
}

public class HW_5_4 {

	public static void main(String[] args) {

		Cars[] Cars = new Cars[5];
		Cars[0] = new Cars("Truck", 2018, 5.5);
		Cars[1] = new Cars("Bus", 2019, 3.5);
		Cars[2] = new Cars("Van", 2016, 2.5);
		Cars[3] = new Cars("PickUp", 2017, 2.1);
		Cars[4] = new Cars("Jeep", 2018, 3.2);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year of production: ");
		int year = sc.nextInt();
		sc.close();
		System.out.println(year + " Cars's are: ");
		for (Cars currentCars : Cars) {
			if (currentCars.getYearProduction() == year) {
				System.out.println(currentCars);
			}
		}

		Cars tmp;
		for (int i = 0; i < Cars.length - 1; i++) {
			for (int j = 0; j < Cars.length - 1 - i; j++) {
				if (Cars[j].getYearProduction() > Cars[j + 1].getYearProduction()) {
					tmp = Cars[j];
					Cars[j] = Cars[j + 1];
					Cars[j + 1] = tmp;
				}
			}
		}
		System.out.println("Sorted Cars Array by year of production");
		for (Cars currentEmp : Cars) {
			System.out.println(currentEmp);
		}
	}
}
