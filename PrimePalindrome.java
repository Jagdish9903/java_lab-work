class NewThread implements Runnable {
    String threadname;
    Thread t;
    int lower, upper;

    NewThread(String name, int l, int u) {
        threadname = name;
        t = new Thread(this, threadname);
        lower = l;
        upper = u;
        t.start();
    }

    boolean isprime(int a) {
        int flag = 0;
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean ispalindrome(int a) {
        int org = a;
        int rev = 0, rem;
        while (a > 0) {
            rem = a % 10;
            rev = (rev * 10) + rem;
            a /= 10;
        }
        if (org == rev) {
            return true;
        } else {
            return false;
        }
    }
void display(int[] primes,int k){
    for (int i = 0; i < k; i++) {
                    System.out.print(primes[i]+" ");
                }
}
    public void run() {
        if (t.getName().equals("Prime")) {
            try {
                int k=0;
                int primes[] = new int[100];
                System.out.println("Required Prime numbers between " + lower + " and " + upper + " : ");
                for (int i = lower; i < upper; i++) {
                    if (isprime(i)) {
                        primes[k++]=i;
                    }
                }
                display(primes,k);
                
                System.out.println();
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            try {
                int m=0;
                int palindrome[] = new int[100];
                System.out.println("Required Palindrome numbers between " + lower + " and " + upper + " : ");
                for (int i = lower; i < upper; i++) {
                    if (ispalindrome(i)) {
                        palindrome[m++]=i;
                    }
                }
                display(palindrome,m);
                System.out.println();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

public class PrimePalindrome {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("Prime", 0, 100);
        NewThread obj2 = new NewThread("Palindrome", 0, 150);
        try {
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interruption Exception : " + e);
        }
    }
}
