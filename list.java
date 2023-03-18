import java.lang.*;
import java.util.*;

class list {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();

            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] >= 1000) {
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
