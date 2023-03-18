import java.lang.*;
import java.util.*;

class maximise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c, d;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            d = s.nextInt();
            if (a > b && c > d) {
                System.out.println(a + c);
            } else if (b > a && d > c) {
                System.out.println(b + d);

            } else if (a > b && d > c) {
                System.out.println(a + d);


            } else if (b > a && c > d) {
                System.out.println(b + c);

            }

        }
    }
}
