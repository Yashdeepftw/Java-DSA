import java.util.*;
public class Functions{
    
    public static int add(int a , int b){
        Scanner sc = new Scanner(System.in);
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        System.out.println(add(a,b));

    }
}