/**
 * @author : AryanRanjane(ranjanearyan14@gmail.com)
 * @date   : 3/8/24 
 */

 import java.awt.*;

 public class code extends Frame {
    public code() {
        setVisible(true);
        setLayout(new GridLayout(2,2,5,5));
        Button b; 
        for(int le = 0; le < 5; le++ ) {
            b = new Button("Button" + String.valueOf(le) ); 
            add(b); 
        }
        setSize(400,400);
    }
    public static void main(String[]params) {
        new code();
    }
 }