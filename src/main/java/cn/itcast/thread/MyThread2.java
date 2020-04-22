package cn.itcast.thread;

public class MyThread2 extends Thread {
    private int count=5;

    @Override
    //加synchronized才能实现线程安全
    synchronized public void run() {
        super.run();
        /*此处不需要for循环，不然就变成了同步，一直由一个线程进行计算*/
        count--;
        System.out.println("由 "+this.currentThread().getName()+" 计算，count="+count);

    }
}
