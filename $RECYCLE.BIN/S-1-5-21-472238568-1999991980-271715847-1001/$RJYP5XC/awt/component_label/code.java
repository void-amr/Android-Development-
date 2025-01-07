/*
 * @Author -> AryanRanjane(ranjanearyan14@gmail.com)
 * @Brief -> Demonstration of label component in java program 
 * @Date -> 20/7/24 
 */

 import java.awt.*;
 
 public class code extends Frame {
    public code() {
        /* Non-Parameterized constructor */
            Label l = new Label();
            setVisible(true);
            setSize(400,400);
            l.setText("My name is");
            add(l); 
    }

    public static void main(String[] args) {
        new code();
    }
 }