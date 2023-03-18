import java.lang.*;
import java.util.*;

class monopoly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (x > (y + z) || y > (x + z) || z > (x + y)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
