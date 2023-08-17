package ex4;

public class BasicMath {

    public int multiplyNumbers(int a, int b){
        int res = 0;
        // badly implemented
        for(int i = 0; i<b; i++){
            res += a;
        }
        return res;
    }
}
