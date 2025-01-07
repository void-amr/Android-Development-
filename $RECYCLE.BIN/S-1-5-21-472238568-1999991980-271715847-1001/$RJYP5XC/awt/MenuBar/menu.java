import java.awt.*;
public class menu extends Frame {
    public menu() { 
        setVisible(true);
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("submenu");
        MenuItem m1,m2,m3,m4; 
        m1 = new MenuItem("item1"); 
        m2 = new MenuItem("item2"); 
        m3 = new MenuItem("item3"); 
        m4 = new MenuItem("item4"); 
        menu.add(m1);
        menu.add(m2);
        menu.addSeparator();
        submenu.add(m3);
        submenu.add(m4);
        menu.add(submenu);
        setMenuBar(mb);
        mb.add(menu); 
        setSize(400,400);
    }   
    public static void main(String[] args) {
        new menu(); 
    } 
}
