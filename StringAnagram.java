import java.util.*;
public class StringAnagram{
    public static void main(String[] args){
        System.out.println(checkAnagram("Listen".toLowerCase(), "Silent".toLowerCase()));
    }

    public static boolean checkAnagram(String s1, String s2){
        HashMap<Character, Integer> hMap = new HashMap<>();
        for(int i = 0; i< s1.length(); i++){
            hMap.put(s1.charAt(i), hMap.getOrDefault(s1.charAt(i), 0) + 1);
        }

         for(int i = 0; i< s2.length(); i++){
            if(hMap.get(s2.charAt(i))!=null){
                if(hMap.get(s2.charAt(i)) == 1){
                    hMap.remove(s2.charAt(i));
                }else{
                    hMap.put(s2.charAt(i), hMap.get(s2.charAt(i)) - 1);
                }
            }else{
                return false;
            }
        }

        if(hMap.isEmpty()){
            return true;
        }
        return false;
    }
}