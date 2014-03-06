package zeklandia.desktop.reddit.client;

/**
 *
 * @author Zeklandia
 */

import com.omrlnr.jreddit.User;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import zeklandia.desktop.logger.LogOutput;
import zeklandia.desktop.reddit.RedditAuth;

public class RedditClientMain extends javax.swing.JFrame {
    
    private static final String classname = "RedditClientMain";
    private static final String padding = " ";
    
    /**
     * Creates new form Main
     */
    public RedditClientMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsView = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);
        setMinimumSize(new java.awt.Dimension(854, 540));

        tabsView.setFont(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsView)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsView)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     */
    public static void main() {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            LogOutput.logError(padding, classname, "Failed to set theme");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RedditClientMain client = new RedditClientMain();
                client.setLocationRelativeTo(null);
                client.setVisible(true);
                client.setTitle("Java-Reddit");
                client.setDefaultLookAndFeelDecorated(true);
                
                RedditClientStreamPanel tabStream;
                tabStream = new RedditClientStreamPanel();
                
                tabsView.addTab("Stream", tabStream);
            }
        });
        
        LogOutput.logMessage(padding, classname, "Created main window");
        RedditAuth.main();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane tabsView;
    // End of variables declaration//GEN-END:variables
}