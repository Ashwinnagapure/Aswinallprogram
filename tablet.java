
import java.lang.*;
import java.util.*;

class tablet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt()*3;
            y = s.nextInt() ;
            if (x <= y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
