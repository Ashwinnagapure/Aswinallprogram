
import java.lang.*;
import java.util.*;

class million {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            System.out.println((x + z) - y);
        }
    }
}
