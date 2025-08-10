public class Armstrong {
    public boolean isArmstrong(int n){
        int original = n;
        int count= 0;
        int temp = n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int sum =0;
        temp=n;
        while(temp>0){
            int lastDigit = temp%10;
            sum += Math.pow(lastDigit, count);
            temp = temp/10;

        }
       return sum == original;
    }
    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        System.out.println(obj.isArmstrong(153));
    }

}
