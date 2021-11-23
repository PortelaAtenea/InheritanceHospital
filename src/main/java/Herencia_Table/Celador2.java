package Herencia_Table;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//Celador2 es clase hija de persona2 y en este caso la herencia es del tipo Table_Per_Class. Es decir, aparecerá
//una tabla para cada subtipo de persona
public class Celador2 extends Persona2 {
    @Column(name="Carga_trabajo")
    private int carga_trabajo;

    public Celador2() {

    }

    public Celador2(String dni, int nuss, String nombre, Direccion2 direccion, int telefono, int carga_trabajo) {
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
