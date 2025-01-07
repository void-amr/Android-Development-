import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;

public class mb extends Frame {
    MenuBar mbb; 
    MenuItem m1,m2,m3,m4; 
    Menu mm;  
    MenuShortcut ms; 
    
    mb() {
        setTitle("MenuBar Demo");
        setSize(500,500); 
        setLayout(null);
        ms = new MenuShortcut(KeyEvent.VK_X); 
        mm = new Menu("file"); 
        mbb = new MenuBar(); 
        m1  = new MenuItem("New..");
        m2 = new MenuItem("Open..");
        m3 = new MenuItem("Save As....");
        m4 = new MenuItem("Exit...",ms); 
        mm.add(m1);
        mm.add(m2);
        mm.add(m3);
        mm.addSeparator(); 
        mm.add(m4);
        mbb.add(mm); 
        setMenuBar(mbb);
    }
    public static void main(String[] args) {
        mb md = new mb(); 
        md.setVisible(true);
    }
}
