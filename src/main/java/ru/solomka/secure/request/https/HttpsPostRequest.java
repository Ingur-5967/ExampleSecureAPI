package ru.solomka.secure.request.https;

import ru.solomka.jwt.server.ServerConnection;
import ru.solomka.jwt.server.ServerHandler;

public class HttpsPostRequest {

    public static void POST() {
        ServerConnection serverConnection = new ServerConnection("https://localhost:8080/.../...");
        ServerHandler serverHandler = new ServerHandler(serverConnection);

        serverHandler.https("your_ssl_path").sendWithSecure("any_value");
    }
}