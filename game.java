import java.lang.*;
import java.util.*;

class game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            int attack;
            attack = y / x;
            System.out.println(attack);
        }
    }
}
