public class StringPalindrome {
    public static void main(String[] args) {
       String data = "Madam";
       System.out.println(reverseString(data) ? "Palindrome" : "Not a Palindrome");
    }

    public static boolean reverseString(String data){
        StringBuilder sb = new StringBuilder(data);
        return sb.reverse().toString().equalsIgnoreCase(data);
    }
}
