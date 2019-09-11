package com.baymax.dailynotes.dailynotes.accessPermission.package0.differentPackage.samePackage;

/**
 * @author bx
 * @date 9/11/2019 4:11 PM
 *
 * private 只能当前文件使用
 * default 同一包子类可以使用
 * protected 不同包/同包子类可以使用
 * public 其他包
 */
class Private1 {
    private static String privateName;
    static String defaultName;
    protected static String protectedName;
    public static String publicName;

    public static void main(String[] args) {
//        Private0.
    }
}
