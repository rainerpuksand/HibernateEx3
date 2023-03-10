package SingleTable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "SPORTS_TYPE")
public abstract class SportsPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="best")
    private double best;


    public SportsPerson() { }
    public SportsPerson(double best) {
        this.best = best;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBest() {
        return best;
    }
    public void setBest(double best) {
        this.best = best;
    }
}
