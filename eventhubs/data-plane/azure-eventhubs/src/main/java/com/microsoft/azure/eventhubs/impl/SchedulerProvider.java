// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.impl;

interface SchedulerProvider {

    ReactorDispatcher getReactorDispatcher();
}
