import java.lang.*;
import java.util.*;

class enroll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, m, k;
            n = s.nextInt();
            m = s.nextInt();
            k = s.nextInt();
            if ((m - k) >= n) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
