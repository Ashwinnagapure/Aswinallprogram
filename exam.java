import java.lang.*;
import java.util.*;

class exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            int x = a + b + c;
            if (x >= 100 && a >= 10 && b >= 10 && c >= 10) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
    }
}
