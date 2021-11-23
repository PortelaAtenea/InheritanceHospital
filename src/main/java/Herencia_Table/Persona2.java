package Herencia_Table;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass

@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)

public class Persona2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int idPersona;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "NUSS")
    private int nuss;
    @Column(name = "Nombre")
    private String nombre;
    @Embedded
    @Column(name = "Dirección")
    private Direccion2 direccion;
    @Column(name = "Teléfono")
    private int telefono;

    public Persona2() {
    }

    public Persona2(String dni, int nuss, String nombre, Direccion2 direccion, int telefono) {

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

    public Direccion2 getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion2 direccion) {
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
        Persona2 persona = (Persona2) o;
        return idPersona == persona.idPersona && nuss == persona.nuss && dni.equals(persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(direccion, persona.direccion) && Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, dni, nuss, nombre, direccion, telefono);
    }
}
