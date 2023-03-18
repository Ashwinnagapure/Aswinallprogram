import java.lang.*;
import java.util.*;

class min {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (x < y && z > y) {
                System.out.println(z - x);
            } else if (y < x && z > x) {
                System.out.println(z - y);

            } else if (z < x && y > x) {
                System.out.println(y - z);

            }
        }
    }
}