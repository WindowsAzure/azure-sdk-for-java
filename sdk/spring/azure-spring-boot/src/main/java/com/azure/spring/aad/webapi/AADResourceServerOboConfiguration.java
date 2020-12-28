// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapi;

import com.azure.spring.aad.webapp.AADAuthorizationServerEndpoints;
import com.azure.spring.aad.webapp.AuthorizationProperties;
import com.azure.spring.autoconfigure.aad.AADAuthenticationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.OAuth2LoginAuthenticationFilter;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * The configuration will not be activated if no {@link OAuth2LoginAuthenticationFilter} class provided.
 * </p>
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnResource(resources = "classpath:aad.enable.config")
@EnableConfigurationProperties({ AADAuthenticationProperties.class })
@ConditionalOnClass({ BearerTokenAuthenticationToken.class, OAuth2LoginAuthenticationFilter.class })
public class AADResourceServerOboConfiguration {

    @Autowired
    private AADAuthenticationProperties properties;

    @Bean
    @ConditionalOnMissingBean({ ClientRegistrationRepository.class, InMemoryClientRegistrationRepository.class })
    public ClientRegistrationRepository oboClientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(createOboClients());
    }

    /**
     * Use InMemoryClientRegistrationRepository to create AADOAuth2OboAuthorizedClientRepository
     *
     * @param repo client registration
     * @return AADOAuth2OboAuthorizedClientRepository Bean
     */
    @Bean
    @ConditionalOnMissingBean
    public OAuth2AuthorizedClientRepository oAuth2AuthorizedClientRepository(
        InMemoryClientRegistrationRepository repo) {
        return new AADOAuth2OboAuthorizedClientRepository(repo);
    }

    public List<ClientRegistration> createOboClients() {
        List<ClientRegistration> result = new ArrayList<>();
        for (String name : properties.getAuthorizationClients().keySet()) {
            AuthorizationProperties authorizationProperties = properties.getAuthorizationClients().get(name);
            ClientRegistration.Builder builder = createClientBuilder(name);
            builder.scope(authorizationProperties.getScopes());
            result.add(builder.build());
        }
        return result;
    }

    private ClientRegistration.Builder createClientBuilder(String id) {
        ClientRegistration.Builder result = ClientRegistration.withRegistrationId(id);
        result.authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN);
        result.redirectUriTemplate("{baseUrl}/login/oauth2/code/{registrationId}");

        result.clientId(properties.getClientId());
        result.clientSecret(properties.getClientSecret());

        AADAuthorizationServerEndpoints endpoints = new AADAuthorizationServerEndpoints(
            properties.getBaseUri(), properties.getTenantId());
        result.authorizationUri(endpoints.authorizationEndpoint());
        result.tokenUri(endpoints.tokenEndpoint());
        result.jwkSetUri(endpoints.jwkSetEndpoint());

        return result;
    }

}
