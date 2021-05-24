
package Controlers;

import Models.ModelsItems;
import Models.ModelsUsers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class itemControllers {
    
    private conexion mysql = new conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String SQL = ""; //Sentencia SQL
    private String sSQL = ""; //Sentencia SQL    
    private String SQLAUX = "";
    public Integer Registros; // Obtener los registros
    
    
   
    public boolean insertar(ModelsItems datos) {
        
        sSQL = "insert into ospos_items (name, category, supplier_id, item_number, description, cost_price, unit_price,"
                +" quantity, reorder_level, item_id, allow_alt_description, is_serialized, deleted, custom1, custom2,"
                +" custom3, custom4, custom5, custom6, custom7, custom8, custom9, custom10, niff, tributario,"
                +" old_price_venta, tipo, autoProduccion, Unid, old_compra, pic, niifC, tribuC, percent_tax, img, video,"
                +" descripcion, id_subcategoria, comision, oferta, ind)"+ 
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 //provicional
  try {
      

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, datos.getName());
            pst.setString(2, datos.getCategory());
            pst.setInt(3, datos.getSupplier_id());
            pst.setString(4, datos.getItem_number());
            pst.setString(5, datos.getDescripcion());
            pst.setFloat(6, datos.getCost_price());
            pst.setFloat(7, datos.getUnit_price());
            pst.setFloat(8, datos.getQuantity());
            pst.setFloat(9, datos.getReorder_level());
            pst.setInt(10, 0);
            pst.setString(11, datos.getAllow_alt_description());
            pst.setInt(12, datos.getIs_serialized());
            pst.setInt(13, datos.getDeleted());
            //custom toco dejarlo asi por uqe la db web viene asi
            pst.setString(14, datos.getCustom1());
            pst.setString(15, datos.getCustom2());
            pst.setString(16, datos.getCustom3());
            pst.setString(17, datos.getCustom4());
            pst.setString(18, datos.getCustom5());
            pst.setString(19, datos.getCustom6());
            pst.setString(20, datos.getCustom7());
            pst.setString(21, datos.getCustom8());
            pst.setString(22, datos.getCustom9());
            pst.setString(23, datos.getCustom10());            
            pst.setString(24, datos.getNiff());
            pst.setString(25, datos.getTributario());
            pst.setFloat(26, datos.getOld_price_venta());
            pst.setInt(27, datos.getTipo());
            pst.setInt(28, datos.getAutoProduccion());
            pst.setInt(29, datos.getUnid());
            pst.setFloat(30, datos.getOld_compra());
            pst.setString(31, datos.getPic());
            pst.setString(32, datos.getNiifC());
            pst.setString(33, datos.getTribuC());
            pst.setFloat(34, datos.getInpercent_tax());
            pst.setString(35, datos.getImg());
            pst.setString(36, datos.getVideo());
            pst.setString(37, datos.getDescripcion());
            pst.setInt(38, datos.getId_subcategoria());
            pst.setFloat(39, datos.getComision());
            pst.setInt(40, datos.getOferta());
            pst.setInt(41, datos.getInd());
            
            int N = pst.executeUpdate();
            

            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

         }/*CIERRE FUNCION INSERTAR*/
      
    public boolean verItem (ModelsItems datos){
        
          System.out.print("Nombre > "+datos.getName()+"\n");
            System.out.print("Category > "+datos.getCategory()+"\n");
            System.out.print("Suplier id > "+datos.getSupplier_id()+"\n");
            System.out.print("Item Numbre > "+datos.getItem_number()+"\n");
            System.out.print("description > "+datos.getDescripcion()+"\n");
            System.out.print("Cost price > "+datos.getCost_price()+"\n");
            System.out.print("unit Price> "+datos.getUnit_price()+"\n");
            System.out.print("Quantity > "+datos.getQuantity()+"\n");
           System.out.print("reorden level> "+datos.getReorder_level()+"\n");
            System.out.print("item id > "+0+"\n");
            System.out.print("descripcion > "+datos.getDescription()+"\n");
            System.out.print("Serializado > "+datos.getIs_serialized()+"\n");
           System.out.print("Delete> "+datos.getDeleted()+"\n");
            //custom toco dejarlo asi por uqe la db web viene asi
            System.out.print("Custom1 > "+datos.getCustom1()+"\n");
            System.out.print("Custom2 > "+datos.getCustom2()+"\n");
            System.out.print("Custom3> "+datos.getCustom3()+"\n");
           System.out.print("Custom4 > "+datos.getCustom4()+"\n");
           System.out.print("Custom5 > "+datos.getCustom5()+"\n");
            System.out.print("Custom6 > "+datos.getCustom6()+"\n");
            System.out.print("Custom7 > "+datos.getCustom7()+"\n");
           System.out.print("Custom8 > "+datos.getCustom8()+"\n");
            System.out.print("Custon9 > "+datos.getCustom9()+"\n");
            System.out.print("custom10 > "+datos.getCustom10()+"\n");        
            System.out.print("Niff > "+datos.getNiff()+"\n");
           System.out.print("tributario > "+datos.getTributario()+"\n");
            System.out.print("precio Venta > "+datos.getUnit_price()+"\n");
           System.out.print("tipo > "+datos.getTipo()+"\n");
           System.out.print("Produccion > "+datos.getAutoProduccion()+"\n");
          System.out.print("Unid MEdida > "+datos.getUnid()+"\n");
            System.out.print("Compra > "+datos.getOld_compra()+"\n");
            System.out.print("pic > "+datos.getPic()+"\n");
            System.out.print("Niif c> "+datos.getNiifC()+"\n");
            System.out.print("tribuc > "+datos.getTribuC()+"\n");
            System.out.print("Porcentaje comision > "+datos.getInpercent_tax()+"\n");
            System.out.print("img > "+datos.getImg()+"\n");
            System.out.print("video > "+datos.getVideo()+"\n");
            System.out.print("Descripcion > "+datos.getDescription()+"\n");
            System.out.print("SubCategoria > "+datos.getId_subcategoria()+"\n");
            System.out.print("Comision > "+datos.getComision()+"\n");
           System.out.print("Oferta > "+datos.getOferta()+"\n");
            System.out.print("Ind > "+datos.getInd()+"\n");
            
        
        return true;
        
    }
    } 
    
    
    
    
    

