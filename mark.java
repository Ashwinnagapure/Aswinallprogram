import java.lang.*;
import java.util.*;

class mark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();
            int y = x / 3;
            if (x % 3 != 0) {
                System.out.println(((y + 1)*3)-x);
            } else {
                System.out.println("0");
            }
        }
    }
}
