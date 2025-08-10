
import java.util.Scanner;

public class SquarePattern {
    
        int N ;
        Scanner sc = new Scanner(System.in);
        public SquarePattern()
        {
            System.out.println("Enter N: ");
            N = sc.nextInt();

        }
        public void Pattern1()
        {
        for(int i =0; i<N; i++)
        {
            for(int j =0; j<N; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    public static void main(String[] args) 
    {
        SquarePattern obj = new SquarePattern();
        obj.Pattern1();
    }
}
