import java.lang.*;
import java.util.*;

class exit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x <= 50) {
                System.out.println("left");
            } else if (x <= 100 && x >= 51) {
                System.out.println("right");

            }
        }
    }
}
