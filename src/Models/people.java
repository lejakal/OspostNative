
package Models;
 
public class people {
   
private String first_name;
private String last_name;
private int phone_number;
private String email;
private String address_1;
private String address_2;
private int city;
private String state;
private String zip;
private String country;
private String comments;
private int person_id;
private int DigVerif;
private String apellidos;
private int tipoPeople;
private String img;
private int categoCliente;

    //nomina
    private String apellidouno;
    private String apellidodos;
    private String nuss;
    private int sexo;
    private String observaciones;
    private int telfcont2;
    private String calle;
    private String piso;
    private String puerta;
    private String cp;
    private String fechaent;
    private String fechasal;
    private int hijos;
    private int estadocivil;
    private String linkfoto;
    private String ARP;
    private String veps;
    private String arl;
    private String linkfoto2;
    private String fechaNaci;

public people(){
    
}

    public people(String first_name, String last_name, int phone_number, String email, String address_1, String address_2, int city, String state, String zip, String country, String comments, int person_id, int DigVerif, String apellidos, int tipoPeople, String img, int categoCliente, String apellidouno, String apellidodos, String nuss, int sexo, String observaciones, int telfcont2, String calle, String piso, String puerta, String cp, String fechaent, String fechasal, int hijos, int estadocivil, String linkfoto, String ARP, String veps, String arl, String linkfoto2,String fechaNaci) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.comments = comments;
        this.person_id = person_id;
        this.DigVerif = DigVerif;
        this.apellidos = apellidos;
        this.tipoPeople = tipoPeople;
        this.img = img;
        this.categoCliente = categoCliente;
        this.apellidouno = apellidouno;
        this.apellidodos = apellidodos;
        this.nuss = nuss;
        this.sexo = sexo;
        this.observaciones = observaciones;
        this.telfcont2 = telfcont2;
        this.calle = calle;
        this.piso = piso;
        this.puerta = puerta;
        this.cp = cp;
        this.fechaent = fechaent;
        this.fechasal = fechasal;
        this.hijos = hijos;
        this.estadocivil = estadocivil;
        this.linkfoto = linkfoto;
        this.ARP = ARP;
        this.veps = veps;
        this.arl = arl;
        this.linkfoto2 = linkfoto2;
        this.fechaNaci = fechaNaci;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
        

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public int getDigVerif() {
        return DigVerif;
    }

    public void setDigVerif(int DigVerif) {
        this.DigVerif = DigVerif;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTipoPeople() {
        return tipoPeople;
    }

    public void setTipoPeople(int tipoPeople) {
        this.tipoPeople = tipoPeople;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getCategoCliente() {
        return categoCliente;
    }

    public void setCategoCliente(int categoCliente) {
        this.categoCliente = categoCliente;
    }

    public String getApellidouno() {
        return apellidouno;
    }

    public void setApellidouno(String apellidouno) {
        this.apellidouno = apellidouno;
    }

    public String getApellidodos() {
        return apellidodos;
    }

    public void setApellidodos(String apellidodos) {
        this.apellidodos = apellidodos;
    }

    public String getNuss() {
        return nuss;
    }

    public void setNuss(String nuss) {
        this.nuss = nuss;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getTelfcont2() {
        return telfcont2;
    }

    public void setTelfcont2(int telfcont2) {
        this.telfcont2 = telfcont2;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getFechaent() {
        return fechaent;
    }

    public void setFechaent(String fechaent) {
        this.fechaent = fechaent;
    }

    public String getFechasal() {
        return fechasal;
    }

    public void setFechasal(String fechasal) {
        this.fechasal = fechasal;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public int getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(int estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getLinkfoto() {
        return linkfoto;
    }

    public void setLinkfoto(String linkfoto) {
        this.linkfoto = linkfoto;
    }

    public String getARP() {
        return ARP;
    }

    public void setARP(String ARP) {
        this.ARP = ARP;
    }

    public String getVeps() {
        return veps;
    }

    public void setVeps(String veps) {
        this.veps = veps;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getLinkfoto2() {
        return linkfoto2;
    }

    public void setLinkfoto2(String linkfoto2) {
        this.linkfoto2 = linkfoto2;
    }

}
