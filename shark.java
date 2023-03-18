import java.lang.*;
import java.util.*;

class shark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int a = (x / 10) * 10;
            int b = (y / 20) * 10;
            if (a == b) {
                System.out.println("any");
            } else if (a > b) {
                System.out.println("first");

            } else if (b > a) {
                System.out.println("second");

            }
        }
    }
}
