import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouse {
    mouse(){
        Frame frame = new Frame();
        TextField txt = new TextField();
        TextField txt1 = new TextField();
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                txt.setText("Mouse is inside the frame");
                Point mousePos = MouseInfo.getPointerInfo().getLocation();
                txt1.setText(String.valueOf(mousePos));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                txt.setText("Mouse is outside.");
                txt1.setText(null);


            }
        });
        frame.add(txt);
        frame.add(txt1);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new mouse();
    }
}
