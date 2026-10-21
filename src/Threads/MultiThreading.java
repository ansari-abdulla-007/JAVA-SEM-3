package Threads;
class MyThread2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread : "+ i);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args){
        MyThread2 t2 = new MyThread2();
        t2.start();

        for(int j=1;j<=5;j++){
            System.out.println("Main : "+ j);
        }
    }
}
