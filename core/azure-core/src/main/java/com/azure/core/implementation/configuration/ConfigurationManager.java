// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.configuration;

import com.azure.core.implementation.util.ImplUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Manages the retrieving configuration values.
 */
public final class ConfigurationManager {
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationManager.class);
    private static List<? extends ConfigurationGetter> getters;

    static {
        ConfigurationManager.getters = Arrays.asList(
            new RuntimeConfigurationGetter(),
            new ConfigurationStoreConfigurationGetter(),
            new EnvironmentConfigurationGetter());
    }

    /**
     * Sets where the configurations are search for and in which order. The {@code ConfigurationManager} uses the
     * {@link ConfigurationGetter ConfigurationGetters} in sequential order.
     * @param getters List of {@code ConfigurationGetter ConfigurationGetters} that the manager uses to search for
     *                configuration values.
     */
    public static void setConfigurationGetters(List<? extends ConfigurationGetter> getters) {
        ConfigurationManager.getters = getters;
    }

    /**
     * Retrieves the configuration from the environment variables.
     * @param configuration Environment variable to retrieve.
     * @return If found the environment variable configuration, otherwise null;
     */
    public static String getConfiguration(EnvironmentConfigurations configuration) {
        return System.getenv(getConfigurationName(configuration));
    }

    /**
     * Retrieves the configuration using the {@link ConfigurationGetter configuration getters}.
     *
     * The default search order used is the following.
     * <ol>
     *     <li>{@link RuntimeConfigurationGetter}</li>
     *     <li>{@link ConfigurationStoreConfigurationGetter}</li>
     *     <li>{@link EnvironmentConfigurationGetter}</li>
     * </ol>
     *
     * Switch the search using {@link ConfigurationManager#setConfigurationGetters(List) setConfigurationGetters}.
     * @param configurationName Name of the configuration being retrieved.
     * @return The configuration value from the first place it was found, if not found null.
     */
    public static String getConfiguration(String configurationName) {
        for (ConfigurationGetter getter : getters) {
            String configurationValue = getter.getConfiguration(configurationName);
            if (!ImplUtils.isNullOrEmpty(configurationValue)) {
                if (getter.isLogWorthy()) {
                    logger.info(getter.logMessage(configurationName));
                }

                return configurationValue;
            }
        }

        return null;
    }

    private static String getConfigurationName(EnvironmentConfigurations configuration) {
        return configuration.toString().toUpperCase(Locale.US);
    }
}
