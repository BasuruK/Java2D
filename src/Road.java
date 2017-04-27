import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

//The Road class extends Trees class which will mimic the effects of two or more panels being in the same JFrame.
//because it is impossible to implement this in conventional ways.
public class Road extends Buildings {

    private void drawRoad(Graphics g)
    {
        //RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        Graphics2D g2d = (Graphics2D) g;
        AffineTransform old = g2d.getTransform();//Store the old state of the transform so that the entire document will stop rotating
        //Initialize the main road
        g2d.setPaint(new Color(7, 3, 2));
        g2d.fillRect(0,600,1800,300);

        //Initialize Road divider marks
        g2d.setPaint(new Color(255, 255, 255));

        //Transform the rectangles to Perambulates
        AffineTransform sat = AffineTransform.getTranslateInstance(150,0);
        sat.shear(-0.7,0);
        g2d.transform(sat);

        //Paint Road dividers
        for(int i = 0; i < 12; i++)
        {
            g2d.fillRect(i * 200,710,130,20);
        }

        g2d.setTransform(old); // Restore the previous transform state

        //Initiate Road-Ground Separator
        g2d.setPaint(new Color(103, 103, 103));
        g2d.fill3DRect(0,590,1800,25,true);

        //Initiate Pedestrian Walk
        g2d.setPaint(new Color(103, 86, 57));
        g2d.fill3DRect(0,540,1800,50,true);


    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawRoad(g);

    }

}
