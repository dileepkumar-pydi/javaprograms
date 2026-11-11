import java.util.*;

class FindPrimeNumbers{
    public static void main(String[] args){
        System.out.println(findPrimeNumbers(10, 100));
    }

    public static List<Integer> findPrimeNumbers(int min, int max){
        List<Integer> list = new LinkedList<>();
        for( int i = min; i <= max; i++){
            boolean res = true;
            for(int j = 2; j <= i/2 ; j++){
                if(i%j == 0){
                    res = false;
                    break;
                }
            }
            if(res){
                list.add(i);
            }
        }
        return list;
    }
}