import javax.swing.*;
import java.awt.*;

public class Road extends JPanel {

    private void drawRoad(Graphics g)
    {
        //RenderingHints renderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new Color(7, 3, 2));
        g2d.fillRect(0,600,1800,300);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawRoad(g);
    }

}
