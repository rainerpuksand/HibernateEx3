package SingleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "LIFT")
public class Lifter extends SportsPerson{

    @Column(name="event_L")
    private String event;


    public Lifter(){ }
    public Lifter(double best, String event) {
        super(best);
        this.event = event;
    }


    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
}
