public class Solutionn {
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
    public static void main(String[] args) {
        Solutionn obj = new Solutionn();
        obj.StudentGrade(56);
    }
    }
    

