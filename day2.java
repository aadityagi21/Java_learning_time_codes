// class A {
//     public static void main(String[] arg) {
//         float a=2.43333333333333327725623853333333333F;
//         long b=(long)a;
//         System.out.println(b);
//     }
// }

import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    int h=a.nextInt();
    int radius=s.nextInt();
    int pi=3;
    long area = pi * (long)radius * radius;
    int perimeter = 2 * pi * radius;

    System.out.println(area);
    System.out.print(perimeter);
        
    }}
