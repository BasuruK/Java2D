import javax.swing.*;
import java.awt.*;

public class BusyCity extends JFrame{

    public BusyCity()
    {
        setTitle("Busy City");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600,900);
  }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Busy City, Where you won't go beyond 2D");
        BusyCity windowFrame = new BusyCity();
        windowFrame.setVisible(true);

    }
}
