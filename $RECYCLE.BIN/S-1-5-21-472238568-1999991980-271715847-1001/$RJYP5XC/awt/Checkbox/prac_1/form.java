/** 
 * @author : AryanRanjane(ranjanearyan14@gmail.com)
 * @brief : Demonstration of form using basic components of awt
 * @date : 25/7/24 
 */

 import java.awt.*;

 public class form extends Frame {
    public form(String title) {
        super(title);
    }
    public static void main(String[] args) {
        /* Driver method */
        form fn = new form("new frame");
        fn.setVisible(true);
        fn.setSize(400,400);
        TextField tfField = new TextField();
        tfField.setEditable(true);
        Label label = new Label("Name:");
        TextArea txta = new TextArea();
        txta.setEditable(true);
        Button button = new Button();
        button.setLabel("submit");
        fn.setLayout(null);
        fn.setBackground(Color.DARK_GRAY);
        label.setBounds(50, 130, 50,30);
        tfField.setBounds(150,130,200,50);
        txta.setBounds(150, 250,200,200);
        button.setBounds(150,550,100,100);
        fn.add(label);
        fn.add(tfField);
        fn.add(txta);
        fn.add(button);
    }
 }