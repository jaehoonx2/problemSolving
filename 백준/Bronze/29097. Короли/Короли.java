import java.util.*;
import java.lang.*;
import java.io.*;
/*
조프리(Joffrey) 왕의 군대는 a명의 병사들로 이루어진 대대 n개로 구성되어 있고,
롭(Robb) 왕의 군대는 b명의 병사, m개 대대로 구성되어 있고,
스타니스(Stannis) 왕의 군대는 c명의 병사, k개 대대로 구성되어 있다.
시타델의 분석가들이 누구의 군대가 더 강한지 알아내는 것을 도와주자. 전쟁이 끝날 무렵, 군대는 해산되었다.
*/
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long[] power = new long[]{a*n, b*m, c*k};
        Arrays.sort(power);
        
        Map<Long, String> map = new HashMap<>();
        map.put(a*n, "Joffrey");
        map.put(b*m, "Robb");
        map.put(c*k, "Stannis");

        if(map.size() == 3)
            System.out.println(map.get(power[2]));
        else if(map.size() == 1)
            System.out.println("Joffrey Robb Stannis");
        else {
            if(!map.containsValue("Joffrey")){
                if(map.get(a*n).equals("Robb")){
                    if(b*m > c*k)
                        System.out.println("Joffrey Robb");
                    else
                        System.out.println("Stannis");
                } else {
                    if(c*k > b*m)
                        System.out.println("Joffrey Stannis");
                    else
                        System.out.println("Robb");
                }
            } else if(!map.containsValue("Robb")){
                 if(map.get(b*m).equals("Joffrey")){
                    if(a*n > c*k)
                        System.out.println("Joffrey Robb");
                    else
                        System.out.println("Stannis");
                } else {
                    if(c*k > a*n)
                        System.out.println("Robb Stannis");
                    else
                        System.out.println("Joffrey");
                }               
            } else {
                 if(map.get(c*k).equals("Joffrey")){
                    if(a*n > b*m)
                        System.out.println("Joffrey Stannis");
                    else
                        System.out.println("Robb");
                } else {
                    if(b*m > a*n)
                        System.out.println("Robb Stannis");
                    else
                        System.out.println("Joffrey");
                }                     
            }
        }
    }
}