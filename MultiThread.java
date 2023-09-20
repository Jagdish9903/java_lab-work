class NewThread implements Runnable
{
    String name;
    Thread t;
    NewThread(String threadname)
    {
        name=threadname;
        t = new Thread(this,name);
        System.out.println(t+" created.");
        t.start();
    }
    public void run()
    {
        try {
            for(int i=5;i<10;i++)
            {
                System.out.println(t.getName()+" : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception generated : "+e);
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        Thread tmain = Thread.currentThread();
        try {
            for(int i=0;i<5;i++)
            {
                System.out.println(tmain.getName()+" : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception generated : "+e);
        }
        
    }
}
