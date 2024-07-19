package Generics;

class Data<T>
{
    private T data;

    public void setData(T v)
    {
        data = v;
    }

    public T getData()
    {
        return data;
    }
}


public class GenericUse     
{
    public static void main(String[] args) 
    {
        
        // Data<Integer> d = new Data<>();
        // d.setData(10); 

        // Data<String> d = new Data<>();
        // d.setData("hello");

        // System.out.println( d.getData() );

        Data<Integer> d1 = new Data<>();
        d1.setData(10);

        System.out.println( d1.getData() );
        

    }
}
