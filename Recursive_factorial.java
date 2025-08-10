import java.util.Scanner;
public class Recursive_factorial {
  
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();  

        int result = findFactorial(N);  
        System.out.println("Factorial of " + N + " is: " + result);

        sc.close();  
    }
}


