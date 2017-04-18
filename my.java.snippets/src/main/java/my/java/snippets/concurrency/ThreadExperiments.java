package my.java.snippets.concurrency;

/**
 * Created by elarbiaboussoror on 24/03/2017.
 */
public class ThreadExperiments {

    private static final int THREAD_NUMBER = 9000000;

    public static void main(String[] args) {
        //maximum number of threads supported for a JVM configuration
        int i = 0;
        while (i++ < THREAD_NUMBER) {

            Thread thread = new Thread("thread num: " + i);
            thread.start();
            //System.out.println("Created "+thread.getName());
        }

    }
}
