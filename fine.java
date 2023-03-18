import java.lang.*;
import java.util.*;

class fine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x <= 70) {
                System.out.println("0");
            } else if (x > 70 && x <= 100) {
                System.out.println("500");

            } else if (x > 100) {
                System.out.println("2000");

            }
        }
    }
}
