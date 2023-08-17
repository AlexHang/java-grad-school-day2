package ex1;

public class MyClass {

    private String var1;

    public String publicVar;

    private int pinCode;

    protected int p1;

    public void setPinCode(int pinCode){
        this.pinCode = pinCode;
    }

    public int getPinCode(){
        return pinCode;
    }

    public static String sayHello(){
        return "Hello";
    }

    MyClass(String var1){
        this.var1 = var1;
    }
    public String sayHelloVar1(){
        return "Hello " + var1;
    }
}
