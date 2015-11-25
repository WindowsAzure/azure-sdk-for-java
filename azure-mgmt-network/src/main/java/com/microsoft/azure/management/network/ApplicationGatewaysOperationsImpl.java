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

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.network.models.ApplicationGateway;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class ApplicationGatewaysOperationsImpl implements ApplicationGatewaysOperations {
    private ApplicationGatewaysService service;
    NetworkManagementClient client;

    public ApplicationGatewaysOperationsImpl(Retrofit retrofit, NetworkManagementClient client) {
        this.service = retrofit.create(ApplicationGatewaysService.class);
        this.client = client;
    }

    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String applicationGatewayName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.delete(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> deleteAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (applicationGatewayName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The Get applicationgateway operation retreives information about the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ApplicationGateway object if successful.
     */
    public ServiceResponse<ApplicationGateway> get(String resourceGroupName, String applicationGatewayName) throws ServiceException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationGatewayName == null) {
            throw new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * The Get applicationgateway operation retreives information about the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<ApplicationGateway> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (applicationGatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<ApplicationGateway>(serviceCallback) {
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

    private ServiceResponse<ApplicationGateway> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<ApplicationGateway>(new AzureJacksonUtils())
                .register(200, new TypeToken<ApplicationGateway>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ApplicationGateway object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<ApplicationGateway> createOrUpdate(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.createOrUpdate(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<ApplicationGateway>() {}.getType());
    }

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters, final ServiceCallback<ApplicationGateway> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (applicationGatewayName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (parameters == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter parameters is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<ApplicationGateway>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ApplicationGateway&gt; object if successful.
     */
    public ServiceResponse<PageImpl<ApplicationGateway>> list(String resourceGroupName) throws ServiceException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(resourceGroupName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<ApplicationGateway>> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.list(resourceGroupName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<ApplicationGateway>>(serviceCallback) {
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

    private ServiceResponse<PageImpl<ApplicationGateway>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<ApplicationGateway>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<ApplicationGateway>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ApplicationGateway&gt; object if successful.
     */
    public ServiceResponse<PageImpl<ApplicationGateway>> listAll() throws ServiceException, IOException, IllegalArgumentException {
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listAll(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listAllDelegate(call.execute(), null);
    }

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<ApplicationGateway>> serviceCallback) {
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listAll(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<ApplicationGateway>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listAllDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<ApplicationGateway>> listAllDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<ApplicationGateway>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<ApplicationGateway>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> start(String resourceGroupName, String applicationGatewayName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.start(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> startAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (applicationGatewayName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.start(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> stop(String resourceGroupName, String applicationGatewayName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.stop(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> stopAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (applicationGatewayName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.stop(resourceGroupName, applicationGatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ApplicationGateway&gt; object if successful.
     */
    public ServiceResponse<PageImpl<ApplicationGateway>> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ApplicationGateway>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<ApplicationGateway>>(serviceCallback) {
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

    private ServiceResponse<PageImpl<ApplicationGateway>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<ApplicationGateway>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<ApplicationGateway>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ApplicationGateway&gt; object if successful.
     */
    public ServiceResponse<PageImpl<ApplicationGateway>> listAllNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listAllNext(nextPageLink, this.client.getAcceptLanguage());
        return listAllNextDelegate(call.execute(), null);
    }

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ApplicationGateway>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listAllNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<ApplicationGateway>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listAllNextDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<ApplicationGateway>> listAllNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<ApplicationGateway>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<ApplicationGateway>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
