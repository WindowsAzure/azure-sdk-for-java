/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListingAsync;

/**
 * Entry point to deployment operation management API.
 */
@Fluent
public interface DeploymentOperations extends
        SupportsListingAsync<DeploymentOperation>,
        SupportsGettingById<DeploymentOperation> {
}
