import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JButton btn = new JButton("Button1");

        JButton btn1 = new JButton("Button2");

        JButton btn2 = new JButton("Button3");

        JButton btn3 = new JButton("Long range Button");

        JButton btn4 = new JButton("5");

        btn.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btn4.setAlignmentX(JButton.CENTER_ALIGNMENT);

        panel.add(btn);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);


        frame.add(panel);

        frame.setVisible(true);


    }


}