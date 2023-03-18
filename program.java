import java.lang.*;
import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int a[] = new int[3];
        for (i = 0; i < 3; i++) {
            a[i] = s.nextInt();

        }


        int count = 0;
        for (i = 0; i < 4; i++) {
            if (a[i] >= 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
