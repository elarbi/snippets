package vertx;

import io.vertx.core.Vertx;

/**
 * Created by elarbiaboussoror on 05/01/2017.
 */
public class VertxApp {
    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new FirstVerticle());

    }
}
