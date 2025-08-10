
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int rev = 0;
        int originalNum = n;
        while(n>0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n = n/10;

        }
        if(rev == originalNum){
        System.out.print("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
