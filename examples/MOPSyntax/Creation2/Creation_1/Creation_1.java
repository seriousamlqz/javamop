
import java.util.*;

public class Creation_1 {
    public int temp = 0;
    public void fun1(){
        temp = 1;
    }
    public void fun2(){
        temp = 2;
    }
    
    public static void main(String[] args){
        Creation_1 o = new Creation_1();
        
        System.out.println("fun1");
        o.fun1();
        System.out.println("fun2");
        o.fun2();
        
        System.out.println("main end");
    }
}
