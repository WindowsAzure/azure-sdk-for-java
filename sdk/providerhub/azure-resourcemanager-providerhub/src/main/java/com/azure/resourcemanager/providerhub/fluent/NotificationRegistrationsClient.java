// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.NotificationRegistrationInner;

/** An instance of this class provides access to all the operations defined in NotificationRegistrationsClient. */
public interface NotificationRegistrationsClient {
    /**
     * Gets the notification registration details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param notificationRegistrationName The notification registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notification registration details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotificationRegistrationInner get(String providerNamespace, String notificationRegistrationName);

    /**
     * Gets the notification registration details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param notificationRegistrationName The notification registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notification registration details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NotificationRegistrationInner> getWithResponse(
        String providerNamespace, String notificationRegistrationName, Context context);

    /**
     * Creates or updates a notification registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param notificationRegistrationName The notification registration.
     * @param properties The required body parameters supplied to the notification registration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notification registration definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotificationRegistrationInner createOrUpdate(
        String providerNamespace, String notificationRegistrationName, NotificationRegistrationInner properties);

    /**
     * Creates or updates a notification registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param notificationRegistrationName The notification registration.
     * @param properties The required body parameters supplied to the notification registration operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notification registration definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NotificationRegistrationInner> createOrUpdateWithResponse(
        String providerNamespace,
        String notificationRegistrationName,
        NotificationRegistrationInner properties,
        Context context);

    /**
     * Deletes a notification registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param notificationRegistrationName The notification registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String providerNamespace, String notificationRegistrationName);

    /**
     * Deletes a notification registration.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param notificationRegistrationName The notification registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String providerNamespace, String notificationRegistrationName, Context context);

    /**
     * Gets the list of the notification registrations for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the notification registrations for the given provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NotificationRegistrationInner> listByProviderRegistration(String providerNamespace);

    /**
     * Gets the list of the notification registrations for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the notification registrations for the given provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NotificationRegistrationInner> listByProviderRegistration(String providerNamespace, Context context);
}
