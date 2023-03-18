import java.lang.*;
import java.util.*;

class investment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt() * 2;
            if (x >= y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
