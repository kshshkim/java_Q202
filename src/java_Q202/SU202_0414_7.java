package java_Q202;

import javax.swing.*;
import java.awt.*;

class ToolTipDelayEx extends JFrame {
    public ToolTipDelayEx() {
        setTitle("툴팁  지연 시간 제어 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel cherryLabel = new JLabel(new
                ImageIcon("images/img.jpeg"));
        cherryLabel.setToolTipText("체리 이미지 어때요");
        JLabel appleLabel = new JLabel(new ImageIcon("images/img2.jpeg"));
        appleLabel.setToolTipText("사과 이미지 어때요");
        c.add(cherryLabel);
        c.add(appleLabel);

        ToolTipManager m = ToolTipManager.sharedInstance();
        m.setInitialDelay(0);
        m.setDismissDelay(3000);

        setSize(800,600);
        setVisible(true);
    }

    public static void main(String [] args) {
        new ToolTipDelayEx();
    }
}


public class SU202_0414_7 {
}
