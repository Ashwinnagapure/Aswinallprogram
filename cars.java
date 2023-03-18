import java.lang.*;
import java.util.*;

class cars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt();
            int a = n / 4;
            if (n % 4 != 0) {
                System.out.println(a + 1);
            } else {
                System.out.println(a);
            }
        }
    }
}
