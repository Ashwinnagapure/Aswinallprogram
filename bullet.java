import java.lang.*;
import java.util.*;

class bullet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            int a = y/x;
            int b=z-a;

            if (b<0) {
                System.out.println("0");
            } else {
                System.out.println(b);
            }
        }
    }
}
