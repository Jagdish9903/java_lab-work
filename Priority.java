class Click implements Runnable{
    int clock = 0;
    Thread t;
    private boolean running=true;
    public Click(int p)
    {
        t=new Thread(this);
        t.setPriority(p);
    }
    public void run(){
        while(running)
        {
            clock++;
        }
    }
    public void stop()
    {
        running=false;
    }
    public void start()
    {
        t.start();
    }
} 
class Priority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Click hi = new Click(Thread.NORM_PRIORITY+2);
        Click lo = new Click(Thread.NORM_PRIORITY-2);
        lo.start();
        hi.start();
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        lo.stop();
        hi.stop();
        try{
            hi.t.join();
            lo.t.join();
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        System.out.println("Low priority thread ran : "+lo.clock+" times.");
        System.out.println("High priority thread ran : "+hi.clock+" times.");
    }
}
