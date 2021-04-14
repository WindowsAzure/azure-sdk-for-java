// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.containerregistry.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.models.ImportMode;
import com.azure.resourcemanager.containerregistry.models.ImportSource;
import org.junit.jupiter.params.provider.Arguments;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.azure.core.test.TestBase.getHttpClients;

public class TestUtils {
    public static final Duration ONE_NANO_DURATION = Duration.ofMillis(1);
    public static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    private static final Configuration CONFIGURATION = Configuration.getGlobalConfiguration().clone();

    public static final String ALPINE_REPOSITORY_NAME = "library/alpine";
    public static final String HELLO_WORLD_REPOSITORY_NAME = "library/hello-world";
    public static final String HELLO_WORLD_SEATTLE_REPOSITORY_NAME = "library/hello-seattle";
    public static final String LIBRARY_BUSYBOX_NAME = "library/busybox";
    public static final String LATEST_TAG_NAME = "latest";
    public static final String V1_TAG_NAME = "v1";
    public static final String TAG_TO_DELETE = "test-delete-image-by-tag";
    public static final String ARTIFACT_TO_DELETE = "test-delete-image-by-manifest";
    public static final String TAG_TO_UPDATE = "test-update-properties";
    public static final String TAG_TO_UPDATE_WITH_RESPONSE = "test-update-properties";

    public static final int  PAGESIZE_2 = 2;
    public static final int PAGESIZE_4 = 4;
    public static final int HELLOWORLD_REPOSITORY_MANIFEST_REFERENCES_COUNT = 9;

    public static final String ARM64_ARCHITECTURE = "arm64";
    public static final String LINUX_OPERATING_SYSTEM = "linux";
    public static final String AMD64_ARCHITECTURE = "amd64";
    public static final String WINDOWS_OPERATING_SYSTEM = "windows";
    public static final String PROPERTY_CONTAINER_REGISTRY_NAME = "CONTAINERREGISTRY_REGISTRY_NAME";
    public static final String PROPERTY_CONTAINER_REGISTRY_RESOURCEGROUP = "CONTAINERREGISTRY_RESOURCE_GROUP";
    public static final String PROPERTY_CONTAINERREGISTRY_SUBSCRIPTION_ID = "CONTAINERREGISTRY_SUBSCRIPTION_ID";

    public static final String REGISTRY_URI = "registry.hub.docker.com";

    public static final long SLEEP_TIME_IN_MILLISECONDS = 7000;

    static class FakeCredentials implements TokenCredential {
        @Override
        public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
            return Mono.just(new AccessToken("someFakeToken", OffsetDateTime.MAX));
        }
    }

    /**
     * Returns a stream of arguments that includes all combinations of eligible {@link HttpClient HttpClients} and
     * service versions that should be tested.
     *
     * @return A stream of HttpClient and service version combinations to test.
     */
    static Stream<Arguments> getTestParameters() {
        List<Arguments> argumentsList = new ArrayList<>();
        getHttpClients();
        return argumentsList.stream();
    }

    static <T extends Comparable<? super T>> boolean isSorted(Iterable<T> iterable) {
        Iterator<T> iter = iterable.iterator();
        if (!iter.hasNext()) {
            return true;
        }
        T t = iter.next();
        while (iter.hasNext()) {
            T t2 = iter.next();
            if (t.compareTo(t2) > 0) {
                return false;
            }
            t = t2;
        }
        return true;
    }

    static TokenCredential getCredential(TestMode testMode) {
        if (testMode == TestMode.PLAYBACK) {
            return new FakeCredentials();
        }

        return new DefaultAzureCredentialBuilder().build();
    }

    static void importImage(TestMode mode, String repository, List<String> tags) {
        if (mode == TestMode.PLAYBACK) {
            return;
        }

        TokenCredential credential = getCredential(mode);

        String registryName = CONFIGURATION.get(PROPERTY_CONTAINER_REGISTRY_NAME);
        String resourceGroupName = CONFIGURATION.get(PROPERTY_CONTAINER_REGISTRY_RESOURCEGROUP);
        String subscriptionId = CONFIGURATION.get(PROPERTY_CONTAINERREGISTRY_SUBSCRIPTION_ID);

        tags = tags.stream().map(tag -> String.format("%1$s:%2$s", repository, tag)).collect(Collectors.toList());

        ContainerRegistryManager manager = ContainerRegistryManager.authenticate(credential, new AzureProfile(AzureEnvironment.AZURE));

        manager.serviceClient().getRegistries().importImage(
            resourceGroupName,
            registryName,
            new ImportImageParameters()
                .withMode(ImportMode.FORCE)
                .withSource(new ImportSource().withSourceImage(repository)
                    .withRegistryUri(REGISTRY_URI))
                .withTargetTags(tags));
    }

    static Mono<Long> monoDelay(TestMode testMode) {
        return monoDelay(testMode, SLEEP_TIME_IN_MILLISECONDS);
    }

    static Mono<Long> monoDelay(TestMode testMode, long delayInMs) {
        return Mono.defer(() -> testMode == TestMode.PLAYBACK ? Mono.delay(Duration.ZERO) : Mono.delay(Duration.ofMillis(delayInMs)));
    }
}
