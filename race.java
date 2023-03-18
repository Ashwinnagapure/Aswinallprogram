import java.lang.*;
import java.util.*;

class race {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b;
            a = s.nextInt();
            b = s.nextInt();

            System.out.println(a + b);
        }
    }
}
