import java.lang.*;
import java.util.*;

class f1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if ((x * 1.07) >= y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
