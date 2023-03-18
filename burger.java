import java.lang.*;
import java.util.*;

class burger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x, k;
            n = s.nextInt();
            x = s.nextInt();
            k = s.nextInt();
            if ((n * x) <= k) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
