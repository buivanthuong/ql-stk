/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.helper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import stk.entities.Quydinh;
import stk.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class QuyDinhHelper extends AbstractClassHelper {
    Session session = null;

    public QuyDinhHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public int doCreate(Object entity) {
        openConnect(session);
        Quydinh user = (Quydinh) entity;
        session.save(user);
        try {
             session.save(user);
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
        Quydinh user = (Quydinh) entity;
        String hql = "update Quydinh as kh set "
                 + "soloai=:soloai, "
                 + "songaydaohan=:songaydaohan, "
                 + "tiengoitoithieu=:tiengoitoithieu, "
                 + "thaydoilaixuat=:thaydoilaixuat";

        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery(hql);
            q.setInteger("soloai", user.getSoLoai());
            q.setInteger("songaydaohan", user.getSoNgayDaoHan());
            q.setInteger("tiengoitoithieu", user.getTienGoiToiThieu());
            q.setBoolean("thaydoilaixuat", user.isThayDoiLaiXuat());

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
        Quydinh user = (Quydinh) entity;
        try {
            Query q = session.createQuery("delete Quydinh as kh where kh.id=" + user.getId());
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
        List<Quydinh> userList = new ArrayList<Quydinh>();
        try {
            Query q = session.createQuery("from Quydinh as kh ");        
            userList = (List<Quydinh>) q.list();
        } catch (Exception e) {
            userList = null;
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            return(List<T>) userList;
        }
    }

    @Override
    public Object doSeleteById(int id) {
        openConnect(session);
        Quydinh user = null;
        try {
            Query q = session.createQuery("from Quydinh");
            user = (Quydinh) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            return user;
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
