/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for Content Key Policy restrictions. A derived class must be used
 * to create a restriction.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyRestriction.class)
@JsonTypeName("ContentKeyPolicyRestriction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyOpenRestriction", value = ContentKeyPolicyOpenRestriction.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyUnknownRestriction", value = ContentKeyPolicyUnknownRestriction.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyTokenRestriction", value = ContentKeyPolicyTokenRestriction.class)
})
public class ContentKeyPolicyRestriction {
}
