import java.lang.*;
import java.util.*;

class rain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x < 3) {
                System.out.println("light");
            } else if (x >= 3 && x < 7) {
                System.out.println("moderate");

            } else if (x >= 7) {
                System.out.println("heavy");
            }
        }
    }
}
