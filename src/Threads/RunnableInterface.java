package Threads;
// Runnable interface:-generally preferred, because Java doesn’t allow
//multiple inheritance of classes — if your class already extends something else, you can’t also extend Thread,
//but you can still implement Runnable:

public class RunnableInterface {
    public static void main(String[] args) {
        Mytask task = new Mytask();
        Thread t1  = new Thread(task); //Wrap the runnable inside a thread object.
        t1.start();
    }
}
class Mytask implements Runnable{
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println("Task running: "+i);
        }
    }
}
