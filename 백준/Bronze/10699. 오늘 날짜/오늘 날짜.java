import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.SimpleDateFormat;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
	}
}