import java.lang.*;
import java.util.*;

class rating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int z = x + 200;
            if (z >= y && y > x) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
