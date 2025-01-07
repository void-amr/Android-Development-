import java.awt.*;
import java.awt.event.*;


public class checkbox extends Frame implements ItemListener {
    private Label label = new Label();
    public checkbox() { 
        Checkbox cb = new Checkbox(); 
        cb.setLabel("C++");
        Checkbox cb2 = new Checkbox();
        cb2.setLabel("java");
        Label l1 = new Label("language selected is : "); 
        add(cb); 
        add(cb2); 
        add(l1); 
        setVisible(true);
        setSize(300,300); 
        setLayout(new FlowLayout());

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(itemEvent e) {
                label.setText("a");                
            }
        }); 
    }    
    public static void main(String[] args) {
        new checkbox();
    }
}
