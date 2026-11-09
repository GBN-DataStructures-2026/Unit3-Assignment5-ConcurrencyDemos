public class Demo03
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter  c = new Counter();
        Runnable r = new Increase(c, 10000);
        Thread   t = new Thread(r);

        t.start();
        t.join();  //the join command indicates that the main
        //thread should wait until completion of the thread t
        //before continuing.

        System.out.println("Expected: 10000");
        System.out.println("Count is: " + c.getCount());
    }
}