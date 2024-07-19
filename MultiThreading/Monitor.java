
class MyData
{
    
    public void display(String S)
    {
        //--------------------------  With Synchronization  -----------------------
        synchronized(this) // use this type of Synchronized Block
        {
            for (int i = 0; i < S.length(); i++) 
            {
                System.out.print(S.charAt(i));
                try {   Thread.sleep(1000); } catch (Exception e) {}
            }
        }
        
        //--------------------------  Without Synchronization  -----------------------
        /* for (int i = 0; i < S.length(); i++)   
        {
            System.out.println(S.charAt(i)); 
        } */
    }
}

/* class MyData
{
    
    synchronized public void display(String S) // or make method to Synchronized 
    {
        
            for (int i = 0; i < S.length(); i++) 
            {
                System.out.println(S.charAt(i));
                
            }
    }
}*/


class MyThread1 extends Thread
{
    MyData d1;
    MyThread1(MyData data)
    {
        d1 = data;
    }

    public void run()
    {
        d1.display("Hello World");
    }
}

class MyThread2 extends Thread
{
    MyData d2;
    MyThread2(MyData data)
    {
        d2 = data;
    }

    public void run()
    {
        d2.display("Welcome");
    }
}


public class Monitor 
{
    public static void main(String[] args) 
    {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        
        t2.start();    
        t1.start();
    }
}
