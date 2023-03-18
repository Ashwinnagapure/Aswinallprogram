import java.lang.*;
import java.util.*;

class jenga {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x;
            n = s.nextInt();
            x = s.nextInt();
            if (x % n == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
