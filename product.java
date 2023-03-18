import java.lang.*;
import java.util.*;

class product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if ((a * b) < 0 || (a * c) < 0 || (b * c) < 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
