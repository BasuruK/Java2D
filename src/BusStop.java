import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.geom.Area;
import java.text.AttributedString;

public class BusStop extends Cars{

    public void drawBusStop(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Set Anti-aliasing Levels
        RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        //Initiate BusStop
        g2d.setPaint(new Color(0xD39248));
        Area busStop = new Area(new Rectangle(1100,500,130,80));
        Area busStopSubstraction = new Area(new Rectangle(1110,515,110,70));

        busStop.subtract(busStopSubstraction);
        g2d.fill(busStop);

        //Initiate Bus Stop label board
        g2d.setPaint(new Color(0xFFFB3E));
        g2d.fillRect(1128,498,75,15);

        //Initiate Label Bus stop
        Font font = new Font("Serif",Font.PLAIN, 16);
        AttributedString string1 = new AttributedString("Bus Stop");
        string1.addAttribute(TextAttribute.FONT, font);

        string1.addAttribute(TextAttribute.FOREGROUND, Color.black,0,8);
        g2d.drawString(string1.getIterator(),1138,510);


        for(int i = 0;i < 9;i++)
        {
            drawStreetLight(32 + ( i * 200 ),g);
        }


    }

    public void drawStreetLight(int x, Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        //Initiate Light poles
        //Light
        g2d.setPaint(new Color(255, 252, 0));
        g2d.fillOval(x+17,520,8,12);
        //Light Handle
        g2d.setPaint(new Color(40, 39, 39));
        g2d.fillRect(x,520,25,5);
        //Handle
        g2d.setPaint(new Color(40, 39, 39));
        g2d.fillRect(x,520,5,60);
        //Base
        g2d.setPaint(new Color(39, 24, 4));
        g2d.fillRect(x-2,570,8,30);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawBusStop(g);

    }
}
