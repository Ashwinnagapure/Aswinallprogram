import java.lang.*;
import java.util.*;

class height {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, h;
            x = s.nextInt();
            h = s.nextInt();
            if (x > h) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
