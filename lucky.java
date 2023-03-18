import java.lang.*;
import java.util.*;

import static java.lang.String.*;

class lucky {
    public static void main(String[] args)
    {
        Scanner  s = new Scanner(System.in);
        int t ;
        t=s.nextInt();
        while(t-- >0)
        {
            int x;
            x=s.nextInt();
            String a = Integer.toString(x);


            if (a.lastIndexOf(x)==7)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
