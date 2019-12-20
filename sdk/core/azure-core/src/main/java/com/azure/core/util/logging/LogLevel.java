// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.logging;

import com.azure.core.util.Configuration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/**
 * Enum which represent logging levels used in Azure SDKs.
 */
public enum LogLevel {
    /**
     * Indicates that log level is at verbose level.
     */
    VERBOSE(1, "1", "verbose", "debug"),

    /**
     * Indicates that log level is at information level.
     */
    INFORMATIONAL(2, "2", "info", "information", "informational"),

    /**
     * Indicates that log level is at warning level.
     */
    WARNING(3, "3", "warn", "warning"),

    /**
     * Indicates that log level is at error level.
     */
    ERROR(4, "4", "err", "error"),

    /**
     * Indicates that no log level is set.
     */
    NOT_SET(5);

    private final int numericValue;
    private final String[] allowedLogLevelVariables;
    private static final HashMap<String, LogLevel> LOG_LEVEL_STRING_MAPPER = new HashMap<>();

    static {
        for (LogLevel logLevel: LogLevel.values()) {
            for (String val: logLevel.allowedLogLevelVariables) {
                LOG_LEVEL_STRING_MAPPER.put(val, logLevel);
            }
        }
    }

    LogLevel(int numericValue, String... allowedLogLevelVariables) {
        this.numericValue = numericValue;
        this.allowedLogLevelVariables = allowedLogLevelVariables;
    }

    /**
     * Converts the log level into a numeric representation used for comparisons.
     *
     * @return The numeric representation of the log level.
     */
    public int getLogLevel() {
        return numericValue;
    }

    /**
     * Converts the passed log level string to the corresponding {@link LogLevel}.
     *
     * @param logLevelVal The log level value which needs to convert
     * @return The LogLevel Enum.
     * @throws IllegalArgumentException if the log level value is invalid.
     */
    public static LogLevel fromString(String logLevelVal) {
        // logLevelVal cannot be null
        Objects.requireNonNull(logLevelVal);

        String caseInsensitiveLogLevel = logLevelVal.toLowerCase(Locale.ROOT);
        if (!LOG_LEVEL_STRING_MAPPER.containsKey(caseInsensitiveLogLevel)) {
            throw new IllegalArgumentException("We currently do not support the log level you set. LogLevel: "
                + logLevelVal);
        }
        return LOG_LEVEL_STRING_MAPPER.get(caseInsensitiveLogLevel);
    }
}
