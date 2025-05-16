package com.example.app;

import java.util.logging.Logger;

public class UserService {

    // Crear un logger estático para la clase
    private static final Logger logger = Logger.getLogger(UserService.class.getName());

    public void processUser(String name) {
        if (name != null) {
            logger.info("User: " + name.toUpperCase()); // Usar logger en lugar de System.out
        } else {
            logger.warning("Nombre no puede ser null"); // Usar un nivel de log adecuado
        }
    }

    public void longMethod() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        total *= 4;
        logger.info("Total: " + total); // Usar logger en lugar de System.out
    }
}