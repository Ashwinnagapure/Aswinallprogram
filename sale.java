import java.lang.*;
import java.util.*;

class sale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x <= 100) {
                System.out.println(x);
            } else if (x > 100 && x <= 1000) {
                System.out.println(x - 25);

            } else if (x > 1000 && x <= 5000) {
                System.out.println(x - 100);

            } else if (x > 5000) {
                System.out.println(x - 500);

            }
        }
    }
}
