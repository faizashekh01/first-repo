public class GreatDiv {
    public int GCD(int a, int b) {
  
     while(b>0){
        int temp = b;
        b= a%b;
        a= temp;
       
     }
    return a;  // return GCD here
}
public static void main(String[] args) {
    GreatDiv obj = new GreatDiv();
    System.out.println(obj.GCD(48, 18));

}

}
