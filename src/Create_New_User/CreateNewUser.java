package Create_New_User;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;
import Conexion.Conexion;
import Login.Login;


public class CreateNewUser extends javax.swing.JFrame {
        //Instanciando Conexión
        Conexion cc=new  Conexion();
        Connection con= cc.conexion();
        //Instanciando Data_User y Crud_User
        Data_User u = new Data_User() ; // Solo cuando no hay contructor
        Crud_User e = new Crud_User();  // Solo cuando no hya contrsuctor 
        String mensaje = "";        //Variable ára mostrar mensajes en consola
       // 
        
        public CreateNewUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btn_clear = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        tf_rpass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_lastname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_recemail = new javax.swing.JTextField();
        tf_remail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        cb_gen = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cb_n = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 760));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 90, -1));

        btn_exit.setText("Volver");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 90, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("User:");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 92, 84, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create new User");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, 570, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 122, 84, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 182, 84, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Repeat Password: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));
        getContentPane().add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 88, 149, -1));
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 118, 149, -1));
        getContentPane().add(tf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 178, 149, -1));

        tf_rpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_rpassKeyReleased(evt);
            }
        });
        getContentPane().add(tf_rpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 208, 150, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Last Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));
        getContentPane().add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, -1));

        tf_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 48, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Personal Information");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 570, -1));
        getContentPane().add(tf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 150, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Country:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Recovery Email:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        tf_recemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_recemailActionPerformed(evt);
            }
        });
        getContentPane().add(tf_recemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 146, -1));

        tf_remail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_remailKeyReleased(evt);
            }
        });
        getContentPane().add(tf_remail, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 148, 149, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Repeat Email:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 152, 84, -1));

        jLabel13.setText("Select an Image ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 54, -1, -1));

        jButton3.setText("imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 88, 150, 150));

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 90, -1));

        cb_gen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Géneros" }));
        cb_gen.setName("Select"); // NOI18N
        cb_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_genActionPerformed(evt);
            }
        });
        getContentPane().add(cb_gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 150, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 56, -1));

        cb_n.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paises" }));
        cb_n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cb_nMouseEntered(evt);
            }
        });
        cb_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nActionPerformed(evt);
            }
        });
        getContentPane().add(cb_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 150, -1));

        jLabel17.setText("Phone:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info.setText("_____");
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lastnameActionPerformed
        
    }//GEN-LAST:event_tf_lastnameActionPerformed

    private void tf_recemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_recemailActionPerformed
       
    }//GEN-LAST:event_tf_recemailActionPerformed

    private void cb_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_genActionPerformed
        
    }//GEN-LAST:event_cb_genActionPerformed
    public void volver(){
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    
    
    }
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if(e.vali_complete(tf_username, tf_email, tf_remail, tf_pass, tf_rpass) == true){
            mensaje = obtiene();
            System.out.println(mensaje);

            mensaje = e.guardar(con,u);
            System.out.println(mensaje);                    //Muestra Información de Guardado

            if ("Se guardo con exito".equals(mensaje)){     //
                //Volver a la ventana de login 
                  volver();
                //Limpiando datos
                  limpiar();                                  //
            }
            
            if ( mensaje != "Se guardo con exito" ){
            info.setText("El usuario o el correo ya existen");
        
            }  
        }else{
            info.setText("Verifique todos los datos, antes de continuar");
        }
        
        
    }//GEN-LAST:event_btn_saveActionPerformed
    public  String validacion(){        //Validación de Texto (Contraseña, correo )
        System.out.println("Se validaron los datos correctamente");
    return mensaje;
    }
    
    
    public String  obtiene(){                                              //Establece datos 
       
         try {
            // guardar Valicación de campos 

        //Manda datos a la Clase "Crud_User"
        u.setL_username(tf_username.getText());
        u.setL_email(tf_email.getText());                               // Correo Electronico
        u.setL_pass(tf_pass.getText());                                 // Contraseña               // Se debe insertar método para encriptarla
        u.setL_name(tf_name.getText());                                 // Nombre
        u.setL_last_name(tf_lastname.getText());                        // Apellidos 
        u.setL_genero(cb_gen.getSelectedIndex()); 
        u.setL_country_id(cb_n.getSelectedIndex());
        if ("".equals(tf_phone.getText())){
            u.setL_phone(0);             // Código del pais +Número de Telefono 
        
        }else{
            u.setL_phone(Integer.parseInt(tf_phone.getText()));             // Código del pais +Número de Telefono 
        }
        
        u.setL_recovery_email(tf_recemail.getText());                   // Correo de Recuperación    
        u.setL_pass_recovery("password de recuperación");               // Password de recuéración de cuenta (se autogenerará con un método )
        u.setL_contition(1);                                            // Binario para ver si el usuario está activo o dado de baja
        
        
        mensaje = "Se obtubieron los datos correctamente\n Genero: "+u.getL_genero() + "\n Codigo Telefono: "+u.getL_country_id()+"\n El telefono es: "+u.getL_phone();
        
        } catch (Exception e) {
            mensaje = ("Vista: Hubo un error al Obtener:  "+e.getMessage());
        }   
      return mensaje;   
    }
     public String mostrar(){
         try {
            //Manda datos a la Clase "Crud_User"
            tf_username.setText(u.getL_username());                     //Usuario
            tf_email.setText(u.getL_email());
            tf_name.setText(u.getL_name());
            tf_lastname.setText(u.getL_last_name());
            cb_gen.setSelectedIndex(u.getL_genero());
            cb_n.setSelectedIndex(u.getL_country_id());
            String phone = String.valueOf(u.getL_phone());
            tf_phone.setText(phone);
            tf_recemail.setText(u.getL_recovery_email());
        
            mensaje = "Vista: Se mostró correctamente \n\n Genero: "+u.getL_genero() + "\n Codigo Telefono: "+u.getL_country_id()+"\n El telefono es: "+u.getL_phone();
         } catch (Exception e) {
             mensaje = ("Vista: Hubo un error al mostrar: "+e.getMessage());
         }
     
        return mensaje;
     }
    
    public String  limpiar(){
        
        try {
               
                //Limpiando métodos
                u.setL_username("");                    //Username
                u.setL_email("");                       //Email
                u.setL_pass("");                        //Password
                u.setL_name("");                        //Name
                u.setL_last_name("");                   //LastName
                u.setL_genero(0);                       //ComboBox (Género sex)
                u.setL_country_id(0);               //
                u.setL_phone(Integer.parseInt(""));
                u.setL_recovery_email("");
                u.setL_pass_recovery("");
                u.setL_contition(1);
                u.setL_pass_recovery("");
                
                
                 //Limpiando Celdas (TextField) 
            
                tf_username.setText("");                                  
                tf_email.setText("");                                        
                tf_pass.setText("");                                             
                tf_name.setText("");                                             
                tf_lastname.setText("");                                            
                cb_gen.setSelectedIndex(0);                     //Reinicia index       
                cb_n.setSelectedIndex(0); 
                tf_phone.setText("");                                             
                tf_recemail.setText(""); 
                
                mensaje = ("Vista: Se Limpiaron las celdas y los datos correctamente: ");   
                
        } catch (Exception e) {
            mensaje = ("Vista: Hubo un error al Limpiar: "+e.getMessage());
        }     
    return mensaje;          
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
     
    }//GEN-LAST:event_jButton3ActionPerformed
       
     
     
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       limpiar();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void cb_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_nActionPerformed

    private void cb_nMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_nMouseEntered
      
        //Cargar Datos de Combo Box 
        
        
    }//GEN-LAST:event_cb_nMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        //Muestra ComboBox de (Paises)
        mensaje = e.show_cb_country(con, u, cb_n);
        System.out.println(mensaje);
       
        //Muestra ComboBoc de Generos
        mensaje = e.show_cb_gen(con, u, cb_gen);
       System.out.println(mensaje);
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void tf_remailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_remailKeyReleased
        if (e.vali_email(tf_email, tf_remail) == true){
        info.setText("_____");

        }
        else{
            info.setText("Verifique su correo");
        }
    }//GEN-LAST:event_tf_remailKeyReleased

    private void tf_rpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_rpassKeyReleased
        if (e.vali_pass(tf_pass, tf_rpass) == true){
        info.setText("_____");

        }
        else{
            info.setText("Verifique su contraseña");
        }
    }//GEN-LAST:event_tf_rpassKeyReleased

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
      volver();
    }//GEN-LAST:event_btn_exitActionPerformed

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewUser().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cb_gen;
    private javax.swing.JComboBox cb_n;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_recemail;
    private javax.swing.JTextField tf_remail;
    private javax.swing.JTextField tf_rpass;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
