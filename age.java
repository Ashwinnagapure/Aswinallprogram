import java.lang.*;
import java.util.*;

public class age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        int x, y;
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            age = s.nextInt();
            x = s.nextInt();
            y = s.nextInt();
            if (age >= x ) {
                System.out.println("yes");
            } else if (age < y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
