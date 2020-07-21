package com.azure.messaging.servicebus.perf.core;

import com.azure.perf.test.core.PerfStressOptions;
import com.beust.jcommander.Parameter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Represents the command line configurable options for a performance test.
 */
@JsonPropertyOrder(alphabetic = true)
public class ServiceBusStressOptions extends PerfStressOptions {

    @Parameter(names = { "-mr", "--maxReceive" }, description = "MaxrReceive messages")
    private int messagesToReceive = 10;

    @Parameter(names = { "-ms", "--messageSend" }, description = "Messages to send")
    private int getMessagesToSend = 10;
}
