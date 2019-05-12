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
import stk.entities.Taikhoan;
import stk.entities.Taikhoan;
import static stk.helper.AbstractClassHelper.FAIL;
import static stk.helper.AbstractClassHelper.SUCCESS;
import stk.util.HibernateUtil;
import stk.util.Utill;

/**
 *
 * @author Administrator
 */
public class TaiKhoanHelper extends AbstractClassHelper{
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
    List<Taikhoan> objList;
     
    @Override
    public int doCreate(Object entity) {
        openConnect(session);
        Taikhoan obj = (Taikhoan) entity;
        session.save(obj);
        try {
             session.save(obj);
            return SUCCESS;

        } catch (Exception e) {
            System.out.println("error:" + e);
            return FAIL;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public int doUpdate(Object entity) {
        openConnect(session);
        Taikhoan obj = (Taikhoan) entity;
        String pass_md5 = Utill.md5(obj.getMatKhau());
        System.out.println("stk.helper.TaiKhoanHelper.login()" + pass_md5 + obj.getId());

        String hql = "update Taikhoan as kh set "
                 + "tentaikhoan=:tentaikhoan, "
                 + "hoten=:hoten, "
                 + "matkhau=:matkhau "
                 + "where "
                 + "id = :id ";
        try {
            session.beginTransaction();
            Query q = session.createQuery(hql);
            q.setInteger("id", obj.getId());
            q.setString("tentaikhoan", obj.getTenTaiKhoan());
            q.setString("hoten", obj.getHoTen());
            q.setString("matkhau", pass_md5);
            q.executeUpdate();

            return SUCCESS;
            
        } catch (Exception e) {
            System.out.println("error:" + e);
            return FAIL;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }
    }

    @Override
    public int doDelete(Object entity) {
        openConnect(session);
        Taikhoan obj = (Taikhoan) entity;
        try {
            Query q = session.createQuery("delete Taikhoan as kh where kh.id=" + obj.getId());
            q.executeUpdate();
            return SUCCESS;

        } catch (Exception e) {
            
            e.printStackTrace();
            return FAIL;

        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public <T extends Object> List<T>  doSeleteAll(Object condition) {
        openConnect(session);
        List<Taikhoan> objList = new ArrayList<Taikhoan>();
        try {
            Query q = session.createQuery("from Taikhoan as kh ");        
            objList = (List<Taikhoan>) q.list();
        } catch (Exception e) {
            objList = null;
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            return(List<T>) objList;
        }
    }

    @Override
    public Object doSeleteById(int id) {
        openConnect(session);
        Taikhoan obj = null;
        try {
            Query q = session.createQuery("from Taikhoan as kh where kh.id=" + id);
            obj = (Taikhoan) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            return obj;
        }
    }

    @Override
    public void closeConnect(Session session) {
        if (session != null && session.isOpen()) {
                session.close();
        }    
    }

    @Override
    public void openConnect(Session session) {
        this.session = HibernateUtil.getSessionFactory().openSession();
              
    }
}
