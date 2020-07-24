package com.azure.messaging.servicebus.perf;

import com.azure.messaging.servicebus.perf.core.ServiceBusStressOptions;
import com.azure.messaging.servicebus.perf.core.ServiceTest;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.Message;
import com.microsoft.azure.servicebus.ReceiveMode;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class ReceiveAndLockMessageTest extends ServiceTest<ServiceBusStressOptions> {

    public ReceiveAndLockMessageTest(ServiceBusStressOptions options) throws InterruptedException, ExecutionException, ServiceBusException {
        super(options, ReceiveMode.PEEKLOCK);
    }

    public Mono<Void> globalSetupAsync() {
        // Since test does warm up and test many times, we are sending many messages, so we will have them available.
        int totalMessageMultiplier = 50;

        String messageId = UUID.randomUUID().toString();
        Message message = new Message(CONTENTS);
        message.setMessageId(messageId);

        return Flux.range(0, options.getMessagesToSend() * totalMessageMultiplier)
            .flatMap(count -> {
                try {
                    sender.send(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ServiceBusException e) {
                    e.printStackTrace();
                }
                return Mono.empty();
            })
            .then();
    }

    @Override
    public void run() {
        Collection<IMessage> messages = null;
        try {
            messages = receiver.receiveBatch(options.getMessagesToReceive());
        } catch  (Exception ee) {
            System.out.println(" Exception in sync receive " + ee);
        }

        for(IMessage message : messages) {
            try {
                receiver.complete(message.getLockToken());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ServiceBusException e) {
                e.printStackTrace();
            }
            System.out.println("Sync receive Message : " + message.getSequenceNumber());
        }
    }

    @Override
    public Mono<Void> runAsync() {
        CompletableFuture<Collection<IMessage>> receiveFuture = receiver.receiveBatchAsync(options.getMessagesToReceive());
        try {
            Collection<IMessage> messages = receiveFuture.get();
            for(IMessage message : messages){
                try {
                    receiver.complete(message.getLockToken());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ServiceBusException e) {
                    e.printStackTrace();
                }
                System.out.println("Async receive Message : " + message.getSequenceNumber());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return Mono.empty();
    }

    public Mono<Void> cleanupAsync() {
        try {
            sender.close();
        } catch (ServiceBusException e) {
            e.printStackTrace();
        }
        return Mono.empty();
    }

    /**
     * Runs the cleanup logic after the performance test finishes.
     * @return An empty {@link Mono}
     */
    public Mono<Void> globalCleanupAsync() {
        try {
            sender.close();
        } catch (ServiceBusException e) {
            e.printStackTrace();
        }
        return Mono.empty();
    }
}
