import java.lang.*;
import java.util.*;

class car {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x <= 300) {
                System.out.println(300 * 10);
            } else {
                System.out.println(x * 10);
            }
        }
    }
}
