package com.baymax.dailynotes.mock.temp;

/**
 * @author bx
 * @date 9/10/2019 11:42 AM
 */

public class LoginPresenter {
    private UserManager mUserManager = new UserManager();
    public boolean login(String username, String password) {
        //调用方法
        return mUserManager.performLogin(username, password);
    }

    public void setmUserManager(UserManager mUserManager) {
        this.mUserManager = mUserManager;
    }
}
