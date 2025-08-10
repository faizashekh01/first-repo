class A{
    public void show1(){
        System.out.println("in A show");
    }

}

class B extends A
{
    public void show2(){
        System.out.println("in B show");

    }

}
public class Upcasting {
    public static void main(String[] args) {
        A obj = (A) new B();
        obj.show1();

        B obj1 = (B) obj;g
        obj1.show2();

    }
    
}
