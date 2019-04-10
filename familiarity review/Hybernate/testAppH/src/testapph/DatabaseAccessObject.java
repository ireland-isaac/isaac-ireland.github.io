/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapph;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author isaac
 */
public class DatabaseAccessObject {
    
    public static boolean addCustomer(int customerId, char discountCode, String zip, String name, String addressline1, String addressline2, String city, String state, String phone, String fax, String email, Integer creditLimit){
        int Customerid = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            Customer emp = new Customer(customerId, discountCode, zip, name, addressline1, addressline2, city, state, phone, fax, email, creditLimit);
            Customerid = (Integer)session.save(emp);
            tx.commit();
        }catch(Exception asd){
            System.out.println(asd.getMessage());
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
        return Customerid > 0;
    }
    
public static List<Customer> getDetails(int Customerid){
    List<Customer> customer = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        Criteria cr = session.createCriteria(Customer.class);
        cr.add(Restrictions.eq("customerId", Customerid));
        customer = cr.list();
        tx.commit();
    }catch(Exception asd){
        System.out.println(asd.getMessage());
        if(tx != null){
            tx.rollback();
        }
    }finally{
        session.close();
    }
    return customer;
}



}