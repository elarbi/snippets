package my.java.snippets.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * Created by elarbiaboussoror on 19/04/2017.
 */
public class ExecutorExample {


    public static void main(String[] args) {

        List<Future<String>> futures = null;
        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return doSomeWork();
            }


        };
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(callable);
        callables.add(callable);
        callables.add(callable);
        callables.add(callable);
        try {
            futures = executorService.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("elapsedTime: " + elapsedTime);

        futures.stream().forEach(f -> {

            try {
                System.out.println(f.get());

            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    private static String doSomeWork() {
        return UUID.randomUUID().toString();
    }
}