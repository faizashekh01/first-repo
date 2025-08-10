class A 
{
public void show()
{
System.out.println("in A show");
}
public void config()
{
System.out.println("in A Config");
}
}
class B extends A
{
public void show()
{
System.out.println("in B show");
}
}
public class Method_overriding
{
public static void main(String a[])
{
B obj = new B();
obj.show();
obj.config();
}
}


