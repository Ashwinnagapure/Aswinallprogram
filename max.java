import java.lang.*;
import java.util.*;

class max {
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
            if ((x > y || x > z) && (x < y || x < z)) {
                ans = x;
            } else if ((y > x || y > z) && (y < x || y < z)) {
                ans = y;
            } else {
                ans = z;
            }
            System.out.println(ans);

        }
    }
}
