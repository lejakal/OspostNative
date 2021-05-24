/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import com.sun.awt.AWTUtilities;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ing daniel reyes
 */
public class FormSupliers extends javax.swing.JFrame {
    int posX,posY;
    /**
     * Creates new form FormPeople
     */
    public FormSupliers() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage( new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaIngreso = new com.toedter.calendar.JDateChooser();
        cboEstado = new javax.swing.JComboBox<>();
        cbRegimen = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbCiudades1 = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbDevTrib = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbNIIF = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbtrib = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbAntNIIF = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbDevNIIF = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cbAntTribu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        javax.swing.JLabel maximizar = new javax.swing.JLabel();
        txtDigVerif = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDepa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos1 = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtBarrio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        txtDireccion2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaIngreso1 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnCrearProb = new javax.swing.JButton();
        javax.swing.JLabel backVerticalForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setName("FormPeople"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaIngreso.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 190, 30));

        cboEstado.setBackground(new java.awt.Color(36, 33, 33));
        cboEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 120, 30));

        cbRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regimen Comun", "Regimen Simplificado" }));
        getContentPane().add(cbRegimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 190, 30));

        cbCiudades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudades1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbCiudades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 190, 30));

        cbDevTrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDevTribActionPerformed(evt);
            }
        });
        getContentPane().add(cbDevTrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 190, 30));

        cbNIIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNIIFActionPerformed(evt);
            }
        });
        getContentPane().add(cbNIIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 190, 30));

        cbtrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtribActionPerformed(evt);
            }
        });
        getContentPane().add(cbtrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 190, 30));

        cbAntNIIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAntNIIFActionPerformed(evt);
            }
        });
        getContentPane().add(cbAntNIIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 190, 30));

        cbDevNIIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDevNIIFActionPerformed(evt);
            }
        });
        getContentPane().add(cbDevNIIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 190, 30));

        cbAntTribu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAntTribuActionPerformed(evt);
            }
        });
        getContentPane().add(cbAntTribu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 207, 207));
        jLabel3.setText("Tipo Regimen :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 207, 207));
        jLabel2.setText("Fecha de Nacimiento :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, 20));

        jLabel19.setBackground(new java.awt.Color(255, 87, 34));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(207, 207, 207));
        jLabel19.setText("Cedula/Nit :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 207, 207));
        jLabel4.setText("Estado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, 20));

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

        txtDigVerif.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtDigVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 30, 30));

        txtNombre.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 30));

        jLabel20.setBackground(new java.awt.Color(255, 87, 34));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(207, 207, 207));
        jLabel20.setText("Crear Nuevo Proveedor");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 87, 34));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(207, 207, 207));
        jLabel21.setText("Nombre :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtDepa.setBackground(new java.awt.Color(102, 255, 255));
        txtDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 190, 30));

        jLabel22.setBackground(new java.awt.Color(255, 87, 34));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(207, 207, 207));
        jLabel22.setText("Departamento :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        txtCC.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 207, 207));
        jLabel5.setText("Ciudad :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, 20));

        txtApellidos1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 30));

        txtDireccion.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 190, 30));

        txtBarrio.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 190, 30));

        jLabel23.setBackground(new java.awt.Color(255, 87, 34));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(207, 207, 207));
        jLabel23.setText("Devoluciones NIIF :");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 87, 34));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(207, 207, 207));
        jLabel24.setText("Direcciòn :");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 87, 34));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(207, 207, 207));
        jLabel25.setText("Barrio :");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        txtPais.setBackground(new java.awt.Color(102, 255, 255));
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        getContentPane().add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 190, 30));

        jLabel26.setBackground(new java.awt.Color(255, 87, 34));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(207, 207, 207));
        jLabel26.setText("Pais :");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        txtDireccion1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, 30));

        txtDireccion2.setBackground(new java.awt.Color(102, 255, 255));
        txtDireccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 207, 207));
        jLabel7.setText("Fecha de Ingreso :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, 20));

        fechaIngreso1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(fechaIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 190, 30));

        jLabel27.setBackground(new java.awt.Color(255, 87, 34));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(207, 207, 207));
        jLabel27.setText("Apellidos :");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel28.setBackground(new java.awt.Color(255, 87, 34));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(207, 207, 207));
        jLabel28.setText("Email :");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel29.setBackground(new java.awt.Color(255, 87, 34));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(207, 207, 207));
        jLabel29.setText("Telefono :");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 87, 34));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(207, 207, 207));
        jLabel30.setText("Tributario :");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jLabel31.setBackground(new java.awt.Color(255, 87, 34));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(207, 207, 207));
        jLabel31.setText("NIIF :");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        jLabel32.setBackground(new java.awt.Color(255, 87, 34));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(207, 207, 207));
        jLabel32.setText("Anticipos NIIF :");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        jLabel33.setBackground(new java.awt.Color(255, 87, 34));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(207, 207, 207));
        jLabel33.setText("Anticipos Tributario :");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 87, 34));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(207, 207, 207));
        jLabel34.setText("Devoluciones Tributario :");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        btnCrearProb.setBackground(new java.awt.Color(102, 255, 255));
        btnCrearProb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/guardar.png"))); // NOI18N
        btnCrearProb.setBorder(null);
        getContentPane().add(btnCrearProb, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 40, 40));

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

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        cboEstado.transferFocus();
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void cbAntTribuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAntTribuActionPerformed

    }//GEN-LAST:event_cbAntTribuActionPerformed

    private void txtDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepaActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtDireccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion2ActionPerformed

    private void cbCiudades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudades1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCiudades1ActionPerformed

    private void cbDevTribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDevTribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDevTribActionPerformed

    private void cbNIIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNIIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNIIFActionPerformed

    private void cbtribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtribActionPerformed

    private void cbAntNIIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAntNIIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAntNIIFActionPerformed

    private void cbDevNIIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDevNIIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDevNIIFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                       
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearProb;
    private javax.swing.JComboBox<String> cbRegimen;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel cerrar;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private com.toedter.calendar.JDateChooser fechaIngreso1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtDepa;
    private javax.swing.JTextField txtDigVerif;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}

