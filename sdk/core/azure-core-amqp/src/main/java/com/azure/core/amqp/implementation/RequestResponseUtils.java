// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpResponseCode;
import org.apache.qpid.proton.message.Message;

import java.util.Map;

/**
 * This consists of various utilities needed to manage Request/Response channel.
 */
public class RequestResponseUtils {
    public static final AmqpResponseCode UNDEFINED_STATUS_CODE = AmqpResponseCode.UNUSED;
    public static final String UNDEFINED_STATUS_DESCRIPTION = "";
    public static final AmqpErrorCondition UNDEFINED_ERROR_CONDITION = AmqpErrorCondition.INTERNAL_ERROR;

    private static final String STATUS_CODE = "statusCode";
    private static final String STATUS_DESCRIPTION = "statusDescription";
    private static final String ERROR_CONDITION = "errorCondition";

    private static final String LEGACY_STATUS_CODE = "status-code";
    private static final String LEGACY_STATUS_DESCRIPTION = "status-description";
    private static final String LEGACY_ERROR_CONDITION = "error-condition";

    public static boolean isSuccessful(Message message) {
        final AmqpResponseCode statusCode = getStatusCode(message);
        return statusCode == AmqpResponseCode.OK || statusCode == AmqpResponseCode.ACCEPTED;
    }

    /**
     * Gets the {@link AmqpResponseCode} from RequestResponse messages.
     *
     * @param message Response from management channel.
     *
     * @return The status code or {@link AmqpResponseCode#UNUSED} if there is no status code.
     */
    public static AmqpResponseCode getStatusCode(Message message) {
        final Map<String, Object> properties = message.getApplicationProperties().getValue();
        if (properties == null) {
            return UNDEFINED_STATUS_CODE;
        }

        final int value;
        if (properties.containsKey(STATUS_CODE)) {
            value = (int) properties.get(STATUS_CODE);
        } else if (properties.containsKey(LEGACY_STATUS_CODE)) {
            value = (int) properties.get(LEGACY_STATUS_CODE);
        } else {
            return UNDEFINED_STATUS_CODE;
        }

        AmqpResponseCode statusCode = AmqpResponseCode.fromValue(value);
        return statusCode != null ? statusCode : UNDEFINED_STATUS_CODE;
    }

    /**
     * Gets the status description from a RequestResponse message.
     *
     * @param message Message to extract status description from.
     *
     * @return The status message, or an empty string if it does not contain one.
     */
    public static String getStatusDescription(Message message) {
        final Map<String, Object> properties = message.getApplicationProperties().getValue();

        if (properties == null) {
            return UNDEFINED_STATUS_DESCRIPTION;
        } else if (properties.containsKey(STATUS_DESCRIPTION)) {
            return String.valueOf(properties.get(STATUS_DESCRIPTION));
        } else if (properties.containsKey(LEGACY_STATUS_DESCRIPTION)) {
            return String.valueOf(properties.get(LEGACY_STATUS_DESCRIPTION));
        } else {
            return UNDEFINED_STATUS_DESCRIPTION;
        }
    }

    /**
     * Gets the error condition of a RequestResponse message.
     *
     * @param message AMQP message to extract error condition from.
     *
     * @return The corresponding error condition or {@link #UNDEFINED_ERROR_CONDITION} if none can be found or there is
     *     no matching condition.
     */
    public static AmqpErrorCondition getErrorCondition(Message message) {
        final Map<String, Object> properties = message.getApplicationProperties().getValue();
        if (properties == null) {
            return UNDEFINED_ERROR_CONDITION;
        }

        final String value;
        if (properties.containsKey(ERROR_CONDITION)) {
            value = (String) properties.get(ERROR_CONDITION);
        } else if (properties.containsKey(LEGACY_ERROR_CONDITION)) {
            value = (String) properties.get(LEGACY_ERROR_CONDITION);
        } else {
            return UNDEFINED_ERROR_CONDITION;
        }

        final AmqpErrorCondition returned = AmqpErrorCondition.fromString(value);
        return returned != null ? returned : UNDEFINED_ERROR_CONDITION;
    }
}
