class CheckPrime{
    public static void main(String[] args){
        int num = 4;
        System.out.println(checkPrime(num)?"Prime":"Not a prime");
    }

    public static boolean checkPrime(int num){
        for(int i = 2 ; i <= num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
         return true;
    }
        
}