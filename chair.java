import java.lang.*;
import java.util.*;

class chair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int z = x - y;
            if (z >= 0) {
                System.out.println(z);
            } else if (z < 0) {
                z = 0;
                System.out.println(z);
            }
        }
    }
}
