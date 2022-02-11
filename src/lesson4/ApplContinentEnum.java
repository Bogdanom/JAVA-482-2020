package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplContinentEnum {
	 enum Continents {
		ASIA, EUROPE, AMERICA, AFRICA
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of country, please");
		String country = br.readLine();
		Continents continent = Continents.ASIA;

		switch (country.toUpperCase()) {
		case "CHINA":
		case "INDIA":
		case "JAPAN":
			continent = Continents.ASIA;
			break;
		case "UKRAINE":
		case "CROATIA":
		case "SLOVAKIA":
			continent = Continents.EUROPE;
			break;
		case "CANADA":
		case "USA":
		case "MEXICA":
			continent = Continents.AMERICA;
			break;
		case "EGYPT":
		case "TUNISIA":
		case "TANZANIA":
			continent = Continents.AFRICA;
			break;
		default:
			System.out.println("No this country");
			System.exit(0);
		}
		System.out.println("country " + country.toUpperCase() + " is in " + continent);
	}
}
