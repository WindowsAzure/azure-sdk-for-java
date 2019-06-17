/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExportFormat.
 */
public final class ExportFormat extends ExpandableStringEnum<ExportFormat> {
    /** Static value swagger-link for ExportFormat. */
    public static final ExportFormat SWAGGER = fromString("swagger-link");

    /** Static value wsdl-link for ExportFormat. */
    public static final ExportFormat WSDL = fromString("wsdl-link");

    /** Static value wadl-link for ExportFormat. */
    public static final ExportFormat WADL = fromString("wadl-link");

    /** Static value openapi-link for ExportFormat. */
    public static final ExportFormat OPENAPI = fromString("openapi-link");

    /**
     * Creates or finds a ExportFormat from its string representation.
     * @param name a name to look for
     * @return the corresponding ExportFormat
     */
    @JsonCreator
    public static ExportFormat fromString(String name) {
        return fromString(name, ExportFormat.class);
    }

    /**
     * @return known ExportFormat values
     */
    public static Collection<ExportFormat> values() {
        return values(ExportFormat.class);
    }
}
