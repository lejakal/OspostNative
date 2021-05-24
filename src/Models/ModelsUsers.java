
package Models;


public class ModelsUsers extends people {
    
    
    
    private String username;
    private String password ;
    private int person_id ;
    private int delete;
    private String niff;
    private String tributario;
    private String niffA;
    private String tributarioA;    
    private int rol;
    private int id_empleado;
    

 
    public void ModelsUsers(String username,String password,int person_id,int delete,String niff,String tributario,String niffA,String tributarioA,int rol,int id_empleado) {
   
   this.username = username;
   this.password = password;
   this.person_id = person_id;
   this.delete = delete;
   this.niff = niff;
   this.tributario = tributario;
   this.niffA = niffA;
   this.tributarioA = tributarioA;
   this.rol = rol;
   this.id_empleado = id_empleado;
    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public String getNiff() {
        return niff;
    }

    public void setNiff(String niff) {
        this.niff = niff;
    }

    public String getTributario() {
        return tributario;
    }

    public void setTributario(String tributario) {
        this.tributario = tributario;
    }

    public String getNiffA() {
        return niffA;
    }

    public void setNiffA(String niffA) {
        this.niffA = niffA;
    }

    public String getTributarioA() {
        return tributarioA;
    }

    public void setTributarioA(String tributarioA) {
        this.tributarioA = tributarioA;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }


    
}
