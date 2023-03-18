import java.lang.*;
import java.util.*;

class mahasena {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int even = 0;
        int odd = 0;
        while (n-- > 0) {
            int a;
            a = s.nextInt();
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        if (even > odd) {
            System.out.println("ready for battle");
        } else {
            System.out.println("not ready");
        }
    }
}