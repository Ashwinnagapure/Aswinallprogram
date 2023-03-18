import javax.swing.*;
import java.awt.*;
public class awt {

    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setLayout(new FlowLayout());
        Button b=new Button("ok");
        Label l=new Label();
        TextField tf=new TextField(20);
        f.add(b);
        f.add(l);
        f.add(tf);
        f.setSize(300,300);
        f.setVisible(true);

    }
}