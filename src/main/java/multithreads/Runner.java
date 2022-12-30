package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;

public class Runner {
    public final static Logger LOG = LogManager.getLogger(Runner.class);

    static final String resource2 = "resource2";
    static final String resource1 = "resource1";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            MultiThreadRun thread = new MultiThreadRun();
//            thread.run();
//            Thread thread1 = new Thread(thread);
//            thread1.start();
//        }
//
//        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
//        ThreadPoolExecutor pool = (ThreadPoolExecutor) fixedPool;
//
//        LOG.info("Core threads: " + ((ThreadPoolExecutor) fixedPool).getCorePoolSize());
//        LOG.info("Max pool size: " + ((ThreadPoolExecutor) fixedPool).getMaximumPoolSize());
//        LOG.info("Total task count: " + ((ThreadPoolExecutor) fixedPool).getTaskCount());
//        for (int i = 0; i <= 7; i++) {
//            fixedPool.submit(new MultiThreadRun());
//        }
//        LOG.info("Core threads: " + ((ThreadPoolExecutor) fixedPool).getCorePoolSize());
//        LOG.info("Max pool size: " + ((ThreadPoolExecutor) fixedPool).getMaximumPoolSize());
//        LOG.info("Total task count: " + ((ThreadPoolExecutor) fixedPool).getTaskCount());
//        pool.shutdown();
//
//        CompletableFuture<Void> future = CompletableFuture.runAsync(new MultiThreadRun());
//        future.get();

        // threadLocks
        Threadlock1 threadlock1 = new Threadlock1();
        Threadlock2 threadlock2 = new Threadlock2();

        threadlock1.start();
        threadlock2.start();

    }

    public static class Threadlock1 extends Thread {
        public void run() {
            synchronized (resource1) {
                LOG.info(resource1 + " :locked");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    LOG.error(e);
                }
            }
            LOG.info(resource1 + " : waiting for " + resource2);
            synchronized (resource2) {
                LOG.info(resource2 + ": locked");
            }
        }
    }

    public static class Threadlock2 extends Thread {
        public void run() {
            synchronized (resource2) {
                LOG.info(resource2 + " :locked");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    LOG.error(e);
                }
            }
            LOG.info(resource2 + " : waiting for " + resource1);
            synchronized (resource1) {
                LOG.info(resource1 + ": locked");
            }
        }

    }
}
//
//
//class Runner {
//    static final String resource1= "Printer";
//    static final String resource2= "Scanner";
//    public static void main(String[] args) {
//        ThreadDemo1 Thread1 = new ThreadDemo1();
//        ThreadDemo2 Thread2 = new ThreadDemo2();
//        Thread1.start();
//        Thread2.start();
//    }
//    private static class ThreadDemo1 extends Thread {
//        public void run() {
//            synchronized (resource1) {
//                System.out.println("Desktop "+ ": locked" + resource1);
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                }
//            }
//            System.out.println("Desktop " + ": waiting for" + resource2+"......");
//            synchronized (resource2) {
//                System.out.println("Desktop "+ ": locked" + resource2);
//            }
//        }
//    }
//    private static class ThreadDemo2 extends Thread {
//        public void run() {
//            synchronized (resource2) {
//                System.out.println("Laptop "+": locked" + resource2);
//                try {
//                    Thread.sleep(100);
//                } catch (Exception e) {
//                }
//            }
//            System.out.println("Laptop " + ": waiting for" + resource1+"......");
//            synchronized (resource1) {
//                System.out.println("Laptop "+ ": locked" + resource1);
//            }
//        }
//    }
//}