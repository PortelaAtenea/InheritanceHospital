package Herencia_Table;

import javax.persistence.*;

@Entity
@Table(name="consulta2")
public class Consulta2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONSULTA")
    private int id_consulta;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ID_planta")
    private Planta2 planta;

    public Consulta2() {

    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Planta2 getPlanta() {
        return planta;
    }

    public void setPlanta(Planta2 planta) {
        this.planta = planta;
    }
}
