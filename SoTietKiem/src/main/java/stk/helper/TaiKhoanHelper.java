/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.helper;
import org.hibernate.Query;
import org.hibernate.Session;
import stk.entities.Taikhoan;
import stk.util.HibernateUtil;
import stk.util.Utill;

/**
 *
 * @author Administrator
 */
public class TaiKhoanHelper {
 Session session = null;
    public TaiKhoanHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public Taikhoan login(String user_name, String password) {
        String pass_md5 = Utill.md5(password);
        System.out.println("stk.helper.TaiKhoanHelper.login()" + pass_md5);
        Taikhoan tk = new Taikhoan();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Taikhoan where tentaikhoan='" + user_name + "' and matkhau='" + pass_md5+"'");        
            tk = (Taikhoan) q.list().get(0);
        } catch (Exception e) {
            tk = null;
            e.printStackTrace();
        }
        session.close();

        return tk;
    }

}
