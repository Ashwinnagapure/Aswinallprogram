import java.lang.*;
import java.util.*;

class candy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n, x;
            n = s.nextInt();
            x = s.nextInt();
            int z = n - x;
            int y = z / 4;
            if (n < x) {
                System.out.println("0");
            } else if (z % 4 != 0)
                System.out.println(y + 1);
            else {
                System.out.println(y);
            }
        }
    }
}
