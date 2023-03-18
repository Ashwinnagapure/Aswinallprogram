import java.lang.*;
import java.util.*;

class notebook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt();

            System.out.println((n * 1000) / 100);
        }
    }
}
