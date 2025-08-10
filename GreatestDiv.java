public class GreatestDiv {
    public int GCD(int n1, int n2){
        int gcd = 1;
        int min = Math.min(n1, n2);

        for(int i =1; i<=min; i++){
            if(n1%i == 0 && n2%i == 0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        GreatestDiv obj = new GreatestDiv();
        System.out.println(obj.GCD(6, 12));
    }
}
