package com.wellac.access.packageA;

public class TestSamePackageAndSub extends A {

    //测试类A"继承属性/方法"的可见性
    public void testSameClass1(){
        /*
        System.out.println(var_public + var_protected + var_default + var_private);
        fun_public();fun_protected();fun_default();fun_private();
        */
    }

    //测试类A"实例属性/方法"的可见性
    public void testSameClass2(){
        /*
        A a = new A();
        System.out.println(a.var_public + a.var_protected + a.var_default + a.var_private);
        a.fun_public();a.fun_protected();a.fun_default();a.fun_private();
        */
    }
}
