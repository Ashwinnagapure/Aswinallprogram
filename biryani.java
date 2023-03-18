import java.lang.*;
import java.util.*;

class biryani {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int pay = x * y;
            System.out.println(pay);
        }

    }
}
