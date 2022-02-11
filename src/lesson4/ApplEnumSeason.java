package lesson4;

public class ApplEnumSeason {

	public enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN
	}

	public static void main(String[] args) {

		for (Seasons current : Seasons.values()) {
			System.out.println("current = " + current);
		}

		String name = "WINTER";
		Seasons season = Seasons.valueOf(name);
		System.out.println("season = " + season);
		int i2 = 2;
		Seasons season1 = Seasons.values()[i2];
		System.out.println("season1 = " + season1);
	}

}
