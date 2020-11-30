// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.servicebus.queue.binder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Warren Zhu
 */
@SpringBootApplication
public class ServiceBusQueueBinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBusQueueBinderApplication.class, args);
    }
}
