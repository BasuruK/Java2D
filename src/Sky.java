import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Sky extends JPanel {

    public void paintSky(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        //Initiate Sky
        GradientPaint lightBluetoDarkBlue = new GradientPaint(0,0,new Color(0x2F838E),800,300,new Color(0x004CC7));
        g2d.setPaint(lightBluetoDarkBlue);
        g2d.fillRect(0,0,getWidth(),getHeight());

        //Initiate Moon
        g2d.setPaint(new Color(0xFFFC3F));
        Area moon = new Area(new Ellipse2D.Double(50,60,80,80));
        Area moonCut = new Area(new Ellipse2D.Double(70,50,80,80));

        moon.subtract(moonCut);
        g2d.fill(moon);

        //Initiate Stars
        g2d.setPaint(new Color(0xFDFFFB));
        AffineTransform old = g2d.getTransform();//Store the old state of the transform so that the entire document will stop rotating
        g2d.scale(0.1,0.1);
        int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
        int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

        GeneralPath star = new GeneralPath();
        star.moveTo( xPoints[ 0 ], yPoints[ 0 ] );

        for ( int k = 1; k < xPoints.length; k++ )
            star.lineTo( xPoints[ k ], yPoints[ k ] );

        star.closePath();

        for(int i = 0; i < 100; i++)
        {
            g2d.translate(Math.random() * 1000 + 20,Math.random() * 500 + 0);
            g2d.fill(star);
            g2d.translate(Math.random() * 1000 + 20,Math.random() * 20 + 0);
            g2d.fill(star);
        }



        g2d.setTransform(old); // Restore the previous transform state
    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        paintSky(g);

    }
}
