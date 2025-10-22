package button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private int width;
    private int height;
    JButton button;

    // Constructor
    public MyFrame() {
        width = 700;
        height = 700;

        ImageIcon icon = new ImageIcon("test.png");

        button = new JButton();
        button.setBounds(200, 100, 350, 200);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(width, height);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("poo");
        }
    }
}
