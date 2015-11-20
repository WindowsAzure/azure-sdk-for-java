/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.UsagesListResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in UsagesOperations.
 */
public interface UsagesOperations {
    /**
     * The interface defining all the services for UsagesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsagesService {
        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/usages")
        Call<ResponseBody> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the UsagesListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<UsagesListResult> list(String location) throws ServiceException, IOException;

    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String location, final ServiceCallback<UsagesListResult> serviceCallback);

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the UsagesListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<UsagesListResult> listNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<UsagesListResult> serviceCallback);

}
