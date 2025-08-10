class Student
{
        int rollno;
        String name;
        int marks;
}
public class Two
{
        public static void main(String args[])
        {
        Student S1 = new Student();
        S1.rollno= 1;
        S1.name = "navin";
        S1.marks= 45;

        Student S2 = new Student();
        S2.rollno= 2 ;
        S2.name = "kiran";
        S2.marks= 47;

        Student S3 = new Student();
        S3.rollno=3;
        S3.name = "harsh";
        S3.marks= 76;
        }

        Student students[] = new Student[3];
        students[0]=S1;
        students[1]=S2;
        students[2]=S3;

        for(int i=0; i<students.length; i++)
        {
                System.out.println(students[i].name +":"+students[i].marks);
        }
}