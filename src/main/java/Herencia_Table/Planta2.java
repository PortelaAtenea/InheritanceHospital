package Herencia_Table;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Planta2")
public class Planta2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id_planta;
    @OneToMany(mappedBy = "planta", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Consulta2> lconsulta;
    @ManyToMany
    @JoinTable(name = "limp_planta2", joinColumns = @JoinColumn(name = "id_planta"),
            inverseJoinColumns = @JoinColumn(name = "id_empleado"))
    private List<Limpieza2> lLimpieza;


    public Planta2() {
        this.lconsulta = new ArrayList<Consulta2>();
        this.lLimpieza = new ArrayList<Limpieza2>();
    }

    public int getId_planta() {
        return id_planta;
    }

    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }

    public List<Consulta2> getLconsulta() {
        return lconsulta;
    }

    public void addCons(Consulta2 c) {
        lconsulta.add(c);
        c.setPlanta(this);
    }

    public void remCons(Consulta2 c) {
        lconsulta.remove(c);
        c.setPlanta(null);
    }
    public void addLimp(Limpieza2 l) {
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
