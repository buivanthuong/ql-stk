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
import stk.entities.Khachhang;
import stk.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class KhachHangHelper {
 Session session = null;
    List<Khachhang> userList;

    public KhachHangHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Khachhang> getKhachhangList() {
        userList = new ArrayList<Khachhang>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Khachhang as kh");
            userList = (List<Khachhang>) q.list();
        } catch (Exception e) {
            userList = null;
            e.printStackTrace();
        }
        return userList;
    }

    public Khachhang getKhachhangByID(int userId) {
        Khachhang user = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Khachhang as kh where kh.id=" + userId);
            user = (Khachhang) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
