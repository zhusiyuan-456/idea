import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JResistor extends JFrame
{

    private JButton jbtResult = new JButton("Result");
    private JComboBox jcboColor = new JComboBox(new String[]{"Black","Brown","Red",
            "Orange","Yellow","Green","Blue","violet","Grey","White"});
    private JComboBox jcboColor2 = new JComboBox(new String[]{"Black","Brown","Red",
            "Orange","Yellow","Green","Blue","violet","Grey","White"});
    private JComboBox jcboColor3 = new JComboBox(new String[]{"Black","Brown","Red",
            "Orange","Yellow","Green","Blue","violet","Grey","White","BLANK"});
    private JComboBox jcboColor4 = new JComboBox(new String[]{"Black","Brown","Red",
            "Orange","Yellow","Green","Blue","violet","Grey","White","gold","silver"});
    private JComboBox jcboColor5 = new JComboBox(new String[]{"gold","silver"});


    private JButton jbtResult1 = new JButton("Band1");
    private JButton jbtResult2 = new JButton("Band2");
    private JButton jbtResult3 = new JButton("Band3");
    private JButton jbtResult4 = new JButton("Multiplier");
    private JButton jbtResult5 = new JButton("Tolerance");



    public JResistor()
    {


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,5));
        panel.add(jcboColor);
        panel.add(jcboColor2);
        panel.add(jcboColor3);
        panel.add(jcboColor4);
        panel.add(jcboColor5);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,5));
        panel2.add(jbtResult1);
        panel2.add(jbtResult2);
        panel2.add(jbtResult3);
        panel2.add(jbtResult4);
        panel2.add(jbtResult5);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2,1));
        panel3.add(panel);
        panel3.add(panel2);

        this.add(panel3,BorderLayout.CENTER);
        this.add(jbtResult, BorderLayout.WEST);


    }






    public static void main(String[] args)
    {



        JResistor frame = new JResistor();
        frame.setTitle("resistor decoder");
        frame.setSize(550,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}