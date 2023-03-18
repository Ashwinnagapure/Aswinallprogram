import java.lang.*;
import java.util.*;

class nextgen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, x, y;
            a = s.nextInt();
            b = s.nextInt();
            x = s.nextInt();
            y = s.nextInt();
            if ((x * y) >= (a * b)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
