import java.lang.*;
import java.util.*;

class discus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if (a > b && a > c) {
                System.out.println(a);
            } else if (b > a && b > c) {
                System.out.println(b);

            } else if (c > a && c > b) {
                System.out.println(c);

            } else if (a == b && a == c && b == c) {
                System.out.println(a);

            }
        }
    }
}
