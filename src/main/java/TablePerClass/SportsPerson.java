package TablePerClass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class SportsPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//cannot be identity
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
