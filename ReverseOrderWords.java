class ReverseOrderWords{
    public static void main(String[] args){
        String str = "I Love Hyderabad";
        System.out.println(reverseOrderWords(str));
    }

    public static String reverseOrderWords(String str){
        StringBuilder sb = new StringBuilder("");
        String[] strs = str.split(" ");
        for(int i = strs.length - 1; i>=0; i--){
            sb.append(strs[i]).append(" ");
        }
        return sb.toString();
    }   
}