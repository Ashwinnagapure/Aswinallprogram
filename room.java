import java.lang.*;
import java.util.*;

class room {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt() ;
            y = s.nextInt() ;
            int min , max ;
            min=x/3;
            max=y/2;
            if (min > max) {
                System.out.println(y * 2);
            } else {
                System.out.println(x * 3);
            }

        }
    }
}
