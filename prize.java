import java.lang.*;
import java.util.*;

class prize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            System.out.println((10 * x) + (90 * y));

        }
    }
}
