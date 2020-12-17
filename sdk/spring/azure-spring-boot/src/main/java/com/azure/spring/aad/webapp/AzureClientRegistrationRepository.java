// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapp;

import com.azure.spring.autoconfigure.aad.AADAuthenticationProperties;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Collections;


/**
 * Manage all AAD oauth2 clients configured by property "azure.activedirectory.xxx"
 */
public class AzureClientRegistrationRepository implements ClientRegistrationRepository, Iterable<ClientRegistration> {

    private final AzureClientRegistration azureClient;
    private final List<ClientRegistration> otherClients;
    private final Map<String, ClientRegistration> allClients;
    private final AADAuthenticationProperties properties;
    private final boolean isWebappRepository;

    public AzureClientRegistrationRepository(AzureClientRegistration azureClient,
                                             List<ClientRegistration> otherClients,
                                             AADAuthenticationProperties properties,
                                             boolean isWebappRepository) {
        this.azureClient = azureClient;
        this.otherClients = new ArrayList<>(otherClients);
        this.properties = properties;
        this.isWebappRepository = isWebappRepository;

        allClients = new HashMap<>();
        addClientRegistration(azureClient.getClient());
        for (ClientRegistration c : otherClients) {
            addClientRegistration(c);
        }
    }

    private void addClientRegistration(ClientRegistration client) {
        allClients.put(client.getRegistrationId(), client);
    }

    @Override
    public ClientRegistration findByRegistrationId(String registrationId) {
        return allClients.get(registrationId);
    }

    @NotNull
    @Override
    public Iterator<ClientRegistration> iterator() {
        if (isWebappRepository) {
            return Collections.singleton(azureClient.getClient()).iterator();
        }
        return allClients.values().iterator();
    }

    public AzureClientRegistration getAzureClient() {
        return azureClient;
    }

    public boolean isClientNeedConsentWhenLogin(ClientRegistration client) {
        return otherClients.contains(client)
            && properties.getAuthorization().get(client.getClientName()) != null
            && !properties.getAuthorization().get(client.getClientName()).isOnDemand();
    }

    public boolean isClientNeedConsentWhenLogin(String id) {
        ClientRegistration client = findByRegistrationId(id);
        return client != null && isClientNeedConsentWhenLogin(client);
    }

}
