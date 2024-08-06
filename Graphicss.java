import java.awt.*;

public class Graphicss extends Frame {
    Graphicss(){
        setSize(500,500);
        setVisible(true);
    }
public  void paint(Graphics g){
super.paint(g);
g.drawLine(100,400,100,300);
g.drawLine(100,300,100,100);
g.drawLine(100,100,300,200);
g.drawLine(300,200,150,200);
g.drawLine(150,200,300,400);
g.drawLine(300,400,100,400);
g.drawLine(100,400,100,450);
}

    public static void main(String[] args) {
       new Graphicss();
    }

}
