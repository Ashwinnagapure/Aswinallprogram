import java.lang.*;
import java.util.*;

class brain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        x = s.nextInt();
        y = s.nextInt();
        if (x < y) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
