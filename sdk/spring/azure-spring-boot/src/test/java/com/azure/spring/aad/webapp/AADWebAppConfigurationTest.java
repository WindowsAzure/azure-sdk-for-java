// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapp;

import com.azure.spring.aad.AADAuthorizationServerEndpoints;
import org.junit.Test;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AADWebAppConfigurationTest {

    @Test
    public void noConfigurationOnMissingRequiredProperties() {
        WebApplicationContextRunnerUtils.getContextRunnerWithoutRequiredProperties()
            .run(context -> {
                assertThat(context).doesNotHaveBean("AADWebAppClientRegistrationRepository");
                assertThat(context).doesNotHaveBean("OAuth2AuthorizedClientRepository");
                assertThat(context).doesNotHaveBean("OAuth2UserService");
        });
    }

    @Test
    public void configurationOnRequiredProperties() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .run(context -> {
                ClientRegistrationRepository clientRegistrationRepository = context.getBean(AADWebAppClientRegistrationRepository.class);
                OAuth2AuthorizedClientRepository authorizedClientRepository = context.getBean(OAuth2AuthorizedClientRepository.class);
                OAuth2UserService userService = context.getBean(OAuth2UserService.class);
                assertNotNull(clientRegistrationRepository);
                assertNotNull(authorizedClientRepository);
                assertNotNull(userService);
            });
    }

    @Test
    public void clientRegistered() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                ClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = clientRepo.findByRegistrationId("azure");

                assertNotNull(azure);
                assertEquals("fake-client-id", azure.getClientId());
                assertEquals("fake-client-secret", azure.getClientSecret());

                AADAuthorizationServerEndpoints endpoints = new AADAuthorizationServerEndpoints("https://login.microsoftonline.com/", "fake-tenant-id");
                assertEquals(endpoints.authorizationEndpoint(),
                    azure.getProviderDetails().getAuthorizationUri());
                assertEquals(endpoints.tokenEndpoint(), azure.getProviderDetails().getTokenUri());
                assertEquals(endpoints.jwkSetEndpoint(), azure.getProviderDetails().getJwkSetUri());
                assertEquals("{baseUrl}/login/oauth2/code/{registrationId}", azure.getRedirectUriTemplate());
                assertDefaultScopes(azure, "openid", "profile", "https://graph.microsoft.com/User.Read", "https://graph.microsoft.com/Directory.AccessAsUser.All");
            });
    }

    @Test
    public void clientRequiresPermissionRegistered() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.authorization-clients.graph.scopes = Calendars.Read",
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                ClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = clientRepo.findByRegistrationId("azure");
                ClientRegistration graph = clientRepo.findByRegistrationId("graph");

                assertNotNull(azure);
                assertNotNull(graph);
                assertDefaultScopes(azure,
                    "openid", "profile", "offline_access", "https://graph.microsoft.com/User.Read", "https://graph.microsoft.com/Directory.AccessAsUser.All", "Calendars.Read");
                assertDefaultScopes(graph, "Calendars.Read");
            });
    }

    @Test
    public void clientRequiresMultiPermissions() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.authorization-clients.graph.scopes = Calendars.Read",
                "azure.activedirectory.authorization-clients.arm.scopes = https://management.core.windows.net/user_impersonation",
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                ClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = clientRepo.findByRegistrationId("azure");
                ClientRegistration graph = clientRepo.findByRegistrationId("graph");
                assertDefaultScopes(
                    azure,
                    "openid",
                    "profile",
                    "offline_access",
                    "Calendars.Read",
                    "https://graph.microsoft.com/User.Read",
                    "https://graph.microsoft.com/Directory.AccessAsUser.All",
                    "https://management.core.windows.net/user_impersonation");
                assertDefaultScopes(graph, "Calendars.Read");
            });
    }

    @Test
    public void clientRequiresPermissionInDefaultClient() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.authorization-clients.graph.scopes = Calendars.Read",
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                ClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = clientRepo.findByRegistrationId("azure");
                assertDefaultScopes(azure,
                    "openid", "profile", "offline_access", "https://graph.microsoft.com/User.Read", "https://graph.microsoft.com/Directory.AccessAsUser.All", "Calendars.Read");
            });
    }

    @Test
    public void aadAwareClientRepository() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.authorization-clients.graph.scopes = Calendars.Read",
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                AADWebAppClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = clientRepo.findByRegistrationId("azure");
                ClientRegistration graph = clientRepo.findByRegistrationId("graph");
                assertDefaultScopes(
                    clientRepo.getAzureClient(),
                    "openid", "profile", "offline_access", "https://graph.microsoft.com/User.Read", "https://graph.microsoft.com/Directory.AccessAsUser.All"
                );
                assertEquals(clientRepo.getAzureClient().getClient(), azure);

                assertFalse(clientRepo.isClientNeedConsentWhenLogin(azure));
                assertTrue(clientRepo.isClientNeedConsentWhenLogin(graph));
                assertFalse(clientRepo.isClientNeedConsentWhenLogin("azure"));
                assertTrue(clientRepo.isClientNeedConsentWhenLogin("graph"));

                List<ClientRegistration> clients = collectClients(clientRepo);
                assertEquals(1, clients.size());
                assertEquals("azure", clients.get(0).getRegistrationId());
            });
    }

    @Test
    public void defaultClientWithAuthzScope() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties().withPropertyValues(
                "azure.activedirectory.authorization-clients.azure.scopes = Calendars.Read",
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                AADWebAppClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                assertDefaultScopes(
                    clientRepo.getAzureClient(),
                    "openid", "profile", "offline_access", "https://graph.microsoft.com/User.Read", "https://graph.microsoft.com/Directory.AccessAsUser.All", "Calendars.Read"
                );
            });
    }

    @Test
    public void customizeUri() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.base-uri = http://localhost/"
            )
            .run(context -> {
                AADWebAppClientRegistrationRepository clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = clientRepo.findByRegistrationId("azure");
                AADAuthorizationServerEndpoints endpoints = new AADAuthorizationServerEndpoints("http://localhost/", "fake-tenant-id");
                assertEquals(endpoints.authorizationEndpoint(),
                    azure.getProviderDetails().getAuthorizationUri());
                assertEquals(endpoints.tokenEndpoint(), azure.getProviderDetails().getTokenUri());
                assertEquals(endpoints.jwkSetEndpoint(), azure.getProviderDetails().getJwkSetUri());
            });
    }

    @Test
    public void clientRequiresOnDemandPermissions() {
        WebApplicationContextRunnerUtils.getContextRunnerWithRequiredProperties()
            .withPropertyValues(
                "azure.activedirectory.authorization-clients.graph.scopes = Calendars.Read",
                "azure.activedirectory.authorization-clients.graph.on-demand = true",
                "azure.activedirectory.authorization-clients.arm.scopes = https://management.core.windows.net/user_impersonation",
                "azure.activedirectory.user-group.allowed-groups = group1, group2"
            )
            .run(context -> {
                AADWebAppClientRegistrationRepository repo = context.getBean(AADWebAppClientRegistrationRepository.class);
                ClientRegistration azure = repo.findByRegistrationId("azure");
                ClientRegistration graph = repo.findByRegistrationId("graph");
                ClientRegistration arm = repo.findByRegistrationId("arm");

                assertNotNull(azure);
                assertDefaultScopes(
                    azure,
                    "openid",
                    "profile",
                    "https://graph.microsoft.com/User.Read",
                    "https://graph.microsoft.com/Directory.AccessAsUser.All",
                    "offline_access",
                    "https://management.core.windows.net/user_impersonation");

                assertFalse(repo.isClientNeedConsentWhenLogin(graph));
                assertTrue(repo.isClientNeedConsentWhenLogin(arm));
                assertFalse(repo.isClientNeedConsentWhenLogin("graph"));
                assertTrue(repo.isClientNeedConsentWhenLogin("arm"));
            });
    }

    private void assertDefaultScopes(ClientRegistration client, String... scopes) {
        assertEquals(scopes.length, client.getScopes().size());
        for (String s : scopes) {
            assertTrue(client.getScopes().contains(s));
        }
    }

    private void assertDefaultScopes(AzureClientRegistration client, String... expected) {
        assertEquals(expected.length, client.getAccessTokenScopes().size());
        for (String e : expected) {
            assertTrue(client.getAccessTokenScopes().contains(e));
        }
    }

    private List<ClientRegistration> collectClients(Iterable<ClientRegistration> itr) {
        List<ClientRegistration> result = new ArrayList<>();
        itr.forEach(result::add);
        return result;
    }
}
