/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.helper;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public abstract class AbstractClassHelper {
    public static final int SUCCESS = 1;
    public static final int FAIL = 0;
    public static final int ORTHER = 2;
    public abstract int doCreate(Object entity);
    public abstract int doUpdate(Object entity);
    public abstract int doDelete(Object entity);
    public abstract <T extends Object> List<T> doSeleteAll(Object condition);
    public abstract <T extends Object> T doSeleteById(int id);
    public abstract void closeConnect(Session entity);
    public abstract void openConnect(Session entity);

}
