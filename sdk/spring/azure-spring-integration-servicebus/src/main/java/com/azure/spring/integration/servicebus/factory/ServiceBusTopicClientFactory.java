// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus.factory;


import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.spring.integration.servicebus.ServiceBusClientConfig;

import java.util.function.Consumer;

/**
 * Factory to return functional creator of service bus topic and subscription client
 *
 * @author Warren Zhu
 */
public interface ServiceBusTopicClientFactory extends ServiceBusSenderFactory {
    /**
     * Return a function which accepts service bus topic and subscription name, then returns {@link ServiceBusProcessorClient}
     * @param topic topic
     * @param subscription subscription
     * @return subscription client
     */
    ServiceBusProcessorClient getOrCreateClient(String topic, String subscription, ServiceBusClientConfig clientConfig, Consumer processMessage, Consumer processError);
}
