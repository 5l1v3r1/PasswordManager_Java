package Login;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class M_Login {
    
    
    //Atributos
 private String username, email, password, mensaje;
 private int id;
 private boolean condicion_tf = false, condicion_gen = false,login = false;

 
 
 //Set and getters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCondicion_tf() {
        return condicion_tf;
    }

    public void setCondicion_tf(boolean condicion_tf) {
        this.condicion_tf = condicion_tf;
    }

    public boolean isCondicion_gen() {
        return condicion_gen;
    }

    public void setCondicion_gen(boolean condicion_gen) {
        this.condicion_gen = condicion_gen;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
    

    
    //Metodos
    
 
    public String validar_celdas (JTextField tf_user, JTextField tf_pass){           //Método Validar Celdas de entrada // TextField o TextBox
        //Validación de datos básico
        if ("".equals(tf_user.getText()) && "".equals(tf_pass.getText())){
            mensaje = "Escriba sus datos de login";
            condicion_tf = false;  
        }
        if ("".equals(tf_pass.getText()) && !"".equals(tf_user.getText())){
            mensaje = "La contraseña está vacía";
            condicion_tf = false;
        }
        if (!"".equals(tf_pass.getText()) && "".equals(tf_user.getText())){
            mensaje = "No olvide escribir su usuario";
            condicion_tf = false;
        }
        
        if (!"".equals(tf_pass.getText()) && !"".equals(tf_user.getText())){
            mensaje = "Celdas llenas, puede continuar";
            condicion_tf = true;
        }
        return mensaje;
    }
    public String clean(JTextField tf_user, JTextField tf_pass){
        tf_user.setText("");
        tf_pass.setText("");
        //setId(Integer.parseInt(""));
        setEmail("");
        setMensaje("");
        setUsername("");
        setPassword("");
       // setCondicion_gen(false);
      
     return "Se limpiaron todos los datos";
        
    
    }
  public String validar_db (Connection con,JTextField tf_user, JTextField tf_pass){     //Método Validación de datos en base de datos
        
        setLogin(false);
        if (condicion_tf == true){                                                      //Verifica que la valición de celfas fue exitoso
            setCondicion_gen(true);   //Se permite el acceso de conexión
            
            setId(id_obtener(con, tf_user));    //Se obtiene el ID del usuario ingresado 
            //la "Condición general" será Modificada como verdadero o falso según el caso
            //Si es que no encuentra el usuario, entonces, CondiciónGeneral será false, y no se podrá
            
            //Se verificará la condición general
            if (isCondicion_gen()){
                
                setUsername(username_obtener(con)); 
                setPassword(pass_obtener(con));
                if (getUsername().equals(tf_user.getText())) {
                    mensaje = "El usuario es correcto";
                    if (getPassword().equals(tf_pass.getText())) {
                        mensaje = "Usted ingresó correctamente";
                        System.out.println(clean(tf_user, tf_pass));   
                        setLogin(true);
                    }
                    else{
                        mensaje ="USER (OK); Pass (Incorrecto";
                    }
                }
                else{
                    mensaje= "El usuario es incorrecto";
                }
                
                System.out.println(""
                    + "\nEl User de la Base de Datos es: "+getUsername()
                    + "\nLa contraseña de la base de datos es: : "+getPassword()
                    + "\n\nLa username del TextField es: "+tf_user.getText()
                    + "\nLa Contraseña del TxtField es: " +tf_pass.getText()+"\n\n\n\n\n");
            }else{
                //condicion_db = false;
                mensaje = "La primera verificación tiene un problema";
                setLogin(false);
            }
                
        }else{
            mensaje = "No se encontró el usuario";
            setLogin(false);
        }
        

        return mensaje;
    }
    
    
    
    //Métodos con Base de datos 
  
  public int id_obtener(Connection con,JTextField tf_user) {                   //obtiene ID del username//
    setLogin(false);
    try (PreparedStatement stmt = con.prepareStatement(" SELECT log_id "
                                                     + " FROM log_user "
                                                     + " WHERE log_username =?")) {
        stmt.setString(1, tf_user.getText());

        try(ResultSet rs = stmt.executeQuery()) {
            if (!rs.next()) {
                throw new SQLException("El usuario no existe o está mal escrito");
                
            }
            return rs.getInt("log_id");
        }
    } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "El username no existe o Está mal escrito");
         
         setCondicion_gen(false);       //Se deniega la continuación del proceso 
       // JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: companiaNombreToInt()", JOptionPane.ERROR_MESSAGE);
    }
    return 0;
    }       
  
  public String pass_obtener(Connection con) {
      setLogin(false);
    try (PreparedStatement stmt = con.prepareStatement(" SELECT log_pass "
                                                     + " FROM log_user "
                                                     + " WHERE log_username =? ")) {
        stmt.setString(1, getUsername());

        try(ResultSet rs = stmt.executeQuery()) {
            if (!rs.next()) {
                throw new SQLException("No se encontró contraseña: " + getPassword());  // Eliminar esta parte
            }
            return rs.getString("log_pass");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "La contraseña que usted escribio es incorrecta");
        setCondicion_gen(false);       //Se deniega la continuación del proceso
        //JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: Contraseña ToInt()", JOptionPane.ERROR_MESSAGE);
    }
    return "";
    }       
    
  public  String username_obtener(Connection con){
        setLogin(false);
        try (PreparedStatement stmt = con.prepareStatement(" SELECT log_username "
                                                     + " FROM log_user "
                                                     + " WHERE log_id =? ")) {
       stmt.setInt(1, getId());

        try(ResultSet rs = stmt.executeQuery()) {
            if (!rs.next()) {
                throw new SQLException("No se encontró el usuario " + getPassword());
            }
            return rs.getString("log_username");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "El Usuario que usted ingresó no existe");  
        setCondicion_gen(false);       //Se deniega la continuación del proceso
        //System.out.println("El usuario que usted ingreso no existe");
        //JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: Contraseña ToInt()", JOptionPane.ERROR_MESSAGE);
    }
    return "";
    }       
}
