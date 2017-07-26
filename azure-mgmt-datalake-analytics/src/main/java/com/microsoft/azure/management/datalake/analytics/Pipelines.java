/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalake.analytics.models.JobPipelineInformation;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Pipelines.
 */
public interface Pipelines {
    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobPipelineInformation&gt; object if successful.
     */
    PagedList<JobPipelineInformation> list(final String accountName);

    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobPipelineInformation>> listAsync(final String accountName, final ListOperationCallback<JobPipelineInformation> serviceCallback);

    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobPipelineInformation&gt; object
     */
    Observable<Page<JobPipelineInformation>> listAsync(final String accountName);

    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobPipelineInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobPipelineInformation>>> listWithServiceResponseAsync(final String accountName);
    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobPipelineInformation&gt; object if successful.
     */
    PagedList<JobPipelineInformation> list(final String accountName, final DateTime startDateTime, final DateTime endDateTime);

    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobPipelineInformation>> listAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime, final ListOperationCallback<JobPipelineInformation> serviceCallback);

    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobPipelineInformation&gt; object
     */
    Observable<Page<JobPipelineInformation>> listAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime);

    /**
     * Lists all pipelines.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of pipelines. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobPipelineInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobPipelineInformation>>> listWithServiceResponseAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobPipelineInformation object if successful.
     */
    JobPipelineInformation get(String accountName, UUID pipelineIdentity);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobPipelineInformation> getAsync(String accountName, UUID pipelineIdentity, final ServiceCallback<JobPipelineInformation> serviceCallback);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobPipelineInformation object
     */
    Observable<JobPipelineInformation> getAsync(String accountName, UUID pipelineIdentity);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobPipelineInformation object
     */
    Observable<ServiceResponse<JobPipelineInformation>> getWithServiceResponseAsync(String accountName, UUID pipelineIdentity);
    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @param startDateTime The start date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobPipelineInformation object if successful.
     */
    JobPipelineInformation get(String accountName, UUID pipelineIdentity, DateTime startDateTime, DateTime endDateTime);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @param startDateTime The start date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobPipelineInformation> getAsync(String accountName, UUID pipelineIdentity, DateTime startDateTime, DateTime endDateTime, final ServiceCallback<JobPipelineInformation> serviceCallback);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @param startDateTime The start date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobPipelineInformation object
     */
    Observable<JobPipelineInformation> getAsync(String accountName, UUID pipelineIdentity, DateTime startDateTime, DateTime endDateTime);

    /**
     * Gets the Pipeline information for the specified pipeline ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param pipelineIdentity Pipeline ID.
     * @param startDateTime The start date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the pipeline and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobPipelineInformation object
     */
    Observable<ServiceResponse<JobPipelineInformation>> getWithServiceResponseAsync(String accountName, UUID pipelineIdentity, DateTime startDateTime, DateTime endDateTime);

    /**
     * Lists all pipelines.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobPipelineInformation&gt; object if successful.
     */
    PagedList<JobPipelineInformation> listNext(final String nextPageLink);

    /**
     * Lists all pipelines.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobPipelineInformation>> listNextAsync(final String nextPageLink, final ServiceFuture<List<JobPipelineInformation>> serviceFuture, final ListOperationCallback<JobPipelineInformation> serviceCallback);

    /**
     * Lists all pipelines.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobPipelineInformation&gt; object
     */
    Observable<Page<JobPipelineInformation>> listNextAsync(final String nextPageLink);

    /**
     * Lists all pipelines.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobPipelineInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobPipelineInformation>>> listNextWithServiceResponseAsync(final String nextPageLink);

}
