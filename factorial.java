import java.lang.*;
import java.math.BigInteger;
import java.util.*;

class factorial {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt();
            BigInteger a = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                a = a.multiply(BigInteger.valueOf(i));
                System.out.println(a);
            }
        }

    }
}
