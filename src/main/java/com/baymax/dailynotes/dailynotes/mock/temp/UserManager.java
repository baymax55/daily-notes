package com.baymax.dailynotes.dailynotes.mock.temp;

/**
 * @author bx
 * @date 9/10/2019 11:42 AM
 */
public class UserManager {
    public boolean performLogin(String username, String password) {
        //很复杂的业务逻辑
        if (username == null || username.length() == 0) return false;
        if (username == null || username.length() == 0) return false;
        if (username.equals("sxl") && password.equals("111111")) {
            return true;
        } else {
            return false;
        }
    }
}
