/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.servicebus;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.management.servicebus.implementation.ServiceBusManager;
import com.microsoft.azure.management.servicebus.implementation.TopicsInner;


/**
 * Entry point to service bus topic management API in Azure.
 */
@Fluent
public interface Topics extends
    SupportsCreating<Topic.DefinitionStages.Blank>,
    HasManager<ServiceBusManager>,
    HasInner<TopicsInner>,
    SupportsBatchCreation<Topic>,
    SupportsGettingById<Topic>,
    SupportsDeletingById,
    SupportsDeletingByGroup {
}
