import java.awt.*;

public class code2 extends Frame {
    code2() { 
        FlowLayout fl; 
        setVisible(true);
        Button b;
        fl = new FlowLayout();  
        setLayout(fl);
            for(int le = 0; le < 9; le++) {
                b = new Button(String.valueOf(le));
                add(b); 
                fl.setAlignment(FlowLayout.LEADING);
            } 
            setSize(400,400);
    }    
    public static void main(String[] args) {
        new code2(); 
    }
}
