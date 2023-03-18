import java.lang.*;
import java.util.*;

class hackerman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int a, b;
            a = s.nextInt();
            b = s.nextInt();
            int c = a + b;
            int count = 0;
            for (int i = 2; i < c; i++) {
                if (c % i == 0) {
                    count++;
                }
            }
            if ( count==0) {
                System.out.println("alice");
            } else {
                System.out.println("bob");

            }
        }
    }
}
