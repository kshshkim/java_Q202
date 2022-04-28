package java_Q202;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class KeyListenerEx extends JFrame {
    private final JLabel [] keyMessage;

    public KeyListenerEx() {
        setTitle("ddd");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new MyKeyListener());

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel("getKeyCode()");
        keyMessage[1] = new JLabel("getKeyChar()");
        keyMessage[2] = new JLabel("getKeyText()");

        for (JLabel jLabel : keyMessage) {
            c.add(jLabel);
            jLabel.setOpaque(true);
            jLabel.setBackground(Color.yellow);
            setSize(300, 150);
            setVisible(true);

            c.setFocusable(true);
            c.requestFocus();
        }
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(e.getKeyText(keyCode));
        }
    }
    public static void main(String[] args){
        new KeyListenerEx();
    }
}