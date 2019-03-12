// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.impl;

import org.apache.qpid.proton.amqp.Symbol;

public final class AmqpErrorCode {

    public static final Symbol NOT_FOUND = Symbol.getSymbol("amqp:not-found");
    public static final Symbol UNAUTHORIZED_ACCESS = Symbol.getSymbol("amqp:unauthorized-access");
    public static final Symbol RESOURCE_LIMIT_EXCEEDED = Symbol.getSymbol("amqp:resource-limit-exceeded");
    public static final Symbol NOT_ALLOWED = Symbol.getSymbol("amqp:not-allowed");
    public static final Symbol INTERNAL_ERROR = Symbol.getSymbol("amqp:internal-error");
    public static final Symbol ILLEGAL_STATE = Symbol.getSymbol("amqp:illegal-state");
    public static final Symbol NOT_IMPLEMENTED = Symbol.getSymbol("amqp:not-implemented");

    // link errors
    public static final Symbol STOLEN = Symbol.getSymbol("amqp:link:stolen");
    public static final Symbol PAYLOAD_SIZE_EXCEEDED = Symbol.getSymbol("amqp:link:message-size-exceeded");
    public static final Symbol AMQP_LINK_DETACH_FORCED = Symbol.getSymbol("amqp:link:detach-forced");

    // connection errors
    public static final Symbol CONNECTION_FORCED = Symbol.getSymbol("amqp:connection:forced");

    // proton library introduced this amqpsymbol in their code-base to communicate IOExceptions
    // while performing operations on SocketChannel (in IOHandler.java)
    public static final Symbol PROTON_IO_ERROR = Symbol.getSymbol("proton:io");
}
