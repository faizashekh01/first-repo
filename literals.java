class Literals
{
    public static void main(String a[])
    {
        // int num1 = 0b110;
        // int num1 = 0x3E;
        int num1 = 10_00_00_000;
        double d =76;
        double num2 = 12e10;
        // boolean b = 1; this will give error because 0 and 1 are not allowed in java only true or false
        char c = 'a';
        c++;
        System.out.println(num1);
        System.out.println(d);
        System.out.println(num2);
        // System.out.println(b);
        System.out.println(c);
    }
}