/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.resources.models.LocationListResult;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.Subscription;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class SubscriptionsOperationsImpl implements SubscriptionsOperations {
    private SubscriptionsService service;
    SubscriptionClient client;

    public SubscriptionsOperationsImpl(Retrofit retrofit, SubscriptionClient client) {
        this.service = retrofit.create(SubscriptionsService.class);
        this.client = client;
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @return the LocationListResult object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<LocationListResult> listLocations(String subscriptionId) throws ServiceException, IOException {
        if (subscriptionId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listLocations(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listLocationsDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listLocationsAsync(String subscriptionId, final ServiceCallback<LocationListResult> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.")));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.listLocations(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<LocationListResult>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listLocationsDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocationListResult> listLocationsDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<LocationListResult>(new AzureJacksonUtils())
                .register(200, new TypeToken<LocationListResult>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @return the Subscription object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Subscription> get(String subscriptionId) throws ServiceException, IOException {
        if (subscriptionId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.get(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAsync(String subscriptionId, final ServiceCallback<Subscription> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.")));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.get(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Subscription>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Subscription> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Subscription>(new AzureJacksonUtils())
                .register(200, new TypeToken<Subscription>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @return the PageImpl&lt;Subscription&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Subscription>> list() throws ServiceException, IOException {
        if (this.client.getSubscriptionId() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.list(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAsync(final ServiceCallback<PageImpl<Subscription>> serviceCallback) {
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.list(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Subscription>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Subscription>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Subscription>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Subscription>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the LocationListResult object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<LocationListResult> listLocationsNext(String nextPageLink) throws ServiceException, IOException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listLocationsNext(nextPageLink, this.client.getAcceptLanguage());
        return listLocationsNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listLocationsNextAsync(String nextPageLink, final ServiceCallback<LocationListResult> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.listLocationsNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<LocationListResult>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listLocationsNextDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocationListResult> listLocationsNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<LocationListResult>(new AzureJacksonUtils())
                .register(200, new TypeToken<LocationListResult>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Subscription&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Subscription>> listNext(String nextPageLink) throws ServiceException, IOException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Subscription>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Subscription>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listNextDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Subscription>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<Subscription>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Subscription>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
