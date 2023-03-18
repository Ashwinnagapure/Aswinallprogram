import java.util.Scanner;
class Parent {
    int phy, che;

    public void get_data(int phy, int che) {
        this.phy = phy;
        this.che = che;
    }
}
    class der extends Parent
    {
       void marks()
       {
           System.out.println((phy+che));
       }
    }

public class inheritance {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        Parent p=new Parent();
        der c=new der();
        int phy;
        System.out.println("enter the marks 1");
        phy = s.nextInt();

        int che;
        System.out.println("enter the marks 2");
        che = s.nextInt();
        p.get_data(phy,che);


    }
}
