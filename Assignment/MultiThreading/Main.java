package Assignment.MultiThreading;

public class Main implements Runnable {
    void display1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (i == 5)
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println(" "+i);
            }
            this.notifyAll();
        }
    }

    void display2() {
        synchronized (this) {
            for (int i =0;i<10;i++){
                if(i == 8)
                    try{
                        this.wait();
                    }
                catch (InterruptedException e){
                        e.printStackTrace();
                }
                System.out.println(i+" ");

            }
            this.notifyAll();
        }

    }
    @Override
    public void run() {
        System.out.println("Thread is Running!"+Thread.currentThread().getName());
        display1();
        display2();
    }

    public static void main(String[] args) {
        Main x = new Main();
        Thread t1 = new Thread(x," Thread 1 ");
        Thread t2 = new Thread(x," Thread 2 ");
        t1.start();
        t2.start();
    }


}