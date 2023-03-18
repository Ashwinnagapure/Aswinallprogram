import java.lang.*;
import java.util.*;

class rank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            int y = x / 25;
            if (x <= 25) {
                System.out.println("1");
            } else if (y % 25 != 0) {
                System.out.println(y + 1);
            } else {
                System.out.println(y);
            }
        }
    }
}
