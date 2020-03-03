package Create_New_User;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;
import Conexion.Conexion;


public class CRUD_Prueba extends javax.swing.JFrame {
        //Instanciando Conexión
        Conexion cc=new  Conexion();
        Connection con= cc.conexion();
        //Instanciando Data_User y Crud_User
        Data_User u = new Data_User() ; // Solo cuando no hay contructor
        Crud_User e = new Crud_User();  // Solo cuando no hya contrsuctor 
        String mensaje = "";        //Variable ára mostrar mensajes en consola
    
        
    
        
        
        
        
        
        public CRUD_Prueba() {
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
        btn_update = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ft_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        cb_n = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_exit.setText("Exit");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("User:");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Information");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Repeat Password: ");

        tf_rpass.setText("-----");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Last Name:");

        tf_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lastnameActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Name:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Personal Information");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Country:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Recovery Email:");

        tf_recemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_recemailActionPerformed(evt);
            }
        });

        tf_remail.setText("------");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Repeat Email:");

        jLabel13.setText("Select an Image ");

        jButton3.setText("imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        cb_gen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Géneros" }));
        cb_gen.setName("Select"); // NOI18N
        cb_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_genActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel15.setText("Search by User");

        btn_search.setText("buscar y mostrar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

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

        jLabel16.setText("Solo en modo de Desarrollo ");

        btn_delete.setText("Delete User");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel17.setText("Phone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_rpass))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_username, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                            .addComponent(tf_email)
                                            .addComponent(tf_remail, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tf_pass)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel11))
                                                .addGap(35, 35, 35))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(46, 46, 46)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(tf_name, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cb_n, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_gen, javax.swing.GroupLayout.Alignment.TRAILING, 0, 165, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ft_search, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_recemail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(271, 271, 271))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_remail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_rpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_save))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btn_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_recemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addGap(3, 3, 3)))
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ft_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(btn_search))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lastnameActionPerformed
        
    }//GEN-LAST:event_tf_lastnameActionPerformed

    private void tf_recemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_recemailActionPerformed
       
    }//GEN-LAST:event_tf_recemailActionPerformed

    private void cb_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_genActionPerformed
        
    }//GEN-LAST:event_cb_genActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        mensaje = obtiene();
        System.out.println(mensaje);

        mensaje = e.guardar(con,u);
        System.out.println(mensaje);                    //Muestra Información de Guardado

        if ("Se guardo con exito".equals(mensaje)){     //
            limpiar();                                  //
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
        u.setL_phone(Integer.parseInt(tf_phone.getText()));             // Código del pais +Número de Telefono 
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
   
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       
        //Llamando al método "obtiene", la cual obtiene datos de nuetros from y las manda a los getters
        obtiene(); 
        System.out.println(mensaje+"\n");
        //El valor del ID es igual al valor retornado del Método "id_obtener"
        u.setL_id(e.id_obtener(con,u));
        //Llamando al método Actualizar Datos, para actualizar , campos
        mensaje = e.actualizar(con,u);           //Declarandoe l mensaje obtenido  (Try/Catch)
        //Manda mensaje de try or Catch a consola
        System.out.println(mensaje);
        
        //Concidión (En caso de todo ok, entonces limpiar textos  )
        if ("Se actualizó con exito".equals(mensaje)){
            limpiar();
            System.out.println(mensaje+"\n");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        //Buscar ID 
        
        
        //Declarando Variable y Asignando busqueda
        u.setL_username(ft_search.getText());           //Se define el usuario, para la busqueda de la ID 
        
        //El valor del ID es igual al valor retornado del Método "id_obtener"
        //Obteniendo ID del dato Usuario            (Este método obtiene el dato USER para obtener el ID )
        u.setL_id(e.id_obtener(con,u));             //En éste método se necesita el UsuarioPrimero 
        mensaje = e.Mostrar(con, u);
        //System.out.println(e.Mostrar(con, u));
        System.out.println(mensaje+"\n");
        mostrar();
        System.out.println(mensaje+"\n");
        //  System.out.println("" + );
    }//GEN-LAST:event_btn_searchActionPerformed
    
     
     
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       limpiar();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        u.setL_username(ft_search.getText());           //Se define el usuario, para la busqueda de la ID 
        
        //El valor del ID es igual al valor retornado del Método "id_obtener"
        //Obteniendo ID del dato Usuario            (Este método obtiene el dato USER para obtener el ID )
        u.setL_id(e.id_obtener(con,u));             //En éste método se necesita el UsuarioPrimero 
        mensaje = e.Eliminar(con, u.getL_id());
        System.out.println(mensaje);
        if ("Se eliminó el dato correctamente".equals(mensaje)){
            limpiar();
        }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

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

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Prueba().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox cb_gen;
    private javax.swing.JComboBox cb_n;
    private javax.swing.JTextField ft_search;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
