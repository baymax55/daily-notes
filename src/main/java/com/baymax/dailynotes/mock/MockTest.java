package com.baymax.dailynotes.mock;

import com.baymax.dailynotes.mock.temp.LoginPresenter;
import com.baymax.dailynotes.mock.temp.UserManager;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * @author bx
 * @date 9/10/2019 11:45 AM
 */
public class MockTest {
    @Test
    //① 验证方法调用（verify）
    public void verify() {
        UserManager mockUserManager = Mockito.mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setmUserManager(mockUserManager);
        loginPresenter.login("sxl", "22");
        //验证UserManager的performLogin方法是否得到了调用，而且入参是否是这个值
        Mockito.verify(mockUserManager).performLogin("sxl", "111111");
        /**测试该方法被调用的几次
         *注意事项：
         *1>传给 Mockito.verify() 的参数必须是一个mock对象
         *2>Mockito.mock() 的作用：而是根据传进去的一个类，mock出属于这个类的一个对象，
         *     并且返回这个mock对象；而传进去的这个类本身并没有改变，用这个类new出来的对象也没有受到任何改变！
         *3>mock出来的对象需要手动注入：mock出来的对象并不会自动替换掉正式代码里面的对象，你必须要有某种方式把mock对象应用到正式代码里面
         */
        Mockito.verify(mockUserManager, Mockito.times(1)).performLogin("sxl", "111111");
    }

    //② 模拟mock对象的某些方法的行为
    ////模拟方法的返回值：Mockito.when(mockObject.targetMethod(args)).thenReturn(desiredReturnValue)
    // Mockito.when(mockValidator.validatorPassword("12345")).thenReturn(true);
    @Test
    public void mockBehavior() {
    }

    //③ spy的使用
    @Test
    public void spy() {
        UserManager spyUserManager = Mockito.spy(UserManager.class);
        assertEquals("测试spy：", true, spyUserManager.performLogin("sxl", "111111"));
    }


}
