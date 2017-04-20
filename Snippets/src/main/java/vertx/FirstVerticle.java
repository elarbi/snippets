package vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Created by elarbiaboussoror on 04/01/2017.
 */
public class FirstVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> future) throws Exception {
        vertx.createHttpServer()
                .requestHandler(r -> r.response().end("<h1>Hello from my first " +
                        "Vert.x 3 application</h1>"))
                .listen(8888, result -> {
                    if (result.succeeded())
                        future.complete();
                    else
                        future.fail(result.cause());
                });

        vertx.setPeriodic(1000,
                r -> {System.out.println("ded");});
        return;
    }
}
