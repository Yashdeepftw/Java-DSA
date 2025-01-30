

import java.util.*;

public class Input {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Arrays of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 3;
        arr[2] = 22;
        arr[3] = 44;
        arr[4] = 55;
        // System.out.println(arr[3]);

        // inputs using for loop
        int[] arr2 = new int[5];
        for(int i=0;i<arr2.length;i++){
            // arr2[i] = sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            // System.out.print(arr2[i]);
        }
        
        // for each loop
        for(int num : arr2){
            // System.out.print(num + " ");// here num represents every element of the array
        }

        //System.out.println(arr2[5]);// will give error of array index out of bound

        int[] arr3 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr3));


        // Arrays of Objects

        String[] arr4 = new String[4];
        for(int i = 0 ; i < arr4.length ; i++){
            arr4[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr4));
    }    
}
