// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue;

/**
 * Determines how queue message body is represented in HTTP requests and responses.
 */
public enum QueueMessageEncoding {
    /**
     * The queue message body is represented verbatim in HTTP requests and responses. I.e. message is not transformed.
     */
    NONE,

    /**
     * The queue message body is represented as Base64 encoded string in HTTP requests and responses.
     * <p>
     * This was the default behavior in the prior v8 and v11 library.
     * Using this option can make interop with an existing application easier.
     */
    BASE64
}
