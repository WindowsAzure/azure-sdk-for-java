/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for Content Key Policy configuration. A derived class must be
 * used to create a configuration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyConfiguration.class)
@JsonTypeName("ContentKeyPolicyConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyClearKeyConfiguration", value = ContentKeyPolicyClearKeyConfiguration.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyUnknownConfiguration", value = ContentKeyPolicyUnknownConfiguration.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyWidevineConfiguration", value = ContentKeyPolicyWidevineConfiguration.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyPlayReadyConfiguration", value = ContentKeyPolicyPlayReadyConfiguration.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration", value = ContentKeyPolicyFairPlayConfiguration.class)
})
public class ContentKeyPolicyConfiguration {
}
