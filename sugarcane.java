import java.lang.*;
import java.util.*;

class sugarcane {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int n;
            n = s.nextInt()*50;
            int x = (int) (0.2*n);
            int y =(int)(0.2*n);
            int z =(int)(0.3*n);

            System.out.println(n-(x+y+z));


        }
    }
}
