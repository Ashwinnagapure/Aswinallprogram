import java.lang.*;
import java.util.*;

class setter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            double x, y;
            x = s.nextDouble();
            y = s.nextDouble();
            double z = (double) (y / x) * 100;
            if (z >= 50) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
