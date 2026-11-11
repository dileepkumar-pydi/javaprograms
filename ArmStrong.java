class Armstrong{
    public static void main(String[] args){
        System.out.println(checkArmStrong(153));
    }

    public static boolean checkArmStrong(int num){
        int count = 0;
        int temp = num;
        while(temp!=0){
            count ++;
            temp = temp/10;
        }
        temp = num;
        int sum = 0;
        while(num!=0){
            int k = num%10;
            int sum2 = k;
            for(int i = 1 ; i < count ; i++){
                sum2 = sum2*k;
            }
            sum = sum + sum2;
            num = num/10;
        }
        return temp == sum;
    }
}