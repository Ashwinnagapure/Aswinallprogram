import java.lang.*;
import java.util.*;

class page {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y, z;
            x = s.nextInt();
            y = s.nextInt();
            z = s.nextInt();
            if (x > y && x > z) {
                System.out.println("setter");
            } else if (y > x && y > z) {
                System.out.println("tester");

            } else if (z > x && z > y) {
                System.out.println("Editorialist");

            }
        }
    }
}
