import java.lang.*;
import java.util.*;

class song {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt() * 3;
            System.out.println(x / y);

        }
    }
}
