package Herencia_Joined;


import javax.persistence.*;

@Entity
@Table(name="consulta3")
public class Consulta3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONSULTA")
    private int id_consulta;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ID_planta")
    private Planta3 planta;

    public Consulta3() {

    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Planta3 getPlanta() {
        return planta;
    }

    public void setPlanta(Planta3 planta) {
        this.planta = planta;
    }
}
