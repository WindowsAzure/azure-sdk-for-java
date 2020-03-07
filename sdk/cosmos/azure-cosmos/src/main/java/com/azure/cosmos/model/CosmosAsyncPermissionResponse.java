// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.model;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosAsyncPermission;
import com.azure.cosmos.CosmosAsyncUser;
import com.azure.cosmos.implementation.ResourceResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * The type Cosmos async permission response.
 */
public class CosmosAsyncPermissionResponse extends CosmosResponse<CosmosPermissionProperties> {
    private final CosmosAsyncPermission permissionClient;

    CosmosAsyncPermissionResponse(ResourceResponse<Permission> response, CosmosAsyncUser cosmosUser) {
        super(response);
        String bodyAsString = response.getBodyAsString();
        if (StringUtils.isEmpty(bodyAsString)) {
            super.setProperties(null);
            permissionClient = null;
        } else {
            CosmosPermissionProperties props = new CosmosPermissionProperties(bodyAsString);
            super.setProperties(props);
            permissionClient = BridgeInternal.createCosmosAsyncPermission(props.getId(), cosmosUser);
        }
    }

    /**
     * Get the permission properties
     *
     * @return the permission properties
     */
    public CosmosPermissionProperties getProperties() {
        return super.getProperties();
    }

    /**
     * Gets the CosmosAsyncPermission
     *
     * @return the cosmos permission
     */
    public CosmosAsyncPermission getPermission() {
        return permissionClient;
    }
}
