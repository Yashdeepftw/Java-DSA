import java.util.*;

public class SearchInStrings {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name = "kunal";
        char key = 'u';
        System.out.println("Character found?: " + search(name, key));
        // converts a string into an array
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String name, char key){
        if(name.length() == 0){
            return false;
        }

        for(int i = 0; i < name.length(); i++){
            if(key == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    // using for each loop
    static boolean search2(String name, char key){
        if(name.length() == 0){
            return false;
        }
        for (char ch: name.toCharArray()) {
            if(ch == key){
                return true;
            }
        }
        return false;
    }
}
