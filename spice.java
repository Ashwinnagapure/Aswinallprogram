import java.lang.*;
import java.util.*;

class spice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x;
            x=s.nextInt();
            if (x < 4) {
                System.out.println("mild");
            } else if (x >= 4 && x < 7) {
                System.out.println("medium");
            } else if (x >= 7) {
                System.out.println("hot");

            }
        }
    }
}
