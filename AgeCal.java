import java.util.Scanner;

public class AgeCal {
    int age;
    Scanner sc = new Scanner(System.in);
    public AgeCal(){
        System.out.println("Enter Your Age: ");
        age = sc.nextInt();
    }

    public void AgeDetect(){
        if(age>=18){
            System.out.println("You are eligible to vote!");
        }
        else {
            System.out.println("Sorry, you are not eligible to vote.");
        }
        
    }

    public static void main(String[] args) {
        AgeCal obj = new AgeCal();
        obj.AgeDetect();
    

    }
}
