/** 
 * @author-> AryanRanjane(ranjanearyan14@gmail.com)
 * @Brief -> Demonstration of label component in applet
 * @Date -> 20/7/24 
 */
// Depracted _> Applet 
 import java.applet.*;
import java.awt.Color;
import java.awt.Label;

/*<applet code = ap_code.class width = 400 height = 400> <applet>*/
 public class ap_code extends Applet {
    Label l; 
    public void init() {
        l = new Label();
        l.setText("Ram Ram");
        setBackground(Color.GRAY);
    }
 }