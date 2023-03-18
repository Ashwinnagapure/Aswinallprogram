import java.lang.*;
import java.util.*;

class lunch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt();
            if (n >= 1 && n < 4) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }
        }
    }

}
