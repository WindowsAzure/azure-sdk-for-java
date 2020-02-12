// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.annotation.Fluent;

/**
 * The set of options that can be specified when creating an TODO.
 *

 */
@Fluent
public class CreateBatchOptions {
    private int maximumSizeInBytes;

    /**
     * Sets the maximum size for the TODO, in bytes.
     *
     * @param maximumSizeInBytes The maximum size to allow for the TODO.
     *
     * @return The updated {@link CreateBatchOptions} object.
     */
    public CreateBatchOptions setMaximumSizeInBytes(int maximumSizeInBytes) {
        this.maximumSizeInBytes = maximumSizeInBytes;
        return this;
    }

    /**
     * Gets the maximum size to allow for the batch of events, in bytes.
     *
     * @return The maximum size to allow for a single batch of events, in bytes.
     */
    public int getMaximumSizeInBytes() {
        return maximumSizeInBytes;
    }


}
