/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.servicebus;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByNameAsync;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingByName;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListingAsync;
import com.microsoft.azure.management.servicebus.implementation.ServiceBusManager;

/**
 * Entry point to authorization rules management API.
 *
 * @param <RuleT> the specific rule type
 */
@Fluent
@Beta
public interface AuthorizationRules<RuleT> extends
        SupportsListingAsync<RuleT>,
        SupportsGettingByNameAsync<RuleT>,
        SupportsDeletingByName,
        HasManager<ServiceBusManager> {
}