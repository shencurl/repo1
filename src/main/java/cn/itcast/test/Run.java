package cn.itcast.test;

import cn.itcast.thread.*;

public class Run {
    public static void main(String[] args) {
    /*    MyThread a=new MyThread("A");
        MyThread b=new MyThread("B");
        MyThread c=new MyThread("C");
        a.start();
        b.start();
        c.start();*/

 /*       MyThread2 myThread2=new MyThread2();
        Thread a=new Thread(myThread2,"A");
        Thread b=new Thread(myThread2,"B");
        Thread c=new Thread(myThread2,"C");
        Thread d=new Thread(myThread2,"D");
        Thread e=new Thread(myThread2,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();*/

    /*    ALogin a=new ALogin();
        a.start();
        BLogin b=new BLogin();
        b.start();*/
    //会出现死循环不能执行setContinuePrint方法
      /*  PrintString printStringService=new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        printStringService.setContinuePrint(false);*/
        //不会出现死循环
        PrintString2 printString2Service =new PrintString2();
        new Thread(printString2Service).start();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        printString2Service.setContinuePrint(false);
    }



}
