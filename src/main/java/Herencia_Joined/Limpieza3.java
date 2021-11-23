package Herencia_Joined;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Limpiadores3")
@PrimaryKeyJoinColumn(name="idPersona")
@DiscriminatorValue(value="1")
//Limpieza3 es clase hija de persona3 y en este caso la herencia es del tipo Joined. Es decir, aparecerá
//que tipo de persona es como un atributo en la tabla persona y en la tabla del tipo aparecerán sus atributos
//específicos(carga_trabajo)
public class Limpieza3 extends Persona3 {
    @Column(name="Carga_trabajo")
    private int carga_trabajo;
    @ManyToMany(mappedBy = "lLimpieza")
    private List<Planta3> lPlantas;

    public Limpieza3() {

    }

    public Limpieza3(String dni, int nuss, String nombre, Direccion3 direccion, int telefono, int carga_trabajo) {
        super(dni, nuss, nombre, direccion, telefono);
        this.carga_trabajo = carga_trabajo;
        this.lPlantas= new ArrayList<Planta3>();
    }

    public int getCarga_trabajo() {
        return carga_trabajo;
    }

    public void setCarga_trabajo(int carga_trabajo) {
        this.carga_trabajo = carga_trabajo;
    }
    public void addPlanta(Planta3 p) {
        lPlantas.add(p);

    }
}
