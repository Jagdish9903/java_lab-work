class Callme {
    void call(String msg) {
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print(" ]");
    }
}
class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized(target){
        target.call(msg);
        }
    }
}
public class Sync {
    public static void main(String[] args) {
        Callme c1 =new Callme();
        Caller a = new Caller(c1, "First");
        Caller b = new Caller(c1, "Second");
        Caller c = new Caller(c1, "Third");
        try{
            a.t.join();
            b.t.join();
            c.t.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }        
    }
}
