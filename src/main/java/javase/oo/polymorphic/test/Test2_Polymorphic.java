package javase.oo.polymorphic.test;

public class Test2_Polymorphic {
    public static void main(String[] args) {
        A a = new B();
        a.show();

        B b = new C();
        b.show();
    }
}
class A {
    public void show() {
        show2();
    }
    public void show2() {
        System.out.println("我");
    }
}
class B extends A {
    public void show() {
        show2();
    }
    public void show2() {
        System.out.println("爱");
    }
}
class C extends B {
    public void show() {
        super.show();
    }
    public void show2() {
        System.out.println("你");
    }
}
