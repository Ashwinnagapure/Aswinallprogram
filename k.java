import javax.swing.*;
import java.awt.*;


class Akash extends JFrame
{
    JFrame f = new JFrame("LOGIN");
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b;

    public Akash()
    {
        l1 = new JLabel("Username");
        l1.setBounds(20,20,80,20);

        t1 = new JTextField();
        // t1.setBounds
        t1.setBounds(120,20,50,20);

        l2 = new JLabel("Password");
        l2.setBounds(20,50,80,20);

        t2 = new JTextField();
        t2.setBounds(120,50,50,20);

        b = new JButton("LOGIN");
        b.setBounds(80,100,80,20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}


public class Login
{
    public static void main(String args[])
    {
        Akash a=new Akash();
    }
}