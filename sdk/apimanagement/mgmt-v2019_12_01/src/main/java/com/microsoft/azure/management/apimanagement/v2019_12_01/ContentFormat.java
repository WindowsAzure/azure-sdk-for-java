/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContentFormat.
 */
public final class ContentFormat extends ExpandableStringEnum<ContentFormat> {
    /** Static value wadl-xml for ContentFormat. */
    public static final ContentFormat WADL_XML = fromString("wadl-xml");

    /** Static value wadl-link-json for ContentFormat. */
    public static final ContentFormat WADL_LINK_JSON = fromString("wadl-link-json");

    /** Static value swagger-json for ContentFormat. */
    public static final ContentFormat SWAGGER_JSON = fromString("swagger-json");

    /** Static value swagger-link-json for ContentFormat. */
    public static final ContentFormat SWAGGER_LINK_JSON = fromString("swagger-link-json");

    /** Static value wsdl for ContentFormat. */
    public static final ContentFormat WSDL = fromString("wsdl");

    /** Static value wsdl-link for ContentFormat. */
    public static final ContentFormat WSDL_LINK = fromString("wsdl-link");

    /** Static value openapi for ContentFormat. */
    public static final ContentFormat OPENAPI = fromString("openapi");

    /** Static value openapi+json for ContentFormat. */
    public static final ContentFormat OPENAPIJSON = fromString("openapi+json");

    /** Static value openapi-link for ContentFormat. */
    public static final ContentFormat OPENAPI_LINK = fromString("openapi-link");

    /** Static value openapi+json-link for ContentFormat. */
    public static final ContentFormat OPENAPIJSON_LINK = fromString("openapi+json-link");

    /**
     * Creates or finds a ContentFormat from its string representation.
     * @param name a name to look for
     * @return the corresponding ContentFormat
     */
    @JsonCreator
    public static ContentFormat fromString(String name) {
        return fromString(name, ContentFormat.class);
    }

    /**
     * @return known ContentFormat values
     */
    public static Collection<ContentFormat> values() {
        return values(ContentFormat.class);
    }
}
