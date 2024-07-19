
// class MyThread extends Thread
// {
//     public void run()
//     {
//         int i = 1;
//         while(i<100)
//         {
//             System.out.println(i + " Hello");
//             i++;
//         }
//     }
// }


// -----> USING RUNNABLE

class MyRunnable implements Runnable
{
    public void run()
    {
        int i = 1;
        while(i<100)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }
}


public class TestThread extends Thread
{
    public void run()
    {
        int i = 1;
        while(i<100)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args)
    {
        // TestThread t = new TestThread();
        // t.start();
        // int i = 1;
        // while(i<100)
        // {
        //     System.out.println(i + " World");
        //     i++;
        // }

        MyRunnable rt = new MyRunnable();
        Thread nt = new Thread(rt);
        nt.start();
        int i = 1;
        while(i<100)
        {
            System.out.println(i + " World");
            i++;
        }
    }    
}
