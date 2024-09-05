import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JLabel label;
    JMenuBar mb;
    JMenu file;
    JMenuItem item1;
    JMenuItem item2;
    JMenuItem item3;

    public Menu(){
        mb = new JMenuBar();
        setJMenuBar(mb);
         file = new JMenu("File");
        mb.add(file);
         item1 = new JMenuItem("Open");
         item2 = new JMenuItem("Close");
         item3 = new JMenuItem("Send");
        file.add(item1);
        file.add(item2);
        file.add(item3);
        label = new JLabel();
        label.setBounds(100,100,300,300);
        add(label);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        label.setText(s+" item is selected");
    }

    public static void main(String[] args) {
        new Menu();
    }
}
