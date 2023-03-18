import java.lang.*;
import java.util.*;

class tennis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int r1, r2, r3, r4;
            r1 = s.nextInt();
            r2 = s.nextInt();
            r3 = s.nextInt();
            r4 = s.nextInt();
            if (r1 == 0 && r2 == 0 && r3 == 0 && r4 == 0) {
                System.out.println("in");
            } else {
                System.out.println("out");
            }
        }
    }
}
