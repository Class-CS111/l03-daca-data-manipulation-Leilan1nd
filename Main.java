// STUDENT NAME:
// DATE: 

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION************/
		int a, y, m;
		int dayToday, monthToday, yearToday, jdnToday; 
		int dayBday, monthBday, yearBday, jdnBday;
		int diff, approxAge; 
		
		 /********  INITIALIZATION *****/
		dayToday = 9;
		monthToday = 2;
		yearToday = 2025;

		dayBday = 17;
		monthBday = 1;
		yearBday = 2006;

		/***** CALCULATION & PROCESSING SECTION *****/
		a = (14 - monthToday) / 12;
		y = yearToday + 4800 - a; 
		m = monthToday + 12*a - 3;
		jdnToday = dayToday + (153 * m + 2) / 5 + 365 * y + (y/4) - (y/100) + (y/400) - 32045;

		a = (14 - monthBday) / 12;
		y = yearBday + 4800 - a; 
		m = monthBday + 12*a - 3;
		jdnBday = dayBday + (153 * m + 2) / 5 + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

		diff = jdnToday - jdnBday;
		approxAge = diff / 365;
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " + monthToday + "/" + dayToday + "/" + yearToday + ", is " + jdnToday + "\n");
		System.out.println();
		System.out.println("Julian Day Number for birthday, " + monthBday + "/" + dayBday + "/" + yearBday + ", is " + jdnBday + "\n");
		System.out.println();
		System.out.println("The difference in days is " + diff + " which makes you approximately " + approxAge + " years old!" + "\n");


  }
}