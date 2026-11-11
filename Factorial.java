class Factorial{
    public static void main(String[] args){
        System.out.println(findFactorial(5));
    }

    public static int findFactorial(int number){
        int fact = 1;
        for(int i = 2; i <= number ; i++){
            fact = fact*i;
        }
        return fact;
    }
}