package Generics;

public class GenericsDemo<T>
{
    /* 
    problem before Generics

    1. needs type casting
    Object obj = new String("Hello");
    String str = obj;  --> gives error cause needs type casting. 

    2. diff class type 
    Object obj = new Integer(10);
    String str =  (String)obj; --> here Type casted but Interger and String diff Class

    3. Array of Object
    Object obj[3] = new Object();
    obj[0] = new String("hi"); 
    obj[1] = new String("hello");
    obj[2] = new Integer(15); --> all three diff type so Tpye are not safe.

    */ 

    // T data[] = new T[3];  --> not Allowded.

    T data[] = (T[]) new Object[3];
    
    

    public static void main(String[] args) 
    {
        GenericsDemo<String> gd = new GenericsDemo<>();

        gd.data[0] = "hi";
        gd.data[1] = "hello";
        gd.data[2] = "How are You";
        // gd.data[2] = 10;  -->  not Allowded cause Type Safe.

        for (int i = 0; i < 3; i++) 
        {
            String str = gd.data[i];
            System.out.println(str);    
        }


    }
    
    
}
