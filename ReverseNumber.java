class Main {
    public static void main(String[] args) {
       int num = 121;
       System.out.println(reverseNumber(num));
    }

    public static int reverseNumber(int num){
        int number = 0;
        while(num!=0){
            int k = num%10;
            number = number*10+k;
            num = num/10;
        }
        return number;
    }
}