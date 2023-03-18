import java.lang.*;
import java.util.*;

class CLIMATE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int c;
            c = s.nextInt();
            if (c > 20) {
                System.out.println("hot");
            } else {
                System.out.println("cold");
            }
        }

    }
}
