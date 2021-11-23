package Herencia_Joined;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Planta3")
public class Planta3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id_planta;
    @OneToMany(mappedBy = "planta", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Consulta3> lconsulta;
    @ManyToMany
    @JoinTable(name = "limp_planta3", joinColumns = @JoinColumn(name = "id_planta"),
            inverseJoinColumns = @JoinColumn(name = "id_empleado"))
    private List<Limpieza3> lLimpieza;


    public Planta3() {
        this.lconsulta = new ArrayList<Consulta3>();
        this.lLimpieza = new ArrayList<Limpieza3>();
    }

    public int getId_planta() {
        return id_planta;
    }

    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }

    public List<Consulta3> getLconsulta() {
        return lconsulta;
    }

    public void addCons(Consulta3 c) {
        lconsulta.add(c);
        c.setPlanta(this);
    }

    public void remCons(Consulta3 c) {
        lconsulta.remove(c);
        c.setPlanta(null);
    }
    public void addLimp(Limpieza3 l) {
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
