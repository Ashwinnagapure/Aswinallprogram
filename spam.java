import java.lang.*;
import java.util.*;

class spam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            x = 10*y;
            if (x >= y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
