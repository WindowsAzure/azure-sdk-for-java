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
import com.microsoft.azure.management.datalake.analytics.models.JobDataPath;
import com.microsoft.azure.management.datalake.analytics.models.JobInformation;
import com.microsoft.azure.management.datalake.analytics.models.JobStatistics;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Jobs.
 */
public interface Jobs {
    /**
     * Gets statistics of the specified job.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity Job Information ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobStatistics object if successful.
     */
    JobStatistics getStatistics(String accountName, UUID jobIdentity);

    /**
     * Gets statistics of the specified job.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity Job Information ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobStatistics> getStatisticsAsync(String accountName, UUID jobIdentity, final ServiceCallback<JobStatistics> serviceCallback);

    /**
     * Gets statistics of the specified job.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity Job Information ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobStatistics object
     */
    Observable<JobStatistics> getStatisticsAsync(String accountName, UUID jobIdentity);

    /**
     * Gets statistics of the specified job.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity Job Information ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobStatistics object
     */
    Observable<ServiceResponse<JobStatistics>> getStatisticsWithServiceResponseAsync(String accountName, UUID jobIdentity);

    /**
     * Gets the job debug data information specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobDataPath object if successful.
     */
    JobDataPath getDebugDataPath(String accountName, UUID jobIdentity);

    /**
     * Gets the job debug data information specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobDataPath> getDebugDataPathAsync(String accountName, UUID jobIdentity, final ServiceCallback<JobDataPath> serviceCallback);

    /**
     * Gets the job debug data information specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobDataPath object
     */
    Observable<JobDataPath> getDebugDataPathAsync(String accountName, UUID jobIdentity);

    /**
     * Gets the job debug data information specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobDataPath object
     */
    Observable<ServiceResponse<JobDataPath>> getDebugDataPathWithServiceResponseAsync(String accountName, UUID jobIdentity);

    /**
     * Builds (compiles) the specified job in the specified Data Lake Analytics account for job correctness and validation.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param parameters The parameters to build a job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobInformation object if successful.
     */
    JobInformation build(String accountName, JobInformation parameters);

    /**
     * Builds (compiles) the specified job in the specified Data Lake Analytics account for job correctness and validation.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param parameters The parameters to build a job.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobInformation> buildAsync(String accountName, JobInformation parameters, final ServiceCallback<JobInformation> serviceCallback);

    /**
     * Builds (compiles) the specified job in the specified Data Lake Analytics account for job correctness and validation.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param parameters The parameters to build a job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInformation object
     */
    Observable<JobInformation> buildAsync(String accountName, JobInformation parameters);

    /**
     * Builds (compiles) the specified job in the specified Data Lake Analytics account for job correctness and validation.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param parameters The parameters to build a job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInformation object
     */
    Observable<ServiceResponse<JobInformation>> buildWithServiceResponseAsync(String accountName, JobInformation parameters);

    /**
     * Cancels the running job specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void cancel(String accountName, UUID jobIdentity);

    /**
     * Cancels the running job specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID to cancel.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> cancelAsync(String accountName, UUID jobIdentity, final ServiceCallback<Void> serviceCallback);

    /**
     * Cancels the running job specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> cancelAsync(String accountName, UUID jobIdentity);

    /**
     * Cancels the running job specified by the job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> cancelWithServiceResponseAsync(String accountName, UUID jobIdentity);

    /**
     * Gets the job information for the specified job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobInformation object if successful.
     */
    JobInformation get(String accountName, UUID jobIdentity);

    /**
     * Gets the job information for the specified job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobInformation> getAsync(String accountName, UUID jobIdentity, final ServiceCallback<JobInformation> serviceCallback);

    /**
     * Gets the job information for the specified job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInformation object
     */
    Observable<JobInformation> getAsync(String accountName, UUID jobIdentity);

    /**
     * Gets the job information for the specified job ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity JobInfo ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInformation object
     */
    Observable<ServiceResponse<JobInformation>> getWithServiceResponseAsync(String accountName, UUID jobIdentity);

    /**
     * Submits a job to the specified Data Lake Analytics account.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity The job ID (a GUID) for the job being submitted.
     * @param parameters The parameters to submit a job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobInformation object if successful.
     */
    JobInformation create(String accountName, UUID jobIdentity, JobInformation parameters);

    /**
     * Submits a job to the specified Data Lake Analytics account.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity The job ID (a GUID) for the job being submitted.
     * @param parameters The parameters to submit a job.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobInformation> createAsync(String accountName, UUID jobIdentity, JobInformation parameters, final ServiceCallback<JobInformation> serviceCallback);

    /**
     * Submits a job to the specified Data Lake Analytics account.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity The job ID (a GUID) for the job being submitted.
     * @param parameters The parameters to submit a job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInformation object
     */
    Observable<JobInformation> createAsync(String accountName, UUID jobIdentity, JobInformation parameters);

    /**
     * Submits a job to the specified Data Lake Analytics account.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param jobIdentity The job ID (a GUID) for the job being submitted.
     * @param parameters The parameters to submit a job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInformation object
     */
    Observable<ServiceResponse<JobInformation>> createWithServiceResponseAsync(String accountName, UUID jobIdentity, JobInformation parameters);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobInformation&gt; object if successful.
     */
    PagedList<JobInformation> list(final String accountName);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobInformation>> listAsync(final String accountName, final ListOperationCallback<JobInformation> serviceCallback);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobInformation&gt; object
     */
    Observable<Page<JobInformation>> listAsync(final String accountName);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobInformation>>> listWithServiceResponseAsync(final String accountName);
    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobInformation&gt; object if successful.
     */
    PagedList<JobInformation> list(final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobInformation>> listAsync(final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count, final ListOperationCallback<JobInformation> serviceCallback);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobInformation&gt; object
     */
    Observable<Page<JobInformation>> listAsync(final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobInformation>>> listWithServiceResponseAsync(final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobInformation&gt; object if successful.
     */
    PagedList<JobInformation> listNext(final String nextPageLink);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobInformation>> listNextAsync(final String nextPageLink, final ServiceFuture<List<JobInformation>> serviceFuture, final ListOperationCallback<JobInformation> serviceCallback);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobInformation&gt; object
     */
    Observable<Page<JobInformation>> listNextAsync(final String nextPageLink);

    /**
     * Lists the jobs, if any, associated with the specified Data Lake Analytics account. The response includes a link to the next page of results, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobInformation>>> listNextWithServiceResponseAsync(final String nextPageLink);

}
