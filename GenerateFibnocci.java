import java.util.*;

class GenerateFibnocci{
    public static void main(String[] args){
        System.out.println(generateSeries(10));
    }

    public static List<Integer> generateSeries(int num){
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        for(int i =0 ; i<num-2; i++){
            list.add(list.get(list.size() -1) + list.get(list.size() -2));
        }
        return list;
    }
}