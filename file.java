import java.lang.*;
import java.util.*;

class file {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x, y;
            n = s.nextInt();
            x = s.nextInt();
            y = s.nextInt();
            int z = (x * 1) + (y * 2);
            if (n >= z) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
