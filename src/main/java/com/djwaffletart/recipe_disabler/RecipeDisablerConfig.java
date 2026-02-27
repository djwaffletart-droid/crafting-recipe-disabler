package com.djwaffletart.recipe_disabler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecipeDisablerConfig {
    private static final String CONFIG_FILE_PATH = "config/recipe_disabler_config.json";
    private final Map<String, Object> config;
    private static final Logger LOGGER = Logger.getLogger(RecipeDisablerConfig.class.getName());

    public RecipeDisablerConfig() {
        config = new HashMap<>();
        loadConfig();
    }

    private void loadConfig() {
        File configFile = new File(CONFIG_FILE_PATH);
        if (!configFile.exists()) {
            LOGGER.log(Level.WARNING, "Config file not found: " + CONFIG_FILE_PATH);
            return;
        }
        try {
            String content = new String(Files.readAllBytes(Paths.get(CONFIG_FILE_PATH)));
            // Assume JSON library is used for parsing
            config.putAll(parseJson(content));
            LOGGER.log(Level.INFO, "Config loaded successfully.");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error loading config file: " + e.getMessage(), e);
        }
    }

    private Map<String, Object> parseJson(String content) {
        // Implement JSON parsing using your preferred library (Jackson, Gson, etc.)
        return new HashMap<>(); // Placeholder for parsed data
    }

    public Object getConfigValue(String key) {
        return config.getOrDefault(key, null);
    }

    public void setConfigValue(String key, Object value) {
        config.put(key, value);
        // Logic to save changes back to config file could be added here
    }
}