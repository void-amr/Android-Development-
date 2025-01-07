/**
 * @author -> AryanRanjane(ranjanearyan14@gmail.com)
 * @breif -> Demonstration of textField component in java using java awt api 
 * @date -> 20/7/24 
 */

 import java.awt.*;

 // Using inheritance way
 public class tex extends Frame {
    public tex(String title) {
        super(title);
    }

    public static void main(String[]args) {
        /* Driver method  */
        tex t = new tex("New Frame");
        TextField tf = new TextField();
        tf.setText("enter your name");
        tf.setEditable(true);
        t.setVisible(true);
        t.setSize(400,400);
        t.add(tf);
    }
 }