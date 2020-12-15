// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.aad;

import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.core.env.Environment;
import org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken;

import java.util.Map;

import static com.azure.spring.autoconfigure.aad.AADAuthenticationProperties.UserGroupProperties;
import static org.assertj.core.api.Assertions.assertThat;

public class AADAuthenticationAutoConfigurationTest {
    private final WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
        .withClassLoader(new FilteredClassLoader(BearerTokenAuthenticationToken.class))
        .withConfiguration(AutoConfigurations.of(AADAuthenticationFilterAutoConfiguration.class))
        .withPropertyValues("azure.activedirectory.client-id=fake-client-id",
            "azure.activedirectory.client-secret=fake-client-secret",
            "azure.activedirectory.user-group.allowed-groups=fake-group",
            "azure.service.endpoints.global.aadKeyDiscoveryUri=http://fake.aad.discovery.uri",
            TestConstants.ALLOW_TELEMETRY_PROPERTY + "=false");

    @Test
    public void createAADAuthenticationFilter() {
        this.contextRunner.run(context -> {
            final AADAuthenticationFilter aadAuthenticationFilter = context.getBean(AADAuthenticationFilter.class);
            assertThat(aadAuthenticationFilter).isNotNull();
            assertThat(aadAuthenticationFilter).isExactlyInstanceOf(AADAuthenticationFilter.class);
        });
    }

    @Test
    public void serviceEndpointsCanBeOverridden() {
        this.contextRunner.withPropertyValues("azure.service.endpoints.global.aadKeyDiscoveryUri=https://test/",
            "azure.service.endpoints.global.aadSigninUri=https://test/",
            "azure.service.endpoints.global.aadGraphApiUri=https://test/",
            "azure.service.endpoints.global.aadKeyDiscoveryUri=https://test/",
            "azure.service.endpoints.global.aadMembershipRestUri=https://test/")
            .run(context -> {
                final Environment environment = context.getEnvironment();
                assertThat(environment.getProperty("azure.service.endpoints.global.aadSigninUri"))
                    .isEqualTo("https://test/");
                assertThat(environment.getProperty("azure.service.endpoints.global.aadGraphApiUri"))
                    .isEqualTo("https://test/");
                assertThat(environment.getProperty("azure.service.endpoints.global.aadKeyDiscoveryUri"))
                    .isEqualTo("https://test/");
                assertThat(environment.getProperty("azure.service.endpoints.global.aadMembershipRestUri"))
                    .isEqualTo("https://test/");
                final ServiceEndpointsProperties serviceEndpointsProperties =
                    context.getBean(ServiceEndpointsProperties.class);
                assertThat(serviceEndpointsProperties).isNotNull();
                assertThat(serviceEndpointsProperties.getEndpoints()).isNotEmpty();

                final Map<String, ServiceEndpoints> endpoints = serviceEndpointsProperties.getEndpoints();
                assertThat(endpoints).hasSize(4);
                assertThat(endpoints.get("cn")).isNotNull()
                    .extracting(ServiceEndpoints::getAadGraphApiUri, ServiceEndpoints::getAadKeyDiscoveryUri,
                        ServiceEndpoints::getAadMembershipRestUri, ServiceEndpoints::getAadSigninUri)
                    .containsExactly("https://graph.chinacloudapi.cn/",
                        "https://login.partner.microsoftonline.cn/common/discovery/keys",
                        "https://graph.chinacloudapi.cn/me/memberOf?api-version=1.6",
                        "https://login.partner.microsoftonline.cn/");
                assertThat(endpoints.get("global")).isNotNull()
                    .extracting(ServiceEndpoints::getAadGraphApiUri, ServiceEndpoints::getAadKeyDiscoveryUri,
                        ServiceEndpoints::getAadMembershipRestUri, ServiceEndpoints::getAadSigninUri)
                    .containsExactly("https://test/", "https://test/", "https://test/", "https://test/");
            });
    }

    @Test
    public void testUserGroupPropertiesAreOverridden() {
        contextRunner.withPropertyValues("azure.activedirectory.user-group.allowed-groups=another_group,third_group",
            "azure.activedirectory.user-group.key=key", "azure.activedirectory.user-group.value=value",
            "azure.activedirectory.user-group.object-id-key=objidk")
            .run(context -> {
                    assertThat(context.getBean(AADAuthenticationProperties.class)).isNotNull();

                    final UserGroupProperties userGroupProperties = context
                        .getBean(AADAuthenticationProperties.class).getUserGroup();

                    assertThat(userGroupProperties).hasNoNullFieldsOrProperties()
                        .extracting(UserGroupProperties::getKey, UserGroupProperties::getValue,
                            UserGroupProperties::getObjectIDKey).containsExactly("key", "value", "objidk");

                    assertThat(userGroupProperties.getAllowedGroups()).isNotEmpty()
                        .hasSize(2).containsExactly("another_group", "third_group");
                }
            );

    }
}
