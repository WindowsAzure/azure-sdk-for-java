// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation to annotate list of HTTP status codes that are expected in response from a REST endpoint.
 *
 * <p><strong>Example:</strong></p>
 *
 * <pre>
 * {@literal @}ExpectedResponses({200, 201})
 * {@literal @}POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft"
 *     + ".CustomerInsights/hubs/{hubName}/images/getEntityTypeImageUploadUrl")
 * void getUploadUrlForEntityType({@literal @}Path("resourceGroupName") String resourceGroupName,
 *         {@literal @}Path("hubName") String hubName, {@literal @}Path("subscriptionId") String subscriptionId,
 *         {@literal @}Body GetImageUploadUrlInputInner parameters);
 * </pre>
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface ExpectedResponses {
    /**
     * The status code that will trigger that an error of type errorType should be returned.
     * @return The status code that will trigger than an error of type errorType should be returned.
     */
    int[] value();
}
