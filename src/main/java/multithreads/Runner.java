package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;

public class Runner {
    public final static Logger LOG = LogManager.getLogger(Runner.class);
    static final String resource1 = "resource1";

    static final String resource2 = "resource2";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            MultiThreadRun thread = new MultiThreadRun();
//            thread.run();
//            Thread thread1 = new Thread(thread);
//            thread1.start();
//        }

        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor pool = (ThreadPoolExecutor) fixedPool;

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
        DeadLock1 deadLock1 = new DeadLock1();
        DeadLock2 deadLock2 = new DeadLock2();

        deadLock1.start();
        deadLock2.start();

    }

    public static class DeadLock1 extends Thread {
        public void run() {
            synchronized (resource1) {
                LOG.info(resource1 + " :locked");
                try {
                    Thread.sleep(3000);
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

    public static class DeadLock2 extends Thread {
        public void run() {
            synchronized (resource2) {
                LOG.info(resource2 + " :locked");
                try {
                    Thread.sleep(3000);
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

