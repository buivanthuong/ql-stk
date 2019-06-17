/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.helper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import stk.entities.Phieuguitien;
import stk.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class PhieuGoiHelper extends AbstractClassHelper{
 Session session = null;
    List<Phieuguitien> objList;

    public PhieuGoiHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
     
    @Override
    public int doCreate(Object entity) {
        openConnect(session);
        Phieuguitien obj = (Phieuguitien) entity;
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
        Phieuguitien obj = (Phieuguitien) entity;
        String hql = "update Phieuguitien as kh set "
                 + "idkh=:idkh, "
                 + "sotiengui=:sotiengui, "
                 + "ngaygui=:ngaygui "
                 + "where "
                 + "id = :id ";
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery(hql);
            q.setInteger("id", obj.getId());
            q.setInteger("idkh", obj.getIdKh());
            q.setInteger("sotiengui", obj.getSoTienGui());
            q.setDate("ngaygui", obj.getNgayGui());
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
        Phieuguitien obj = (Phieuguitien) entity;
        try {
            
            Query q = session.createQuery("delete Phieuguitien as kh where kh.id=" + obj.getId());
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
        List<Phieuguitien> objList = new ArrayList<Phieuguitien>();
        try {
            Query q = session.createQuery("from Phieuguitien as kh ");        
            objList = (List<Phieuguitien>) q.list();
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
        Phieuguitien obj = null;
        try {
            Query q = session.createQuery("from Phieuguitien as kh where kh.id=" + id);
            obj = (Phieuguitien) q.uniqueResult();
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

    public <T extends Object> List<T> doSeleteByMaso(String id) {
        openConnect(session);
        openConnect(session);
        List<Phieuguitien> objList = new ArrayList<Phieuguitien>();
        try {
            Query q = session.createQuery("from Phieuguitien as kh where maso ='" + id + "'");        
            objList = (List<Phieuguitien>) q.list();
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
