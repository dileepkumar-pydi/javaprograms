class ReverseWord{
    public static void main(String[] args){
        String str = "I Love Hyderabad";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str){
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < strs.length; i++){
            StringBuilder newStr = new StringBuilder(strs[i]);
            sb.append(newStr.reverse()).append(" ");
        }
        return sb.toString();
    }
}