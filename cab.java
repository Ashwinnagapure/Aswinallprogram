import java.lang.*;
import java.util.*;

class cab {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (x < y) {
                System.out.println("first");
            } else if (y < x) {
                System.out.println("second");

            } else {
                System.out.println("any");
            }
        }
    }
}
