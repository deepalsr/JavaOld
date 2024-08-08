import java.awt.*;

public class BarChart extends Frame {
    BarChart(){
        setSize(250,200);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(45,50,45,100);
        g.drawLine(45,100,150,100);
        g.drawRect(50,80,20,20);
        g.drawRect(75,65,20,35);
        g.drawRect(100,70,20,30);
        g.drawRect(125,85,20,15);
        g.setFont(new Font(Font.SERIF,Font.BOLD,7));
        g.drawString("Java",50,120);
        g.drawString("php",75,120);
        g.drawString("python",100,120);
        g.drawString("GoLang",125,120);
        g.drawString("Languages",170,120);
        g.drawString("No. of Stds",40,40);
        int x=35,y=100, val =0;
        for(int i = 0;i<=4;i++){
            g.setFont(new Font(Font.SERIF,Font.BOLD,5));

            g.drawString(String.valueOf(val),x,y);
            val = val +10;
            y=y-10;

        }



    }

    public static void main(String[] args) {
        new BarChart();
    }

}
