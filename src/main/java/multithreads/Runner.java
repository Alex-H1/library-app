package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;

public class Runner {
    public final static Logger LOG = LogManager.getLogger(Runner.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            MultiThreadRun thread = new MultiThreadRun();
////            thread.start();
//            Thread thread1 = new Thread(thread);
//            thread1.start();
//        }

//        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
//        ThreadPoolExecutor pool = (ThreadPoolExecutor) fixedPool;
//
//        LOG.info("Core threads: " + ((ThreadPoolExecutor) fixedPool).getCorePoolSize());
//        LOG.info("Max pool size: " + ((ThreadPoolExecutor) fixedPool).getMaximumPoolSize());
//        LOG.info("Total task count: " + ((ThreadPoolExecutor) fixedPool).getTaskCount());
//        for(int i = 0; i <= 7; i++){
//            fixedPool.submit(new MultiThreadRun());
//        }
//        LOG.info("Core threads: " + ((ThreadPoolExecutor) fixedPool).getCorePoolSize());
//        LOG.info("Max pool size: " + ((ThreadPoolExecutor) fixedPool).getMaximumPoolSize());
//        LOG.info("Total task count: " + ((ThreadPoolExecutor) fixedPool).getTaskCount());
//        pool.shutdown();

        CompletableFuture<Void> future = CompletableFuture.runAsync(new MultiThreadRun());
        future.get();
    }
}


