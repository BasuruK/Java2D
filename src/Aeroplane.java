import java.awt.*;
import java.awt.geom.AffineTransform;

public class Aeroplane extends Trees {

    public void drawAeroplane(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform old = g2d.getTransform();//Store the old state of the transform so that the entire document will stop rotating
        AffineTransform sat = AffineTransform.getTranslateInstance(150,0); // Sheer the element
        sat.shear(-0.7,0);
        g2d.transform(sat);
        g2d.rotate(Math.toRadians(15));

        //Initialize the Tail
        g2d.setPaint(new Color(215, 0, 49));
        Rectangle tail = new Rectangle(850,-140,10,30);


        g2d.draw(tail);
        g2d.fill(tail);

        g2d.setPaint(new Color(1, 7, 27));
        Rectangle tail1 = new Rectangle(860,-140,10,30);
        g2d.draw(tail1);
        g2d.fill(tail1);

        g2d.setTransform(old); // Restore the previous transform state


        //Initialize the body of the Aeroplane
        g2d.setPaint(new Color(198, 198, 198));
        g2d.fillOval(800,100,150,40);

        //Initialize the Windows
        g2d.setPaint(new Color(255,255,255));
        for(int i = 0; i < 5;i++)
        {
            g2d.fillOval(830 + (i * 20),112,8,10);
        }

        //Initialize Wing1
        g2d.setPaint(new Color(255, 255, 255));
        g2d.fillRoundRect(850,125,60,5,10,10);

        //Initialize Engines
        g2d.setPaint(new Color(1, 7, 27));
        g2d.fillRoundRect(860,130,20,10,10,10);

    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawAeroplane(g);

    }
}
