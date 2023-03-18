import java.lang.*;
import java.util.*;

class meet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            if (x <= 30) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
