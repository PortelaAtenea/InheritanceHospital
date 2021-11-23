package Herencia_Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
//Limpieza2 es clase hija de persona2 y en este caso la herencia es del tipo Table_Per_Class. Es decir, aparecerá
//una tabla para cada subtipo de persona

public class Limpieza2 extends Persona2 {
    @Column(name="Carga_trabajo")
    private int carga_trabajo;
    @ManyToMany(mappedBy = "lLimpieza")
    private List<Planta2> lPlantas;

    public Limpieza2() {

    }

    public Limpieza2(String dni, int nuss, String nombre, Direccion2 direccion, int telefono, int carga_trabajo) {
        super(dni, nuss, nombre, direccion, telefono);
        this.carga_trabajo = carga_trabajo;
        this.lPlantas= new ArrayList<Planta2>();
    }

    public int getCarga_trabajo() {
        return carga_trabajo;
    }

    public void setCarga_trabajo(int carga_trabajo) {
        this.carga_trabajo = carga_trabajo;
    }
    public void addPlanta(Planta2 p) {
        lPlantas.add(p);

    }
}
