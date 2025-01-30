import java.util.*;

public class Functions_02 {
    public static void main(String[] args){
        String name = "kunal";
        change(name);
        System.out.println(name);
    }

    static void change(String name){
        name = "not kunal";
        System.out.println("name in method: " + name);

    }
}
