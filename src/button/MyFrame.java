package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private int widthFrame;
    private int heightFrame;
    JButton button;
    JLabel label;

    // Constructor
    public MyFrame() {
        widthFrame = 700;
        heightFrame = 700;

        ImageIcon icon = new ImageIcon("test.png");

        // Button stuff
        button = new JButton();
        button.setBounds(200, 100, 350, 200);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setForeground(Color.RED);

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(UIManager.getColor("control"));
            }
        });

        // Label stuff
        label = new JLabel("Hello world");
        label.setSize(100, 50);
        label.setBackground(Color.BLACK);
        label.setLocation(100, 50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(widthFrame, heightFrame);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("\033[0;34mpoo");
        }
    }
}
