package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

enum Language {
	English, Ukrainian, Russian;
}
enum LanguageWeeks {
	MONDAY("Monday", "Понеділок", "Понедельник"), TUESDAY("Tuesday", "Вівторок", "Вторник"),
	WEDNESDAY("Wednesday", "Cереда", "Cреда"), THURSDAY("Thursday", "Четвер", "Четверг"),
	FRIDAY("Friday", "Пятниця", "Пятниця"), SATURDAY("Saturday", "Cубота", "Cуббота"),
	SUNDAY("Sunday", "Неділя", "Воскресенье");
	private Map<Language, String> dayName;
	private LanguageWeeks(String... day) {
		dayName = new HashMap<>();
		int i = 0;
		for (Language currentLanguage : Language.values()) {
			if ((day[i] == null) || (day[i].length() == 0)) {
				throw new IllegalArgumentException("Invalid argument or Parameter not Found");
			}
			dayName.put(currentLanguage, day[i]);
			i++;
		}
	}
	public String getWeekDay(Language language) {
		return dayName.get(language);
	}
	@Override
	public String toString() {
		return dayName.toString();
	}
}
public class Appl_SL_30_PT_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String scLang="English";
		Language language=Language.English;
		int day;
			System.out.println("Enter Language, please:");
			scLang = br.readLine();
			try {
				language=Language.valueOf(scLang);	
			} catch (IllegalArgumentException e) {
				boolean isThrowException= true;
				for(Language currentLanguage:Language.values()) {
					System.out.println("Attempt to use as: "+currentLanguage.name());
	//if(scLang.toLowerCase().contains(currentLanguage.name().toLowerCase())) { //work too
	if(scLang.substring(0,3).equalsIgnoreCase(currentLanguage.name().substring(0,3))) {
						language=currentLanguage;
						isThrowException=false;
						break;
					}
				}
				if(isThrowException) {
					throw new IllegalArgumentException("Invalid Parameter ",e);
				}
			}
		do {
			System.out.println("Enter number of the day, please:");
			day = Integer.parseInt(br.readLine());
			if ((day < 0) || (day > 6)) {
				System.out.println("Invalid parametr, day = " + day + "Please,Repeat");
			}
		} while ((day < 0) || (day > 6));
			System.out.print("Current day is: ");
			System.out.println(LanguageWeeks.values()[day].getWeekDay(language));
		}
	}


