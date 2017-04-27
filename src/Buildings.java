import java.awt.*;
import java.util.Random;

public class Buildings extends Sky {

    public void drawBuilding(Graphics g)
    {

        for(int i = 0;i < 5; i++)
        {
            generateBuilding(50 + (i * 300),350,g);
        }

    }

    public void generateBuilding(int x,int height,Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        int  h = height;
        //Initialize Buildings
        Random randomNumber = new Random();
        g2d.setColor(new Color(randomNumber.nextFloat(),randomNumber.nextFloat(),randomNumber.nextFloat()));

        g2d.fill3DRect(x,190,250,h,true);

        //Initialize Windows
        g2d.setPaint(new Color(0xFFFCD7));
        for(int i = 0;i < (h/30) - 5; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                g2d.fillRect((x+10) + (j * 65),230 + (i * 45),30,30);
            }

        }
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawBuilding(g);

    }
}
