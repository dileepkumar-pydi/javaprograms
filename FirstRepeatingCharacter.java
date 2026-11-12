import java.util.*;
public class FirstNonRepeatingCharacter{
    public static void main(String[] args){
        String str = "KingKKKi";
        System.out.println(findDuplicates(str));
    }

    public static Character findDuplicates(String str){
        LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
        for(int i = 0; i< str.length(); i++){
            hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i) , 0) + 1);
        }

        for(Map.Entry<Character, Integer> data : hmap.entrySet()){
            if(data.getValue() > 1){
                return data.getKey();
            }
        }
        return ' ';
    }
}