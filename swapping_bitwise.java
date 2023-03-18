import java.lang.*;
import java.util.*;

public class swapping_bitwise {
    public static void main(String[] args) {
        int a = 10, b = 9;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("the swapping is " + a + " " + b);
    }
}
