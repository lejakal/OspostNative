package Controlers;


import Models.ModelsUsers;
import Models.extractor;
import Models.people;
import Views.Login;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioControllers {

    private conexion mysql = new conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL
    private String sSQL2 = "";
    private String sSQL3 = "";
    private String sSQL4 = "";
    public Integer totalRegistros; // Obtener los registros

    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"COD", "Nombre", "Direccion", "Telefono", "Email", "Cedula", "Login", "pass", "Estado", "Acceso"};

        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.cod_persona , p.nombre_persona , p.direccion,p.telefono , "
                + "p.email,u.rut_usuario,u.login,u.password,u.estado ,u.acceso from "
                + " persona p inner join usuario u on p.cod_persona = u.cod_usuario "
                + " where nombre_persona like '%" + buscar + "%' order by cod_persona desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("cod_persona");
                registros[1] = rs.getString("nombre_persona");
                registros[2] = rs.getString("direccion");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("email");
                registros[5] = rs.getString("rut_usuario");
                registros[6] = rs.getString("login");
                registros[7] = rs.getString("password");
                registros[8] = rs.getString("estado");
                registros[9] = rs.getString("acceso");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    /**
     * *Cierre Funcion Mostrar**
     */

    /**
     * Cierre Funcion Mostrar
     *
     * @param datos
     */
    public boolean insertar(ModelsUsers datos) {
        
        //insertar en tabla empleados  o ususarios del sistema
        sSQL = "insert into ospos_people (first_name,last_name,phone_number,email,address_1,address_2,city,state,zip,country,comments,person_id,DigVerif,apellidos,tipoPeople,img,categoCliente)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into ospos_employees (username,password,person_id,deleted,niff,tributario,niffA,tribA,rol,id_empleado)"
                + " values (?,?,?,?,?,?,?,?,?,?)";
        
        sSQL4 = "insert into empleados (idemp, nombre, apellidouno, apellidodos, email, dni, estado, nuss, sexo, observaciones, telfcont, telfcont2, calle, piso, puerta, cp, localidad, provincia, fechaent, fechasal, hijos, estadocivil, linkfoto, ARP, linkfoto2, fechaNaci, arl, person_id )"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
        

        try {
            String registro ="";
            PreparedStatement pst = cn.prepareStatement(sSQL, Statement.RETURN_GENERATED_KEYS);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            PreparedStatement pst4 = cn.prepareStatement(sSQL4);

            
                
                
            pst.setString(1, datos.getFirst_name());
            pst.setString(2, datos.getLast_name());
            pst.setInt(3, datos.getPhone_number());
            pst.setString(4, datos.getEmail());
            pst.setString(5, datos.getAddress_1());
            pst.setString(6, datos.getFechaNaci());
            pst.setInt(7, datos.getCity());
            pst.setInt(8, datos.getDelete());
            pst.setString(9, "0");
            pst.setString(10, datos.getCountry());
            pst.setString(11, datos.getObservaciones());
            pst.setInt(12, datos.getPerson_id());
            pst.setInt(13, 0);
            pst.setString(14, datos.getApellidos());
            pst.setInt(15, 1);
            pst.setString(16, "");
            pst.setInt(17, 0);
            
            int N = pst.executeUpdate();
            
            

            
           
            
            //estructurado
                       
            String sqlRequest = "select * from ospos_people";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlRequest);
            
            while (rs.next()) {
               
                registro = rs.getString("person_id");         
                
            }
            
            int register = parseInt(registro);
            
 
            
            pst4.setInt(1, 0);
            pst4.setString(2, datos.getFirst_name());
            pst4.setString(3, datos.getApellidouno());
            pst4.setString(4, datos.getApellidodos());
            pst4.setString(5, datos.getEmail());
            pst4.setString(6, datos.getLast_name());
            pst4.setInt(7, datos.getDelete());
            pst4.setString(8, "");
            pst4.setInt(9, datos.getSexo());
            pst4.setString(10, datos.getObservaciones());
            pst4.setInt(11, datos.getPhone_number());
            pst4.setInt(12, datos.getTelfcont2());
            pst4.setString(13, "");//para ser modificados segun reqeurimiento
            pst4.setString(14, "");
            pst4.setString(15, "");
            pst4.setInt(16, 0);
            pst4.setString(17, "");
            pst4.setInt(18, 0);
            pst4.setString(19, datos.getFechaent());
            pst4.setString(20, datos.getFechaent());
            pst4.setInt(21, datos.getHijos());
            pst4.setInt(22, datos.getEstadocivil());
            pst4.setString(23, "");
            pst4.setString(24, datos.getARP());
            pst4.setString(25, "");
            pst4.setString(26, datos.getFechaNaci());
            pst4.setString(27, datos.getArl());
            pst4.setInt(28, register);
            //ejecutamos el insert
            int N3 = pst4.executeUpdate();
           
            //tomamos el ultimo ide insertado
            //estructurado
                    String registroEmp="";   
            String sqlempleados = "select * from empleados";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(sqlempleados);
            
            while (rs2.next()) {
              
                registroEmp = rs2.getString("idemp");         
                
            }
            
           
            int regisEmpleado = parseInt(registroEmp);
            
            
            System.out.print("este es el id del empleado : "+regisEmpleado);
            //datos del insert p3 de employees
            pst2.setString(1, datos.getUsername());
            pst2.setString(2, datos.getPassword());           
            pst2.setInt(3, register);
            pst2.setInt(4, datos.getDelete());
            pst2.setString(5, datos.getNiff());
            pst2.setString(6, datos.getTributario());
            pst2.setString(7, datos.getNiffA());
            pst2.setString(8, datos.getTributarioA());
            pst2.setInt(9, datos.getRol());
            pst2.setInt(10, regisEmpleado);
            
            
            
            
            
            
            int N2 = pst2.executeUpdate();
            if (N != 0 ) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }/*CIERRE FUNCION INSERTAR*/

    public boolean instalar (ModelsUsers datos) {
        
        //insertar en tabla empleados  o ususarios del sistema
        sSQL = "insert into ospos_people (first_name,last_name,phone_number,email,address_1,address_2,city,state,zip,country,comments,person_id,DigVerif,apellidos,tipoPeople,img,categoCliente)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into ospos_employees (username,password,person_id,deleted,niff,tributario,niffA,tribA,rol,id_empleado)"
                + " values (?,?,?,?,?,?,?,?,?,?)";       
        

        try {
            String registro ="";
            PreparedStatement pst = cn.prepareStatement(sSQL, Statement.RETURN_GENERATED_KEYS);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
          
            pst.setString(1, datos.getFirst_name());
            pst.setString(2, datos.getLast_name());
            pst.setInt(3, datos.getPhone_number());
            pst.setString(4, datos.getEmail());
            pst.setString(5, datos.getAddress_1());
            pst.setString(6, "0000-00-00");
            pst.setInt(7, 0);
            pst.setInt(8, 0);
            pst.setString(9, "0");
            pst.setString(10, "0");
            pst.setString(11,"'");
            pst.setInt(12, datos.getPerson_id());
            pst.setInt(13, 0);
            pst.setString(14, "0");
            pst.setInt(15, 1);
            pst.setString(16, "0");
            pst.setInt(17, 0);
            
            int N = pst.executeUpdate();
            //estructurado
                       
            String sqlRequest = "select * from ospos_people";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlRequest);
            
            while (rs.next()) {
               
                registro = rs.getString("person_id");         
                
            }
            
            int register = parseInt(registro);
            
         
            //tomamos el ultimo ide insertado
            //datos del insert p3 de employees
            pst2.setString(1, datos.getUsername());
            pst2.setString(2, datos.getPassword());           
            pst2.setInt(3, register);
            pst2.setInt(4, datos.getDelete());
            pst2.setString(5,"");
            pst2.setString(6, "");
            pst2.setString(7, "");
            pst2.setString(8, "");
            pst2.setInt(9, datos.getRol());
            pst2.setInt(10, 0);
            
            
            
            
            
            
            int N2 = pst2.executeUpdate();
            if (N != 0 ) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }/*CIERRE FUNCION INSERTAR*/


    public boolean editar(ModelsUsers datos) {

        sSQL = "update ospos_people set first_name = ? , last_name = ? ,"
                + " phone_number = ? , email = ? , address_1 = ? , address_2 = ? , city = ? ,"
                + " state = ? , zip = ? , country = ? , comments = ? , DigVerif = ? ,"
                + " apellidos = ? , tipoPeople = ? , img = ? , categoCliente = ? where person_id = ?";

        sSQL2 = "update UPDATE ospos_employees SET username = ?, password = ?,"
                + " deleted = ?, niff = ?, tributario = ?, niffA = ?, tribA = ?,"
                + " rol = ?, id_empleado = ? WHERE person_id = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, datos.getFirst_name());
            pst.setString(2, datos.getLast_name());
            pst.setInt(3, datos.getPhone_number());
            pst.setString(4, datos.getEmail());
            pst.setString(5, datos.getAddress_1());
            pst.setString(6, datos.getAddress_2());
            pst.setInt(7, datos.getCity());
            pst.setString(8, datos.getState());
            pst.setString(9, datos.getZip());
            pst.setString(10, datos.getCountry());
            pst.setString(11, datos.getComments());
            pst.setInt(12, datos.getPerson_id());
            pst.setInt(13, datos.getDigVerif());
            pst.setString(14, datos.getApellidos());
            pst.setString(15, datos.getImg());
            pst.setInt(16, datos.getCategoCliente());
            pst.setInt(17, datos.getPerson_id());

            pst2.setString(1, datos.getUsername());
            pst2.setString(2, datos.getPassword());
            pst2.setInt(3, datos.getDelete());
            pst2.setString(4, datos.getNiff());
            
            pst2.setString(5, datos.getTributario());
            
            pst2.setString(6, datos.getNiffA());
            
            pst2.setString(7, datos.getTributarioA());
            
            pst2.setInt(8, datos.getRol());
            pst2.setInt(9, datos.getId_empleado());
            
            pst2.setInt(10, datos.getPerson_id());

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();
            
            

            if (N != 0 || N2 != 0) {

                return true;

            } else {

                return false;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }/*CIERRE FUNCION EDITAR*/

    public boolean clear(ModelsUsers datos) {

        sSQL2 = "update UPDATE ospos_employees SET deleted = ? WHERE person_id = ?";

        try {

            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst2.setInt(1, datos.getDelete());
            pst2.setInt(2, datos.getPerson_id());

            int N2 = pst2.executeUpdate();

            if (N2 != 0) {

                return true;

            } else {

                return false;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }/*CIERRE FUNCION EDITAR*/


    public boolean eliminar(ModelsUsers datos) {

        sSQL = "delete from ospos_people where person_id = ?";
        sSQL2 = "delete from ospos_employee where person_id = ?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, datos.getPerson_id());
            pst2.setInt(1, datos.getPerson_id());

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();

            if (N != 0 || N2 != 0) {

                return true;

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    } //cierre funcion eliminar

    /**
     * ***************************************************************
     */
    public DefaultTableModel login(String login, String password) {
        DefaultTableModel modelo;

        String[] titulos = {"COD", "NOMBRE", "DIRECCION", "TELEFONO", "EMAIL", "LOGIN", "PASS", "ESTADO", "ACCESO"};

        String[] registro = new String[9];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.person_id , p.first_name , p.last_name ,"
                + "p.phone_number, p.email , p.address_1 , u.username  , u.password , u.deleted ,"
                + "u.rol from ospos_people p inner join ospos_employees "
                + " u on p.person_id = u.person_id where u.username ='" + login + "' "
                + " and u.password ='" + password + "' and deleted = '0'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("person_id");
                registro[1] = rs.getString("first_name");
                registro[2] = rs.getString("last_name");
                registro[3] = rs.getString("phone_number");

                registro[4] = rs.getString("email");
                registro[4] = rs.getString("address_1");
                registro[5] = rs.getString("username");
                registro[6] = rs.getString("password");
                registro[7] = rs.getString("deleted");
                registro[8] = rs.getString("rol");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public int ContarUsuarios() {

        sSQL = "select count(person_id) AS cantidadUsuarios from ospos_employees";

        try {
            int codigo_venta = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
            codigo_venta = rs.getInt("cantidadUsuarios");
            }

            return codigo_venta;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }
    


        public int verificarLogin() {
        ModelsUsers User = new ModelsUsers(); 
        String login =User.getPassword();
        sSQL ="SELECT COUNT(login) AS login FROM ospos_employees WHERE password = "+login;

        try {
            int loginResultante = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                loginResultante = rs.getInt("password");
            }

            return loginResultante;

        } catch (Exception e) {
            return 0;
        }

    }
}
