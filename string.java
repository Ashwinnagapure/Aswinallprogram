import java.lang.*;
import java.util.*;

public class string {
    public static void main(String[] args) {
        String str3 = "hello";
        char c[] = {'a', 'b', 'c', 'd'};
        String str1 = new String(c);
        System.out.println(str1);
        byte b[] = {64, 65, 66, 67};
        String str2 = new String(b);
        System.out.println(str2);
        System.out.println(str3);

    }

}
