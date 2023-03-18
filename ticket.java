import java.lang.*;
import java.util.*;

class ticket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, p, q;
            x = s.nextInt();
            p = s.nextInt();
            q = s.nextInt();
            System.out.println((p - q) * x);
        }
    }
}
