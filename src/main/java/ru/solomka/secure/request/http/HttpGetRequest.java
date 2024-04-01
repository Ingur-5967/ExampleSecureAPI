package ru.solomka.secure.request.http;

import ru.solomka.jwt.server.ServerConnection;
import ru.solomka.jwt.server.ServerHandler;

import java.util.Optional;

public class HttpGetRequest {

    public static void GET() {
        ServerConnection serverConnection = new ServerConnection("http://localhost:8080/.../...");
        ServerHandler serverHandler = new ServerHandler(serverConnection);

        Optional<Object> answer = serverHandler.http().getOfNullBody();

        // ...
    }
}