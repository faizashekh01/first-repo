import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();
        Grading grad = new Grading();
        
        grad.StudentGrade(marks);
    }
}



class Grading {
    public void StudentGrade(int marks){
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=70){
            System.out.println("Grade B");
        }
        else if(marks>=50){
            System.out.println("Grade C");
        }
        else if(marks>=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail!!!");
        }
    }
  

}
