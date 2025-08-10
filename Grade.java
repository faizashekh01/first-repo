import java.util.Scanner;

public class Grade {
    int marks;
   
    Scanner sc = new Scanner(System.in);
    public Grade(){
        System.out.print("Enter MARKS: ");
        marks = sc.nextInt();

    }
    
    
    public void StudentGrade(){
        if(marks>=90){
            System.out.println("Grade A");

        }
        else if(marks>=70){
            System.out.println("Grade B");
        }
        else if(marks>= 50){
            System.out.println("Grade C");
        }
        else if(marks>= 35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("FAIL");
        } 
    }
    
    public static void main(String[] args) {
    Grade obj = new Grade();
    obj.StudentGrade();
    
    
    }
    
}
