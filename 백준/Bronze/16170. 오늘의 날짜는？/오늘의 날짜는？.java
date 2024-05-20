import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		ZonedDateTime now = ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC);
		
		System.out.println(now.getYear());
		
		if(now.getMonthValue() < 10)
			System.out.println("0" + now.getMonthValue());
		else
			System.out.println(now.getMonthValue());
			
		System.out.println(now.getDayOfMonth());
	}
}