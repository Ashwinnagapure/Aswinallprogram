import java.lang.*;
import java.util.*;

class mask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (x * 100 >= y * 10) {
                System.out.println("cloth");
            } else if (x * 100 == y * 10) {
                System.out.println("cloth");

            } else {
                System.out.println("disposal");
            }
        }
    }
}
