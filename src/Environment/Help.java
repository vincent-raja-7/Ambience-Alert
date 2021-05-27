/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Environment;
import java.awt.Dimension;
import java.awt.Toolkit;
import AppPackage.AnimationClass;
import javax.swing.ImageIcon;

/**
 *
 * @author King Vincent
 */
public class Help extends javax.swing.JFrame {
    AnimationClass AC1=new AnimationClass();
    AnimationClass AC2=new AnimationClass();
    AnimationClass AC3=new AnimationClass();
    AnimationClass AC1L=new AnimationClass();
    AnimationClass AC2L=new AnimationClass();
    AnimationClass AC3L=new AnimationClass();

    /**
     * Creates new form Help
     */
    public Help() {
        initComponents();
        SlideShow();
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
    }
    public void SlideShow()
    {
        new Thread()
        {
           
            @Override
            public void run()
        {
           try
        {
                    Thread.sleep(4000);
                    AC1.jLabelXRight(0, 598,20,7, H1);
                    Thread.sleep(4000);
                    AC2.jLabelXRight(0,598,20,7,H2);
                    Thread.sleep(4000);
                    AC3.jLabelXRight(0,598 ,20,7,H3);
                   
        }
            catch(InterruptedException e)
        {
            
        }
       
        
        }
    }.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        X = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        H3 = new javax.swing.JLabel();
        H4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        X.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        X.setText("X");
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                XMouseReleased(evt);
            }
        });
        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        H1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/H1.png"))); // NOI18N
        H1.setPreferredSize(new java.awt.Dimension(598, 419));
        getContentPane().add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        H2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/H2.png"))); // NOI18N
        H2.setMaximumSize(new java.awt.Dimension(598, 419));
        H2.setMinimumSize(new java.awt.Dimension(598, 419));
        H2.setPreferredSize(new java.awt.Dimension(598, 419));
        getContentPane().add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        H3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/H3.png"))); // NOI18N
        getContentPane().add(H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        H4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/H4.png"))); // NOI18N
        getContentPane().add(H4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseReleased
       dispose();
    }//GEN-LAST:event_XMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel H3;
    private javax.swing.JLabel H4;
    private javax.swing.JLabel X;
    // End of variables declaration//GEN-END:variables
}