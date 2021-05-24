/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import Controlers.conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author ing daniel reyes
 */
public class extractor {
    
   
    public String extractor;  
    public String extract; 
    public int reg;

    public String getExtractor() {
        return extractor;
    }

    public void setExtractor(String extractor) {
        this.extractor = extractor;
    }

        
        public String extractor(String extracto){
         String[] CEXTRA = extracto.split("-");
        
        for (int i = 0; i < 2; i++) {	
        if(i==0){
            extractor=CEXTRA[i];
            extract = extractor;
                       }                 
         }
        return extract;
    }

public int lastInsert(String table, String columna ){
    try{
            String registro="";
            conexion mysql = new conexion(); //Instanciando la clase conexion
            Connection cn = mysql.conectar();
            String sqlRequest = "select * from "+table;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlRequest);
            
            while (rs.next()) {
               
                registro = rs.getString(columna);             
                
            }
            int reg = parseInt(registro);
            
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
                 }
    return reg;
}
        
        
}
