import java.lang.*;
import java.util.*;

class stock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();//bought
            y = s.nextInt();//sold
            if (x < y) {
                System.out.println("profit");
            } else if (x > y) {
                System.out.println("loss");

            } else {
                System.out.println("neutral");
            }
        }

    }
}
