package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class MultiThreadRun implements Runnable {
    public final static Logger LOG = LogManager.getLogger(multithreads.MultiThreadRun.class);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                LOG.info("Running Task" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep((long) i * 1000);
                LOG.info("Task Complete" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                LOG.error(e);
            }
            LOG.info(i);
        }
    }
}
