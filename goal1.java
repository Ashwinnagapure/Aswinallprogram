import java.lang.*;
import java.util.*;

class goal1 {
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
            if (a <= c && b <= d) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
        }
    }
}
