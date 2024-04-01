package ru.solomka.secure.token;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import ru.solomka.jwt.config.ConfigurationImpl;
import ru.solomka.jwt.secure.SecureManager;
import ru.solomka.secure.Main;

import java.util.Optional;

public class ValidateJwtToken {

    public static void validateKey() {
        ConfigurationImpl configuration = new ConfigurationImpl(Main.class);
        String parameter = String.valueOf(configuration.getValue("application.properties", "jwt.secret"));

        SecureManager secureManager = new SecureManager(parameter);

        Optional<Jws<Claims>> claims = secureManager.validator().validateKey("joined_jwt_token");

        // ...
    }
}