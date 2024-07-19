
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int c = 1;
        while(true)
        {
            System.out.println(c);
            c++;
        }
    }
}

public class ThreadMethod  
{
    public static void main(String args[])
    {
        MyThread mt = new MyThread("My Thread 1");
        mt.setPriority( 2); 
        `
        System.out.println( mt.threadId() );
        System.out.println( mt.getName() );
        System.out.println( "My Thread 1 is Demon :- " + mt.isDaemon() );
        System.out.println( mt.getPriority() );
        System.out.println( mt.getState() );
        // mt.interrupt();

        // System.out.println( mt.getState() );
        // System.out.println( mt.hashCode() );

        // Thread mainThread = Thread.currentThread();
        // try{ mainThread.join(); } catch(Exception e){}

        // mt.start();
        // System.out.println( mt.getState() );
        
        // try
        // {
        //     MyThread.sleep(2000);
        // }
        // catch(InterruptedException e)
        // {
        //     System.out.println(e);
        // }   


        
    }
}
