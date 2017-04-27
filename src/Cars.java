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

        for(int i =0; i < 8; i++)
        {
            Random rand = new Random();
            int number = rand.nextInt(10);

            if (number > 5)
            {
                drawASuperCar(50 + (i * 200),g);
            }
            else
            {
                drawNormalCar(50 +  (i * 200),g);
            }
        }
//        drawNormalCar(200,g);
//        drawASuperCar(500,g);

    }


    public void drawNormalCar(int x, Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Initialize the Base
        Random randomNumber = new Random();
        g2d.setColor(new Color(randomNumber.nextFloat(),randomNumber.nextFloat(),randomNumber.nextFloat()));

        Area base = new Area(new RoundRectangle2D.Double(x,640,80,30,10,10));
        Area tireHoles1 = new Area(new Ellipse2D.Double(x+5,655,25,25));
        Area tireHoles2 = new Area(new Ellipse2D.Double(x+50,655,25,25));

        base.subtract(tireHoles2);
        base.subtract(tireHoles1);
        g2d.fill(base);

        //Initialize Windows
        g2d.fillRoundRect(x+15,620,48,20,5,5);

        //Initialize Tires
        //Tire back
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+7,656,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+12,662,10,10);
        //Tire Front
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+52,656,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+58,662,10,10);

        //Initialize Head and Tail lights
        //Head Lights
        g2d.setPaint(new Color(0xE9EADF));
        g2d.fillOval(x+67,642,10,5);
        //Tail Lights
        g2d.setPaint(new Color(0x240005));
        g2d.fillOval(x+2,642,10,8);



    }


    public void drawASuperCar(int x,Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Initialize Base of the car
        Random randomNumber = new Random();
        g2d.setColor(new Color(randomNumber.nextFloat(),randomNumber.nextFloat(),randomNumber.nextFloat()));

        Area base = new Area(new RoundRectangle2D.Double(x,640,100,30,10,10));
        Area tireHoles1 = new Area(new Ellipse2D.Double(x+5,655,25,25));
        Area tireHoles2 = new Area(new Ellipse2D.Double(x+60,655,25,25));

        base.subtract(tireHoles2);
        base.subtract(tireHoles1);
        g2d.fill(base);

        //Initialize Windows
        g2d.fillRoundRect(x+15,625,48,20,10,10);

        //Initialize Tires
        //Tire back
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+7,656,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+12,662,10,10);
        //Tire Front
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+62,656,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+68,662,10,10);

        //Initialize Head and Tail lights
        //Head Lights
        g2d.setPaint(new Color(0xE9EADF));
        g2d.fillOval(x+87,642,10,5);
        //Tail Lights
        g2d.setPaint(new Color(0x240005));
        g2d.fillOval(x+2,642,10,8);

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawCar(g);

    }
}
