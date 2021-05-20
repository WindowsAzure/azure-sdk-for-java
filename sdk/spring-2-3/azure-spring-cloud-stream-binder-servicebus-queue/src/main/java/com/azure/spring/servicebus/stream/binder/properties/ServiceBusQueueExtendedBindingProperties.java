// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.stream.binder.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Warren Zhu
 */
@ConfigurationProperties("spring.cloud.stream.servicebus.queue")
public class ServiceBusQueueExtendedBindingProperties extends ServiceBusExtendedBindingProperties {
    private static final String DEFAULTS_PREFIX = "spring.cloud.stream.servicebus.queue.default";

    @Override
    public String getDefaultsPrefix() {
        return DEFAULTS_PREFIX;
    }
}
