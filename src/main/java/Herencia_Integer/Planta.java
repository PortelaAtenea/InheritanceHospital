package Herencia_Integer;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Planta")
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id_planta;
    @OneToMany(mappedBy = "planta", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Consulta> lconsulta;
    @ManyToMany
    @JoinTable(name = "limp_planta", joinColumns = @JoinColumn(name = "id_planta"),
            inverseJoinColumns = @JoinColumn(name = "id_empleado"))
    private List<Limpieza> lLimpieza;


    public Planta() {
        this.lconsulta = new ArrayList<Consulta>();
        this.lLimpieza = new ArrayList<Limpieza>();
    }

    public int getId_planta() {
        return id_planta;
    }

    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }

    public List<Consulta> getLconsulta() {
        return lconsulta;
    }

    public void addCons(Consulta c) {
        lconsulta.add(c);
        c.setPlanta(this);
    }

    public void remCons(Consulta c) {
        lconsulta.remove(c);
        c.setPlanta(null);
    }
    public void addLimp(Limpieza l) {
        lLimpieza.add(l);
        l.addPlanta(this);
    }


    @Override
    public String toString() {
        return "Planta{" +
                "id_planta=" + id_planta +
                ", lconsulta=" + lconsulta +
                '}';
    }
}
