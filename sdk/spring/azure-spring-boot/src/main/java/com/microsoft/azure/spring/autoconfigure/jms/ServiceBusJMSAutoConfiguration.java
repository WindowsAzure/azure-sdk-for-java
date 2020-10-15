// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.spring.autoconfigure.jms;

import static com.microsoft.azure.utils.ApplicationId.AZURE_SPRING_SERVICE_BUS;
import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactory;
import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactorySettings;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@Configuration
@ConditionalOnClass(ServiceBusJmsConnectionFactory.class)
@ConditionalOnResource(resources = "classpath:servicebusjms.enable.config")
@ConditionalOnProperty(value = "spring.jms.servicebus.enabled", matchIfMissing = true)
@EnableConfigurationProperties(AzureServiceBusJMSProperties.class)
public class ServiceBusJMSAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public ConnectionFactory jmsConnectionFactory(AzureServiceBusJMSProperties serviceBusJMSProperties) {
        final String connectionString = serviceBusJMSProperties.getConnectionString();
        final String clientId = serviceBusJMSProperties.getTopicClientId();
        final long idleTimeout = serviceBusJMSProperties.getIdleTimeout();

        final ServiceBusJmsConnectionFactorySettings settings =
            new ServiceBusJmsConnectionFactorySettings(idleTimeout, false);
        final SpringServiceBusJmsConnectionFactory springServiceBusJmsConnectionFactory =
            new SpringServiceBusJmsConnectionFactory(connectionString, settings);

        springServiceBusJmsConnectionFactory.setClientId(clientId);
        springServiceBusJmsConnectionFactory.setCustomUserAgent(AZURE_SPRING_SERVICE_BUS);

        return new CachingConnectionFactory(springServiceBusJmsConnectionFactory);
    }

    @Bean
    @ConditionalOnMissingBean
    public JmsTemplate jmsTemplate(ConnectionFactory jmsConnectionFactory) {
        final JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(jmsConnectionFactory);
        return jmsTemplate;
    }

    @Bean
    @ConditionalOnMissingBean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        final DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        return jmsListenerContainerFactory;
    }

    @Bean
    public JmsListenerContainerFactory<?> topicJmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        final DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setSubscriptionDurable(Boolean.TRUE);
        return jmsListenerContainerFactory;
    }

}
