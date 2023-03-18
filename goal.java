import java.lang.*;
import java.util.*;

class goal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (x == y && x != 0 && y != 0)
                System.out.println("yes");
            else if (x == 1 && y == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
