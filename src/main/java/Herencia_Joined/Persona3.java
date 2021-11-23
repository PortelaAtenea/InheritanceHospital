package Herencia_Joined;



import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="personas3")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_persona",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")
public class Persona3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private int idPersona;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "NUSS")
    private int nuss;
    @Column(name = "Nombre")
    private String nombre;
    @Embedded
    @Column(name = "Dirección")
    private Direccion3 direccion;
    @Column(name = "Teléfono")
    private int telefono;

    public Persona3() {
    }

    public Persona3(String dni, int nuss, String nombre, Direccion3 direccion, int telefono) {

        this.dni = dni;
        this.nuss = nuss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNuss() {
        return nuss;
    }

    public void setNuss(int nuss) {
        this.nuss = nuss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion3 getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion3 direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona3 persona = (Persona3) o;
        return idPersona == persona.idPersona && nuss == persona.nuss && dni.equals(persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(direccion, persona.direccion) && Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, dni, nuss, nombre, direccion, telefono);
    }
}
