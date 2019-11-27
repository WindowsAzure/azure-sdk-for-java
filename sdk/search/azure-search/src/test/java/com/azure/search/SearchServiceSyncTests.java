// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.search.models.ServiceStatistics;
import org.junit.Test;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;
import static org.unitils.reflectionassert.ReflectionComparatorMode.IGNORE_DEFAULTS;

public class SearchServiceSyncTests extends SearchServiceTestBase {

    @Test
    public void getServiceStatsReturnsCorrectDefinition() {
        SearchServiceClient serviceClient = getSearchServiceClientBuilder().buildClient();

        ServiceStatistics serviceStatistics = serviceClient.getServiceStatistics();
        assertReflectionEquals(serviceStatistics, getExpectedServiceStatistics(), IGNORE_DEFAULTS);

        serviceStatistics = serviceClient.getServiceStatistics(generateRequestOptions());
        assertReflectionEquals(serviceStatistics, getExpectedServiceStatistics(), IGNORE_DEFAULTS);
    }
}
