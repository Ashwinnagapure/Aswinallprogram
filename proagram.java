import java.lang.*;
import java.util.*;

class proagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt();
            if (n % 4 == 0) {
                System.out.println("good");
            } else {
                System.out.println("not good");
            }
        }
    }
}
