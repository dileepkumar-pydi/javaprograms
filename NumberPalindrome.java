public class NumberPalindrome{
    public static void main(String[] args){
        int num = 121;
        System.out.println(checkPalindrome(num)?"Palindrome":"Not a palindrome");
    }

    public static boolean checkPalindrome(int num){
        int temp = 0;
        int original = num;
        while(num!=0){
            int k = num%10;
            temp = temp*10+k;
            num = num/10;
        }
        return original == temp;
    }
}