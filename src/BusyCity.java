import javax.swing.*;
/**
 * All the subsequent classes will represent one item in the Scene and all the classes will extend the sky class
 * which extends a JPanel. This way All the elements can be drawn in one JPanel and items are separated in separate classes for clarity of the code
 *
 * IT14020254
 * Balasuriya B.K
 * AUISD Assignment Part A - BusyCity
 */
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