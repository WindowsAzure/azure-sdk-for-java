// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.EnrollmentAccountSummaryInner;

/** An instance of this class provides access to all the operations defined in EnrollmentAccountsClient. */
public interface EnrollmentAccountsClient {
    /**
     * Lists the enrollment accounts the caller has access to.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing enrollment accounts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnrollmentAccountSummaryInner> list();

    /**
     * Lists the enrollment accounts the caller has access to.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing enrollment accounts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnrollmentAccountSummaryInner> list(Context context);

    /**
     * Gets a enrollment account by name.
     *
     * @param name Enrollment Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a enrollment account by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnrollmentAccountSummaryInner get(String name);

    /**
     * Gets a enrollment account by name.
     *
     * @param name Enrollment Account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a enrollment account by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnrollmentAccountSummaryInner> getWithResponse(String name, Context context);
}
