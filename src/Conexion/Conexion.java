package Conexion;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
     
    Connection conectar = null;         // "Connection" es una palabra reservada // con ella se importa su librería
//    Declaramos los datos de Conexion a la bd
//    String driver="com.mysql.jdbc.Driver";                                     //Database Driver
//    String user="uxn9325vqgromb0d";                                            //Database User
//    String pass="acqyS6yNc1q3RpEvFTP8";                                        //DataBase Password
//    String database = "bixjqd5hmlmr4i0fnaft";                                  //Database name
//    String port = "3306";                                                      //Database Port
//    String dburl = "bixjqd5hmlmr4i0fnaft-mysql.services.clever-cloud.com";     //Database Link // Host 
//    String url="jdbc:mysql://"+dburl+":"+port+"/"+database;
    //Creando método
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://bixjqd5hmlmr4i0fnaft-mysql.services.clever-cloud.com/bixjqd5hmlmr4i0fnaft","uxn9325vqgromb0d","acqyS6yNc1q3RpEvFTP8");
                System.out.println("Se conecto correctamente a la base de datos");
            //JOptionPane.showMessageDialog(null,"conexión exitosa");
            
        } catch (Exception e) {
            System.out.println("hubo un error en al conexión de la base de datos");
        // JOptionPane.showMessageDialog(null,"Error de Conexion"+ e.getMessage());  
        }
        return conectar;
    }
    
    
}
