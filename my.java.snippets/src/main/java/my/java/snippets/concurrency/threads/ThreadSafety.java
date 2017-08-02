package my.java.snippets.concurrency.threads;

public class ThreadSafety {

    /**
     * Local variable per thread.
     * i.e. not shared. Every thread has its one copy
     */
    ThreadLocal<Integer> localInteger = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 2;
        }
    };
    /**
     * Shared variable btw threads !
     * No thread-safety
     */
    int counter = 0;


    public ThreadLocal<Integer> getLocalInteger() {
        return localInteger;
    }



    public void next() {
        ++counter;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafety threadSafety = new ThreadSafety();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {

                    long id = Thread.currentThread().getId();

                    threadSafety.next();
                    threadSafety.incrementThreadLocalInt();
                    System.out.println("thread id :" + id + " counter : " + threadSafety.getCounter()
                            + "thread local: " + threadSafety.getLocalInteger().get());
                    Thread.sleep(100);
                    System.out.println("thread id :" + id + " counter : " + threadSafety.getCounter()
                            + "thread local: " + threadSafety.getLocalInteger().get());

                } catch (InterruptedException e) {


                }
            }
        };

        for (int i = 0; i < 100; i++) {
            new Thread(task, "myThread").start();

        }
    }

    private void incrementThreadLocalInt() {
        Integer actual = getLocalInteger().get();
        getLocalInteger().set(++actual);
    }
}
