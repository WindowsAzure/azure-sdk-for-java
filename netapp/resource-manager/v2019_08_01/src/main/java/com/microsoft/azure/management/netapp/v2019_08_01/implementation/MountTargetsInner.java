/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MountTargets.
 */
public class MountTargetsInner {
    /** The Retrofit service to perform REST calls. */
    private MountTargetsService service;
    /** The service client containing this operation class. */
    private AzureNetAppFilesManagementClientImpl client;

    /**
     * Initializes an instance of MountTargetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MountTargetsInner(Retrofit retrofit, AzureNetAppFilesManagementClientImpl client) {
        this.service = retrofit.create(MountTargetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MountTargets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MountTargetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.netapp.v2019_08_01.MountTargets list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.NetApp/netAppAccounts/{accountName}/capacityPools/{poolName}/volumes/{volumeName}/mountTargets")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("poolName") String poolName, @Path("volumeName") String volumeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Describe all mount targets.
     * List all mount targets associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MountTargetInner&gt; object if successful.
     */
    public List<MountTargetInner> list(String resourceGroupName, String accountName, String poolName, String volumeName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName, poolName, volumeName).toBlocking().single().body();
    }

    /**
     * Describe all mount targets.
     * List all mount targets associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MountTargetInner>> listAsync(String resourceGroupName, String accountName, String poolName, String volumeName, final ServiceCallback<List<MountTargetInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, accountName, poolName, volumeName), serviceCallback);
    }

    /**
     * Describe all mount targets.
     * List all mount targets associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MountTargetInner&gt; object
     */
    public Observable<List<MountTargetInner>> listAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName, poolName, volumeName).map(new Func1<ServiceResponse<List<MountTargetInner>>, List<MountTargetInner>>() {
            @Override
            public List<MountTargetInner> call(ServiceResponse<List<MountTargetInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Describe all mount targets.
     * List all mount targets associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MountTargetInner&gt; object
     */
    public Observable<ServiceResponse<List<MountTargetInner>>> listWithServiceResponseAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (poolName == null) {
            throw new IllegalArgumentException("Parameter poolName is required and cannot be null.");
        }
        if (volumeName == null) {
            throw new IllegalArgumentException("Parameter volumeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, accountName, poolName, volumeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MountTargetInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MountTargetInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MountTargetInner>> result = listDelegate(response);
                        List<MountTargetInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MountTargetInner>> clientResponse = new ServiceResponse<List<MountTargetInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MountTargetInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MountTargetInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MountTargetInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
