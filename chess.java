import java.lang.*;
import java.util.*;

class chess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt() * 3;
            System.out.println(n);
        }
    }
}
