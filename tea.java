import java.lang.*;
import java.util.*;

class tea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            int a = x / y;
            if (x % y != 0) {
                System.out.println((a + 1) * z);
            } else {
                System.out.println(a * z);
            }
        }
    }
}
