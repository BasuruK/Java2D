import javax.swing.*;

public class BusyCity extends JFrame {

    private BusyCity()
    {
        setTitle("Busy City");
        setSize(1600,900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(new Cars());

    }

    public static void main(String[] args)
    {
        BusyCity busyCity = new BusyCity();
    }
}