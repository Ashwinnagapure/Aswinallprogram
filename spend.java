import java.lang.*;
import java.util.*;

class spend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (x >= (y * 30)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
