
import java.awt.*;

public class choice extends Frame {
    public choice() {
        Choice ch = new Choice();
        ch.add("c++");
        ch.add("php");
        ch.add("rust");

        ch.setBounds(50,100,300,300);
        setVisible(true);
        setSize(400, 400);

        add(ch);
    }

    public static void main(String[] args) {
        new choice();
    }
}