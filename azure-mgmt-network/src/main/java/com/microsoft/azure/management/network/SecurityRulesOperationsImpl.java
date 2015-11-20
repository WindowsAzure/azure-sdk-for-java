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
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.SecurityRule;
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
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class SecurityRulesOperationsImpl implements SecurityRulesOperations {
    private SecurityRulesService service;
    NetworkManagementClient client;

    public SecurityRulesOperationsImpl(Retrofit retrofit, NetworkManagementClient client) {
        this.service = retrofit.create(SecurityRulesService.class);
        this.client = client;
    }

    /**
     * The delete network security rule operation deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.delete(resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() {}.getType());
    }

    /**
     * The delete network security rule operation deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> deleteAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (networkSecurityGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null.")));
        }
        if (securityRuleName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter securityRuleName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The Get NetworkSecurityRule operation retreives information about the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @return the SecurityRule object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<SecurityRule> get(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) throws ServiceException, IOException {
        if (resourceGroupName == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkSecurityGroupName == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null."));
        }
        if (securityRuleName == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter securityRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.get(resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * The Get NetworkSecurityRule operation retreives information about the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, final ServiceCallback<SecurityRule> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
            return null;
        }
        if (networkSecurityGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null.")));
            return null;
        }
        if (securityRuleName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter securityRuleName is required and cannot be null.")));
            return null;
        }
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
        Call<ResponseBody> call = service.get(resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<SecurityRule>(serviceCallback) {
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

    private ServiceResponse<SecurityRule> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<SecurityRule>(new AzureJacksonUtils())
                .register(200, new TypeToken<SecurityRule>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * The Put network security rule operation creates/updates a security rule in the specified network security group
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Parameters supplied to the create/update network security rule operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the SecurityRule object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<SecurityRule> createOrUpdate(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRule securityRuleParameters) throws ServiceException, IOException, InterruptedException {
        Response<ResponseBody> result = service.createOrUpdate(resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), securityRuleParameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<SecurityRule>() {}.getType());
    }

    /**
     * The Put network security rule operation creates/updates a security rule in the specified network security group
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Parameters supplied to the create/update network security rule operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRule securityRuleParameters, final ServiceCallback<SecurityRule> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
        }
        if (networkSecurityGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null.")));
        }
        if (securityRuleName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter securityRuleName is required and cannot be null.")));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.")));
        }
        if (securityRuleParameters == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter securityRuleParameters is required and cannot be null.")));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Validator.validate(securityRuleParameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(resourceGroupName, networkSecurityGroupName, securityRuleName, this.client.getSubscriptionId(), securityRuleParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) { serviceCallback.failure(t); }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<SecurityRule>() {}.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @return the PageImpl&lt;SecurityRule&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<SecurityRule>> list(String resourceGroupName, String networkSecurityGroupName) throws ServiceException, IOException {
        if (resourceGroupName == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkSecurityGroupName == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.list(resourceGroupName, networkSecurityGroupName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listAsync(String resourceGroupName, String networkSecurityGroupName, final ServiceCallback<PageImpl<SecurityRule>> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.")));
            return null;
        }
        if (networkSecurityGroupName == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null.")));
            return null;
        }
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
        Call<ResponseBody> call = service.list(resourceGroupName, networkSecurityGroupName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<SecurityRule>>(serviceCallback) {
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

    private ServiceResponse<PageImpl<SecurityRule>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<SecurityRule>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<SecurityRule>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;SecurityRule&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<SecurityRule>> listNext(String nextPageLink) throws ServiceException, IOException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<SecurityRule>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<SecurityRule>>(serviceCallback) {
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

    private ServiceResponse<PageImpl<SecurityRule>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<PageImpl<SecurityRule>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<SecurityRule>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
