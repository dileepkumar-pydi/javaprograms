import java.util.*;
public class FirstNonRepeatingCharacter{
    public static void main(String[] args){
        String str = "KingKKKi";
        for(Map.Entry<Character, Integer> data : findDuplicates(str).entrySet()){
                 System.out.println(data.getKey() +" "+ data.getValue());
        }       
    }

    public static LinkedHashMap<Character, Integer> findDuplicates(String str){
        LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
        for(int i = 0; i< str.length(); i++){
            hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i) , 0) + 1);
        }
        return hmap;
    }
}