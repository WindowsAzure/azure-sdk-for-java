// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.amqp.exception;

import com.azure.core.implementation.util.ImplUtils;

import java.io.Serializable;
import java.util.Locale;

/**
 * Provides context for an {@link AmqpException}.
 *
 * @see AmqpException
 */
public class ErrorContext implements Serializable {
    private final String namespaceName;

    public ErrorContext(final String namespaceName) {
        if (ImplUtils.isNullOrEmpty(namespaceName)) {
            throw new IllegalArgumentException("'namespaceName' cannot be null or empty");
        }

        this.namespaceName = namespaceName;
    }

    /**
     * Gets the
     * @return
     */
    public String namespaceName() {
        return namespaceName;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "NS: %s", this.namespaceName);
    }
}
