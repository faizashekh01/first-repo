public class gfg {
    static int add(int x, int y){
        x +=y;
        return x;
    }
 public static void main(String[] args) {
    int a =1;
    int b= 2;
    add(a,b);
    System.out.println("After add function a = " +a);
    System.out.println("After add function b = " +b);
 }   
}
