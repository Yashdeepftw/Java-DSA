

import java.util.*;

// method overloading is when same method with same name but with different parameters are called
// this happens at the run time
public class Overloading {
    public static void main(String[] args) {
        fun(1);
        fun("name", 100);
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name, int b){
        System.out.println(name + b);
    }
}
