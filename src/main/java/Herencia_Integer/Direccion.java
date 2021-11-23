package Herencia_Integer;

import javax.persistence.Embeddable;

@Embeddable //Este atributo sirve para señalar que es un atributo multivaluado que se encuentra en otra clase
public class Direccion {
    private String via;
    private String cp;

    public Direccion() {
    }

    public Direccion(String via, String cp) {
        this.via = via;
        this.cp = cp;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
