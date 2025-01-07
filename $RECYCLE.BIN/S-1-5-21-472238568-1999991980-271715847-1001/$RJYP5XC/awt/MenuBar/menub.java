import java.awt.*;
public class menub extends Frame {
    menub() {
        setVisible(true); 
        Menu menu = new Menu("color"); 
        MenuBar menuBar = new MenuBar(); 
        setMenuBar(menuBar);
        MenuItem m1,m2,m3,m4,m5,m6,m7,m8;
        m1 = new MenuItem("RED");
        m2 = new MenuItem("YELLOW");
        m3 = new MenuItem("GREEN");
        m4 = new MenuItem("DARk GREEN");
        m5 = new MenuItem("purple");
        m6 = new MenuItem("violet");   
        m7 = new MenuItem("golden");
        m8 = new MenuItem("black");
        menuBar.add(menu); 
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        menu.add(m5);
        menu.add(m5);
        menu.add(m6);
        menu.add(m7);
        menu.addSeparator(); 
        menu.add(m8);
        m8.setEnabled(false);
        setSize(400,400);    
    }    
    public static void main(String[] args) {
        new menub(); 
    }
}
