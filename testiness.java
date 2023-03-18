import java.lang.*;
import java.util.*;

class testiness {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt() * 2;
            y = s.nextInt() * 5;
            if (x > y) {
                System.out.println("chocolate");
            } else if (y > x) {
                System.out.println("candy");

            } else {
                System.out.println("either");
            }
        }
    }
}
