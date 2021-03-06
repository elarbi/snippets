import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import vertx.FirstVerticle;

/**
 * Created by elarbiaboussoror on 05/01/2017.
 */
@RunWith(VertxUnitRunner.class)
public class MyFirstVerticleTest {

    private Vertx vertx;

    @Before
    public void setUp(TestContext context) {
        vertx = Vertx.vertx();

        vertx.deployVerticle(FirstVerticle.class.getName(),
                //make the test fails if the verticle does not start
                context.asyncAssertSuccess());
    }

    @After
    public void tearDown(TestContext context) {
        vertx.close(context.asyncAssertSuccess());
    }

    @Test
    public void testMyApp(TestContext context) {
        final Async async = context.async();

        vertx.createHttpClient().getNow(8888, "localhost", "/", response ->
                {
                    response.handler(body -> {
                                context.assertTrue(body.toString().contains("Hello"));
                                async.complete();
                            }
                    );

                }
        );

    }
}
