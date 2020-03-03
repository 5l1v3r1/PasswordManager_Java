package Login;
import Conexion.Conexion;
import Create_New_User.CreateNewUser;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;


public class Login extends javax.swing.JFrame {
      Conexion cc=new  Conexion();
      Connection con = cc.conexion();
      M_Login m = new M_Login();  
      
     //Login l = new Login();
    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_log = new javax.swing.JButton();
        tf_pass = new javax.swing.JTextField();
        tf_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pic_logo = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_log.setText("L");
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });
        getContentPane().add(btn_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 83, 83));

        tf_pass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(tf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 171, -1));

        tf_user.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 171, -1));

        jLabel1.setText("User:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        btn_create.setText("Create new Acount");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel3.setText("Did you forget your password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 160, 180, -1));

        btn_exit.setText("Exit");
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 60, -1));

        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info.setText("Welcome to Pasword Manager");
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 630, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login To Password Manager ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 630, -1));

        pic_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pïctures/login/Block (1).png"))); // NOI18N
        getContentPane().add(pic_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 106, 112));

        info2.setForeground(new java.awt.Color(255, 51, 51));
        info2.setText("jLabel4");
        getContentPane().add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
        info.setText (m.validar_celdas(tf_user, tf_pass));      //Manda mensaje de validación
        info2.setText(m.validar_db(con, tf_user, tf_pass));     // Manda mensaje de Validación de Base de datos
        if(m.isLogin()){
        }   
    }//GEN-LAST:event_btn_logActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        CreateNewUser cnu = new CreateNewUser();
        cnu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_createActionPerformed
       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_log;
    private javax.swing.JLabel info;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pic_logo;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
