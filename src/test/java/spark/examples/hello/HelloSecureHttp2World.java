package spark.examples.hello;

import static spark.Spark.get;
import static spark.Spark.http2;
import static spark.Spark.port;
import static spark.Spark.secure;

import com.google.gson.Gson;

import spark.util.SparkTestUtil;

public class HelloSecureHttp2World {

    public static void main(String[] args) {
        secure(SparkTestUtil.getKeyStoreLocation(), SparkTestUtil.getKeystorePassword(), null, null);
        http2();
        port(5000);
        get("/httptwo", (request, response) -> {
            System.out.println("Hier1");
            return new Gson().toJson("a");
        });

    }
    
}
