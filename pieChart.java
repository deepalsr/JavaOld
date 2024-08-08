import java.awt.*;

public class pieChart extends Frame {
    pieChart(){
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        int supportive = (25*360)/48;
        int against = (15*360/48);
        int neutral = (8*360/48);
        g.drawOval(150,50,200,200);
        g.setColor(Color.red);
        g.fillArc(150,50,200,200,0,supportive);
        g.setColor(Color.CYAN);
        g.fillArc(150,50,200,200,supportive,against);
        g.setColor(Color.green);
        g.fillArc(150,50,200,200,supportive+against,neutral);
        g.setColor(Color.black);
       g.drawLine(300,100,400,100);
       g.drawString("Supportive",410,100);
       g.drawLine(200,200,75,200);
       g.drawString("Against",20,200);
       g.drawLine(300,200,400,200);
       g.drawString("Neutral",410,200);

    }

    public static void main(String[] args) {
        new pieChart();
    }
}
