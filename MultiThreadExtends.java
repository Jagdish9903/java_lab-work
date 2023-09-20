class NewThread extends Thread
{
    NewThread(String name)
    {
        super(name);
        start();
    }
    public void run()
    {
        try {
            for(int i=5;i<10;i++)
            {
                System.out.println(getName()+" : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception generated : "+e);
        }
    }
}
public class MultiThreadExtends {
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
