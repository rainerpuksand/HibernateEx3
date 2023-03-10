package JoinedTables;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)//all classes will have a table
public abstract class SportsPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="best")
    private double best;


    public SportsPerson() {  }
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
