package Herencia_Integer;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


@Entity

@DiscriminatorValue(value="2")
//Limpieza es clase hija de persona y en este caso la herencia es del tipo Integer. Es decir, aparecerá
//que tipo de persona es como un atributo en la tabla persona y sus atributos específicos aparecerán también ahí
public class Limpieza extends Persona {
    @Column(name="Carga_trabajo")
    private int carga_trabajo;
    @ManyToMany(mappedBy = "lLimpieza")
    private List<Planta> lPlantas;

    public Limpieza() {

    }

    public Limpieza(String dni, int nuss, String nombre, Direccion direccion, int telefono, int carga_trabajo) {
        super(dni, nuss, nombre, direccion, telefono);
        this.carga_trabajo = carga_trabajo;
        this.lPlantas= new ArrayList<Planta>();
    }

    public int getCarga_trabajo() {
        return carga_trabajo;
    }

    public void setCarga_trabajo(int carga_trabajo) {
        this.carga_trabajo = carga_trabajo;
    }
    public void addPlanta(Planta p) {
        lPlantas.add(p);

    }
}
