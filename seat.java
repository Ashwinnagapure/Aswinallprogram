import java.lang.*;
import java.util.*;

class seat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (y < x)
                System.out.println("0");
            else {
                System.out.println(y - x);
            }
        }
    }
}
