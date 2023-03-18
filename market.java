import java.lang.*;
import java.util.*;

class market {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, a, b;
        x = s.nextInt();
        a = s.nextInt();
        b = s.nextInt();
        if (x > (a + b)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
