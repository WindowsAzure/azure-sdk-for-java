// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs;

import com.azure.core.implementation.util.ImplUtils;
import com.azure.core.test.TestMode;

abstract class TestBase {
    private static final String EVENT_HUB_CONNECTION_STRING_ENV_NAME = "AZURE_EVENTHUBS_CONNECTION_STRING";
    private static final String CONNECTION_STRING = System.getenv(EVENT_HUB_CONNECTION_STRING_ENV_NAME);

    static final String TEST_CONNECTION_STRING = "Endpoint=sb://test-event-hub.servicebus.windows.net/;SharedAccessKeyName=dummySharedKeyName;SharedAccessKey=dummySharedKeyValue;EntityPath=eventhub1;";

    String getConnectionString() {
        return CONNECTION_STRING;
    }

    TestMode getTestMode() {
        return ImplUtils.isNullOrEmpty(getConnectionString()) ? TestMode.PLAYBACK : TestMode.RECORD;
    }
}
