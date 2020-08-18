package com.azure.messaging.servicebus.receivesettle.async;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.receivesettle.NetworkFailureException;
import com.azure.messaging.servicebus.receivesettle.Order;
import com.azure.messaging.servicebus.receivesettle.OrderServiceFailureException;
import com.azure.messaging.servicebus.receivesettle.sync.OrderSyncService;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.stream.Stream;

public class OrderAsyncService {
    private final Random rand = new Random();
    private final ClientLogger logger = new ClientLogger(OrderSyncService.class);

    public Mono<Void> createOrReplaceOrder(Order order){
        Order workOrder;
        if (order.getId() == null) {
            workOrder = new Order();
            workOrder.setId(UUID.randomUUID().toString());
            workOrder.setContent(order.getContent());
        } else {
            workOrder = order;
        }
        return this.throwRandomError()
            .then(
                Mono.fromRunnable(() -> {
                    logger.info(String.format("Order saved {\"id\": %s, \"content\": %s}", workOrder.getId(), workOrder.getContent()));
                }))
            .then(this.throwRandomError());
    }

    public Mono<Void> batchCreateOrReplaceOrder(Stream<Order> orders) {
        return this.throwRandomError().then(
            Mono.fromRunnable(() -> orders.forEach(order -> {
                String orderId = order.getId();
                if(orderId == null) {
                    Order newOrder = new Order();
                    orderId = UUID.randomUUID().toString();
                    newOrder.setId(orderId);
                    newOrder.setContent(order.getContent());
                }
                logger.info(String.format("Order in batch saved {\"id\": %s, \"content\": %s}", orderId, order.getContent()));
            })).then(this.throwRandomError())
        );
    }

    private Mono<Void> throwRandomError() {
        int nextInt = rand.nextInt(100);
        if(nextInt == 1) {
            logger.info("A simulated OrderServiceFailureException is thrown");
            return Mono.error(new OrderServiceFailureException("A simulated service failure happens"));
        } else if (nextInt == 2) {
            logger.info("A simulated NetworkFailureException is thrown");
            return Mono.error(new NetworkFailureException("A simulated network failure happens"));
        }
        return Mono.empty();
    }
}
