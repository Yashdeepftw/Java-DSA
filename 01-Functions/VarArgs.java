
import java.util.*;

// ... is used to give multiple arguments in the parameters area
public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        multiple(1,2,"kunal", "naem"); // have to give parameters same as defined in the function
    }

    static void fun(int ...a){ // here ... takes the array of the arguments given , the array will be of the data type defined 
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, String ...s){ // here the last vatiable with multiple args is neede to be defined at the last place
        

    }
}
