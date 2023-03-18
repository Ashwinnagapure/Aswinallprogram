import java.lang.*;
import java.util.*;

class shoe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int a = (y - x) / 8;
            if (x >= y) {
                System.out.println("0");


            } else if (a % 8 == 0) {
                System.out.println(a);
            } else {
                System.out.println(a + 1);
            }
        }
    }
}
