/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.controller;

import stk.entities.Taikhoan;
import stk.helper.TaiKhoanHelper;
import stk.util.Utill;

/**
 *
 * @author Administrator
 */
public class TaiKhoanController {
    public static boolean LoginUser(String user_name, String password){
		Taikhoan ob = new TaiKhoanHelper().login(user_name, password);
		if(ob != null) {
			if(Utill.SaveUser(ob)){
                            return true;
			}
		}
        return false;
	}
}
