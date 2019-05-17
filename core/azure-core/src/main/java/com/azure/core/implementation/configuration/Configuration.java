// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.configuration;

import com.azure.core.implementation.logging.ServiceLogger;
import com.azure.core.implementation.util.ImplUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Contains configuration information that is used during construction of client libraries.
 */
public class Configuration {

    /**
     * Noop Configuration object used to opt out of using global configurations when constructing client libraries.
     */
    public static final Configuration NONE = new NoopConfiguration();

    private static final String LOADED_FROM_RUNTIME = "Found configuration {} in the runtime parameters.";
    private static final String LOADED_FROM_ENVIRONMENT = "Found configuration {} in the environment variables.";

    private final ServiceLogger logger = new ServiceLogger(Configuration.class);

    private Map<String, String> configurations = new HashMap<>();

    public Configuration() {
    }

    private Configuration(Map<String, String> configurations) {
        this.configurations = new HashMap<>(configurations);
    }

    /**
     * Gets the value of the configuration.
     *
     * @param name Name of the configuration.
     * @return Value of the configuration if found, otherwise null.
     */
    public String get(String name) {
        return configurations.get(name);
    }

    /**
     * Gets the value of the configuration converted to {@code T}.
     *
     * If no configuration is found the default is returned.
     *
     * @param name Name of the configuration.
     * @param defaultValue Value to return if the configuration isn't found.
     * @param <T> Generic type that the configuration is converted to if found.
     * @return The converted configuration if found, otherwise the default value is returned.
     */
    public <T> T get(String name, T defaultValue) {
        return convertOrDefault(get(name), defaultValue);
    }

    /**
     * Gets the converted value of the configuration.
     *
     * @param name Name of the configuration.
     * @param converter Converter used to map the configuration to {@code T}.
     * @param <T> Generic type that the configuration is converted to if found.
     * @return The converted configuration if found, otherwise null.
     */
    public <T> T get(String name, Function<String, T> converter) {
        String value = get(name);
        if (ImplUtils.isNullOrEmpty(value)) {
            return null;
        }

        return converter.apply(value);
    }

    /**
     * Attempts to get the value of the configuration from the configuration store, if the value isn't found then it
     * attempts to load it from the runtime parameters then the environment variables.
     *
     * If no configuration is found null is returned.
     *
     * @param name Name of the configuration.
     * @return The configuration value from either the configuration store, runtime parameters, or environment
     * variable, in that order, if found, otherwise null.
     */
    public String getOrLoad(String name) {
        if (configurations.containsKey(name)) {
            return configurations.get(name);
        }

        return load(name).get(name);
    }

    /**
     * Attempts to load the configuration from the environment.
     *
     * The runtime parameters are checked first followed by the environment variables. If the configuration is found
     * the value is loaded into the configuration store and if a configuration with the same name already exists this
     * will update it to the loaded value.
     *
     * @param name Name of the configuration.
     * @return the updated Configuration object.
     */
    public Configuration load(String name) {
        if (loadFrom(name, System::getProperty, LOADED_FROM_RUNTIME)) {
            return this;
        } else if (loadFrom(name, System::getenv, LOADED_FROM_ENVIRONMENT)) {
            return this;
        } else {
            return this;
        }
    }

    /**
     * Adds a configuration with the given value.
     *
     * If a configuration with the same name already exists this will update it to the passed value.
     *
     * @param name Name of the configuration.
     * @param value Value of the configuration.
     * @return the updated Configuration object.
     */
    public Configuration put(String name, String value) {
        configurations.put(name, value);
        return this;
    }

    /**
     * Removes the configuration.
     *
     * @param name Name of the configuration.
     * @return If the configuration was removed the value of it, otherwise null.
     */
    public String remove(String name) {
        return configurations.remove(name);
    }

    /**
     * Determines if the configuration exists.
     *
     * @param name Name of the configuration.
     * @return True if the configuration exists, otherwise false.
     */
    public boolean contains(String name) {
        return configurations.containsKey(name);
    }

    /**
     * @return a clone of the Configuration object.
     */
    @SuppressWarnings("CloneDoesntCallSuperClone")
    public Configuration clone() {
        return new Configuration(configurations);
    }

    /**
     * Attempts to convert the configuration value to {@code T}.
     *
     * If the value is null or empty then the default value is returned.
     *
     * @param value Configuration value retrieved from the map.
     * @param defaultValue Default value to return if the configuration value is null or empty.
     * @param <T> Generic type that the value is converted to if not null or empty.
     * @return The converted configuration, if null or empty the default value.
     */
    @SuppressWarnings("unchecked")
    private <T> T convertOrDefault(String value, T defaultValue) {
        // Value is null or empty, return the default.
        if (ImplUtils.isNullOrEmpty(value)) {
            return defaultValue;
        }

        // Check the default value's type to determine how it needs to be converted.
        Object convertedValue;
        if (defaultValue instanceof Byte) {
            convertedValue = Byte.parseByte(value);
        } else if (defaultValue instanceof Short) {
            convertedValue = Short.parseShort(value);
        } else if (defaultValue instanceof Integer) {
            convertedValue = Integer.parseInt(value);
        } else if (defaultValue instanceof Long) {
            convertedValue = Long.parseLong(value);
        } else if (defaultValue instanceof Float) {
            convertedValue = Float.parseFloat(value);
        } else if (defaultValue instanceof Double) {
            convertedValue = Double.parseDouble(value);
        } else if (defaultValue instanceof Boolean) {
            convertedValue = Boolean.parseBoolean(value);
        } else {
            convertedValue = value;
        }

        return (T) convertedValue;
    }

    /**
     * Attempts to load the configuration using the passed loader. If the configuration is found it will be added to
     * the configuration store and a message will be logged.
     *
     * @param name Name of the configuration.
     * @param loader Loading function to apply.
     * @param logMessage Message to log if the configuration is found.
     * @return True if the configuration was loaded, false otherwise.
     */
    private boolean loadFrom(String name, Function<String, String> loader, String logMessage) {
        String value = loader.apply(name);
        if (!ImplUtils.isNullOrEmpty(value)) {
            configurations.put(name, value);
            logger.asInformational().log(logMessage, name);
            return true;
        }

        return false;
    }

    /*
     * Noop Configuration used to opt out of using global configurations when constructing client libraries.
     */
    private static class NoopConfiguration extends Configuration {
        @Override
        public String get(String name) {
            return null;
        }

        @Override
        public <T> T get(String name, T defaultValue) {
            return null;
        }

        @Override
        public <T> T get(String name, Function<String, T> converter) {
            return null;
        }

        @Override
        public String getOrLoad(String name) {
            return null;
        }

        @Override
        public Configuration load(String name) {
            return this;
        }

        @Override
        public Configuration put(String name, String value) {
            return this;
        }

        @Override
        public String remove(String name) {
            return null;
        }

        @Override
        public boolean contains(String name) {
            return false;
        }
    }
}
