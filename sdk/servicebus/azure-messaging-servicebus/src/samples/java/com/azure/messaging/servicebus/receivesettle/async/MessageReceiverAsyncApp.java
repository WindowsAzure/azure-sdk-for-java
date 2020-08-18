package com.azure.messaging.servicebus.receivesettle.async;

import com.azure.core.util.IterableStream;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient;
import com.azure.messaging.servicebus.receivesettle.sync.MessageReceiverSyncApp;

import java.time.Duration;

/**
 * Sample Application that uses async API to receive and settle messages.
 */
public class MessageReceiverAsyncApp {
    private final ServiceBusReceiverAsyncClient receiverClient;
    private final MessageReceiverAsyncWorker messageReceiverWorker;

    public MessageReceiverAsyncApp(ServiceBusReceiverAsyncClient receiverClient, MessageReceiverAsyncWorker messageReceiverWorker) {
        this.receiverClient = receiverClient;
        this.messageReceiverWorker = messageReceiverWorker;
    }

    /**
     * Receive messages and process them one by one.
     */
    public void processMessageOneByOne() {
        receiverClient.receiveMessages().flatMap(messageReceiverWorker::processMessageOneByOne).blockLast();
    }

    /**
     * Receive messages and process them in batches.
     */
    public void processMessageInBatch() {
        receiverClient.receiveMessages().bufferTimeout(5, Duration.ofSeconds(2)).map(IterableStream::of).flatMap(messageReceiverWorker::processMessageInBatch).blockLast();
    }

    public static void main(String[] args) {
        ClientLogger logger = new ClientLogger(MessageReceiverSyncApp.class);
        logger.info("Start of MessageReceiverAsyncApp");
        String serviceBusConnectionString = System.getenv("SERVICE_BUS_CONNECTION_STR");
        String queueName = System.getenv("SERVICE_BUS_QUEUE_NAME");

        ServiceBusReceiverAsyncClient receiverClient = new ServiceBusClientBuilder()
            .connectionString(serviceBusConnectionString)
            .receiver()
            .queueName(queueName)
            .buildAsyncClient();
        OrderAsyncService orderService = new OrderAsyncService();
        MessageReceiverAsyncWorker messageReceiverSyncWorker = new MessageReceiverAsyncWorker(receiverClient, orderService);
        MessageReceiverAsyncApp app = new MessageReceiverAsyncApp(receiverClient, messageReceiverSyncWorker);
        try (receiverClient) {
            app.processMessageOneByOne();
            //app.processMessageInBatch();
        }
        logger.info("End of MessageReceiverAsyncApp");
    }
}
