/**
 * ccal
 */

import java.awt.*; 
public class ccal extends Frame {
    private FlowLayout flowlayout; 
    public ccal () { 
        Button b;
        setBackground(Color.CYAN);
        for(int le = 1; le <10; le++) { 
            b = new Button(String.valueOf(le)); 
            add(b);
            b.setBackground(Color.LIGHT_GRAY);
        }
        setVisible(true);
        setSize(600, 600);
        setLayout(new GridLayout(3,3,10,15));
    }
    public static void main(String[] args) {
        new ccal();
    }
}