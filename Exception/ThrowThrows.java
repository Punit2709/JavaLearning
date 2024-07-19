
class ZeroDivisiorException extends Exception
{
    public String toString()
    {
        return "Divisior cannot be Zero Number";
    }
}

public class ThrowThrows 
{
    static void meth1() throws ZeroDivisiorException
    {
        int a = meth2(10,0);
        System.out.println("Division = " + a);
    }

    static int meth2(int a, int b) throws ZeroDivisiorException
    {
        if(b == 0)
            throw new ZeroDivisiorException(); // Exception Generate above line So throw Here
        return a/b;
    }

    static void meth3() throws ZeroDivisiorException
    {
        meth1();
    }
    public static void main(String args[])
    {
        try
        {
            meth3();
        }

        catch(ZeroDivisiorException e)
        {
            System.out.println(e);
        }
    }   
}
