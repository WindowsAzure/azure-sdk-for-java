// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.spring.cloud.autoconfigure.storage;

import static com.microsoft.azure.spring.cloud.context.core.util.Constants.SPRING_CLOUD_STORAGE_BLOB_APPLICATION_ID;
import static com.microsoft.azure.spring.cloud.context.core.util.Constants.SPRING_CLOUD_STORAGE_FILE_SHARE_APPLICATION_ID;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.file.share.ShareServiceClientBuilder;
import com.microsoft.azure.identity.spring.SpringEnvironmentTokenBuilder;
import com.microsoft.azure.management.storage.StorageAccount;
import com.microsoft.azure.spring.cloud.autoconfigure.context.AzureContextAutoConfiguration;
import com.microsoft.azure.spring.cloud.context.core.api.EnvironmentProvider;
import com.microsoft.azure.spring.cloud.context.core.api.ResourceManagerProvider;
import com.microsoft.azure.spring.cloud.context.core.storage.StorageConnectionStringProvider;
import com.microsoft.azure.spring.cloud.storage.AzureStorageProtocolResolver;
import com.microsoft.azure.spring.cloud.telemetry.TelemetryCollector;

/**
 * An auto-configuration for Azure Storage Account
 *
 * @author Warren Zhu
 */
@Configuration
@AutoConfigureAfter(AzureContextAutoConfiguration.class)
@ConditionalOnClass({ BlobServiceClientBuilder.class, ShareServiceClientBuilder.class })
@ConditionalOnProperty(name = "spring.cloud.azure.storage.account")
@EnableConfigurationProperties(AzureStorageProperties.class)
public class AzureStorageAutoConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(AzureStorageAutoConfiguration.class);
    private static final String STORAGE = "Storage";
    private static final String ACCOUNT_NAME = "AccountName";

    @Autowired(required = false)
    private ResourceManagerProvider resourceManagerProvider;

    @PostConstruct
    public void collectTelemetry() {
        TelemetryCollector.getInstance().addService(STORAGE);
    }

    @Autowired
    private Environment environment;

    @Bean
    @ConditionalOnMissingBean
    public BlobServiceClientBuilder blobServiceClientBuilder(AzureStorageProperties storageProperties,
            EnvironmentProvider environmentProvider) {

        BlobServiceClientBuilder authenticatedClientBuilder = null;

        // Use storage credentials where provided, default identity otherwise.
        if (StringUtils.isNotBlank(storageProperties.getAccessKey())) {
            String connectionString = null;
            if (resourceManagerProvider != null) {
                StorageAccount storageAccount = resourceManagerProvider.getStorageAccountManager()
                        .getOrCreate(storageProperties.getAccount());
                connectionString = StorageConnectionStringProvider.getConnectionString(storageAccount,
                        environmentProvider.getEnvironment(), storageProperties.isSecureTransfer());
            } else {
                connectionString = StorageConnectionStringProvider.getConnectionString(storageProperties.getAccount(),
                        storageProperties.getAccessKey(), environmentProvider.getEnvironment());
                TelemetryCollector.getInstance().addProperty(STORAGE, ACCOUNT_NAME, storageProperties.getAccount());
            }
            authenticatedClientBuilder = new BlobServiceClientBuilder().connectionString(connectionString);

        } else {
            TokenCredential defaultIdentityCredential = new SpringEnvironmentTokenBuilder().fromEnvironment(environment)
                    .defaultCredential().build();
            authenticatedClientBuilder = new BlobServiceClientBuilder().credential(defaultIdentityCredential);
        }

        return authenticatedClientBuilder
                .httpLogOptions(new HttpLogOptions().setApplicationId(SPRING_CLOUD_STORAGE_BLOB_APPLICATION_ID));
    }

    @Bean
    @ConditionalOnMissingBean
    public ShareServiceClientBuilder shareServiceClientBuilder(AzureStorageProperties storageProperties,
            EnvironmentProvider environmentProvider) {
        String connectionString;
        String connectionString1;
        if (resourceManagerProvider != null) {
            String accountName = storageProperties.getAccount();

            StorageAccount storageAccount = resourceManagerProvider.getStorageAccountManager().getOrCreate(accountName);
            connectionString1 = StorageConnectionStringProvider.getConnectionString(storageAccount,
                    environmentProvider.getEnvironment(), storageProperties.isSecureTransfer());
        } else {
            connectionString1 = StorageConnectionStringProvider.getConnectionString(storageProperties.getAccount(),
                    storageProperties.getAccessKey(), environmentProvider.getEnvironment());
            TelemetryCollector.getInstance().addProperty(STORAGE, ACCOUNT_NAME, storageProperties.getAccount());
        }

        connectionString = connectionString1;

        return new ShareServiceClientBuilder().connectionString(connectionString)
                .httpLogOptions(new HttpLogOptions().setApplicationId(SPRING_CLOUD_STORAGE_FILE_SHARE_APPLICATION_ID));
    }

    @Configuration
    @ConditionalOnClass(AzureStorageProtocolResolver.class)
    @Import(AzureStorageProtocolResolver.class)
    static class StorageResourceConfiguration {
    }
}
