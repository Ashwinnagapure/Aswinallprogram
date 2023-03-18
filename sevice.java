import java.lang.*;
import java.util.*;

class sevice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x;
            n = s.nextInt();
            x = s.nextInt();
            if (n > 6) {
                System.out.println((n / 6) * x);
            }

            else {
                System.out.println(x);
            }
        }

    }
}
