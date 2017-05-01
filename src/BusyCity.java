import com.sun.deploy.panel.PathRenderer;

import javax.swing.*;

public class BusyCity extends JFrame {

    private BusyCity()
    {
        setTitle("Busy City");
        setSize(1600,900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        add(new Pedestrians());

    }

    public static void main(String[] args)
    {
        BusyCity busyCity = new BusyCity();
    }
}