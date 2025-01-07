/*
 * @author -> AryanRanjane(ranjanearyan14@gmail.com)
 * @brief -> Implementation of Button TextField Frame component and EventListener 
 *           to create a simple mathematic app for + - * / 
 * @date -> 20/7/24 
 */

 import java.awt.*;
 import java.awt.event.*;

 public class task120 extends Frame {
    /* non parameterized constructor */
    public task120() {
        /* 3 textfields */
        TextField tf1, tf2, tf3; 
        /* 2 buttons */
        Button b1,b2;
        
        /* initializing the textfield and button objects */
        tf1 = new TextField();
        tf1.setBounds(50,80,150,20);

        tf2 = new TextField();
        tf2.setBounds(50, 130, 150, 20);

        tf3 = new TextField();
        tf3.setBounds(50, 180, 150, 20); 
        tf3.setEditable(false); 

        b1 = new Button("+");    
        b1.setBounds(50, 240, 50, 50);  
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        b1.addActionListener(null);    
        setVisible(true);
        setLayout(null);
        setSize(300,300);
    }

    public void actionPerformed(ActionEvent e) {
            
    }

    public static void main(String[] args) {
        new task120();
    }
    
 }
