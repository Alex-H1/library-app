import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public final static Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args)throws IOException, SQLException {
        log.info("this");
        log.info("is");
        log.info("a");
        log.info("test");

    }
}
