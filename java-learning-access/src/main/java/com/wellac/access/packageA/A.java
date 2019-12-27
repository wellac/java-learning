package com.wellac.access.packageA;

public class A {
    //成员变量
    public int var_public = 0;
    protected int var_protected = 0;
    int var_default = 0;
    private int var_private = 0;

    //成员方法
    public void fun_public() {}
    protected void fun_protected() {}
    void fun_default() {}
    private void fun_private() {}

    //测试类A"自身属性/方法"的可见性
    public void testSameClass1() {
        System.out.println(var_public + var_protected + var_default + var_private);
        fun_public();fun_protected();fun_default();fun_private();
    }

    //测试类A"实例属性/方法"的可见性
    public void testSameClass2() {
        A a = new A();
        System.out.println(a.var_public + a.var_protected + a.var_default + a.var_private);
        a.fun_public();a.fun_protected();a.fun_default();a.fun_private();
    }
}
