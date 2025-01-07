/**
 * @author : AryanRanjane 
 * @brief : Demonstration of all the functions of buttons
 * @date : 27/7/24 
 */

 import java.awt.*;

 public class button extends Frame { 
    public button() {
        setVisible(true);
        Button b = new Button(); 
        b.setLabel("click me"); 
        setSize(400,400); 
        add(b); 
    }
    public static void main(String[] args) {
        new button(); 
    }
 }