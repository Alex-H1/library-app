package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultiThreadRun implements Runnable {
    public final static Logger LOG = LogManager.getLogger(multithreads.MultiThreadRun.class);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            LOG.info(i);
            LOG.info("Running Task" + Thread.currentThread().getName());
            LOG.info("Task Complete" + Thread.currentThread().getName());

        }
    }
}
