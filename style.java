import java.lang.*;
import java.util.*;

class style {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x1, y1, x2, y2;
            x1 = s.nextInt();
            y1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            int min;
            if ((x1 + y1) > (x2 + y2)) {
                min = (x2 + y2);
                System.out.println(min);
            } else {
                min = (x1 + y1);
                System.out.println(min);
            }
        }
    }
}
