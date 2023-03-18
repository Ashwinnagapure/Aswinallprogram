import java.lang.*;
import java.util.*;

class gym {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (z >= (x + y)) {
                System.out.println("2");
            } else if (z >= x && z < (x + y)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }
    }
}
