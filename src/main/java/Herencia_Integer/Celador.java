package Herencia_Integer;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="1")
//Celador es clase hija de persona y en este caso la herencia es del tipo Integer. Es decir, aparecerá
//que tipo de persona es como un atributo en la tabla persona
public class Celador extends Persona{
    @Column(name="Carga_trabajo")
    private int carga_trabajo;

    public Celador() {

    }

    public Celador(String dni, int nuss, String nombre, Direccion direccion, int telefono, int carga_trabajo) {
        super(dni, nuss, nombre, direccion, telefono);
        this.carga_trabajo = carga_trabajo;
    }

    public int getCarga_trabajo() {
        return carga_trabajo;
    }

    public void setCarga_trabajo(int carga_trabajo) {
        this.carga_trabajo = carga_trabajo;
    }
}
