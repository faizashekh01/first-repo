class Ternary
{
    public static void main(String args[])
    {
        int n = 11;
        int result = 0;

        // if (n%2==0)
        //     result = 10;
        // else
        //     result = 20;
        // instead of all these lines we can write in 1 line
        result = n%2==0?10:20;

           
        System.out.println(result);  

    }
}