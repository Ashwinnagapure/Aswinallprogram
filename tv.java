import java.lang.*;
import java.util.*;

class tv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a1, b1, a2, b2;
            a1 = s.nextInt();
            b1 = s.nextInt();
            a2 = s.nextInt();
            b2 = s.nextInt();
            if ((a1 - a2) < (b1 - b2)) {
                System.out.println("first");
            } else if ((a1 - a2) > (b1 - b2)) {
                System.out.println("second");

            } else {
                System.out.println("any");
            }
        }
    }
}
