package ru.solomka.secure.request.https;

import ru.solomka.jwt.server.ServerConnection;
import ru.solomka.jwt.server.ServerHandler;

import java.util.Optional;

public class HttpsGetRequest {

    public static void GET() {
        ServerConnection serverConnection = new ServerConnection("https://localhost:8080/.../...");
        ServerHandler serverHandler = new ServerHandler(serverConnection);

        Optional<Object> answer = serverHandler.https("your_ssl_path").getWithSecure();

        // ...
    }

}
