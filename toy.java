import java.lang.*;
import java.util.*;

class toy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();

            System.out.println(100 - x);
        }
    }
}
