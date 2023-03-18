import java.lang.*;
import java.util.*;

class profit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            if (x % 100 == 0) {
                int z = (x/100)*100 ;
                System.out.println((z + y) - (x - y));
            } else {
                System.out.println("0");
            }
        }
    }
}
