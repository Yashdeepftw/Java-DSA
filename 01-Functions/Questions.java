// Prime number question

import java.util.*;

// public class Questions {
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.println("enter number you want to check: ");
//         int a = sc.nextInt();
//         System.out.println(isPrime(a));
//     }

//     static boolean isPrime(int a){
//         if(a <= 1){
//             return false;
//         }
//         for(int i=2;i<a;i++){
//             if(a % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Question {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the number you want to check");
        int a = sc.nextInt();
        System.out.println(isArmstrong(a));
    }

    static boolean isArmstrong(int n){

        int sum = 0;
        int og = n;
        while(n>0){
            int rem = n%10;
            n = n/10;
            int remCube = cube(rem);
            sum += remCube;
        }

        return sum == og;
    }

    static int cube(int a){
        return a*a*a;
    }
}