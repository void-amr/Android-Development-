/**
 * @author -> AryanRanjane(ranjanearyan14@gmai.com)
 * @brief -> Demonstration of button component in java.
 * @date -> 20/7/24 
 */
/**
 * Creating 5 button components and using setLayout method to add them to the frame 
 * directing the components to the 5 regions as BorderLayout is our default layoutmanager.
 */
 import java.awt.*;
 public class fstway extends Frame {
    public fstway() {
        /* Non_Parameterized constructor */
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400,400);
        add(new Button("NORTH"), BorderLayout.NORTH);
        add(new Button("SOUTH"), BorderLayout.SOUTH);
        add(new Button("WEST"), BorderLayout.WEST);
        add(new Button("EAST"), BorderLayout.EAST);
        add(new Button("CENTER"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new fstway();
    }
 }