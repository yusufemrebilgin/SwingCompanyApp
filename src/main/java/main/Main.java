package main;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.Login;

public class Main {
        
    public static void main(String[] args) {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatArcDarkIJTheme.setup();
     
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);          
        });
    }
    
}
