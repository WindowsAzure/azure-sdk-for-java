/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the properties for an output image file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ImageFormat")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JpgFormat", value = JpgFormat.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.PngFormat", value = PngFormat.class)
})
public class ImageFormat extends Format {
}
