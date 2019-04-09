/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.helper;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import stk.entities.Phieuguitien;
import stk.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class PhieuGoiHelper {
 Session session = null;
    List<Phieuguitien> userList;

    public PhieuGoiHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Phieuguitien> getPhieuguitienList() {
        userList = new ArrayList<Phieuguitien>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Phieuguitien as kh");
            userList = (List<Phieuguitien>) q.list();
        } catch (Exception e) {
            userList = null;
            e.printStackTrace();
        }
        session.close();
        return userList;
    }

    public Phieuguitien getKhachhangByID(int userId) {
        Phieuguitien user = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Phieuguitien as kh where kh.id=" + userId);
            user = (Phieuguitien) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
