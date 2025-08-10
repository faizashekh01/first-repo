
import java.util.Scanner;

public class Sum_Recursion {
    int N ;
    Scanner sc = new Scanner(System.in);

public Sum_Recursion(){
    System.out.println("Enter N:");
    N = sc.nextInt();
}
public int f(int n){
    if(n==0){
        return 0;
    }
    return n + f(n-1);
}
public static void main(String[] args) {
    Sum_Recursion obj = new Sum_Recursion();
    System.out.println(obj.N);
}

}
