import java.lang.*;
import java.util.*;

class mario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x % 3 == 0) {
                System.out.println("normal");
            } else if (x % 3 == 1) {
                System.out.println("huge");

            } else if (x % 3 == 2) {
                System.out.println("small");

            }

        }
    }
}
