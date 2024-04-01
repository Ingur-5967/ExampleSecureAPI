package ru.solomka.secure.token;

import ru.solomka.jwt.config.ConfigurationImpl;
import ru.solomka.jwt.secure.SecureEntity;
import ru.solomka.jwt.secure.SecureManager;
import ru.solomka.secure.Main;

import java.util.Map;

public class GenerateJwtToken {

    public static void generateToken() {
        ConfigurationImpl configuration = new ConfigurationImpl(Main.class);

        String parameter = String.valueOf(configuration.getValue("application.properties", "jwt.secret"));

        SecureManager secureManager = new SecureManager(parameter);

        String key = secureManager.generateSecureKey(new SecureEntity() {
            @Override
            public String getId() {
                return "TestId";
            }

            @Override
            public Map<String, Object> getParameters() {
                return Map.of("name", "Plotter", "email", "Plotter@mail.ru");
            }
        }, 900000);

        // ...
    }
}