import java.util.ArrayList;
import tools.AdvCalc;
import tools.Calc;

public class Calculator {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        Calc obj1 = new Calc();
        int p = obj1.add(23, 2);
        int r=obj.add(10,2);
        int r1= obj.div(15, 3);
        int r2= obj.modulo(16, 4);
        int r3= obj.sub(22, 10);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(p);
        ArrayList list = new ArrayList();
    }
    
}
