package ex4;

import ex2.Car;

public class OverloadAndOverrideExample extends BasicMath{

    @Override
    public int multiplyNumbers(int a, int b){
        return a*b;
    }

    public int addNumbers(int a, int b){
        return a+b;
    }
    public double addNumbers(double a, double b){
        return a+b;
    }
    public int addNumbers(int a, int b, int c){
        return a+b+c;
    }

    public void foo(){
        System.out.println(this.addNumbers(1.0, 2.0));
    }

}
