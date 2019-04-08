package stk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
 
 
 
import org.hibernate.*;
import stk.domain.Employee;
import stk.util.HibernateUtil;
 
public class App {
 
public static void main(String[] args) {
          
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
 
       
//        session.getTransaction().commit();
// 
//        Query q = session.createQuery("From Employee ");
//                 
//        List<Employee> resultList = q.list();
//        System.out.println("num of employess:" + resultList.size());
//        for (Employee next : resultList) {
//            System.out.println("next employee: " + next);
//        }
 
    }
    
}