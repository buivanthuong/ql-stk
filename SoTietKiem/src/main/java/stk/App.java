package stk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
 
 
 
import org.hibernate.*;
import stk.helper.KhachHangHelper;
import stk.util.HibernateUtil;
import stk.entities.Khachhang;
public class App {
 
public static void main(String[] args) {

       KhachHangHelper kh = new KhachHangHelper();
       
        List<Khachhang> resultList = kh.getKhachhangList();;
        System.out.println("num of employess:" + resultList.size());
        for (Khachhang next : resultList) {
            System.out.println("next employee: " + next);
        }
 
    }
    
}