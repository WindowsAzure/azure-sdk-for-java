/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.avs.v20200717preview.models.Operation;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public interface Operations {
    /**
     * Lists all of the available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Operation&gt; object if successful.
     */
    PagedList<Operation> list();

    /**
     * Lists all of the available operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Operation>> listAsync(final ListOperationCallback<Operation> serviceCallback);

    /**
     * Lists all of the available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Operation&gt; object
     */
    Observable<Page<Operation>> listAsync();

    /**
     * Lists all of the available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Operation&gt; object
     */
    Observable<ServiceResponse<Page<Operation>>> listWithServiceResponseAsync();

    /**
     * Lists all of the available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Operation&gt; object if successful.
     */
    PagedList<Operation> listNext(final String nextPageLink);

    /**
     * Lists all of the available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Operation>> listNextAsync(final String nextPageLink, final ServiceFuture<List<Operation>> serviceFuture, final ListOperationCallback<Operation> serviceCallback);

    /**
     * Lists all of the available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Operation&gt; object
     */
    Observable<Page<Operation>> listNextAsync(final String nextPageLink);

    /**
     * Lists all of the available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Operation&gt; object
     */
    Observable<ServiceResponse<Page<Operation>>> listNextWithServiceResponseAsync(final String nextPageLink);

}
