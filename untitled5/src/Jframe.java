import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;

public interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

public interface AdjustmentListener {
    public void adjustmentValueChanged(AdjustmentEvent e);
}


public class MyWindow extends JFrame {
    private JPanel p;
    public MyWindow() {
        super();
        JButton a = new JButton("a");
        JScrollBar s = new JScrollBar();