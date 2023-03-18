import java.lang.*;
import java.util.*;

class netflix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z, a;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            a = s.nextInt();
            if (a <= (x + y) || a <= (x + z) || a <= (y + z)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
