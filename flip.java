import java.lang.*;
import java.util.*;

class flip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x;
            n = s.nextInt();
            x = s.nextInt();
            int z = Math.min(n, x);
            if (x == 0) {
                System.out.println("0");
            } else if (n == x) {
                System.out.println(n - x);

            } else if (n >= x) {
                System.out.println(z);

            }
        }
    }
}
