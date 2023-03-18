import java.lang.*;
import java.util.*;

class marathon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (400 / x > 400 / y && 400 / x > 400 / z) {
                System.out.println("alice");
            } else if (400 / y > 400 / x && 400 / y > 400 / z) {
                System.out.println("bob");

            } else if (400 / z > 400 / x && 400 / z > 400 / y) {

            }
            {
                System.out.println("charlie");
            }
        }
    }
}
