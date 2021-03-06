package com.baymax.dailynotes.accessPermission.differentPackage.samePackage;

/**
 * https://blog.csdn.net/u012969412/article/details/76401148
 * 类修饰符：
 * public（访问控制符），将一个类声明为公共类，他可以被任何对象访问，一个程序的主类必须是公共类。
 *
 * abstract，将一个类声明为抽象类，没有实现的方法，需要子类提供方法实现。
 *
 * final，将一个类生命为最终（即非继承类），表示他不能被其他类继承。
 *
 * friendly，默认的修饰符，只有在相同包中的对象才能使用这样的类。
 *
 * 成员变量修饰符：
 * public（公共访问控制符），指定该变量为公共的，他可以被任何对象的方法访问。
 *
 * private（私有访问控制符）指定该变量只允许自己的类的方法访问，其他任何类（包括子类）中的方法均不能访问。
 *
 * protected（保护访问控制符）指定该变量可以别被自己的类和子类访问。在子类中可以覆盖此变量。
 *
 * friendly ，在同一个包中的类可以访问，其他包中的类不能访问。
 *
 * final，最终修饰符，指定此变量的值不能变。
 *
 * static（静态修饰符）指定变量被所有对象共享，即所有实例都可以使用该变量。变量属于这个类。
 *
 * transient（过度修饰符）指定该变量是系统保留，暂无特别作用的临时性变量。
 *
 * volatile（易失修饰符）指定该变量可以同时被几个线程控制和修改。
 *
 * 方法修饰符：
 * public（公共控制符）
 *
 * private（私有控制符）指定此方法只能有自己类等方法访问，其他的类不能访问（包括子类）
 *
 * protected（保护访问控制符）指定该方法可以被它的类和子类进行访问。
 *
 * final，指定该方法不能被重载。
 *
 * static，指定不需要实例化就可以激活的一个方法。
 *
 * synchronize，同步修饰符，在多个线程中，该修饰符用于在运行前，对他所属的方法加锁，以防止其他线程的访问，运行结束后解锁。
 *
 * native，本地修饰符。指定此方法的方法体是用其他语言在程序外部编写的。
 *
 * @author bx
 * @date 9/11/2019 4:11 PM
 * private 只能当前文件使用
 * default 同一包子类可以使用
 * protected 不同包/同包子类可以使用
 * public 其他包
 */
public class Private0 {
    private static String privateName;
    static String defaultName;
    protected static String protectedName;
    public static String publicName;

    public static void main(String[] args) {
//        Private0.
    }
}
