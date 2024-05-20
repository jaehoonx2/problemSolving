import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		LocalDate date = LocalDate.of(2007, x, y);
		DayOfWeek dayofWeek = date.getDayOfWeek();
		
		String str = new String();
		
		switch(dayofWeek.getValue()){
			case 1 : str = "MON"; break;
			case 2 : str = "TUE"; break;
			case 3 : str = "WED"; break;
			case 4 : str = "THU"; break;
			case 5 : str = "FRI"; break;
			case 6 : str = "SAT"; break;
			case 7 : str = "SUN"; break;
		}
		
		System.out.println(str);
	}
}