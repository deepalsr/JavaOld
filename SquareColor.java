import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareColor extends JPanel {
    private Color squareColor = Color.white;

    public SquareColor() {
        setLayout(new BorderLayout());
        JPanel squarepanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(squareColor);
                g.fillRect(100, 100, 100, 100);
                g.setColor(Color.black);
                g.drawRect(100, 100, 100, 100);
            }

        };
        squarepanel.setPreferredSize(new Dimension(200,200));

        JPanel buttonpanel = new JPanel();
        JButton btn = new JButton("Red");
        buttonpanel.add(btn);
        JButton btn1 = new JButton("Blue");
        buttonpanel.add(btn1);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                squareColor = Color.red;
                repaint();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                squareColor = Color.blue;
                repaint();
            }
        });
        add(squarepanel, BorderLayout.CENTER);
        add(buttonpanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        SquareColor sc = new SquareColor();
        frame.getContentPane().add(sc);
        frame.pack();
        frame.setSize(555,555);
        frame.setVisible(true);
    }
}