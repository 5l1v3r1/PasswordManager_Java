package Create_New_User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Crud_User {
    private String mensaje = "";
    //private Data_User u;
     
    
    public String guardar (Connection con, Data_User u){
        PreparedStatement pst = null;
        String sql =  " insert into log_user "
                    + " ( "
                    + " log_username, "
                    + " log_email, "
                    + " log_pass, "
                    + " log_name, "
                    + " log_last_name, "
                    + " log_gen_id, "
                    + " country_phone_id, "
                    + " log_phone, "
                    + " log_recovery_email, "
                    + " log_pass_recovery, "
                    + " log_condition "
                    + " ) "
                    + " values "
                    + " (?,?,?,?,?,?,?,?,?,?,?)"; 
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,u.getL_username());         //1
            pst.setString(2,u.getL_email());            //2
            pst.setString(3,u.getL_pass());             //3
            pst.setString(4,u.getL_name());             //4
            pst.setString(5,u.getL_last_name());        //5
            pst.setInt(6,u.getL_genero());              //6
            pst.setInt(7,u.getL_country_id());          //7
            pst.setInt(8,u.getL_phone());               //8
            pst.setString(9,u.getL_recovery_email());   //9
            pst.setString(10,u.getL_pass_recovery());   //10
            pst.setInt(11,u.getL_contition());          //11            
            pst.execute();
            pst.close();
            mensaje = ("Se guardo con exito");
        } catch (Exception e) {
            mensaje = ("Error al guardar\n"+e.getMessage());
            //Hacer que le menmsaje de error sea visible para el usuario intuitivamente  
        }
    return mensaje; 
    }
    
    public int id_obtener(Connection con, Data_User u) {
    try (PreparedStatement stmt = con.prepareStatement(" SELECT log_id "
                                                     + " FROM log_user "
                                                     + " WHERE log_username =?")) {
        stmt.setString(1, u.getL_username());

        try(ResultSet rs = stmt.executeQuery()) {
            if (!rs.next()) {
                throw new SQLException("No se encontró registro con el nombre: " + u.getL_username());
            }
            return rs.getInt("log_id");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: companiaNombreToInt()", JOptionPane.ERROR_MESSAGE);
    }
    return 0;
    }
    
    public String actualizar(Connection con,Data_User u){
    
        PreparedStatement pst = null;
        String sql =  " UPDATE log_user SET "
                    + " log_username=?, "            //1
                    + " log_email=?, "           //2
                    + " log_pass=?, "            //3
                    + " log_name=?, "            //4
                    + " log_last_name=?, "       //5
                    + " log_gen_id=?, "          //6
                    + " country_phone_id=?, "    //7
                    + " log_phone=?,"            //8
                    + " log_recovery_email=?, "  //9
                    + " log_pass_recovery=?, "    //10
                    + " log_condition=? "         //11
                    + " WHERE "
                    + " log_id=? ";               //12
        
        try {
           pst = con.prepareStatement(sql);
           
            pst.setString(1,u.getL_username());         //1
            pst.setString(2,u.getL_email());            //2
            pst.setString(3,u.getL_pass());             //3
            pst.setString(4,u.getL_name());             //4
            pst.setString(5,u.getL_last_name());        //5
            pst.setInt(6,u.getL_genero());              //6
            pst.setInt(7,u.getL_country_id());      //7
            pst.setInt(8,u.getL_phone());               //8
            pst.setString(9,u.getL_recovery_email());   //9
            pst.setString(10,u.getL_pass_recovery());   //10
            pst.setInt(11,u.getL_contition());          //11   
            pst.setInt(12,u.getL_id());                 //12
            
            pst.execute();
            pst.close();
            mensaje = ("Se actualizó con exito");
        } catch (Exception e) {
            mensaje = ("Error al actualizar"+e.getMessage());
            
        }
    return mensaje;
    }
    
    public String Eliminar(Connection con,int id){
    
        PreparedStatement pst = null;
            String sql = " DELETE FROM log_user "
                       + " WHERE log_id = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);                           //1
            
            pst.execute();
            pst.close();
            mensaje = ("Se eliminó el dato correctamente");
        } catch (Exception e) {
            mensaje = ("Error al Eliminar el dato: \n"+e.getMessage());
            
        }
    return mensaje;
    }
    
    public  String Mostrar (Connection con, Data_User u){
        PreparedStatement pst = null;
        ResultSet rs;       // Resultado 
        String sql = " SELECT * FROM log_user "
                   + " WHERE log_id =? ";
        try {
            pst = con.prepareStatement(sql);
            // Obtiene el "u.getL_id"" de la otra clase 
            pst.setInt(1,u.getL_id());
            rs = pst.executeQuery();
            if (rs.next()){
            u.setL_username(rs.getString("log_username"));                      //User
            u.setL_email(rs.getString("log_email"));                    //Email
            u.setL_name(rs.getString("log_name"));                      //Nombre
            u.setL_last_name(rs.getString("log_last_name"));            //Apellido
            u.setL_genero(rs.getInt("log_gen_id"));                     //Género
            u.setL_country_id(rs.getInt("country_phone_id"));       //cod Pais
            u.setL_phone(rs.getInt("log_phone"));                       //telefono    
            u.setL_recovery_email(rs.getString("log_recovery_email"));  //Email de recuperación
            
            // Set Imagen ( Falta insertar una imagen )
            
            }else {
            mensaje = "No existe Usuario"; 
            
            } 
        } catch (Exception e) {
            mensaje = ("Error al mostrar los datos : "+e);
        }
        return mensaje;
   
    }
    
    public String show_cb_country(Connection con, Data_User u, JComboBox cb_n){
        cb_n.removeAllItems();  //Remueve todos los items existentes en el combo box 
        PreparedStatement pst = null;
        ResultSet rs;       // Resultado 
        
        String sql = " SELECT country_name "
                   + " FROM country_phone "
                   + " ORDER BY country_phone_id "
                   + " ASC";   //Consulta SQL
        
        // el ASC (son los datos donde queremos que se ordene, numerica o alfabeticamente) 
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(); 
            //LLenamos nuestro ComboBox
            cb_n.addItem("Seleccione");

            while(rs.next()){

                cb_n.addItem(rs.getString("country_name"));
            }
        } catch (Exception e) {

                mensaje = ("Error al obtener combo box (Pais_phone): "+e);
         }

        
        return mensaje;
    }
    public String show_cb_gen(Connection con, Data_User u, JComboBox cb_gen){
        cb_gen.removeAllItems();  //Remueve todos los items existentes en el combo box 
        PreparedStatement pst = null;
        ResultSet rs;       // Resultado 
        String sql = " SELECT log_user_gen "
                   + " FROM log_gen "
                   + " ORDER BY log_user_gen_id "
                   + " ASC";   //Consulta SQL
       
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(); 
            //LLenamos nuestro ComboBox
            cb_gen.addItem("Seleccione");

            while(rs.next()){

                cb_gen.addItem(rs.getString("log_user_gen"));
            }
        } catch (Exception e) {

                mensaje = ("Error al obtener combo box (Genero): "+e);
         }

        
        return mensaje;
    }
    public boolean vali_email( JTextField tf_email,JTextField tf_remail){
        
        if (!"".equals(tf_email.getText()) && "".equals(tf_remail.getText())){
            return false;
        }
        if (tf_email.getText().equals(tf_remail.getText())){
            
           if (!"".equals(tf_email.getText()) && !"".equals(tf_remail.getText())){
               return true; 
            }
           else{
               return false;
           }
        }
    return false;
    }
    public boolean vali_pass(JTextField tf_pass , JTextField tf_rpass){
        
        if (!"".equals(tf_pass.getText()) && "".equals(tf_rpass.getText())){
            return false;
        }
        if (tf_pass.getText().equals(tf_rpass.getText())){
            if (!"".equals(tf_pass.getText()) && !"".equals(tf_rpass.getText())){
               return true; 
            }
           else{
               return false;
           }
        }
        
    return false;
    }
    public boolean vali_complete( JTextField tf_username, JTextField tf_email,JTextField tf_remail,JTextField tf_pass , JTextField tf_rpass){
        boolean e = vali_email(tf_email, tf_remail);
        boolean p = vali_pass(tf_pass, tf_rpass);
        
        if (e == true && p == true){
            if (!"".equals(tf_username.getText())){
                return true;

            
            }
            return false;
        }     
    return false;
    }
}

