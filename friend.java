import java.lang.*;
import java.util.*;

class friend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if (a > b && a > c && a == (b + c)) {
                System.out.println("yes");
            } else if (b > a && b > c && b == (a + c)) {
                System.out.println("yes");

            } else if (c > a && c > b && c == a + b) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }
        }
    }
}
