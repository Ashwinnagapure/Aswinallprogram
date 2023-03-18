import java.lang.*;
import java.util.*;

class money {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt() * 10;
            y = s.nextInt() * 5;
            System.out.println(x + y);

        }
    }
}
