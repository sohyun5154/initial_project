package practice1;

/**
 * Created by sohyun on 2017-01-25.
 */
public class A {
public void methodA(B b) {
    b.methodB();
}
}

class B {
    public void methodB () {
        System.out.println("methodB()");
    }
}

class InterfaceTest {
    public static void main(String[] args) {
        A a = new A ();
        a.methodA (new B());
    }
}