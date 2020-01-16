/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The authentication information required in the REST health check request to
 * the health provider.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = RestRequestAuthentication.class)
@JsonTypeName("RestRequestAuthentication")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RolloutIdentity", value = RolloutIdentityAuthentication.class),
    @JsonSubTypes.Type(name = "ApiKey", value = ApiKeyAuthentication.class)
})
public class RestRequestAuthentication {
}
