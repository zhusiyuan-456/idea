import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
    public calculator(){
        super("Grid Buttons");
        Container c=getContentPane();
        c.setLayout(new GridLayout(4,4));
        for (int i=0;i<10;i++){
            JButton b=new JButton((i+" "));
            c.add(b);
        }
        JButton b=new JButton(("+"));
        JButton e=new JButton(("-"));
        JButton a=new JButton(("*"));
        JButton bc=new JButton(("/"));
        c.add(b);
        c.add(e);
        c.add(a);
        c.add(bc);
        setSize(800,600);
        setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new calculator();
    }
}
