/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controlers.conexion;
import com.sun.awt.AWTUtilities;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author ing daniel reyes
 */
public class ListarEmpleados extends javax.swing.JFrame {
    int posX,posY;

    public ListarEmpleados() {
        initComponents();
        selectlistar();
        
        setLocationRelativeTo(null);
        setIconImage( new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
    }

  public void selectlistar(){
  try {   conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM payments";
          
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            tipoPagos.removeAllItems();
            while (rs.next()) {
             tipoPagos.addItem(rs.getString(2));
             
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
} 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPagos = new javax.swing.JComboBox<>();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        javax.swing.JLabel maximizar = new javax.swing.JLabel();
        javax.swing.JLabel backVerticalForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setName("FormPeople"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipoPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagosActionPerformed(evt);
            }
        });
        getContentPane().add(tipoPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, -1));

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/exit.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/min.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, 10));

        maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/max.png"))); // NOI18N
        maximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizarMouseClicked(evt);
            }
        });
        getContentPane().add(maximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 20, 30));

        backVerticalForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/principalBack.png"))); // NOI18N
        backVerticalForm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backVerticalFormMouseDragged(evt);
            }
        });
        backVerticalForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backVerticalFormMousePressed(evt);
            }
        });
        getContentPane().add(backVerticalForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
      setVisible(false); 

    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
         setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_minimizarMouseClicked

    private void maximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizarMouseClicked
       
/*this.setSize(Toolkit.getDefaultToolkit().getScreenSize()); 
float escalar = 10F;  
int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*escalar); 
int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalar); 
this.setSize(ancho,alto); **/

    }//GEN-LAST:event_maximizarMouseClicked

    private void backVerticalFormMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backVerticalFormMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_backVerticalFormMousePressed

    private void backVerticalFormMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backVerticalFormMouseDragged
        //asignamos valores la posicion nueva menos la anterior
        int xposition = evt.getXOnScreen() -posX;
        int yposition = evt.getYOnScreen() -posY;
        // enviamos los nuevos valores
        this.setLocation(xposition, yposition);
    }//GEN-LAST:event_backVerticalFormMouseDragged

    private void tipoPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagosActionPerformed
         
       
    }//GEN-LAST:event_tipoPagosActionPerformed

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
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                       
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel minimizar;
    private javax.swing.JComboBox<String> tipoPagos;
    // End of variables declaration//GEN-END:variables
}
