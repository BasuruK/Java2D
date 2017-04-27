import java.awt.*;

import javax.swing.*;

public class Trees extends JPanel {

    private void drawTree(Graphics g)
    {
        //Set Antialiasing Levels
        RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        //Draw Trees
        for(int i = 0; i < 6; i++)
        {
            draw1Tree(50 + (i * 100),540,g);
        }

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawTree(g);
    }


    /**
     * Draws 1 tree on a given location on a screen.
     */
    private void draw1Tree(int x, int y, Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        //Initialise Tree Trunk
        g2d.setPaint(new Color(165, 116, 28));
        g2d.fillRect(x-2,y,15,50);

        //Initialize TreeLeaves
        //Leaves 1 left
        g2d.setPaint(new Color(20,216, 75));
        g2d.fillOval(x-40,y-40,50,50);
        //Leaves 2 right
        g2d.setPaint(new Color(41,216, 109));
        g2d.fillOval(x,y-40,50,50);
        //Leaves 3 middle
        g2d.setPaint(new Color(75,216, 46));
        g2d.fillOval(x-20,y-70,50,50);

        //Initialize Flowers
        g2d.setPaint(new Color(63, 78, 84));
        g2d.fillOval(x-20,y-20,5,5);
        g2d.fillOval(x,y-20,5,5);
        g2d.fillOval(x+20,y-20,5,5);
        g2d.fillOval(x,y-40,5,5);
    }
}
