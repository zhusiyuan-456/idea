package question3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mywindow {
    public class Win4 extends JFrame {
        private JTextField tf;
        private void buildMenu() {
            JMenuBar mb = new JMenuBar();
            JMenu m = new JMenu("File");
            JMenuItem mi = new JMenuItem("Quit");
            mi.addActionListener(
                    new ActionListener() { //name = Win4$1
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    }
            );
            m.add(mi);
            mb.add(m);
            setJMenuBar(mb);
        }
        public Window(Color bg, int w, int h) {
            super("My Window"); // super must be the first line of constructor
            this.setSize(w,h);
            Container c = getContentPane();
            Font f = new Font("Times", Font.BOLD, 28);
            c.setBackground(bg);
            JButton b = new JButton("test");
            b.addActionListener(new MyListener());
            JButton b2 = new JButton("1");
            b2.setFont(f2);
            MyListener2 mylistener = new MyListener2();
            b2.addActionListener(mylistener);
            c.add(b, BorderLayout.EAST);
            c.add(b2, BorderLayout.CENTER);
            text.setFont(f);
            c.add(text, BorderLayout.NORTH);
            c.add(tf, BorderLayout.SOUTH);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            buildMenu();
            setVisible(true);
        }}