import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Akash extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    JLabel l1;
    public Akash()
    {
        t1=new JTextField(20);
        t2=new JTextField( 20);
       // t3=new JTextField(20);
        b1=new JButton("add");
        b2=new JButton("sub");
        b3=new JButton("mul");
        b4=new JButton("div");

        l1=new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        //b1.createActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        int value ;
 if (e.getSource()==b1) {
     value = num1 + num2;
 } else if (e.getSource()==b2) {
     value=num1-num2;

 }
 else if (e.getSource()==b3) {
     value=num1*num2;

 }
 else  {
     value=num1/num2;

 }

        l1.setText(value+"");

    }
}

public class Calci
{
    public static void main(String[] args)
    {
        Akash a =new Akash();
    }
}