package Herencia_Joined;

import javax.persistence.Embeddable;

@Embeddable //Este atributo sirve para señalar que es un atributo multivaluado que se encuentra en otra clase
public class Direccion3 {
    private String via;
    private String cp;

    public Direccion3() {
    }

    public Direccion3(String via, String cp) {
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
