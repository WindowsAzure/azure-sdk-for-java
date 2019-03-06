/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.datalake.analytics.models.JobRecurrenceInformation;
import com.microsoft.azure.ListOperationCallback;
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
 * in Recurrences.
 */
public interface Recurrences {
    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object if successful.
     */
    PagedList<JobRecurrenceInformation> list(final String accountName);

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobRecurrenceInformation>> listAsync(final String accountName, final ListOperationCallback<JobRecurrenceInformation> serviceCallback);

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    Observable<Page<JobRecurrenceInformation>> listAsync(final String accountName);

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listWithServiceResponseAsync(final String accountName);
    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object if successful.
     */
    PagedList<JobRecurrenceInformation> list(final String accountName, final DateTime startDateTime, final DateTime endDateTime);

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobRecurrenceInformation>> listAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime, final ListOperationCallback<JobRecurrenceInformation> serviceCallback);

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    Observable<Page<JobRecurrenceInformation>> listAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime);

    /**
     * Lists all recurrences.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param startDateTime The start date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get the list of recurrences. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listWithServiceResponseAsync(final String accountName, final DateTime startDateTime, final DateTime endDateTime);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobRecurrenceInformation object if successful.
     */
    JobRecurrenceInformation get(String accountName, UUID recurrenceIdentity);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity, final ServiceCallback<JobRecurrenceInformation> serviceCallback);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    Observable<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    Observable<ServiceResponse<JobRecurrenceInformation>> getWithServiceResponseAsync(String accountName, UUID recurrenceIdentity);
    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobRecurrenceInformation object if successful.
     */
    JobRecurrenceInformation get(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime, final ServiceCallback<JobRecurrenceInformation> serviceCallback);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    Observable<JobRecurrenceInformation> getAsync(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime);

    /**
     * Gets the recurrence information for the specified recurrence ID.
     *
     * @param accountName The Azure Data Lake Analytics account to execute job operations on.
     * @param recurrenceIdentity Recurrence ID.
     * @param startDateTime The start date for when to get the recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @param endDateTime The end date for when to get recurrence and aggregate its data. The startDateTime and endDateTime can be no more than 30 days apart.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobRecurrenceInformation object
     */
    Observable<ServiceResponse<JobRecurrenceInformation>> getWithServiceResponseAsync(String accountName, UUID recurrenceIdentity, DateTime startDateTime, DateTime endDateTime);

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobRecurrenceInformation&gt; object if successful.
     */
    PagedList<JobRecurrenceInformation> listNext(final String nextPageLink);

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<JobRecurrenceInformation>> listNextAsync(final String nextPageLink, final ServiceFuture<List<JobRecurrenceInformation>> serviceFuture, final ListOperationCallback<JobRecurrenceInformation> serviceCallback);

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    Observable<Page<JobRecurrenceInformation>> listNextAsync(final String nextPageLink);

    /**
     * Lists all recurrences.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobRecurrenceInformation&gt; object
     */
    Observable<ServiceResponse<Page<JobRecurrenceInformation>>> listNextWithServiceResponseAsync(final String nextPageLink);

}
