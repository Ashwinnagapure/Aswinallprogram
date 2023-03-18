import java.lang.*;
import java.util.*;

class battery {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x <= 15) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
