import java.lang.*;
import java.util.*;

class bid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            int ans;
            if (x > y && x > z) {
                ans = x;
                System.out.println("alice");
            } else if (y > x && y > z) {
                ans = y;
                System.out.println("bob");

            } else if (z > x && z > y) {
                ans = z;
                System.out.println("charlie");

            }

        }
    }
}