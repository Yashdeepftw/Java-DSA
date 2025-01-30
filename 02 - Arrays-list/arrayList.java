
//  What are Arrays ?
//  => Arrays are continous collection of data types 
//  in java this continous point depends on the jvm means in java arrays are not stored continous ways as java does not have pointers

public class arrayList {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(a);
            // Syntax int[] arr = [1,23,3,445,54];
            // object decleration
            int[] rnos = new int[5];// initialisation : actually here object is being created in the memory (heap)
            System.out.println(rnos[1]);
            // simple declaration 
            int[] nos = {1,2,34,5,6};

            String[] arr = new String[4];
            System.out.println(arr[1]);

            
        }
}
