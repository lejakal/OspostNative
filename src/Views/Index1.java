package Views;
import Controlers.Fondo;
import Controlers.conexion;
import com.sun.awt.AWTUtilities;
import java.awt.Graphics;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import javax.swing.plaf.basic.BasicMenuBarUI;


public class Index1 extends javax.swing.JFrame {
   
            
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();

    public Index1() {

        initComponents();
        

        // jmIVenta.setMnemonic(KeyEvent.VK_V);
        this.setLocationRelativeTo(null);
      
        this.setExtendedState(MAXIMIZED_BOTH);

        menuBar.setOpaque(true);

        menuBar.setUI(new BasicMenuBarUI() {
            public void paint(Graphics g, JComponent c) {
                
                g.setColor(new java.awt.Color(0, 0, 0));
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
                
            }         
            
        
        });

             MenuModulos MenuModels = new MenuModulos();
             AWTUtilities.setWindowOpaque(MenuModels, false);
             MenuModels.setVisible(true);

        //jmIVentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuNomina = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        comprasMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        crearArticulo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnCProveedor = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuContable = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenu();

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ospost Software ");
        setBackground(new java.awt.Color(36, 111, 128));
        setIconImage( new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
        setUndecorated(true);

        menuBar.setBackground(new java.awt.Color(204, 204, 204));
        menuBar.setBorder(null);
        menuBar.setToolTipText("");
        menuBar.setAlignmentX(0.2F);
        menuBar.setAlignmentY(0.2F);
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.setEnabled(false);
        menuBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuBar.setOpaque(true);

        menuNomina.setForeground(new java.awt.Color(102, 255, 255));
        menuNomina.setText("NOMINA");
        menuNomina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu1.setText("Empleados");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("Crear/modificar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuNomina.add(jMenu1);

        menuBar.add(menuNomina);

        comprasMenu.setBackground(new java.awt.Color(0, 0, 0));
        comprasMenu.setBorder(null);
        comprasMenu.setForeground(new java.awt.Color(102, 255, 255));
        comprasMenu.setText("COMPRAS");
        comprasMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comprasMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comprasMenu.setOpaque(true);

        jMenu2.setText("Productos");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        crearArticulo.setText("Crear Articulo");
        crearArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearArticuloActionPerformed(evt);
            }
        });
        jMenu2.add(crearArticulo);

        jMenu3.setText("Lista de Productos");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu3);

        comprasMenu.add(jMenu2);

        jMenu4.setText("Proveedores");

        btnCProveedor.setText("Crear");
        btnCProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCProveedorActionPerformed(evt);
            }
        });
        jMenu4.add(btnCProveedor);

        comprasMenu.add(jMenu4);

        menuBar.add(comprasMenu);

        menuVentas.setBorder(null);
        menuVentas.setForeground(new java.awt.Color(102, 255, 255));
        menuVentas.setText("VENTAS");
        menuVentas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem1);

        menuBar.add(menuVentas);

        menuContable.setBorder(null);
        menuContable.setForeground(new java.awt.Color(102, 255, 255));
        menuContable.setText("CONTABLE");
        menuContable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuBar.add(menuContable);

        menuAyuda.setForeground(new java.awt.Color(102, 255, 255));
        menuAyuda.setText("AYUDA");
        menuBar.add(menuAyuda);

        MenuSalir.setBackground(new java.awt.Color(0, 0, 0));
        MenuSalir.setBorder(null);
        MenuSalir.setForeground(new java.awt.Color(102, 255, 255));
        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/exit.png"))); // NOI18N
        MenuSalir.setAutoscrolls(true);
        MenuSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenuSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuSalir.setOpaque(true);
        MenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalirMouseClicked(evt);
            }
        });
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        menuBar.add(MenuSalir);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed

    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MenuSalirMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:    FormEmployee formUsuario = new FormEmployee();
     nuevoEmployee formUsuario = new nuevoEmployee();      
      AWTUtilities.setWindowOpaque(formUsuario, false);
      formUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
      
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
               
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ListarEmpleados listarEmp = new ListarEmpleados();
        AWTUtilities.setWindowOpaque(listarEmp, false);
        listarEmp.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void crearArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearArticuloActionPerformed
        FromItem crearItem = new FromItem();
        AWTUtilities.setWindowOpaque(crearItem, false);
        crearItem.setVisible(true);
    }//GEN-LAST:event_crearArticuloActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Inventory items = new Inventory();
        AWTUtilities.setWindowOpaque(items, false);
        items.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnCProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCProveedorActionPerformed
       FormSupliers crearProv = new FormSupliers();
       AWTUtilities.setWindowOpaque(crearProv, false);
       crearProv.setVisible(true);
    }//GEN-LAST:event_btnCProveedorActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index1().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu MenuSalir;
    javax.swing.JMenuItem btnCProveedor;
    public static javax.swing.JMenu comprasMenu;
    javax.swing.JMenuItem crearArticulo;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JPanel jPanel1;
    javax.swing.JMenu menuAyuda;
    public static javax.swing.JMenuBar menuBar;
    javax.swing.JMenu menuContable;
    javax.swing.JMenu menuNomina;
    javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables

}
