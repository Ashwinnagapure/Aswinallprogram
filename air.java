import java.lang.*;
import java.util.*;

class air {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if (b >= a && c < b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
