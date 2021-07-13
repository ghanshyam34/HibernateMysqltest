
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import p1.Employee;


public class testClient
{
    public static void main(String qrgs[])throws Exception
    {
        //get hb session factory obj
        SessionFactory factory=myhelper.getSessionFactory();

         //get hb session hb obj
        Session ses=factory.openSession();

        //write hb persistence logic
        Employee eb=new Employee();
        eb.setEid(35);
        eb.setFirstno("ghanshyam");
        eb.setLastno("patidar");
        eb.setEmail("ghanshyam@gmail.com");
        Transaction tx=ses.beginTransaction();
        ses.save(eb);
        tx.commit();
        factory.close();
        ses.close();
    }

}
