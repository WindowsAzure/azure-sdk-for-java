// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDefinitionItemInner;

/** An instance of this class provides access to all the operations defined in SecureScoreControlDefinitionsClient. */
public interface SecureScoreControlDefinitionsClient {
    /**
     * List the available security controls, their assessments, and the max score.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecureScoreControlDefinitionItemInner> list();

    /**
     * List the available security controls, their assessments, and the max score.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecureScoreControlDefinitionItemInner> list(Context context);

    /**
     * For a specified subscription, list the available security controls, their assessments, and the max score.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecureScoreControlDefinitionItemInner> listBySubscription();

    /**
     * For a specified subscription, list the available security controls, their assessments, and the max score.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecureScoreControlDefinitionItemInner> listBySubscription(Context context);
}
