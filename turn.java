import java.lang.*;
import java.util.*;

class turn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int max;
            if (x > y) {
                max = x;
                System.out.println(7 - max);
            } else {
                max = y;
                System.out.println(7 - max);
            }
        }
    }
}
