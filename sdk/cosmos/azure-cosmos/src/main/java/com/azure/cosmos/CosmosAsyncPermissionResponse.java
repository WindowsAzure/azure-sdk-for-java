// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.cosmos.implementation.Permission;
import com.azure.cosmos.implementation.ResourceResponse;

public class CosmosAsyncPermissionResponse extends CosmosResponse<CosmosPermissionProperties> {
    CosmosAsyncPermission permissionClient;
    
    CosmosAsyncPermissionResponse(ResourceResponse<Permission> response, CosmosAsyncUser cosmosUser) {
        super(response);
        if(response.getResource() == null){
            super.setProperties(null);
        }else{
            super.setProperties(new CosmosPermissionProperties(response.getResource().toJson()));
            permissionClient = new CosmosAsyncPermission(response.getResource().getId(), cosmosUser);
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
