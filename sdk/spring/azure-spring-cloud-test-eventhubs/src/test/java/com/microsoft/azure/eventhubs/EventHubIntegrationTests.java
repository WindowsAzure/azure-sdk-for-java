package com.microsoft.azure.eventhubs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.GenericMessage;

@EnableBinding(Source.class)
@SpringBootTest
class EventHubIntegrationTests {

    private static final String MESSAGE = "Azure Spring Cloud EventHub Test";

    @Test
    void integrationTest(@Autowired Source source) throws InterruptedException {
        // Wait for eventhub initialization to complete
        Thread.sleep(15000);
        source.output().send(new GenericMessage<>(MESSAGE));
        String msg = Receiver.EXCHANGER.exchange(MESSAGE);
        Assertions.assertEquals(MESSAGE, msg);
        msg = Receiver.EXCHANGER.exchange("");
        Assertions.assertEquals("ERROR!", msg);
    }

}
