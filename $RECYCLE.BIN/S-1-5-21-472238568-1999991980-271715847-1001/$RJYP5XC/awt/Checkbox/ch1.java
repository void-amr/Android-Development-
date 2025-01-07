/**
 * @author : AryanRanjane(ranjanearyan14@gmail.com)
 * @abstract : Demonstration of Checkbox and CheckboxGroup components
 * @date : 25/7/24 
 */

 import java.awt.*;

 public class ch1 extends Frame {
    public ch1() {
        /* constructor */
        Checkbox cb = new Checkbox("square");
        CheckboxGroup chgb = new CheckboxGroup(); 
        Checkbox cb2 = new Checkbox("round",chgb,true); 
        setVisible(true);
        setSize(300,300);
        cb.setBounds(50,100,50,50);
        add(cb);
        add(cb2);
        setBackground(Color.blue);
    }
    public static void main(String[] args) {
        /* Driver method */
        new ch1();
    }
    
 }