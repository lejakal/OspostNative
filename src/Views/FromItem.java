/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controlers.UsuarioControllers;
import Controlers.conexion;
import com.sun.awt.AWTUtilities;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import Models.ModelsItems;
import Controlers.itemControllers;
import Models.ModelsUsers;
import Models.extractor;
import static java.lang.Integer.parseInt;


/**
 *
 * @author ing daniel reyes
 */
public class FromItem extends javax.swing.JFrame {

    int posX, posY;

    /**
     * Creates new form FormPeople
     */
    public FromItem() {
        initComponents();
        selectUnidades();
        selectProveedores();
        selectCategorias();
        selectClasificacion();
        selectLocation();
        selectCategorias();
        selectIvas();
        selectTrib();
        selectNiif();
        selectNiifA();
        selectTribuA();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
    }

    //seleccion de unidades 
    public void selectUnidades() {
        try {
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sSQL = ""; //Sentencia SQL
            Integer totalRegistros; // Obtener los registros
            sSQL = "SELECT * FROM ospos_unidades ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboMedidas.removeAllItems();
            while (rs.next()) {
                cboMedidas.addItem(rs.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //seleccion de unidades 
    public void selectLocation() {
        try {
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sSQL = ""; //Sentencia SQL
            Integer totalRegistros; // Obtener los registros
            sSQL = "SELECT * FROM ospos_stock_locations ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboLocalizacion.removeAllItems();
            while (rs.next()) {
                cboLocalizacion.addItem(rs.getString(1)+"-"+rs.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //seleccion de unidades 
    public void selectCategorias() {
        try {
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sSQL = ""; //Sentencia SQL
            Integer totalRegistros; // Obtener los registros
            sSQL = "SELECT * FROM ospos_category ";
            String auxSQL = "SELECT * FROM ospos_subcatecorias ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            Statement stSub = cn.createStatement();
            ResultSet rsSub = stSub.executeQuery(auxSQL);
            
            cboCategoria.removeAllItems();

            while (rs.next()) {
                
               while (rsSub.next()){
                
                cboCategoria.addItem(rsSub.getString(1)+"-"+rsSub.getString(2));
               }
               
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    //seleccion de unidades 

    public void selectIvas() {
        try {
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sSQL = ""; //Sentencia SQL
            Integer totalRegistros; // Obtener los registros
            sSQL =
                    "SELECT * FROM ospos_tax ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboImpuestos.removeAllItems();

            while (rs.next()) {
                
                cboImpuestos.addItem(rs.getString(3)+"-"+rs.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void selectProveedores() {
        try {
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sSQL = ""; //Sentencia SQL
            Integer totalRegistros; // Obtener los registros
            sSQL = "SELECT * FROM ospos_suppliers ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboProv.removeAllItems();
            while (rs.next()) {

                cboProv.addItem(rs.getString(2));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void selectClasificacion() {
        try {
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sSQL = ""; //Sentencia SQL
            Integer totalRegistros; // Obtener los registros
            sSQL = "SELECT * FROM ospos_tipopoducto ";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            cboTipoProducto.removeAllItems();
            while (rs.next()) {

                cboTipoProducto.addItem(rs.getString(2));

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
      sSQL = "SELECT * FROM ospos_subcuentas WHERE grupo_subcuenta LIKE '41' AND uso = 0 or uso = 2 ";          
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
      sSQL = "SELECT * FROM ospos_subcuentas WHERE grupo_subcuenta LIKE '41' AND uso = 0 or uso = 2 ";          
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
      sSQL = "SELECT * FROM ospos_subcuentas WHERE grupo_subcuenta LIKE '14' AND uso = 0 or uso = 2 ";          
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
      sSQL = "SELECT * FROM ospos_subcuentas WHERE grupo_subcuenta LIKE '14' AND uso = 0 or uso = 1 ";          
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

        txtBarCode = new javax.swing.JTextField();
        txtComision = new javax.swing.JTextField();
        txtcantidadIni = new javax.swing.JTextField();
        txtcantidadMin = new javax.swing.JTextField();
        cboMedidas = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        checkSerialized = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        javax.swing.JLabel maximizar = new javax.swing.JLabel();
        cboImpuestos = new javax.swing.JComboBox<>();
        cboProv = new javax.swing.JComboBox<>();
        cboCategoria = new javax.swing.JComboBox<>();
        cboTipoProducto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboAutoProd = new javax.swing.JComboBox<>();
        checkIndicativo = new javax.swing.JRadioButton();
        txtDescription = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        checkNumSerie = new javax.swing.JRadioButton();
        checkdescriptV = new javax.swing.JRadioButton();
        cboLocalizacion = new javax.swing.JComboBox<>();
        cbtrib = new javax.swing.JComboBox<>();
        cboantiTribu = new javax.swing.JComboBox<>();
        cboNiif = new javax.swing.JComboBox<>();
        cboAntiNiif = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtVenta = new javax.swing.JTextField();
        btnCrearEmpleado = new javax.swing.JButton();
        txtNombreItem = new javax.swing.JTextField();
        txtCompra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        javax.swing.JLabel backVerticalForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setName("FormPeople"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBarCode.setBackground(new java.awt.Color(102, 255, 255));
        txtBarCode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBarCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 330, 30));

        txtComision.setBackground(new java.awt.Color(102, 255, 255));
        txtComision.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComision.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 150, 30));

        txtcantidadIni.setBackground(new java.awt.Color(102, 255, 255));
        txtcantidadIni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcantidadIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtcantidadIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 120, 30));

        txtcantidadMin.setBackground(new java.awt.Color(102, 255, 255));
        txtcantidadMin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcantidadMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidadMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadMinActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidadMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 120, 30));

        cboMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMedidasActionPerformed(evt);
            }
        });
        getContentPane().add(cboMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 90, 30));

        cboEstado.setBackground(new java.awt.Color(36, 33, 33));
        cboEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 90, 30));

        checkSerialized.setBackground(new java.awt.Color(255, 255, 255));
        checkSerialized.setForeground(new java.awt.Color(102, 255, 255));
        checkSerialized.setSelected(true);
        checkSerialized.setText("Serializado");
        checkSerialized.setToolTipText("");
        checkSerialized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSerializedActionPerformed(evt);
            }
        });
        getContentPane().add(checkSerialized, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("Localizaciòn :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, -1, -1));

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/exit.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 87, 34));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(207, 207, 207));
        jLabel19.setText("Creacion Producto");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Unid Medidas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("Proveedor :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Descripciòn :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Codigo De Barras:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Cantidad Inicial");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 255));
        jLabel7.setText("Cantidad Minima");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 255));
        jLabel8.setText("Nombre :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

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

        cboImpuestos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(cboImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 120, 30));

