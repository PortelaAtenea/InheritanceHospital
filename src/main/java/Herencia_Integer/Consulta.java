package Herencia_Integer;

import javax.persistence.*;

@Entity
@Table(name="consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONSULTA")
    private int id_consulta;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ID_planta")
    private Planta planta;

    public Consulta() {

    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
}
