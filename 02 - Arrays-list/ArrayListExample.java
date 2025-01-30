
import java.util.*;

public class ArrayListExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(7);
        list.add(45);
        list.add(4);
        System.out.println(list);

        System.out.println(list.contains(66));

        list.set(0, 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        // input
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list2.add(i);
        }
        // get item form any index 
        for(int i = 0; i < 5; i++){
            System.out.print(list2.get(i));// list of index [] will not work here 
        }
        System.out.println();
        System.out.println(list2);
    }
}