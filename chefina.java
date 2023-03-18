import java.lang.*;
import java.util.*;

class chefina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt() * 5;
            y = s.nextInt() * 10;
            z = s.nextInt();
            System.out.println((x + y) / z);
        }
    }
}
