import java.lang.*;
import java.util.*;

class flow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int w, x, y, z;
            w = s.nextInt();
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (x > (w + (y * z))) {
                System.out.println("unfilled");
            } else if (x < (w + (y * z))) {
                System.out.println("overflow");

            } else {
                System.out.println("filled");
            }
        }
    }
}
