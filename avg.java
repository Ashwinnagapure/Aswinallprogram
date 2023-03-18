import java.lang.*;
import java.util.*;

class avg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            float a = (x + y) / 2;
            if (a > z) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
