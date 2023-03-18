import java.lang.*;
import java.util.*;

class topic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c, x;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        x = s.nextInt();
        if (a == x || b == x || c == x) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
