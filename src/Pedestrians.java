import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Pedestrians extends BusStop{

    private BufferedImage image;
    private BufferedImage image1,image2,image3,image4;

    public void drawPerson(Graphics g)
    {
        drawNormalPersonWalking(100,g);
        drawFamilyPerson(200,g);
        colorWalkingFemale(400,g);
        JobPerson(480,g);
        walkingMale(600,g);
        drawRunningPerson(700,g);
        drawBusHaltPeople(1112,g);
    }

    public void drawRunningPerson(int x,Graphics g)
    {
        try {
            image = ImageIO.read(getClass().getResource("/images/running-person.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
    }

    public void drawNormalPersonWalking(int x,Graphics g)
    {
        try {
            image = ImageIO.read(getClass().getResource("/images/person-walking.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
    }

    public void drawFamilyPerson(int x,Graphics g)
    {
        try {
            image = ImageIO.read(getClass().getResource("/images/person-holding-hands.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
    }

    public void colorWalkingFemale(int x,Graphics g)
    {
        try {
            image = ImageIO.read(getClass().getResource("/images/colord-female-walking.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
    }


    public void JobPerson(int x,Graphics g)
    {
        try {
            image = ImageIO.read(getClass().getResource("/images/JobPerson.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
    }


    public void walkingMale(int x,Graphics g)
    {
        try {
            image = ImageIO.read(getClass().getResource("/images/Walking-Male.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
    }

    public void drawBusHaltPeople(int x,Graphics g)
    {

        Graphics2D g2d = (Graphics2D) g;
        try {
            image = ImageIO.read(getClass().getResource("/images/busStopPerson1.png"));
            image1 = ImageIO.read(getClass().getResource("/images/busStopPerson2.png"));
            image2 = ImageIO.read(getClass().getResource("/images/busStopPerson3.png"));
            image3 = ImageIO.read(getClass().getResource("/images/busStopPerson4.png"));
            image4 = ImageIO.read(getClass().getResource("/images/busStopPerson5.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        g2d.drawImage(image,x,520,image.getWidth(), image.getHeight(),null);
        g2d.drawImage(image1,x+20,520,image.getWidth(), image.getHeight(),null);
        g2d.drawImage(image2,x+40,520,image.getWidth(), image.getHeight(),null);
        g2d.drawImage(image3,x+60,520,image.getWidth(), image.getHeight(),null);
        g2d.drawImage(image4,x+80,520,image.getWidth(), image.getHeight(),null);
    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawPerson(g);

    }
}
