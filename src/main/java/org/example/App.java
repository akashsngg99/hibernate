package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        emp e= new emp();
        e.setEmpID(2089747);
        e.setEmpName("Akash Singh");
        e.setSalary(90000);
        e.setManger_id(2089747);
        System.out.println("Looking for config: " + Thread.currentThread().getContextClassLoader().getResource("hibernate.cfg.xml"));
        Configuration cfg = new Configuration();

        cfg.addAnnotatedClass(emp.class);
        cfg.configure("hibernate.cfg.xml"); // <- correct

        SessionFactory sfs = cfg.buildSessionFactory();

        Session session= sfs.openSession();
    /*    Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        System.out.print(e);

*/
        /*fetch
        emp s2=null;
        s2=session.get(emp.class,2089747);

        System.out.println(s2);
*/
        Transaction tcx=session.beginTransaction();
        session.merge(e);
        tcx.commit();
        System.out.print(e);

        session.close();








    }
}
