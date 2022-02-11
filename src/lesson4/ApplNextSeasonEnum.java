package lesson4;

public class ApplNextSeasonEnum {
	public enum Season {
		WINTER, SPRING, SUMMER, AUTUMN;

		public Season nextSeason() {
			if (this == Season.WINTER)
				return SPRING;
			if (this == Season.SPRING)
				return SUMMER;
			if (this == Season.SUMMER)
				return Season.AUTUMN;
			return Season.WINTER;
		}
	}

	public static void main(String[] args) {
		
		Season season = Season.AUTUMN;
		System.out.println("Current season is " + season);
		System.out.println("Next season is " + season.nextSeason());

	}

}
