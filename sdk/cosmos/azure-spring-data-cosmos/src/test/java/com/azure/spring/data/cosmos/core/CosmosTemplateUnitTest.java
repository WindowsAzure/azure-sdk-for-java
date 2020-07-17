// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.data.cosmos.core;

import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.data.cosmos.CosmosFactory;
import com.azure.spring.data.cosmos.common.TestConstants;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CosmosTemplateUnitTest {

    @Test(expected = IllegalArgumentException.class)
    public void rejectNullDbFactory() {
        final CosmosConfig cosmosConfig = CosmosConfig.builder()
                                                  .cosmosClientBuilder(new CosmosClientBuilder()
                                                          .endpoint("")
                                                          .key(""))
                                                  .database(TestConstants.DB_NAME)
                                                  .build();
        final CosmosFactory cosmosFactory = new CosmosFactory(cosmosConfig);

        new CosmosTemplate(cosmosFactory, null, TestConstants.DB_NAME);
    }
}
