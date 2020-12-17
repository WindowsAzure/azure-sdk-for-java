// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapi;

import org.junit.Test;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.OAuth2LoginAuthenticationFilter;
import org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class AzureActiveDirectoryResourceServerClientConfigurationTest {

    private static final String AAD_PROPERTY_PREFIX = "azure.activedirectory.";

    private final WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
        .withPropertyValues(AAD_PROPERTY_PREFIX + "user-group.allowed-groups=group1",
            AAD_PROPERTY_PREFIX + "tenant-id=fake-tenant-id",
            AAD_PROPERTY_PREFIX + "client-id=fake-client-id",
            AAD_PROPERTY_PREFIX + "client-secret=fake-client-secret");

    @Test
    public void testNotExistBearerTokenAuthenticationToken() {
        this.contextRunner
            .withUserConfiguration(AzureActiveDirectoryResourceServerClientConfiguration.class)
            .withClassLoader(new FilteredClassLoader(BearerTokenAuthenticationToken.class))
            .run(context -> {
                assertThat(context).doesNotHaveBean("AADOAuth2OboAuthorizedClientRepository");
            });
    }

    @Test
    public void testNotExistOAuth2LoginAuthenticationFilter() {
        this.contextRunner
            .withUserConfiguration(AzureActiveDirectoryResourceServerClientConfiguration.class)
            .withClassLoader(new FilteredClassLoader(OAuth2LoginAuthenticationFilter.class))
            .run(context -> {
                assertThat(context).doesNotHaveBean("AADOAuth2OboAuthorizedClientRepository");
            });
    }

    @Test
    public void testOAuth2AuthorizedClientRepository() {
        this.contextRunner
            .withUserConfiguration(AzureActiveDirectoryResourceServerClientConfiguration.class)
            .run(context -> {
                final OAuth2AuthorizedClientRepository aadOboRepo = context.getBean(
                    AADOAuth2OboAuthorizedClientRepository.class);
                assertThat(aadOboRepo).isNotNull();
                assertThat(aadOboRepo).isExactlyInstanceOf(AADOAuth2OboAuthorizedClientRepository.class);
            });
    }

    @Test
    public void testDefaultClientRegistrationRepository() {
        this.contextRunner
            .withUserConfiguration(AzureActiveDirectoryResourceServerClientConfiguration.class)
            .run(context -> {
                OboClientRegistrationRepository graphRepo = context.getBean(OboClientRegistrationRepository
                    .class);
                ClientRegistration graph = graphRepo.findByRegistrationId("graph");

                assertThat(graphRepo).isNotNull();
                assertThat(graphRepo).isExactlyInstanceOf(OboClientRegistrationRepository.class);

                assertThat(graph).isNull();

            });
    }

    @Test
    public void testExistGraphClient() {
        this.contextRunner
            .withUserConfiguration(AzureActiveDirectoryResourceServerClientConfiguration.class)
            .withPropertyValues(AAD_PROPERTY_PREFIX + "webApiClients.graph.scopes=User.read")
            .run(context -> {
                OboClientRegistrationRepository oboRepo = context.getBean(OboClientRegistrationRepository
                    .class);

                ClientRegistration graph = oboRepo.findByRegistrationId("graph");
                Set<String> graphScopes = graph.getScopes();

                assertThat(oboRepo).isExactlyInstanceOf(OboClientRegistrationRepository.class);
                assertThat(graph).isNotNull();
                assertThat(graphScopes).hasSize(1);

            });
    }

}
