package SingleTable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainProgram {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            System.out.println("Creating Java objects...");
            SportsPerson runnerObj = new Runner(10.00, "100meters");
            SportsPerson lifterObj = new Lifter(225.00, "Squats");


            //transaction
            session.beginTransaction();
            System.out.println("Inserting Runner & Lifter");
            session.save(runnerObj);
            session.save(lifterObj);

            session.getTransaction().commit();
            System.out.println("End  --x x x x x x x x x-- ");

        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
        }
        finally {
            factory.close();
        }




    }
}
