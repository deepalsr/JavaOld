import javax.swing.*;
import java.awt.event.*;

public class MenuFX extends JFrame implements MouseListener,ActionListener {
    JPopupMenu file;
    JMenuItem i1,i2,i3;
    JLabel label;
    public  MenuFX() {
        file = new JPopupMenu();
        add(file);
        i1 = new JMenuItem("Hello");
        file.add(i1);
        i2 = new JMenuItem("Hola");
        file.add(i2);
        i3 = new JMenuItem("Namaste");
        file.add(i3);
        label = new JLabel();
        label.setBounds(100, 100, 200, 200);
        add(label);

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);


        addMouseListener(this);
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        file.show(this,e.getX(),e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MenuFX();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        label.setText(s+" item is selected");
    }
}
