/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol;

import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.azure.batch.protocol.models.ComputeNodeExtensionGetHeaders;
import com.microsoft.azure.batch.protocol.models.ComputeNodeExtensionGetOptions;
import com.microsoft.azure.batch.protocol.models.ComputeNodeExtensionListHeaders;
import com.microsoft.azure.batch.protocol.models.ComputeNodeExtensionListNextOptions;
import com.microsoft.azure.batch.protocol.models.ComputeNodeExtensionListOptions;
import com.microsoft.azure.batch.protocol.models.NodeVMExtension;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ComputeNodeExtensions.
 */
public interface ComputeNodeExtensions {
    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NodeVMExtension object if successful.
     */
    NodeVMExtension get(String poolId, String nodeId, String extensionName);

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NodeVMExtension> getAsync(String poolId, String nodeId, String extensionName, final ServiceCallback<NodeVMExtension> serviceCallback);

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NodeVMExtension object
     */
    Observable<NodeVMExtension> getAsync(String poolId, String nodeId, String extensionName);

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NodeVMExtension object
     */
    Observable<ServiceResponseWithHeaders<NodeVMExtension, ComputeNodeExtensionGetHeaders>> getWithServiceResponseAsync(String poolId, String nodeId, String extensionName);
    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param computeNodeExtensionGetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NodeVMExtension object if successful.
     */
    NodeVMExtension get(String poolId, String nodeId, String extensionName, ComputeNodeExtensionGetOptions computeNodeExtensionGetOptions);

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param computeNodeExtensionGetOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NodeVMExtension> getAsync(String poolId, String nodeId, String extensionName, ComputeNodeExtensionGetOptions computeNodeExtensionGetOptions, final ServiceCallback<NodeVMExtension> serviceCallback);

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param computeNodeExtensionGetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NodeVMExtension object
     */
    Observable<NodeVMExtension> getAsync(String poolId, String nodeId, String extensionName, ComputeNodeExtensionGetOptions computeNodeExtensionGetOptions);

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param computeNodeExtensionGetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NodeVMExtension object
     */
    Observable<ServiceResponseWithHeaders<NodeVMExtension, ComputeNodeExtensionGetHeaders>> getWithServiceResponseAsync(String poolId, String nodeId, String extensionName, ComputeNodeExtensionGetOptions computeNodeExtensionGetOptions);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeVMExtension&gt; object if successful.
     */
    PagedList<NodeVMExtension> list(final String poolId, final String nodeId);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeVMExtension>> listAsync(final String poolId, final String nodeId, final ListOperationCallback<NodeVMExtension> serviceCallback);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<Page<NodeVMExtension>> listAsync(final String poolId, final String nodeId);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeVMExtension>, ComputeNodeExtensionListHeaders>> listWithServiceResponseAsync(final String poolId, final String nodeId);
    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param computeNodeExtensionListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeVMExtension&gt; object if successful.
     */
    PagedList<NodeVMExtension> list(final String poolId, final String nodeId, final ComputeNodeExtensionListOptions computeNodeExtensionListOptions);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param computeNodeExtensionListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeVMExtension>> listAsync(final String poolId, final String nodeId, final ComputeNodeExtensionListOptions computeNodeExtensionListOptions, final ListOperationCallback<NodeVMExtension> serviceCallback);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param computeNodeExtensionListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<Page<NodeVMExtension>> listAsync(final String poolId, final String nodeId, final ComputeNodeExtensionListOptions computeNodeExtensionListOptions);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param computeNodeExtensionListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeVMExtension>, ComputeNodeExtensionListHeaders>> listWithServiceResponseAsync(final String poolId, final String nodeId, final ComputeNodeExtensionListOptions computeNodeExtensionListOptions);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeVMExtension&gt; object if successful.
     */
    PagedList<NodeVMExtension> listNext(final String nextPageLink);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeVMExtension>> listNextAsync(final String nextPageLink, final ServiceFuture<List<NodeVMExtension>> serviceFuture, final ListOperationCallback<NodeVMExtension> serviceCallback);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<Page<NodeVMExtension>> listNextAsync(final String nextPageLink);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeVMExtension>, ComputeNodeExtensionListHeaders>> listNextWithServiceResponseAsync(final String nextPageLink);
    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param computeNodeExtensionListNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeVMExtension&gt; object if successful.
     */
    PagedList<NodeVMExtension> listNext(final String nextPageLink, final ComputeNodeExtensionListNextOptions computeNodeExtensionListNextOptions);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param computeNodeExtensionListNextOptions Additional parameters for the operation
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeVMExtension>> listNextAsync(final String nextPageLink, final ComputeNodeExtensionListNextOptions computeNodeExtensionListNextOptions, final ServiceFuture<List<NodeVMExtension>> serviceFuture, final ListOperationCallback<NodeVMExtension> serviceCallback);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param computeNodeExtensionListNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<Page<NodeVMExtension>> listNextAsync(final String nextPageLink, final ComputeNodeExtensionListNextOptions computeNodeExtensionListNextOptions);

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param computeNodeExtensionListNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeVMExtension&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeVMExtension>, ComputeNodeExtensionListHeaders>> listNextWithServiceResponseAsync(final String nextPageLink, final ComputeNodeExtensionListNextOptions computeNodeExtensionListNextOptions);

}
