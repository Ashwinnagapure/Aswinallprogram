import java.lang.*;
import java.util.*;

class online {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x = s.nextInt();

            if (x / 10 > 100) {
                System.out.println((x / 10));
            } else {
                System.out.println("100");
            }
        }


    }
}
