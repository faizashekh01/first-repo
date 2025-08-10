
import java.util.Scanner;

public class RightAngleTriangle 
{
    int N ;
    Scanner sc = new Scanner(System.in);

    public RightAngleTriangle()
    {
        System.out.println("Enter N: ");
        N = sc.nextInt();
    }

    public void RightTriangle()
    {
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
             System.out.println();
        }
       
    }

    public static void main(String[] args) 
    {
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.RightTriangle();
    }
}
