import java.awt.*;
import java.awt.event.*; 
import java.applet.*;;

/*<applet code = "st.class" width = 300 height = 300></applet>*/

public class st extends Frame {
    static final int n = 4;
    public st() {
        setLayout(new GridLayout(n,n));
        setFont(new Font("SansSerif", Font.BOLD, 24));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int k = i * n +j; 
                if(k > 0) {
                    add(new Button(" "+k)); 
                }
            }
        }
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new st();
    }
}
