package org.acme.getting.started.getting.started;

import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.stomp.*;
import io.vertx.core.Vertx;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

//@Path("/server")
public class ServerStomp {

    @Inject
    Vertx vertx;

    Future<StompServer> server = StompServer.create(vertx)
            .handler(StompServerHandler.create(vertx))
            .listen(8080);

//    StompClient client = (StompClient) StompClient.create(vertx)
//            .connect()
//            .onSuccess(connection -> {
//                Map<String, String> headers = new HashMap<>();
//                headers.put("header1", "value1");
//                connection.send("/queue", headers, Buffer.buffer("Hello"));
//                // No headers:
//                connection.send("/queue", Buffer.buffer("World"));
//            })
//            .onFailure(err ->
//                    System.out.println(
//                            "Failed to connect to the STOMP server: " + err.toString()));


//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String get() {
//        return "text";
//}

}