        cboProv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProvActionPerformed(evt);
            }
        });
        getContentPane().add(cboProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 260, 30));

        cboCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 120, 30));

        cboTipoProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 255));
        jLabel9.setText("Comision :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 20));

        cboAutoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        getContentPane().add(cboAutoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 30));

        checkIndicativo.setBackground(new java.awt.Color(255, 255, 255));
        checkIndicativo.setForeground(new java.awt.Color(102, 255, 255));
        checkIndicativo.setText("Tiene Indicativo");
        getContentPane().add(checkIndicativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 120, 30));

        txtDescription.setBackground(new java.awt.Color(102, 255, 255));
        txtDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescription.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 230, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 255, 255));
        jLabel15.setText("Precio Compra :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 20));

        checkNumSerie.setBackground(new java.awt.Color(255, 255, 255));
        checkNumSerie.setForeground(new java.awt.Color(102, 255, 255));
        checkNumSerie.setText("Serializar");
        getContentPane().add(checkNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 120, 30));

        checkdescriptV.setBackground(new java.awt.Color(255, 255, 255));
        checkdescriptV.setForeground(new java.awt.Color(102, 255, 255));
        checkdescriptV.setText("Descripcion en Venta");
        getContentPane().add(checkdescriptV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 150, 30));

        cboLocalizacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboLocalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalizacionActionPerformed(evt);
            }
        });
        getContentPane().add(cboLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 120, 30));

        cbtrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtribActionPerformed(evt);
            }
        });
        getContentPane().add(cbtrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 330, 30));

        cboantiTribu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboantiTribuActionPerformed(evt);
            }
        });
        getContentPane().add(cboantiTribu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 330, 30));

        cboNiif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNiifActionPerformed(evt);
            }
        });
        getContentPane().add(cboNiif, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 230, 30));

        cboAntiNiif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAntiNiifActionPerformed(evt);
            }
        });
        getContentPane().add(cboAntiNiif, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 230, 30));

        jLabel40.setBackground(new java.awt.Color(255, 87, 34));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 255, 255));
        jLabel40.setText("NIIF COmpras :");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 87, 34));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 255, 255));
        jLabel39.setText("Tributario Compras :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 255));
        jLabel11.setText("AutoProduccion");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 90, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 255, 255));
        jLabel12.setText("Estado :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 255, 255));
        jLabel13.setText("Categoria :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 255, 255));
        jLabel14.setText("Clasificacion :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jLabel42.setBackground(new java.awt.Color(255, 87, 34));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 255, 255));
        jLabel42.setText("NIIF Ventas :");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        jLabel43.setBackground(new java.awt.Color(255, 87, 34));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 255, 255));
        jLabel43.setText("Tributario Ventas :");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel44.setBackground(new java.awt.Color(255, 87, 34));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 255, 255));
        jLabel44.setText("Impuestos :");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        txtVenta.setBackground(new java.awt.Color(102, 255, 255));
        txtVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 150, 30));

        btnCrearEmpleado.setBackground(new java.awt.Color(102, 255, 255));
        btnCrearEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/guardar.png"))); // NOI18N
        btnCrearEmpleado.setBorder(null);
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 40, 40));

        txtNombreItem.setBackground(new java.awt.Color(102, 255, 255));
        txtNombreItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombreItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombreItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 330, 30));

        txtCompra.setBackground(new java.awt.Color(102, 255, 255));
        txtCompra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 150, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 255, 255));
        jLabel16.setText("Precio Venta :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, 20));

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

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
      
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void checkSerializedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSerializedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSerializedActionPerformed

    private void cboMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMedidasActionPerformed

    }//GEN-LAST:event_cboMedidasActionPerformed

    private void txtcantidadMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadMinActionPerformed

    private void cboProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProvActionPerformed

    private void cbtribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtribActionPerformed

    private void cboantiTribuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboantiTribuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboantiTribuActionPerformed

    private void cboNiifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNiifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNiifActionPerformed

    private void cboAntiNiifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAntiNiifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAntiNiifActionPerformed



