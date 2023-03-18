import java.lang.*;
import java.util.*;

class chiken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (x == z && y == z) {
                System.out.println("any");
            } else if (z % x != 0 && z % y != 0) {
                System.out.println("none");

            } else if (z % x == 0) {
                System.out.println("chicken");

            } else if (z % y == 0) {
                System.out.println("duck");

            }
        }
    }
}
