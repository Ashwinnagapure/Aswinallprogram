import java.util.Scanner;

abstract class Shape {
    abstract int area(int a, int b);
}

class Rect extends Shape {
    int area(int a, int b) {
        return a * b;
    }
}

class Tri extends Shape {
    int area(int a, int b) {
        double h = 0.5 * a * b;
        return (int) h;
    }
}

class Cir extends Shape {
    int area(int a, int b) {
        double h = 3.14 * a * a;
        return (int) h;
    }
}

public class Sush {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Shape obj;
        System.out.println("Enter base and height of triangle: ");
        int base = s.nextInt();
        int height = s.nextInt();
        obj = new Tri();
        obj.area(base, height);
        System.out.println("Enter length and breadth of Rectangle: ");
        int length = s.nextInt();
        int breadth = s.nextInt();
        obj = new Rect();
        obj.area(length, breadth);
        System.out.println("Enter radius of Circle");
        int Radius = s.nextInt();
        obj = new Cir();
        obj.area(Radius, 0);
    }

}