//validamos los check box si esta nseleccionados manda 1 si no manda 0
    public void checkBox(){
     int serial = 0, numSerie = 0;
     int desctv = 0, Indicativo = 0;
     
    if(checkSerialized.isSelected()){
        serial = 1;
    }
    if(checkdescriptV.isSelected()){
       desctv = 1;
    }
    if(checkNumSerie.isSelected()){
        numSerie = 1;
    }
    if(checkIndicativo.isSelected()){
        Indicativo = 1;
    }
    
}
    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        //verificar si los campos estan rellenos y requerirlos
        
        ModelsItems datos;
        datos = new ModelsItems();
        itemControllers funcion = new itemControllers();

        checkBox();
                
        if (txtNombreItem.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias Ingresar el Nombre del Producto");
            txtNombreItem.requestFocus();
            return;
        }

        if (txtCompra.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias Ingresar Un Precio de Compra");
            txtVenta.requestFocus();
            return;
        }

        if (txtCompra.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias Ingresar Un Precio de Venta");
            txtVenta.requestFocus();
            return;
        }

        if (txtComision.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias Ingresar Un Precio de Venta");
            txtComision.requestFocus();
            return;
        }

        if (txtcantidadIni.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias Ingresar Un Precio de Venta");
            txtcantidadIni.requestFocus();
            return;
        }

        if (txtcantidadMin.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Creo que deberias Ingresar Un Precio de Venta");
            txtcantidadMin.requestFocus();
            return;
        }

        datos.setItem_number(txtBarCode.getText() );
        
         datos.setName(txtNombreItem.getText());
        //convertimos el dato de xtring a float
       
        Float cantidadIni = Float.parseFloat(txtcantidadIni.getText());
        datos.setQuantity(cantidadIni);
        
                //convertimos el dato de xtring a float
     
        Float cantidadMin = Float.parseFloat(txtcantidadMin.getText());
        datos.setQuantity(cantidadMin);
        
        datos.setDescription(txtDescription.getText());
        
        Float precioCompra = Float.parseFloat(txtCompra.getText());
        datos.setCost_price(precioCompra);
        
        Float precioVenta = Float.parseFloat(txtVenta.getText());
        datos.setUnit_price(precioVenta);
        
         Float Comision = Float.parseFloat(txtComision.getText());
        datos.setComision(Comision);
        
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
         datos.setTribuC(extraT.extract);
         
         String antNiif = (String) cboAntiNiif.getSelectedItem();
         extractor extraNff = new extractor();
         extraNff.extractor(antNiif);
         datos.setNiifC(extraNff.extract);
         
         int autoprod = cboAutoProd.getSelectedIndex();
        datos.setAutoProduccion(autoprod);
        
         int unidMedidas = cboMedidas.getSelectedIndex();
        datos.setUnid(unidMedidas);
        
        String category = (String) cboCategoria.getSelectedItem();
        datos.setCategory(category);
        
        int  SubCategoty = cboCategoria.getSelectedIndex();
        datos.setId_subcategoria(SubCategoty);
        
        int  Estado = cboEstado.getSelectedIndex();
        datos.setDeleted(Estado);
        
        int tipoProduct = cboTipoProducto.getSelectedIndex();
        datos.setTipo(tipoProduct);
        
        String location = (String) cboLocalizacion.getSelectedItem();
        extractor extraLocation = new extractor();
        extraLocation.extractor(location);
        int LocationId = parseInt(extraLocation.extract);
        datos.setLocation(LocationId);
        
        String taxes = (String) cboImpuestos.getSelectedItem();
        extractor extraTax = new extractor();
        extraTax.extractor(taxes);
        Float extraTaxs = Float.parseFloat(extraTax.extract);
        datos.setInpercent_tax(extraTaxs);
        
      if(funcion.verItem(datos)){
           JOptionPane.showMessageDialog(null, "Datos Ingresado");
      }else{
           JOptionPane.showMessageDialog(null, "Upss lo siento no se ingresador los Datos");
      }
            
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void cboLocalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLocalizacionActionPerformed

    private void cboTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JComboBox<String> cboAntiNiif;
    private javax.swing.JComboBox<String> cboAutoProd;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboImpuestos;
    private javax.swing.JComboBox<String> cboLocalizacion;
    private javax.swing.JComboBox<String> cboMedidas;
    private javax.swing.JComboBox<String> cboNiif;
    private javax.swing.JComboBox<String> cboProv;
    private javax.swing.JComboBox<String> cboTipoProducto;
    private javax.swing.JComboBox<String> cboantiTribu;
    private javax.swing.JComboBox<String> cbtrib;
    private javax.swing.JLabel cerrar;
    private javax.swing.JRadioButton checkIndicativo;
    private javax.swing.JRadioButton checkNumSerie;
    private javax.swing.JRadioButton checkSerialized;
    private javax.swing.JRadioButton checkdescriptV;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextField txtBarCode;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtNombreItem;
    private javax.swing.JTextField txtVenta;
    private javax.swing.JTextField txtcantidadIni;
    private javax.swing.JTextField txtcantidadMin;
    // End of variables declaration//GEN-END:variables
}
