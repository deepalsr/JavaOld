import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Circle extends JPanel {
    private int x = 100;
    private  int y = 100;
    public Circle(){
        setLayout(new BorderLayout());
        JPanel circlePanel = new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawOval(x,y,100,100);
            }

        };
        circlePanel.setPreferredSize(new Dimension(200,200));
        JPanel buttonPanel = new JPanel();
        JButton up = new JButton("Up");
        buttonPanel.add(up);
        JButton down = new JButton("Down");
        buttonPanel.add(down);
        JButton left = new JButton("left");
        buttonPanel.add(left);
        JButton right = new JButton("Right");
        buttonPanel.add(right);

        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y = y-5;
                repaint();
            }
        });

        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y=y+5;
                repaint();
            }
        });

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-5;
                repaint();
            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+5;
                repaint();
            }
        });

        add(circlePanel, BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Circle circle = new Circle();
        frame.getContentPane().add(circle);
        frame.setSize(500,500);
        frame.pack();
        frame.setVisible(true);
    }
}
