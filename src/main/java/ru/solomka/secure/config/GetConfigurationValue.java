package ru.solomka.secure.config;

import ru.solomka.jwt.config.ConfigurationImpl;
import ru.solomka.secure.Main;

import java.util.Optional;

public class GetConfigurationValue {
    public static void get() {
        ConfigurationImpl configuration = new ConfigurationImpl(Main.class);

        String parameter = String.valueOf(configuration.getValue("application.properties", "jwt.secret"));

        // ...
    }
}