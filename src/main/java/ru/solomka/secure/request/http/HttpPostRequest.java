package ru.solomka.secure.request.http;

import ru.solomka.jwt.server.ServerConnection;
import ru.solomka.jwt.server.ServerHandler;

public class HttpPostRequest {

    public static void POST() {
        ServerConnection serverConnection = new ServerConnection("http://localhost:8080/.../...");
        ServerHandler serverHandler = new ServerHandler(serverConnection);

        serverHandler.http().sendWithBody("any_value");
    }
}