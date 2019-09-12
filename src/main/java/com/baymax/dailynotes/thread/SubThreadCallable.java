package com.baymax.dailynotes.thread;

import java.util.concurrent.*;

/**
 * @author bx
 * @date 9/10/2019 3:02 PM
 * Java 实现子线程返回值的几种方法
 * 一、主线程等待法#
 * https://www.jianshu.com/p/2196d8210b12
 */
public class SubThreadCallable extends Thread {
    private String value1;
    private String value2;

    public void run() {
        value1 = "有数据了";
        value2 = "有数据了";
    }

    public static void main(String[] args) throws Exception {
        SubThreadCallable thread = new SubThreadCallable();
        thread.start();
        while (thread.value1 == null || thread.value2 == null) {
            sleep(2000);
        }
        System.out.println("value1:" + thread.value1);
        System.out.println("value2:" + thread.value2);
    }
}

/**
 * 一、Thread join()方法，系统自动等待线程完成后再执行#
 */
class ThreadA implements Runnable {
    private int counter;

    @Override
    public void run() {
        while (counter <= 10) {
            System.out.print("Counter = " + counter + " ");
            counter++;
        }
        System.out.println();
    }
}

class ThreadB implements Runnable {

    private int i;

    @Override
    public void run() {
        while (i <= 10) {
            System.out.print("i = " + i + " ");
            i++;
        }
        System.out.println();
    }
}

class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());
        t1.start();
        t1.join(); // wait t1 to be finished
        t2.start();
        t2.join(); // in this program, this may be removed
    }
}

/**
 * 三、利用线程池，实现Callable接口
 */
class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
//创建两个有返回值的任务
        Callable c1 = new MyCallable("A");
        Callable c2 = new MyCallable("B");
//执行任务并获取Future对象
        Future f1 = pool.submit(c1);
        Future f2 = pool.submit(c2);
//从Future对象上获取任务的返回值，并输出到控制台
        System.out.println(">>>" + f1.get().toString());
        System.out.println(">>>" + f2.get().toString());
//关闭线程池
        pool.shutdown();
    }
}

class MyCallable implements Callable {
    private String oid;

    MyCallable(String oid) {
        this.oid = oid;
    }

    @Override
    public Object call() throws Exception {
        return oid + "任务返回的内容";
    }
}

