import java.lang.*;
import java.util.*;

class summer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, m;
            x = s.nextInt();
            y = s.nextInt();
            m = s.nextInt();
            if ((x * m) >= y) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
