import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1995, "ITMO");
        map.put(1996, "SPbSU");
        map.put(1997, "SPbSU");
        map.put(1998, "ITMO");
        map.put(1999, "ITMO");
        map.put(2000, "SPbSU");
        map.put(2001, "ITMO");
        map.put(2002, "ITMO");
        map.put(2003, "ITMO");
        map.put(2004, "ITMO");
        map.put(2005, "ITMO");
        map.put(2007, "SPbSU");
        map.put(2008, "SPbSU");
        map.put(2009, "ITMO");
        map.put(2010, "ITMO");
        map.put(2011, "ITMO");
        map.put(2012, "ITMO");
        map.put(2013, "SPbSU");
        map.put(2014, "ITMO");
        map.put(2015, "ITMO");
        map.put(2016, "ITMO");
        map.put(2017, "ITMO");
        map.put(2018, "SPbSU");
        map.put(2019, "ITMO");

        int year = sc.nextInt();
        if(year != 2006)
            System.out.println(map.get(year));
        else
            System.out.println("PetrSU, ITMO");
    }
}