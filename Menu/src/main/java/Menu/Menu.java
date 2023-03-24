package Menu;

import Clases.VentanaInicio;
import java.awt.BorderLayout;

/**
 *
 * @author Trifunski
 */

public class Menu {

    private static VentanaInicio menu;
    
    private static void initComponents() {
        menu = new VentanaInicio();
    }
    
    public static void main(String[] args) {
        initComponents();
        menu.setSize(1100, 900);
        menu.setResizable(true);
        menu.getContentPane().setLayout(new BorderLayout());
        menu.setTitle("Menu");
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
