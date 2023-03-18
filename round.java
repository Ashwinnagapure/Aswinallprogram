import java.lang.*;
import java.util.*;

class round {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, a, b;
            x = s.nextInt();
            a = s.nextInt();
            b = s.nextInt() * 2;
            if (x <= (a + b)) {
                System.out.println("qualify");
            } else
                System.out.println("not qualify");

        }
    }
}
