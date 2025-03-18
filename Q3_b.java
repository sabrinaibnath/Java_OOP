class A1 {
    public static final int var; // `final` variables must be initialized explicitly.
    public int par;
    static {
        var = 10; // OK to assign here because `var` is static and `final`.
        // par = 5; // Cannot access instance variable `par` in a static block. Commented out.
        System.out.println("Static block in A");
    }

    void meth() {
        // var = 15; // `final` variable cannot be reassigned. Commented out.
        System.out.println("Method in class A");
    }
}

class B2 extends A1 {
    final void meth() {
        // var += 20; // `final` variable cannot be modified. Commented out.
        System.out.println("Method in class B");
    }
}

final class C extends B2 {
    int star; // Instance variable `star` declared correctly.

    // The `meth()` method in class B is `final`, so it cannot be overridden. Removed this method.
    /*
    void meth() {
        System.out.println("Method in class C");
    }
    */

}

public class Q3_b {

	public static void main(String[] args) {
        B2 obj1 = new B2();
        B2 obj2 = new B2();
        obj1.meth();

        // star = 100; // `star` is an instance variable, so it must be accessed through an object. Commented out.
        C obj3 = new C(); // Created an object of class C to set `star`.
        obj3.star = 100; // Correctly setting the value of `star`.

        System.out.println("par = " + obj1.par + ", var = " + obj2.var + ", star = " + obj3.star);
    }
}
