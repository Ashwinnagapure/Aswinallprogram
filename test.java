import java.lang.*;
import java.util.*;

class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x, y;
            n = s.nextInt();
            x = s.nextInt();
            y = s.nextInt();

            if (n < (x * y)) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }
        }
    }
}
