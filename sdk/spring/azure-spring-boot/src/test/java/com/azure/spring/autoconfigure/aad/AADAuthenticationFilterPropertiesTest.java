// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.aad;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindException;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.ObjectError;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class AADAuthenticationFilterPropertiesTest {
    @After
    public void clearAllProperties() {
        System.clearProperty(TestConstants.SERVICE_ENVIRONMENT_PROPERTY);
        System.clearProperty(TestConstants.CLIENT_ID_PROPERTY);
        System.clearProperty(TestConstants.CLIENT_SECRET_PROPERTY);
        System.clearProperty(TestConstants.TARGETED_GROUPS_PROPERTY);
    }

    @Test
    public void canSetProperties() {
        configureAllRequiredProperties();

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(Config.class);
            context.refresh();

            final AADAuthenticationProperties properties = context.getBean(AADAuthenticationProperties.class);

            assertThat(properties.getClientId()).isEqualTo(TestConstants.CLIENT_ID);
            assertThat(properties.getClientSecret()).isEqualTo(TestConstants.CLIENT_SECRET);
            assertThat(properties.getActiveDirectoryGroups()
                    .toString()).isEqualTo(TestConstants.TARGETED_GROUPS.toString());
        }
    }

    @Test
    public void defaultEnvironmentIsGlobal() {
        configureAllRequiredProperties();
        assertThat(System.getProperty(TestConstants.SERVICE_ENVIRONMENT_PROPERTY)).isNullOrEmpty();

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(Config.class);
            context.refresh();

            final AADAuthenticationProperties properties = context.getBean(AADAuthenticationProperties.class);

            assertThat(properties.getEnvironment()).isEqualTo("global");
        }
    }

    private void configureAllRequiredProperties() {
        System.setProperty(TestConstants.CLIENT_ID_PROPERTY, TestConstants.CLIENT_ID);
        System.setProperty(TestConstants.CLIENT_SECRET_PROPERTY, TestConstants.CLIENT_SECRET);
        System.setProperty(TestConstants.TARGETED_GROUPS_PROPERTY,
                TestConstants.TARGETED_GROUPS.toString().replace("[", "").replace("]", ""));
        System.setProperty(TestConstants.ALLOW_TELEMETRY_PROPERTY, "false");
    }

    @Test
    @Ignore // TODO (wepa) clientId and clientSecret can also be configured in oauth2 config, test to be refactored
    public void emptySettingsNotAllowed() {
        System.setProperty(TestConstants.CLIENT_ID_PROPERTY, "");
        System.setProperty(TestConstants.CLIENT_SECRET_PROPERTY, "");

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            Exception exception = null;

            context.register(Config.class);

            try {
                context.refresh();
            } catch (Exception e) {
                exception = e;
            }

            assertThat(exception).isNotNull();
            assertThat(exception).isExactlyInstanceOf(ConfigurationPropertiesBindException.class);

            final BindValidationException bindException = (BindValidationException) exception.getCause().getCause();
            final List<ObjectError> errors = bindException.getValidationErrors().getAllErrors();

            final List<String> errorStrings = errors.stream().map(ObjectError::toString).collect(Collectors.toList());

            final List<String> errorStringsExpected = Arrays.asList(
                    "Field error in object 'azure.activedirectory' on field 'activeDirectoryGroups': "
                            + "rejected value [null];",
                    "Field error in object 'azure.activedirectory' on field 'clientId': rejected value [];",
                    "Field error in object 'azure.activedirectory' on field 'clientSecret': rejected value [];"
            );

            Collections.sort(errorStrings);

            assertThat(errors.size()).isEqualTo(errorStringsExpected.size());

            for (int i = 0; i < errorStrings.size(); i++) {
                assertThat(errorStrings.get(i)).contains(errorStringsExpected.get(i));
            }
        }
    }

    @Configuration
    @EnableConfigurationProperties(AADAuthenticationProperties.class)
    static class Config {
    }
}

