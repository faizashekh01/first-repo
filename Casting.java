class Casting{
    public static void main(String args[])
    {
       
        // int a = 23;
        // byte b = a;
        // System.out.println(b);
        // this above code will give error as we are assigning 
        // the value of int to byte basically we are narrowing it 

        int a = 22;
        byte b = (byte)a;
        System.out.println(b);

      // byte a = 20;
      // byte c = 10;
      // int res = a*c;
      //   System.out.println(res);
    }
}