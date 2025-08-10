
import java.util.Scanner;

public class Digit {
    int N ;
    Scanner sc = new Scanner(System.in);
    public Digit(){
        System.out.println("Enter N: ");
        N = sc.nextInt();
    }
    public void DigitCounter(){
       String str = Integer.toString(N);
       int r = str.length();
       System.out.println(r);
    }
    public static void main(String[] args) {
        Digit obj = new Digit();
        obj.DigitCounter();
    }
}
