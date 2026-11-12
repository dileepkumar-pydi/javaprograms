import java.util.*;
public class DuplicateElements{
    public static void main(String[] args){
        String str = "KingKKKi";
        System.out.println(findDuplicates(str));
    }

    public static LinkedHashSet<Character> findDuplicates(String str){
        LinkedHashSet<Character> ch = new LinkedHashSet<Character>();
        LinkedHashSet<Character> ch2 = new LinkedHashSet<Character>();
        for(int i = 0; i<str.length(); i++){
            if(!ch.add(str.charAt(i))){
                ch2.add(str.charAt(i));
            }
        }
        return ch2;
    }
}