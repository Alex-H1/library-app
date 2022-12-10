package helper;

import java.util.Random;

public class RanodomNumGen {
    public final static int randomNumGen() {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        return rand.nextInt(upperbound);
    }
}
