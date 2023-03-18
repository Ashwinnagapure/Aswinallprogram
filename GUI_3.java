//import java.swing.*;
//
//public class GUI_3 extends implements ActionListener
//{
//
//    JLabel l1,l2;
//    JTextField t1,t2,t3;
//    JButton b1,b2;
//
//    public GUI_3()
//    {
//        JFrame f = new JFrame("calculator");
//        l1 = new JLabel("First No");
//        l1.setBounds(20,20,50,40);
//
//        t1 = new JTextField();
//        t1.setBounds(80,20,50,40);
//
//        l2 = new JLabel("Second No");
//        l2.setBounds(20,40,50,40);
//
//        t2 = new JTextField();
//        t2.setBounds(80,40,50,40);
//
//        t3 = new JTextField();
//        t3.setBounds(80,60,50,40);
//        t3.setEditable(false);
//
//        b1 = new Button("+");
//        b1.setBounds(50,80,20,20);
//
//        b2 = new Button("-");
//        b2.setBounds(80,80,20,20);
//
//        b1.addActionListener(this);
//        b2.addActionaListener(this);
//
//        j.add(l1);
//        j.add(l2);
//        j.add(t1);
//        j.add(t2);
//
//        j.setSize(300,300);
//        j.setLayout(null);
//        j.setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e)
//    {
//        int a = Integer.parseInt(t1.gettext());
//        int b = Integer.parseInt(t2.gettext());
//        int c=0;
//        if(a.getsource()==b1)
//        {
//            c = a+b;
//        }
//        else
//        {
//            c = a-b;
//        }
//        t3.setText(result+"");
//    }
//    public static void main(String[] args)
//    {
//        GUI_3  a=new GUI_3();
//    }
//}