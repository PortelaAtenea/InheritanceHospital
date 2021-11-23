package Herencia_Joined;



import javax.persistence.*;

@Entity
@Table(name="Celadores3")
@PrimaryKeyJoinColumn(name="idPersona")
@DiscriminatorValue(value="1")
//Celador3 es clase hija de persona3 y en este caso la herencia es del tipo Joined. Es decir, aparecerá
//que tipo de persona es como un atributo en la tabla persona y en la tabla del tipo aparecerán sus atributos
//específicos(carga_trabajo)
public class Celador3 extends Persona3 {
    @Column(name="Carga_trabajo")
    private int carga_trabajo;

    public Celador3() {

    }

    public Celador3(String dni, int nuss, String nombre, Direccion3 direccion, int telefono, int carga_trabajo) {
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
