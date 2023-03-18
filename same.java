import java.lang.*;
import java.util.*;

class same {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if ((i + j) == n) {
                    System.out.println(i+""+j);
                    count++;
                } else if ((j + i) == n) {
                    System.out.println(j+""+i);
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
