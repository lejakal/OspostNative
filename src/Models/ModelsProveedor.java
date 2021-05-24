
package Models;

public class ModelsProveedor extends people {
    
    

private String company_name;
private String account_number;
private int deleted;
private float CupMaxCredito;
private String niff;
private String tributario;
private String actividad;
private String constituida;
private String nacimiento;
private int tipo_supplier;
 private int estadoSupl;
private String niffA;
private String tribA;
private String niifDev;
private String tribuDev;


    public ModelsProveedor(String company_name, String account_number, int deleted, float CupMaxCredito, String niff, String tributario, String actividad, String constituida, String nacimiento, int tipo_supplier, int estadoSupl, String niffA, String tribA, String niifDev, String tribuDev) {
        
        this.company_name = company_name;
        this.account_number = account_number;
        this.deleted = deleted;
        this.CupMaxCredito = CupMaxCredito;
        this.niff = niff;
        this.tributario = tributario;
        this.actividad = actividad;
        this.constituida = constituida;
        this.nacimiento = nacimiento;
        this.tipo_supplier = tipo_supplier;
        this.estadoSupl = estadoSupl;
        this.niffA = niffA;
        this.tribA = tribA;
        this.niifDev = niifDev;
        this.tribuDev = tribuDev;
    }



    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public float getCupMaxCredito() {
        return CupMaxCredito;
    }

    public void setCupMaxCredito(float CupMaxCredito) {
        this.CupMaxCredito = CupMaxCredito;
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

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getConstituida() {
        return constituida;
    }

    public void setConstituida(String constituida) {
        this.constituida = constituida;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getTipo_supplier() {
        return tipo_supplier;
    }

    public void setTipo_supplier(int tipo_supplier) {
        this.tipo_supplier = tipo_supplier;
    }

    public int getEstadoSupl() {
        return estadoSupl;
    }

    public void setEstadoSupl(int estadoSupl) {
        this.estadoSupl = estadoSupl;
    }

    public String getNiffA() {
        return niffA;
    }

    public void setNiffA(String niffA) {
        this.niffA = niffA;
    }

    public String getTribA() {
        return tribA;
    }

    public void setTribA(String tribA) {
        this.tribA = tribA;
    }

    public String getNiifDev() {
        return niifDev;
    }

    public void setNiifDev(String niifDev) {
        this.niifDev = niifDev;
    }

    public String getTribuDev() {
        return tribuDev;
    }

    public void setTribuDev(String tribuDev) {
        this.tribuDev = tribuDev;
    }





    
}
