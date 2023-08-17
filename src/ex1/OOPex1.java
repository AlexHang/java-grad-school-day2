package ex1;

public class OOPex1 {
    public static void main(String[] args) {
        System.out.println(MyClass.sayHello());

        MyClass m1 = new MyClass("DB");
        System.out.println(m1.sayHelloVar1());
        m1.publicVar = "abc";
        System.out.println(m1 instanceof MyClass);
    }
}
