package my.java.snippets.concurrency;

/**
 * Created by elarbiaboussoror on 24/03/2017.
 */
public class ThreadExperiments2 {


    private static Object s = new Object();
    private static int count = 0;

    public static void main(String[] argv) {
        for (; ; ) {
            new Thread(new Runnable() {
                public void run() {
                    synchronized (s) {
                        count += 1;
                        //System.err.println("New thread #" + count);
                    }
                    for (; ; ) {
                        try {
                            Thread.sleep(100000);
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            }).start();
        }
    }
}


