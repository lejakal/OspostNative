/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controlers.UsuarioControllers;
import Controlers.conexion;
import Models.ModelsUsers;
import Models.extractor;
import com.sun.awt.AWTUtilities;
import java.awt.Toolkit;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.persistence.Convert;

/**
 *
 * @author ing daniel reyes
 */
public class nuevoEmployee extends javax.swing.JFrame {

    int posX, posY;

    /**
     * Creates new form FormPeople
     */
    public nuevoEmployee() {
        initComponents();
        selectCities();
        selectRol();
        selectPais();
        selectTrib();
        selectNiif();
        selectNiifA();
        selectTribuA();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
    }
    
         //select traido de db usar como base no olvide inicializarlo.
  public void selectCities(){
  try {   conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM ospos_municipios ";
          
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboCiudad.removeAllItems();
            while (rs.next()) {
             cboCiudad.addItem(rs.getString(1).replaceFirst(rs.getString(1), rs.getString(3)));
            
                       
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
} 
  
  public void selectRol(){
  try {   conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM ospos_roles ";
          
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboRolles.removeAllItems();
            while (rs.next()) {
             cboRolles.addItem(rs.getString(1).replaceFirst(rs.getString(1), rs.getString(2)));
            
                       
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
} 
  
   public void selectPais(){
  try {   conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM country ";
          
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboCountry.removeAllItems();
            while (rs.next()) {
             cboCountry.addItem(rs.getString(1).replaceFirst(rs.getString(1), rs.getString(2)));
            
                       
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
} 
   //selector de cuetas
     public void selectTrib(){
  try { 
      conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM ospos_subcuentas WHERE cuenta_subcuenta LIKE '5105' AND uso = 0 or uso = 2 ";          
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cbtrib.removeAllItems();
            while (rs.next()) {
             cbtrib.addItem(rs.getString(2)+"-"+rs.getString(3));          
                        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
} 
     
        //selector de cuetas
     public void selectNiif(){
  try { 
      conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM ospos_subcuentas WHERE cuenta_subcuenta LIKE '5105' AND uso = 0 or uso = 2 ";          
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboNiif.removeAllItems();
            while (rs.next()) {
             cboNiif.addItem(rs.getString(2)+"-"+rs.getString(3));          
                        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
} 
   
         //selector de cuetas
     public void selectNiifA(){
  try { 
      conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM ospos_subcuentas WHERE cuenta_subcuenta LIKE '1330' AND uso = 0 or uso = 2 ";          
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboAntiNiif.removeAllItems();
            while (rs.next()) {
             cboAntiNiif.addItem(rs.getString(2)+"-"+rs.getString(3));          
                        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
}   
  
                //selector de cuetas
     public void selectTribuA(){
  try { 
      conexion mysql = new conexion(); //Instanciando la clase conexion
     Connection cn = mysql.conectar();
     String sSQL = ""; //Sentencia SQL
     Integer totalRegistros; // Obtener los registros
      sSQL = "SELECT * FROM ospos_subcuentas WHERE cuenta_subcuenta LIKE '1330' AND uso = 0 or uso = 1 ";          
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboantiTribu.removeAllItems();
            while (rs.next()) {
             cboantiTribu.addItem(rs.getString(2)+"-"+rs.getString(3));          
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

        txtNombre = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEps = new javax.swing.JTextField();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        javax.swing.JLabel maximizar = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtArp = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtArl = new javax.swing.JTextField();
        cboNumeroHijos = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox<>();
        cboRolles = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cbtrib = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cboNiif = new javax.swing.JComboBox<>();
        txtObservaciones = new javax.swing.JTextField();
        btnCrearEmpleado = new javax.swing.JButton();
        cboAntiNiif = new javax.swing.JComboBox<>();
        cboantiTribu = new javax.swing.JComboBox<>();
        com.toedter.calendar.JDateChooser fechaINacimiento = new com.toedter.calendar.JDateChooser();
        jLabel43 = new javax.swing.JLabel();
        cboCountry = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel backVerticalForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setName("FormPeople"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(102, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 30));

        jLabel30.setBackground(new java.awt.Color(255, 87, 34));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 255, 255));
        jLabel30.setText("Segundo Apellido :");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        txtApellido2.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 190, 30));

        jLabel21.setBackground(new java.awt.Color(255, 87, 34));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 255, 255));
        jLabel21.setText("Nombre :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel27.setBackground(new java.awt.Color(255, 87, 34));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 255, 255));
        jLabel27.setText("Primer Apellido :");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        txtApellido1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 30));

        jLabel19.setBackground(new java.awt.Color(255, 87, 34));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 255, 255));
        jLabel19.setText("Sexo :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txtCC.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 190, 30));

        fechaIngreso.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 190, 30));

        txtEmail.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 190, 30));

        txtTelefono2.setBackground(new java.awt.Color(102, 255, 255));
        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 190, 30));

        jLabel20.setBackground(new java.awt.Color(255, 87, 34));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(207, 207, 207));
        jLabel20.setText("Gestion Usuarios/Empelados");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel29.setBackground(new java.awt.Color(255, 87, 34));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 255, 255));
        jLabel29.setText("Telefono Auxiliar :");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel28.setBackground(new java.awt.Color(255, 87, 34));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 255, 255));
        jLabel28.setText("Email :");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, 30));

        txtDireccion.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 30));

        jLabel24.setBackground(new java.awt.Color(255, 87, 34));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 255, 255));
        jLabel24.setText("Direcciòn :");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        txtBarrio.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 190, 30));

        jLabel25.setBackground(new java.awt.Color(255, 87, 34));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 255, 255));
        jLabel25.setText("Barrio :");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 87, 34));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 255, 255));
        jLabel22.setText("Hijos :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        txtEps.setBackground(new java.awt.Color(102, 255, 255));
        txtEps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEpsActionPerformed(evt);
            }
        });
        getContentPane().add(txtEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 190, 30));

        cboEstado.setBackground(new java.awt.Color(36, 33, 33));
        cboEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Estado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 20));

        cboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(cboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 207, 207));
        jLabel5.setText("Pais :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, 20));

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

        jLabel23.setBackground(new java.awt.Color(255, 87, 34));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 255, 255));
        jLabel23.setText("Fecha Ingreso :");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        txtTelefono1.setBackground(new java.awt.Color(102, 255, 255));
        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 190, 30));

        jLabel31.setBackground(new java.awt.Color(255, 87, 34));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 255, 255));
        jLabel31.setText("Telefono :");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 87, 34));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 255, 255));
        jLabel26.setText("Cedula/Nit :");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel32.setBackground(new java.awt.Color(255, 87, 34));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 255, 255));
        jLabel32.setText("ARP :");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        txtArp.setBackground(new java.awt.Color(102, 255, 255));
        txtArp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArpActionPerformed(evt);
            }
        });
        getContentPane().add(txtArp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 190, 30));

        jLabel33.setBackground(new java.awt.Color(255, 87, 34));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 255, 255));
        jLabel33.setText("ARL :");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        txtArl.setBackground(new java.awt.Color(102, 255, 255));
        txtArl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArlActionPerformed(evt);
            }
        });
        getContentPane().add(txtArl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 190, 30));

        cboNumeroHijos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "10+" }));
        getContentPane().add(cboNumeroHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 60, 30));

        jLabel34.setBackground(new java.awt.Color(255, 87, 34));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 255, 255));
        jLabel34.setText("EPS :");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Union Libre", "Viudo/a" }));
        getContentPane().add(cboEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 100, 30));

        cboRolles.setBackground(new java.awt.Color(102, 255, 255));
        cboRolles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboRolles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRollesActionPerformed(evt);
            }
        });
        getContentPane().add(cboRolles, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 190, 30));

        txtPassword.setBackground(new java.awt.Color(102, 255, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 190, 30));

        txtLogin.setBackground(new java.awt.Color(102, 255, 255));
        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 190, 30));

        jLabel35.setBackground(new java.awt.Color(255, 87, 34));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(207, 207, 207));
        jLabel35.setText("Roll de acceso :");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, -1, -1));

        jLabel36.setBackground(new java.awt.Color(255, 87, 34));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 255, 255));
        jLabel36.setText("Estado Civil :");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        jLabel37.setBackground(new java.awt.Color(255, 87, 34));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(207, 207, 207));
        jLabel37.setText("Usuario Sistema :");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        jLabel38.setBackground(new java.awt.Color(255, 87, 34));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(207, 207, 207));
        jLabel38.setText("Contraseña :");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));

        cbtrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtribActionPerformed(evt);
            }
        });
        getContentPane().add(cbtrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 190, 30));

        jLabel39.setBackground(new java.awt.Color(255, 87, 34));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 255, 255));
        jLabel39.setText("Tributario :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jLabel40.setBackground(new java.awt.Color(255, 87, 34));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 255, 255));
        jLabel40.setText("NIIF :");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        jLabel41.setBackground(new java.awt.Color(255, 87, 34));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 255, 255));
        jLabel41.setText("Anticipos NIIF :");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        jLabel42.setBackground(new java.awt.Color(255, 87, 34));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(207, 207, 207));
        jLabel42.setText("Anticipos Tributario :");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, -1, -1));

        cboNiif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNiifActionPerformed(evt);
            }
        });
        getContentPane().add(cboNiif, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 190, 30));

        txtObservaciones.setToolTipText("");
        getContentPane().add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 190, 30));

        btnCrearEmpleado.setBackground(new java.awt.Color(102, 255, 255));
        btnCrearEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/guardar.png"))); // NOI18N
        btnCrearEmpleado.setBorder(null);
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 40, 40));

        cboAntiNiif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAntiNiifActionPerformed(evt);
            }
        });
        getContentPane().add(cboAntiNiif, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 190, 30));

        cboantiTribu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboantiTribuActionPerformed(evt);
            }
        });
        getContentPane().add(cboantiTribu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 200, 30));

        fechaINacimiento.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(fechaINacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 190, 30));

        jLabel43.setBackground(new java.awt.Color(255, 87, 34));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 255, 255));
        jLabel43.setText("Fecha Nacimiento :");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        getContentPane().add(cboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 207, 207));
        jLabel7.setText("Observaciones :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Ciudad :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, 20));

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
        int xposition = evt.getXOnScreen() - posX;
        int yposition = evt.getYOnScreen() - posY;
        // enviamos los nuevos valores
        this.setLocation(xposition, yposition);
    }//GEN-LAST:event_backVerticalFormMouseDragged

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        cboEstado.transferFocus();
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void cboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCiudadActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSexoActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void txtEpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpsActionPerformed

    private void txtArpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArpActionPerformed

    private void txtArlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArlActionPerformed

    private void cboRollesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRollesActionPerformed

    }//GEN-LAST:event_cboRollesActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        txtPassword.transferFocus();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        txtLogin.transferFocus();
    }//GEN-LAST:event_txtLoginActionPerformed

    private void cbtribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtribActionPerformed

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        //verificar si los campos esta nllenos y requerirlos
        if (txtNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias ingresar Un nombre para este empleado");
            txtNombre.requestFocus();
            return;
        }

        if (txtApellido1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar el Apellido");
            txtApellido1.requestFocus();
            return;
        }

        if (txtApellido2.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar el Apellido");
            txtApellido2.requestFocus();
            return;
        }

        if (txtApellido1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar el Apellido");
            txtApellido1.requestFocus();
            return;
        }

        if (txtCC.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar El Nùmero del Documento");
            txtCC.requestFocus();
            return;
        }

        if (txtTelefono1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar Un Numero de Telefono por si algo.");
            txtTelefono1.requestFocus();
            return;
        }
        if (txtEmail.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar Un Email Valido.");
            txtEmail.requestFocus();
            return;
        }

        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar Una Direccion Valida.");
            txtDireccion.requestFocus();
            return;
        }

        if (txtBarrio.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar Un Barrio Valido.");
            txtBarrio.requestFocus();
            return;
        }

        if (txtLogin.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar Un Usuario");
            txtLogin.requestFocus();
            return;
        }
        if (txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias agregar Una Contraseña de Usuario");
            txtPassword.requestFocus();
            return;
        }

        ModelsUsers datos = new ModelsUsers();
        UsuarioControllers funcion = new UsuarioControllers();

        datos.setFirst_name(txtNombre.getText());
        datos.setApellidos(txtApellido1.getText() + " " + txtApellido2.getText());
        datos.setApellidouno(txtApellido1.getText());
        datos.setApellidodos(txtApellido2.getText());
        datos.setLast_name(txtCC.getText());
        int phone = parseInt(txtTelefono1.getText());
        datos.setPhone_number(phone);
        int telefono2 = parseInt(txtTelefono2.getText());
        datos.setTelfcont2(telefono2);
        datos.setEmail(txtEmail.getText());
        
        datos.setAddress_1(txtDireccion.getText());
        datos.setCalle(txtBarrio.getText());
        datos.setARP(txtArp.getText());
        datos.setVeps(txtEps.getText());
        datos.setARP(txtArp.getText());
        datos.setUsername(txtLogin.getText());
        datos.setPassword(txtPassword.getText());
        datos.setArl(txtArl.getText());
        datos.setObservaciones(txtObservaciones.getText());
        
        //ingreso combo box
        
        String country = (String)cboCountry.getSelectedItem();
        datos.setCountry(country);
        
        int city = cboCiudad.getSelectedIndex();
        datos.setCity(city);
        
        int sexo = cboSexo.getSelectedIndex();
        datos.setSexo(sexo);

        int estado = cboEstado.getSelectedIndex();
        datos.setDelete(estado);

        int acceso = cboRolles.getSelectedIndex();
        datos.setRol(acceso);

        int hijos = cboNumeroHijos.getSelectedIndex();
        datos.setHijos(hijos);

        int estadoCivil = cboEstadoCivil.getSelectedIndex();
        datos.setEstadocivil(estadoCivil);

        String tributario = (String) cbtrib.getSelectedItem();
        extractor extraTrib = new extractor();
        extraTrib.extractor(tributario);
        datos.setTributario(extraTrib.extract);

        String niff = (String)cboNiif.getSelectedItem();
        extractor extraTN = new extractor();
         extraTN.extractor(niff);        
         datos.setNiff(extraTN.extract);

       
         String antTribu = (String) cboantiTribu.getSelectedItem();
         extractor extraT = new extractor();
         extraT.extractor(antTribu);
         datos.setTributarioA(extraT.extract);
         
         String antNiif = (String) cboAntiNiif.getSelectedItem();
         extractor extraNff = new extractor();
         extraNff.extractor(antNiif);
         datos.setNiffA(extraNff.extract);
                
         // String[] CEXTRA = antNiif.split("-");
          //for (int i = 0; i <= 1; i++) { if(i==0){ String extractor1=CEXTRA[i]; datos.setNiffA(extractor1);} }
         
             

        String formato = fechaIngreso.getDateFormatString();
        Date date = fechaIngreso.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaNacimiento = String.valueOf(sdf.format(date));
        datos.setFechaNaci(fechaNacimiento);
        
        String formatoI = fechaIngreso.getDateFormatString();
        Date dateI = fechaIngreso.getDate();
        SimpleDateFormat sdfI = new SimpleDateFormat(formatoI);
        String fechaIngreso = String.valueOf(sdfI.format(dateI));
        datos.setFechaent(fechaIngreso);
        
        if (funcion.insertar(datos)) {

            JOptionPane.showMessageDialog(rootPane,
                "EMPLEADO  INGRESADO CORRECTAMENTE."+
                "Login : "+txtLogin.getText()+"  "+"Contraseña : "+txtPassword.getText(),
                "NUEVO USUARIO", JOptionPane.INFORMATION_MESSAGE);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Upss lo siento no se ingresador los Datos");

        }
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cboantiTribuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboantiTribuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboantiTribuActionPerformed

    private void cboNiifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNiifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNiifActionPerformed

    private void cboAntiNiifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAntiNiifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAntiNiifActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JComboBox<String> cboAntiNiif;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JComboBox<String> cboCountry;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboEstadoCivil;
    private javax.swing.JComboBox<String> cboNiif;
    private javax.swing.JComboBox<String> cboNumeroHijos;
    private javax.swing.JComboBox<String> cboRolles;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboantiTribu;
    private javax.swing.JComboBox<String> cbtrib;
    private javax.swing.JLabel cerrar;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtArl;
    private javax.swing.JTextField txtArp;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEps;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
