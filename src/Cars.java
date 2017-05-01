import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;

public class Cars extends Aeroplane {

    public void drawCar(Graphics g)
    {
        //Set Anti-aliasing Levels
        RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        Graphics2D g2d = (Graphics2D) g;

        //Initiate Lane One vehicles
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

        //Initiate Lane Two Vehicles
        for (int i = 0; i < 7; i++)
        {
            Random rand = new Random();
            int number = rand.nextInt(10);

            if (number > 5)
            {
                drawBus(90 + (i * 200),g);
            }
            else
            {
                drawTruck(60 + (i * 200),g);
            }
        }


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
        //Initiate Windows
        g2d.setPaint(new Color(0xF1EE00));
        g2d.fillRect(x+40,623,20,15);



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
        //Initiate Windows
        g2d.setPaint(new Color(0xF1EE00));
        g2d.fillRoundRect(x+40,626,20,15,10,10);

    }

    public void drawBus(int x,Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Initialize Base of the car
        Random randomNumber = new Random();
        g2d.setColor(new Color(randomNumber.nextFloat(),randomNumber.nextFloat(),randomNumber.nextFloat()));

        Area base = new Area(new RoundRectangle2D.Double(x,743,150,60,10,10));
        Area tireHoles1 = new Area(new Ellipse2D.Double(x+5,785,25,25));
        Area tireHoles2 = new Area(new Ellipse2D.Double(x+100,785,25,25));

        base.subtract(tireHoles2);
        base.subtract(tireHoles1);
        g2d.fill(base);

        //Initialize Tires
        //Tire back
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+7,787,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+13,793,10,10);
        //Tire Front
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+102,787,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+108,793,10,10);

        //Initialize Head and Tail lights
        //Head Lights
        g2d.setPaint(new Color(0xE9EADF));
        g2d.fillOval(x+137,787,10,5);
        //Tail Lights
        g2d.setPaint(new Color(0x240005));
        g2d.fillOval(x+2,777,10,8);

        //Initiate Windows
        g2d.setPaint(new Color(0xF7FC00));
        for(int i = 0; i < 6; i++)
        {
            g2d.fillRect(x + (i * 21),755,10,10);
        }
        g2d.fillRect(x+132,752,15,15);
    }

    public void drawTruck(int x, Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Initialize Base of the car
        Random randomNumber = new Random();
        g2d.setColor(new Color(randomNumber.nextFloat(),randomNumber.nextFloat(),randomNumber.nextFloat()));

        Area head = new Area(new RoundRectangle2D.Double(x+102,748,50,55,10,10));
        Area base = new Area(new RoundRectangle2D.Double(x,743,100,60,10,10));
        Area tireHoles1 = new Area(new Ellipse2D.Double(x+5,785,25,25));
        Area tireHoles2 = new Area(new Ellipse2D.Double(x+60,785,25,25));
        Area tireHolesHead1 = new Area(new Ellipse2D.Double(x+105,785,25,25));
        Area tireHolesHead2 = new Area(new Ellipse2D.Double(x+120,785,25,25));

        base.subtract(tireHoles2);
        base.subtract(tireHoles1);
        head.subtract(tireHolesHead1);
        head.subtract(tireHolesHead2);
        g2d.fill(base);
        g2d.fill(head);


        //Initialize Tires
        //Tire back
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+7,787,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+13,793,10,10);
        //Tire Front
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+61,787,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+67,793,10,10);

        //TireHeadFront
        //Tire1
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+106,787,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+112,793,10,10);
        //Tire2
        g2d.setPaint(new Color(0x702F05));
        g2d.fillOval(x+122,787,22,22);
        g2d.setPaint(new Color(0xA7A79C));
        g2d.fillOval(x+127,793,10,10);

        //Initialize Head and Tail lights
        //Head Lights
        g2d.setPaint(new Color(0xE9EADF));
        g2d.fillOval(x+139,780,10,5);
        //Tail Lights
        g2d.setPaint(new Color(0x240005));
        g2d.fillOval(x+2,777,10,8);

        //Initiate Window
        g2d.setPaint(new Color(0xF7FC00));
        g2d.fillRect(x+134,752,15,20);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawCar(g);

    }
}
