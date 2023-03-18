import java.lang.*;
import java.util.*;

class pizza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x;
            n = s.nextInt();
            x = s.nextInt();
            if (x % 2 == 0) {
                System.out.println((n * x) / 4);
            } else {
                System.out.println(((n * x) / 4) + 1);
            }
        }
    }
}
