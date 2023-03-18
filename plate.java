import java.lang.*;
import java.util.*;

class plate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, m, x;
            n = s.nextInt() * 2;
            m = s.nextInt() * 2;
            x = s.nextInt();
            System.out.println((n + m) * x);

        }
    }
}
