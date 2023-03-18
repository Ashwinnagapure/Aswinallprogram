import java.lang.*;
import java.util.*;

public class arithmatic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.print("enter the value of 'a' : ");
        a = s.nextInt();
        System.out.print("enter the value  of 'b' :");
        b = s.nextInt();
        System.out.print("enter the value of 'c' : ");
        c = s.nextInt();
        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("the value of r1 is : " + r1);
        System.out.println("the value of r2 is  : " + r2);
    }
}
