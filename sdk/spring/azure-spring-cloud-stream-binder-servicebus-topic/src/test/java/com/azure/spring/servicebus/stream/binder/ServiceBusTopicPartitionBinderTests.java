// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.stream.binder;

import com.azure.spring.integration.servicebus.factory.ServiceBusTopicClientFactory;
import com.azure.spring.integration.servicebus.health.InstrumentationManager;
import com.azure.spring.servicebus.stream.binder.properties.ServiceBusConsumerProperties;
import com.azure.spring.servicebus.stream.binder.properties.ServiceBusProducerProperties;
import com.azure.spring.servicebus.stream.binder.support.ServiceBusTopicTestOperation;
import com.azure.spring.servicebus.stream.binder.test.AzurePartitionBinderTests;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.cloud.stream.binder.ExtendedConsumerProperties;
import org.springframework.cloud.stream.binder.ExtendedProducerProperties;
import org.springframework.cloud.stream.binder.HeaderMode;

/**
 * Test cases are defined in super class
 *
 * @author Warren Zhu
 */
@RunWith(MockitoJUnitRunner.class)
public class ServiceBusTopicPartitionBinderTests
    extends AzurePartitionBinderTests<ServiceBusTopicTestBinder,
    ExtendedConsumerProperties<ServiceBusConsumerProperties>,
    ExtendedProducerProperties<ServiceBusProducerProperties>> {

    //TODO (Xiaobing Zhu): It is currently impossible to upgrade JUnit 4 to JUnit 5 due to the inheritance of Spring unit tests.

    @Mock
    ServiceBusTopicClientFactory clientFactory;

    private ServiceBusTopicTestBinder binder;

    private InstrumentationManager instrumentationManager = new InstrumentationManager();

    @Before
    public void setUp() {
        this.binder = new ServiceBusTopicTestBinder(new ServiceBusTopicTestOperation(this.clientFactory,
            instrumentationManager));
    }

    @Override
    protected String getClassUnderTestName() {
        return ServiceBusTopicTestBinder.class.getSimpleName();
    }

    @Override
    protected ServiceBusTopicTestBinder getBinder() throws Exception {
        return this.binder;
    }

    @Override
    protected ExtendedConsumerProperties<ServiceBusConsumerProperties> createConsumerProperties() {
        ExtendedConsumerProperties<ServiceBusConsumerProperties> properties = new ExtendedConsumerProperties<>(
            new ServiceBusConsumerProperties());
        properties.setHeaderMode(HeaderMode.embeddedHeaders);
        return properties;
    }

    @Override
    protected ExtendedProducerProperties<ServiceBusProducerProperties> createProducerProperties() {
        ExtendedProducerProperties<ServiceBusProducerProperties> properties = new ExtendedProducerProperties<>(
            new ServiceBusProducerProperties());
        properties.setHeaderMode(HeaderMode.embeddedHeaders);
        return properties;
    }

    @Override
    public void testOneRequiredGroup() {
        // Required group test rely on unsupported start position of consumer properties
    }

    @Override
    public void testTwoRequiredGroups() {
        // Required group test rely on unsupported start position of consumer properties
    }
}
