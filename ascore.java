import java.lang.*;
import java.util.*;

class ascore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b, c;
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if ((a + b) / 2 < 35 || (a + c) / 2 < 35 || (b + c) / 2 < 35) {
                System.out.println("fail");
            } else {
                System.out.println("pass");
            }
        }
    }
}
