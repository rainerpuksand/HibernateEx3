package TablePerClass;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Runner extends SportsPerson {

    @Column(name="event_R")
    private String event;


    public Runner() {  }
    public Runner(double best, String event) {
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
