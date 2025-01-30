

import java.util.*;
public class MultiAL {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Multi dimension arraylist
        ArrayList<ArrayList<Integer>> list = new  ArrayList<>();
        // Initialisation
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // add elements 
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
