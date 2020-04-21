// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class RestErrorCodeStrings {

    private static Properties errorStrings;

    static final String ERROR_STRINGS_FILE_NAME = "kvErrorStrings.properties";

    /**
     * The property name of Azure Key Vault Credentials required error string.
     */
    static final String CREDENTIAL_REQUIRED = "credential_required";

    /**
     * Gets the error String for the specified property.
     *
     * @param propertyName the property name for which error string is required.
     * @return The {@link String value} containing the error message.
     */
    static String getErrorString(String propertyName) {
        loadProperties();
        return errorStrings.getProperty(propertyName);
    }

    private static synchronized void loadProperties() {
        if (errorStrings == null) {
            try (InputStream fileInputStream =
                    RestErrorCodeStrings.class.getClassLoader().getResource((ERROR_STRINGS_FILE_NAME)).openStream()) {
                errorStrings = new Properties();
                errorStrings.load(fileInputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


