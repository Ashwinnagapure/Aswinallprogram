import java.lang.*;
import java.util.*;

class ap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, c;
            int b;
            a = s.nextInt();
            c = s.nextInt();
            b = (int) (a + c) / 2;
            if ((a + c) % 2 == 0) {
                System.out.println(b);
            } else {
                System.out.println("-1");
            }
        }
    }
}
