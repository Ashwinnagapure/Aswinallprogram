import java.lang.*;
import java.util.*;

class winner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int p1, p2, q1, q2;
            p1 = s.nextInt();
            p2 = s.nextInt();
            q1 = s.nextInt();
            q2 = s.nextInt();
            int a = Math.max(p1, p2);
            int b = Math.max(q1, q2);

            if (a > b) {
                System.out.println("q");
            } else if (b > a) {
                System.out.println("p");

            } else {
                System.out.println("tie");
            }
        }
    }
}
