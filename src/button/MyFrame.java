package button;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements ActionListener, MouseListener {
    private int widthFrame;
    private int heightFrame;
    JButton button;
    JLabel label;
    Border buttonBorder;

    // Constructor
    public MyFrame() {
        widthFrame = 700;
        heightFrame = 700;

        ImageIcon icon = new ImageIcon("test.png");
        buttonBorder = BorderFactory.createLineBorder(Color.BLUE);

        // Button stuff
        button = new JButton();
        button.setBounds(300, 200, 350, 200);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setForeground(Color.RED);
        button.setBackground(Color.MAGENTA);
        button.setBorder(buttonBorder);

        button.addMouseListener(this);

        // Label stuff
        label = new JLabel("Hello world");
        label.setSize(400, 200);
        label.setBackground(Color.BLACK);
        label.setLocation(100, 50);
        label.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(widthFrame, heightFrame);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        this.setTitle("My window");
        this.setIconImage(icon.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("\033[0;34mpoo\033[0m");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        button.setBackground(Color.RED);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        button.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        button.setBackground(Color.MAGENTA);
    }
}
