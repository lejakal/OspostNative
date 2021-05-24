package Views;

import Models.ModelsUsers;
import Controlers.UsuarioControllers;
import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {
    
//dos variablespara guardar la posicon en x y en y 
    int posX,posY;
    
    public Login() {
        initComponents();

        ContarUsuarios();
        jScrollPane1.setVisible(false);
        this.setLocationRelativeTo(null);
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
              btnIngresarActionPerformed(null);
            }
         });
      }
    

    
    public void ContarUsuarios() {

        UsuarioControllers funcion = new UsuarioControllers();
        int cantidadUsuarios = funcion.ContarUsuarios();
        if (cantidadUsuarios == 0) {

            JOptionPane.showMessageDialog(rootPane, "DEBE CREAR EL ADMINISTRADOR DEL SISTEMA");
            Instalacion formulario = new Instalacion();
            AWTUtilities.setWindowOpaque(formulario, false);
            formulario.setResizable(false);
            formulario.toFront();
            formulario.setVisible(true);
            formulario.setLocationRelativeTo(null);
        }//cierre
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        licencia = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        licencia1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage( new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/exit.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        cerrar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cerrarPropertyChange(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 20, 10));

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/min.png"))); // NOI18N
        minimizar.setToolTipText("");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 10, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/user.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, 20));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablalistado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 10, 10));

        txtLogin.setBackground(new java.awt.Color(102, 255, 255));
        txtLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(0, 102, 153));
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLogin.setBorder(null);
        txtLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 140, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/pass.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(102, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(25, 118, 210));
        btnIngresar.setText("Go.");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnIngresarKeyTyped(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 60, -1));

        txtpassword.setBackground(new java.awt.Color(102, 255, 255));
        txtpassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 102, 153));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 140, 20));

        licencia.setText(" OSPOST S.A.S - NIT : 900984703-6  Cucuta - Colombia - www.ospost.org");
        getContentPane().add(licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 400, -1));

        logo.setText("Versión : 3.0x64 bits / ERP_SOFTWARE ADMINISTRATIVO  ENGINE 4.0");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 400, -1));

        licencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/logo.png"))); // NOI18N
        getContentPane().add(licencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/ini.png"))); // NOI18N
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyTyped

    }//GEN-LAST:event_btnIngresarKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (txtLogin.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un UserName");
            txtLogin.requestFocus();
            return;
        }

        if (txtpassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una contraseña");
            txtpassword.requestFocus();
            return;
        }

        try {
            DefaultTableModel modelo;

            UsuarioControllers func = new UsuarioControllers();
            ModelsUsers dts = new ModelsUsers();

            dts.setUsername(txtLogin.getText());
            dts.setPassword(txtpassword.getText());

            modelo = func.login(dts.getUsername(), dts.getPassword());

            tablalistado.setModel(modelo);

            if (func.totalRegistros > 0) {
                this.dispose();
                Index1 inicio = new Index1();
                inicio.toFront();
                AWTUtilities.setWindowOpaque(inicio, false);
                this.setExtendedState(MAXIMIZED_BOTH);
                inicio.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Datos incorrectos", "Acceso al Sistema", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        txtpassword.transferFocus();
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        txtLogin.transferFocus();
    }//GEN-LAST:event_txtLoginActionPerformed

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_minimizarMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cerrarPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarPropertyChange
//para saber cuando se presiona cuales su posicion en x y en y
    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
    
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    //usamos eventos mouseMotion mouseadragged  para mover y asignar las nueva psocion
    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
       //asignamos valores la posicion nueva menos la anterior
        int xposition = evt.getXOnScreen() -posX;
        int yposition = evt.getYOnScreen() -posY;
       // enviamos los nuevos valores 
        this.setLocation(xposition, yposition);
    }//GEN-LAST:event_fondoMouseDragged

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Login intro = new Login();
            AWTUtilities.setWindowOpaque(intro, false);
            intro.setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licencia;
    private javax.swing.JLabel licencia1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

}
