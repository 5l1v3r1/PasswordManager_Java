package Create_New_User;

class Data_User {       //Para poder acceder a los getters and setters, primero debe colocarse el nombre de la clase
                        // +  un punto y el metodo, ejemplo 
                                                            // Data_User u; 
                                                            // Esto dentro de un evento 
                                                            // u.setL_user(tf_user.getText());
    
    //Declaración de variables 
    
    private int l_id;
    private String l_username, l_email,l_pass,l_name,l_last_name;
    private int l_genero,l_phone, l_country_id;
    private String l_picture, l_recovery_email,l_pass_recovery;
    private int  l_contition;

    
    //Constructor

//    public Data_User(int l_id, String l_user, String l_email, String l_pass, String l_name, String l_last_name, int l_genero, int country_phone_id, String l_phone, String l_picture, String l_recovery_email, String l_pass_recovery, int l_contition) {
//        this.l_id = l_id;
//        this.l_user = l_user;
//        this.l_email = l_email;
//        this.l_pass = l_pass;
//        this.l_name = l_name;
//        this.l_last_name = l_last_name;
//        this.l_genero = l_genero;
//        this.country_phone_id = country_phone_id;
//        this.l_phone = l_phone;
//        this.l_picture = l_picture;
//        this.l_recovery_email = l_recovery_email;
//        this.l_pass_recovery = l_pass_recovery;
//        this.l_contition = l_contition;
//    }
    
    //Métodos Set and Get

   

//    @Override
//    public String toString() {
//        return "Data_User{" + "l_id=" + l_id + ", l_user=" + l_user + ", l_email=" + l_email + ", l_pass=" + l_pass + ", l_name=" + l_name + ", l_last_name=" + l_last_name + ", l_genero=" + l_genero + ", country_phone_id=" + country_phone_id + ", l_phone=" + l_phone + ", l_picture=" + l_picture + ", l_recovery_email=" + l_recovery_email + ", l_pass_recovery=" + l_pass_recovery + ", l_contition=" + l_contition + '}';
//    }

    public int getL_id() {
        return l_id;
    }

    public void setL_id(int l_id) {
        this.l_id = l_id;
    }

    public String getL_username() {
        return l_username;
    }

    public void setL_username(String l_username) {
        this.l_username = l_username;
    }

    public String getL_email() {
        return l_email;
    }

    public void setL_email(String l_email) {
        this.l_email = l_email;
    }

    public String getL_pass() {
        return l_pass;
    }

    public void setL_pass(String l_pass) {
        this.l_pass = l_pass;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getL_last_name() {
        return l_last_name;
    }

    public void setL_last_name(String l_last_name) {
        this.l_last_name = l_last_name;
    }

    public int getL_genero() {
        return l_genero;
    }

    public void setL_genero(int l_genero) {
        this.l_genero = l_genero;
    }

    public int getL_phone() {
        return l_phone;
    }

    public void setL_phone(int l_phone) {
        this.l_phone = l_phone;
    }

    public int getL_country_id() {
        return l_country_id;
    }

    public void setL_country_id(int l_country_id) {
        this.l_country_id = l_country_id;
    }

    public String getL_picture() {
        return l_picture;
    }

    public void setL_picture(String l_picture) {
        this.l_picture = l_picture;
    }

    public String getL_recovery_email() {
        return l_recovery_email;
    }

    public void setL_recovery_email(String l_recovery_email) {
        this.l_recovery_email = l_recovery_email;
    }

    public String getL_pass_recovery() {
        return l_pass_recovery;
    }

    public void setL_pass_recovery(String l_pass_recovery) {
        this.l_pass_recovery = l_pass_recovery;
    }

    public int getL_contition() {
        return l_contition;
    }

    public void setL_contition(int l_contition) {
        this.l_contition = l_contition;
    }

   

    

            
}
