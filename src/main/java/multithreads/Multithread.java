package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Multithread extends Thread {
    public final static Logger LOG = LogManager.getLogger(Multithread.class);

    @Override
    public void run(){
        for(int i = 0; i < 5; i ++){
            LOG.info(i);
        }
    }
}
