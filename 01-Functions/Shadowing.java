


public class Shadowing {
    static int x = 10;//like a global variable

    public static void main(String[] args) {
        System.out.println(x); // 10 => global value

        int x ;
        // here shadowing is not done until value is initialized , it is done when the value of the variable is initialised
        x = 20;// shadowing [means overlaping the before value] happens here when the value is initialised
        System.out.println(x);
    }    
}
