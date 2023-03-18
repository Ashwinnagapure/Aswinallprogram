import java.lang.*;
import java.util.*;

class police {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (x > y) {
                System.out.println(x - y);
            } else {
                System.out.println(y - x);
            }
        }
    }
}
