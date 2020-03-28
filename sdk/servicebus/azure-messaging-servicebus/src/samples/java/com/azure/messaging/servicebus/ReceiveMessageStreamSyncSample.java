// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.util.IterableStream;

import java.time.Duration;

/**
 * Sample demonstrates how to receive a stream of {@link ServiceBusReceivedMessage} from an Azure Service Bus Queue
 * using sync client.
 */
public class ReceiveMessageStreamSyncSample {
    /**
     * Main method to invoke this demo on how to receive a stream of {@link ServiceBusMessage} from an
     * Azure Service Bus Queue.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {

        // The connection string value can be obtained by:
        // 1. Going to your Service Bus namespace in Azure Portal.
        // 2. Go to "Shared access policies"
        // 3. Copy the connection string for the "RootManageSharedAccessKey" policy.
        String connectionString = System.getenv("AZURE_SERVICEBUS_CONNECTION_STRING");

        // Create a receiver.
        // "<<fully-qualified-namespace>>" will look similar to "{your-namespace}.servicebus.windows.net"
        // "<<queue-name>>" will be the name of the Service Bus queue instance you created
        // inside the Service Bus namespace.

        ServiceBusReceiverClient receiverClient = new ServiceBusClientBuilder()
            .connectionString(connectionString)
            .buildReceiverClientBuilder()
            .queueName("<<queue-name>>")
            .maxAutoLockRenewalDuration(Duration.ofSeconds(2))
            .buildClient();

        final IterableStream<ServiceBusReceivedMessage> receivedMessages =  receiverClient.receive(5);

        receivedMessages.stream().forEach(message -> {
            System.out.println("Received Message Id:" + message.getMessageId());
            System.out.println("Received Message:" + new String(message.getBody()));
        });

        // Close the receiver.
        receiverClient.close();
    }
}
