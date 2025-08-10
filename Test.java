import tools.AdvCalc;

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc extends Calc
{
public int add (int n1, int n2)
{
    return n1+n2+1;
}
}
public class Test
{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1= obj.add(4, 7);
        System.out.println(r1);
        
    }
}
