/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Details for log generated during copy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "copyLogDetailsType", defaultImpl = CopyLogDetails.class)
@JsonTypeName("CopyLogDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataBox", value = DataBoxAccountCopyLogDetails.class),
    @JsonSubTypes.Type(name = "DataBoxDisk", value = DataBoxDiskCopyLogDetails.class),
    @JsonSubTypes.Type(name = "DataBoxHeavy", value = DataBoxHeavyAccountCopyLogDetails.class)
})
public class CopyLogDetails {
}
