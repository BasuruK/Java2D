import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;

public class Cars extends Aeroplane {

    public void drawCar(Graphics g)
    {
        //Set Antialiasing Levels
        RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        Graphics2D g2d = (Graphics2D) g;

        drawNormalCar(g);

    }


    public void drawNormalCar(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Initialize the Base
        //g2d.setPaint(new Color(0xD73900));
        Random randomNumber = new Random();
        g2d.setColor(new Color(randomNumber.nextFloat(),randomNumber.nextFloat(),randomNumber.nextFloat()));

        Area base = new Area(new RoundRectangle2D.Double(200,640,80,30,10,10));
        Area tireHoles1 = new Area(new Ellipse2D.Double(205,655,25,25));
        Area tireHoles2 = new Area(new Ellipse2D.Double(250,655,25,25));

        base.subtract(tireHoles2);
        base.subtract(tireHoles1);
        g2d.fill(base);

        //Initialize Windows
        g2d.fillRoundRect(215,620,48,20,5,5);

        //Initialize Tires
        //Tire back
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(207,656,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(212,662,10,10);
        //Tire Front
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(252,656,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(258,662,10,10);

        //Initialize Head and Tail lights
        //Head Lights
        g2d.setPaint(new Color(0xE9EADF));
        g2d.fillOval(267,642,10,5);
        //Tail Lights
        g2d.setPaint(new Color(0x240005));
        g2d.fillOval(202,642,10,8);



    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawCar(g);

    }
}
