package Models;

/**
 * @author ing daniel reyes para Ospost s.a.s
 */
public class ModelsItems {

    private String name;
    private String category;
    private int supplier_id;
    private String description;
    private String item_number;
    private Float cost_price;
    private Float unit_price;
    private Float quantity;
    private Float reorder_level;
    private int item_id;
    private String allow_alt_description;
    private int is_serialized;
    private int deleted;
    private String custom1;
    private String custom2;
    private String custom3;
    private String custom4;
    private String custom5;
    private String custom6;
    private String custom7;
    private String custom8;
    private String custom9;
    private String custom10;
    private String niff;
    private String tributario;
    private Float old_price_venta;
    private int tipo;
    private int autoProduccion;
    private int Unid;
    private float old_compra;
    private String pic;
    private String niifC;
    private String tribuC;
    private Float inpercent_tax;
    private String img;
    private String video;
    private String descripcion;
    private int id_subcategoria;
    private Float comision;
    private int oferta;
    private int ind; //indicativo tipo de producto si es comprado con o sin
    private int location;

    public ModelsItems() {
       
    }

    public ModelsItems(String name, String category, int supplier_id, String item_number, String description, Float cost_price, Float unit_price, Float quantity, Float reorder_level, int item_id, String allow_alt_description, int is_serialized, int deleted, String custom1, String custom2, String custom3, String custom4, String custom5, String custom6, String custom7, String custom8, String custom9, String custom10, String niff, String tributario, Float old_price_venta, int tipo, int autoProduccion, int Unid, float old_compra, String pic, String niifC, String tribuC, Float inpercent_tax, String img, String video, String descripcion, int id_subcategoria, Float comision, int oferta, int ind,int location) {
        this.name = name;
        this.category = category;
        this.supplier_id = supplier_id;
        this.item_number = item_number;
        this.description = description;
        this.cost_price = cost_price;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.reorder_level = reorder_level;
        this.item_id = item_id;
        this.allow_alt_description = allow_alt_description;
        this.is_serialized = is_serialized;
        this.deleted = deleted;
        this.custom1 = custom1;
        this.custom2 = custom2;
        this.custom3 = custom3;
        this.custom4 = custom4;
        this.custom5 = custom5;
        this.custom6 = custom6;
        this.custom7 = custom7;
        this.custom8 = custom8;
        this.custom9 = custom9;
        this.custom10 = custom10;
        this.niff = niff;
        this.tributario = tributario;
        this.old_price_venta = old_price_venta;
        this.tipo = tipo;
        this.autoProduccion = autoProduccion;
        this.Unid = Unid;
        this.old_compra = old_compra;
        this.pic = pic;
        this.niifC = niifC;
        this.tribuC = tribuC;
        this.inpercent_tax = inpercent_tax;
        this.img = img;
        this.video = video;
        this.descripcion = descripcion;
        this.id_subcategoria = id_subcategoria;
        this.comision = comision;
        this.oferta = oferta;
        this.ind = ind;
        this.location = location;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getItem_number() {
        return item_number;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCost_price() {
        return cost_price;
    }

    public void setCost_price(Float cost_price) {
        this.cost_price = cost_price;
    }

    public Float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Float unit_price) {
        this.unit_price = unit_price;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getReorder_level() {
        return reorder_level;
    }

    public void setReorder_level(Float reorder_level) {
        this.reorder_level = reorder_level;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getAllow_alt_description() {
        return allow_alt_description;
    }

    public void setAllow_alt_description(String allow_alt_description) {
        this.allow_alt_description = allow_alt_description;
    }

    public int getIs_serialized() {
        return is_serialized;
    }

    public void setIs_serialized(int is_serialized) {
        this.is_serialized = is_serialized;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    public String getCustom4() {
        return custom4;
    }

    public void setCustom4(String custom4) {
        this.custom4 = custom4;
    }

    public String getCustom5() {
        return custom5;
    }

    public void setCustom5(String custom5) {
        this.custom5 = custom5;
    }

    public String getCustom6() {
        return custom6;
    }

    public void setCustom6(String custom6) {
        this.custom6 = custom6;
    }

    public String getCustom7() {
        return custom7;
    }

    public void setCustom7(String custom7) {
        this.custom7 = custom7;
    }

    public String getCustom8() {
        return custom8;
    }

    public void setCustom8(String custom8) {
        this.custom8 = custom8;
    }

    public String getCustom9() {
        return custom9;
    }

    public void setCustom9(String custom9) {
        this.custom9 = custom9;
    }

    public String getCustom10() {
        return custom10;
    }

    public void setCustom10(String custom10) {
        this.custom10 = custom10;
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

    public Float getOld_price_venta() {
        return old_price_venta;
    }

    public void setOld_price_venta(Float old_price_venta) {
        this.old_price_venta = old_price_venta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAutoProduccion() {
        return autoProduccion;
    }

    public void setAutoProduccion(int autoProduccion) {
        this.autoProduccion = autoProduccion;
    }

    public int getUnid() {
        return Unid;
    }

    public void setUnid(int Unid) {
        this.Unid = Unid;
    }

    public float getOld_compra() {
        return old_compra;
    }

    public void setOld_compra(float old_compra) {
        this.old_compra = old_compra;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getNiifC() {
        return niifC;
    }

    public void setNiifC(String niifC) {
        this.niifC = niifC;
    }

    public String getTribuC() {
        return tribuC;
    }

    public void setTribuC(String tribuC) {
        this.tribuC = tribuC;
    }

    public Float getInpercent_tax() {
        return inpercent_tax;
    }

    public void setInpercent_tax(Float inpercent_tax) {
        this.inpercent_tax = inpercent_tax;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_subcategoria() {
        return id_subcategoria;
    }

    public void setId_subcategoria(int id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    
}
