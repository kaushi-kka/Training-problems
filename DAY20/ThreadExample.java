
class SampleThread extends Thread{
    @Override
    public void run()
    {
        System.out.println("Thread running using Thread class");

    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run()//3.Running state
    {
        try{
            System.out.println("Thread running using Runnable");
            Thread.sleep(4000);//4.blocked/waiting state
            System.out.println("After 4 seconds");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ThreadExample {
    public static void main(String[] args)
    {
        SampleThread t1=new SampleThread();
        t1.start();
        SampleThread2 s=new SampleThread2();
        Thread t2=new Thread(s);
        t2.start();
    }
}

