import java.awt.*;

public class co extends Frame {
    public co() {
        setVisible(true);
        setLayout(new BorderLayout());
        add(new Button("CENTER"), BorderLayout.CENTER);
        setSize(400,400); 
    }    
    public static void main(String[] args) {
        new co(); 
    }
}
