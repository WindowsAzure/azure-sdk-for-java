// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob

import com.azure.core.http.rest.Response
import com.azure.core.util.Context
import com.azure.identity.DefaultAzureCredentialBuilder
import com.azure.storage.blob.models.BlobAnalyticsLogging
import com.azure.storage.blob.models.BlobContainerItem
import com.azure.storage.blob.models.BlobContainerListDetails
import com.azure.storage.blob.models.BlobCorsRule
import com.azure.storage.blob.models.BlobMetrics
import com.azure.storage.blob.models.BlobRetentionPolicy
import com.azure.storage.blob.models.BlobServiceProperties
import com.azure.storage.blob.models.CustomerProvidedKey
import com.azure.storage.blob.models.ListBlobContainersOptions
import com.azure.storage.blob.models.ParallelTransferOptions
import com.azure.storage.blob.models.StaticWebsite

import com.azure.storage.blob.models.BlobStorageException

import com.azure.storage.common.policy.RequestRetryOptions
import com.azure.storage.common.policy.RequestRetryPolicy
import com.azure.storage.common.sas.AccountSasPermission
import com.azure.storage.common.sas.AccountSasResourceType
import com.azure.storage.common.sas.AccountSasService
import com.azure.storage.common.sas.AccountSasSignatureValues
import reactor.core.publisher.Mono
import reactor.test.StepVerifier

import java.time.Duration
import java.time.OffsetDateTime

class ServiceAPITest extends APISpec {

    BlobServiceClient anonymousClient;

    def setup() {
        setup:
        // We shouldnt be getting to the network layer anyway
        anonymousClient = new BlobServiceClientBuilder()
            .endpoint(String.format(defaultEndpointTemplate, primaryCredential.getAccountName()))
            .buildClient()
        def disabled = new BlobRetentionPolicy().setEnabled(false)
        primaryBlobServiceClient.setProperties(new BlobServiceProperties()
            .setStaticWebsite(new StaticWebsite().setEnabled(false))
            .setDeleteRetentionPolicy(disabled)
            .setCors(null)
            .setHourMetrics(new BlobMetrics().setVersion("1.0").setEnabled(false)
                .setRetentionPolicy(disabled))
            .setMinuteMetrics(new BlobMetrics().setVersion("1.0").setEnabled(false)
                .setRetentionPolicy(disabled))
            .setLogging(new BlobAnalyticsLogging().setVersion("1.0")
                .setRetentionPolicy(disabled))
            .setDefaultServiceVersion("2018-03-28"))
    }

    def cleanup() {
        def disabled = new BlobRetentionPolicy().setEnabled(false)
        primaryBlobServiceClient.setProperties(new BlobServiceProperties()
            .setStaticWebsite(new StaticWebsite().setEnabled(false))
            .setDeleteRetentionPolicy(disabled)
            .setCors(null)
            .setHourMetrics(new BlobMetrics().setVersion("1.0").setEnabled(false)
                .setRetentionPolicy(disabled))
            .setMinuteMetrics(new BlobMetrics().setVersion("1.0").setEnabled(false)
                .setRetentionPolicy(disabled))
            .setLogging(new BlobAnalyticsLogging().setVersion("1.0")
                .setRetentionPolicy(disabled))
            .setDefaultServiceVersion("2018-03-28"))
    }

    def "List containers"() {
        when:
        def response =
            primaryBlobServiceClient.listBlobContainers(new ListBlobContainersOptions().setPrefix(containerPrefix + testName), null)

        then:
        for (BlobContainerItem c : response) {
            c.getName().startsWith(containerPrefix)
            c.getProperties().getLastModified() != null
            c.getProperties().getETag() != null
            c.getProperties().getLeaseStatus() != null
            c.getProperties().getLeaseState() != null
            c.getProperties().getLeaseDuration() == null
            c.getProperties().getPublicAccess() == null
            !c.getProperties().isHasLegalHold()
            !c.getProperties().isHasImmutabilityPolicy()
            !c.getProperties().isEncryptionScopeOverridePrevented()
            c.getProperties().getDefaultEncryptionScope()
            !c.isDeleted()
        }
    }

    def "List containers min"() {
        when:
        primaryBlobServiceClient.listBlobContainers().iterator().hasNext()

        then:
        notThrown(BlobStorageException)
    }

    def "List containers marker"() {
        setup:
        for (int i = 0; i < 10; i++) {
            primaryBlobServiceClient.createBlobContainer(generateContainerName())
        }

        def listResponse = primaryBlobServiceClient.listBlobContainers().iterator()
        def firstContainerName = listResponse.next().getName()

        expect:
        // Assert that the second segment is indeed after the first alphabetically
        firstContainerName < listResponse.next().getName()
    }

    def "List containers details"() {
        setup:
        def metadata = new HashMap<String, String>()
        metadata.put("foo", "bar")
        cc = primaryBlobServiceClient.createBlobContainerWithResponse("aaa" + generateContainerName(), metadata, null, null).getValue()

        expect:
        primaryBlobServiceClient.listBlobContainers(new ListBlobContainersOptions()
            .setDetails(new BlobContainerListDetails().setRetrieveMetadata(true))
            .setPrefix("aaa" + containerPrefix), null)
            .iterator().next().getMetadata() == metadata

        // Container with prefix "aaa" will not be cleaned up by normal test cleanup.
        cc.deleteWithResponse(null, null, null).getStatusCode() == 202
    }

    def "List containers maxResults"() {
        setup:
        def NUM_CONTAINERS = 5
        def PAGE_RESULTS = 3
        def containerName = generateContainerName()
        def containerPrefix = containerName.substring(0, Math.min(60, containerName.length()))

        def containers = [] as Collection<BlobContainerClient>
        for (i in (1..NUM_CONTAINERS)) {
            containers << primaryBlobServiceClient.createBlobContainer(containerPrefix + i)
        }

        expect:
        primaryBlobServiceClient.listBlobContainers(new ListBlobContainersOptions()
            .setPrefix(containerPrefix)
            .setMaxResultsPerPage(PAGE_RESULTS), null)
            .iterableByPage().iterator().next().getValue().size() == PAGE_RESULTS

        cleanup:
        containers.each { container -> container.delete() }
    }

    def "List deleted"() {
        given:
        def NUM_CONTAINERS = 5
        def containerName = generateContainerName()
        def containerPrefix = containerName.substring(0, Math.min(60, containerName.length()))

        def containers = [] as Collection<BlobContainerClient>
        for (i in (1..NUM_CONTAINERS)) {
            containers << primaryBlobServiceClient.createBlobContainer(containerPrefix + i)
        }
        containers.each { container -> container.delete() }

        when:
        def listResult = primaryBlobServiceClient.listBlobContainers(
            new ListBlobContainersOptions()
            .setPrefix(containerPrefix)
            .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true)),
            null)

        then:
        for (BlobContainerItem item : listResult) {
            item.isDeleted()
        }
        listResult.size() == NUM_CONTAINERS
    }

    def "List containers error"() {
        when:
        primaryBlobServiceClient.listBlobContainers().streamByPage("garbage continuation token").count()

        then:
        thrown(BlobStorageException)
    }

    def "List containers anonymous"() {
        when:
        anonymousClient.listBlobContainers().iterator()

        then:
        thrown(IllegalStateException)
    }

    def "List containers with timeout still backed by PagedFlux"() {
        setup:
        def NUM_CONTAINERS = 5
        def PAGE_RESULTS = 3

        def containers = [] as Collection<BlobContainerClient>
        for (i in (1..NUM_CONTAINERS)) {
            containers << primaryBlobServiceClient.createBlobContainer(generateContainerName())
        }

        when: "Consume results by page"
        primaryBlobServiceClient.listBlobContainers(new ListBlobContainersOptions().setMaxResultsPerPage(PAGE_RESULTS), Duration.ofSeconds(10)).streamByPage().count()

        then: "Still have paging functionality"
        notThrown(Exception)

        cleanup:
        containers.each { container -> container.delete() }
    }

    def validatePropsSet(BlobServiceProperties sent, BlobServiceProperties received) {
        return received.getLogging().isRead() == sent.getLogging().isRead() &&
            received.getLogging().isDelete() == sent.getLogging().isDelete() &&
            received.getLogging().isWrite() == sent.getLogging().isWrite() &&
            received.getLogging().getVersion() == sent.getLogging().getVersion() &&
            received.getLogging().getRetentionPolicy().getDays() == sent.getLogging().getRetentionPolicy().getDays() &&
            received.getLogging().getRetentionPolicy().isEnabled() == sent.getLogging().getRetentionPolicy().isEnabled() &&

            received.getCors().size() == sent.getCors().size() &&
            received.getCors().get(0).getAllowedMethods() == sent.getCors().get(0).getAllowedMethods() &&
            received.getCors().get(0).getAllowedHeaders() == sent.getCors().get(0).getAllowedHeaders() &&
            received.getCors().get(0).getAllowedOrigins() == sent.getCors().get(0).getAllowedOrigins() &&
            received.getCors().get(0).getExposedHeaders() == sent.getCors().get(0).getExposedHeaders() &&
            received.getCors().get(0).getMaxAgeInSeconds() == sent.getCors().get(0).getMaxAgeInSeconds() &&

            received.getDefaultServiceVersion() == sent.getDefaultServiceVersion() &&

            received.getHourMetrics().isEnabled() == sent.getHourMetrics().isEnabled() &&
            received.getHourMetrics().isIncludeApis() == sent.getHourMetrics().isIncludeApis() &&
            received.getHourMetrics().getRetentionPolicy().isEnabled() == sent.getHourMetrics().getRetentionPolicy().isEnabled() &&
            received.getHourMetrics().getRetentionPolicy().getDays() == sent.getHourMetrics().getRetentionPolicy().getDays() &&
            received.getHourMetrics().getVersion() == sent.getHourMetrics().getVersion() &&

            received.getMinuteMetrics().isEnabled() == sent.getMinuteMetrics().isEnabled() &&
            received.getMinuteMetrics().isIncludeApis() == sent.getMinuteMetrics().isIncludeApis() &&
            received.getMinuteMetrics().getRetentionPolicy().isEnabled() == sent.getMinuteMetrics().getRetentionPolicy().isEnabled() &&
            received.getMinuteMetrics().getRetentionPolicy().getDays() == sent.getMinuteMetrics().getRetentionPolicy().getDays() &&
            received.getMinuteMetrics().getVersion() == sent.getMinuteMetrics().getVersion() &&

            received.getDeleteRetentionPolicy().isEnabled() == sent.getDeleteRetentionPolicy().isEnabled() &&
            received.getDeleteRetentionPolicy().getDays() == sent.getDeleteRetentionPolicy().getDays() &&

            received.getStaticWebsite().isEnabled() == sent.getStaticWebsite().isEnabled() &&
            received.getStaticWebsite().getIndexDocument() == sent.getStaticWebsite().getIndexDocument() &&
            received.getStaticWebsite().getErrorDocument404Path() == sent.getStaticWebsite().getErrorDocument404Path()
    }

    def "Set get properties"() {
        when:
        def retentionPolicy = new BlobRetentionPolicy().setDays(5).setEnabled(true)
        def logging = new BlobAnalyticsLogging().setRead(true).setVersion("1.0")
            .setRetentionPolicy(retentionPolicy)
        def corsRules = new ArrayList<BlobCorsRule>()
        corsRules.add(new BlobCorsRule().setAllowedMethods("GET,PUT,HEAD")
            .setAllowedOrigins("*")
            .setAllowedHeaders("x-ms-version")
            .setExposedHeaders("x-ms-client-request-id")
            .setMaxAgeInSeconds(10))
        def defaultServiceVersion = "2016-05-31"
        def hourMetrics = new BlobMetrics().setEnabled(true).setVersion("1.0")
            .setRetentionPolicy(retentionPolicy).setIncludeApis(true)
        def minuteMetrics = new BlobMetrics().setEnabled(true).setVersion("1.0")
            .setRetentionPolicy(retentionPolicy).setIncludeApis(true)
        def website = new StaticWebsite().setEnabled(true)
            .setIndexDocument("myIndex.html")
            .setErrorDocument404Path("custom/error/path.html")

        def sentProperties = new BlobServiceProperties()
            .setLogging(logging).setCors(corsRules).setDefaultServiceVersion(defaultServiceVersion)
            .setMinuteMetrics(minuteMetrics).setHourMetrics(hourMetrics)
            .setDeleteRetentionPolicy(retentionPolicy)
            .setStaticWebsite(website)

        def headers = primaryBlobServiceClient.setPropertiesWithResponse(sentProperties, null, null).getHeaders()

        // Service properties may take up to 30s to take effect. If they weren't already in place, wait.
        sleepIfRecord(30 * 1000)

        def receivedProperties = primaryBlobServiceClient.getProperties()

        then:
        headers.getValue("x-ms-request-id") != null
        headers.getValue("x-ms-version") != null
        validatePropsSet(sentProperties, receivedProperties)
    }

    // In java, we don't have support from the validator for checking the bounds on days. The service will catch these.

    def "Set props min"() {
        setup:
        def retentionPolicy = new BlobRetentionPolicy().setDays(5).setEnabled(true)
        def logging = new BlobAnalyticsLogging().setRead(true).setVersion("1.0")
            .setRetentionPolicy(retentionPolicy)
        def corsRules = new ArrayList<BlobCorsRule>()
        corsRules.add(new BlobCorsRule().setAllowedMethods("GET,PUT,HEAD")
            .setAllowedOrigins("*")
            .setAllowedHeaders("x-ms-version")
            .setExposedHeaders("x-ms-client-request-id")
            .setMaxAgeInSeconds(10))
        def defaultServiceVersion = "2016-05-31"
        def hourMetrics = new BlobMetrics().setEnabled(true).setVersion("1.0")
            .setRetentionPolicy(retentionPolicy).setIncludeApis(true)
        def minuteMetrics = new BlobMetrics().setEnabled(true).setVersion("1.0")
            .setRetentionPolicy(retentionPolicy).setIncludeApis(true)
        def website = new StaticWebsite().setEnabled(true)
            .setIndexDocument("myIndex.html")
            .setErrorDocument404Path("custom/error/path.html")

        def sentProperties = new BlobServiceProperties()
            .setLogging(logging).setCors(corsRules).setDefaultServiceVersion(defaultServiceVersion)
            .setMinuteMetrics(minuteMetrics).setHourMetrics(hourMetrics)
            .setDeleteRetentionPolicy(retentionPolicy)
            .setStaticWebsite(website)

        expect:
        primaryBlobServiceClient.setPropertiesWithResponse(sentProperties, null, null).getStatusCode() == 202
    }

    def "Set props cors check"() {
        setup:
        def serviceProperties = primaryBlobServiceClient.getProperties()

        // Some properties are not set and this test validates that they are not null when sent to the service
        def rule = new BlobCorsRule()
        rule.setAllowedOrigins("microsoft.com")
        rule.setMaxAgeInSeconds(60)
        rule.setAllowedMethods("GET")
        rule.setAllowedHeaders("x-ms-version")

        serviceProperties.setCors(Collections.singletonList(rule))

        expect:
        primaryBlobServiceClient.setPropertiesWithResponse(serviceProperties, null, null).getStatusCode() == 202
    }

    def "Set props error"() {
        when:
        getServiceClient(primaryCredential, "https://error.blob.core.windows.net")
            .setProperties(new BlobServiceProperties())

        then:
        thrown(BlobStorageException)
    }

    def "Set props anonymous"() {
        when:
        anonymousClient.setProperties(new BlobServiceProperties())

        then:
        thrown(IllegalStateException)
    }

    def "Get props min"() {
        expect:
        primaryBlobServiceClient.getPropertiesWithResponse(null, null).getStatusCode() == 200
    }

    def "Get props error"() {
        when:
        getServiceClient(primaryCredential, "https://error.blob.core.windows.net")
            .getProperties()

        then:
        thrown(BlobStorageException)
    }

    def "Get props anonymous"() {
        when:
        anonymousClient.getProperties()

        then:
        thrown(IllegalStateException)
    }

    def "Get UserDelegationKey"() {
        setup:
        def start = OffsetDateTime.now()
        def expiry = start.plusDays(1)

        def response = getOAuthServiceClient().getUserDelegationKeyWithResponse(start, expiry, null, null)

        expect:
        response.getStatusCode() == 200
        response.getValue() != null
        response.getValue().getSignedObjectId() != null
        response.getValue().getSignedTenantId() != null
        response.getValue().getSignedStart() != null
        response.getValue().getSignedExpiry() != null
        response.getValue().getSignedService() != null
        response.getValue().getSignedVersion() != null
        response.getValue().getValue() != null
    }

    def "Get UserDelegationKey min"() {
        setup:
        def expiry = OffsetDateTime.now().plusDays(1)

        def response = getOAuthServiceClient().getUserDelegationKeyWithResponse(null, expiry, null, null)

        expect:
        response.getStatusCode() == 200
    }

    def "Get UserDelegationKey error"() {
        when:
        getOAuthServiceClient().getUserDelegationKey(start, expiry)

        then:
        thrown(exception)

        where:
        start                | expiry                            || exception
        null                 | null                              || NullPointerException
        OffsetDateTime.now() | OffsetDateTime.now().minusDays(1) || IllegalArgumentException
    }

    def "Get UserDelegationKey anonymous"() {
        when:
        anonymousClient.getUserDelegationKey(null, OffsetDateTime.now().plusDays(1))

        then:
        thrown(IllegalStateException)
    }

    def "Get stats"() {
        setup:
        def secondaryEndpoint = String.format("https://%s-secondary.blob.core.windows.net", primaryCredential.getAccountName())
        def serviceClient = getServiceClient(primaryCredential, secondaryEndpoint)
        def response = serviceClient.getStatisticsWithResponse(null, null)

        expect:
        response.getHeaders().getValue("x-ms-version") != null
        response.getHeaders().getValue("x-ms-request-id") != null
        response.getHeaders().getValue("Date") != null
        response.getValue().getGeoReplication().getStatus() != null
        response.getValue().getGeoReplication().getLastSyncTime() != null
    }

    def "Get stats min"() {
        setup:
        def secondaryEndpoint = String.format("https://%s-secondary.blob.core.windows.net", primaryCredential.getAccountName())
        def serviceClient = getServiceClient(primaryCredential, secondaryEndpoint)

        expect:
        serviceClient.getStatisticsWithResponse(null, null).getStatusCode() == 200
    }

    def "Get stats error"() {
        when:
        primaryBlobServiceClient.getStatistics()

        then:
        thrown(BlobStorageException)
    }

    def "Get stats anonymous"() {
        when:
        anonymousClient.getStatistics()

        then:
        thrown(IllegalStateException)
    }

    def "Get account info"() {
        when:
        def response = primaryBlobServiceClient.getAccountInfoWithResponse(null, null)

        then:
        response.getHeaders().getValue("Date") != null
        response.getHeaders().getValue("x-ms-version") != null
        response.getHeaders().getValue("x-ms-request-id") != null
        response.getValue().getAccountKind() != null
        response.getValue().getSkuName() != null
    }

    def "Get account info min"() {
        expect:
        primaryBlobServiceClient.getAccountInfoWithResponse(null, null).getStatusCode() == 200
    }

    // This test validates a fix for a bug that caused NPE to be thrown when the account did not exist.
    def "Invalid account name"() {
        setup:
        def badURL = new URL("http://fake.blobfake.core.windows.net")
        def client = getServiceClient(primaryCredential, badURL.toString(),
            new RequestRetryPolicy(new RequestRetryOptions(null, 2, null, null, null, null)))

        when:
        client.getProperties()

        then:
        def e = thrown(RuntimeException)
        e.getCause() instanceof UnknownHostException
    }

    def "Get account info anonymous"() {
        when:
        anonymousClient.getAccountInfo()

        then:
        thrown(IllegalStateException)
    }

    def "Get account sas anonymous"() {
        setup:
        def expiryTime = OffsetDateTime.now().plusDays(1)
        def permissions = new AccountSasPermission().setReadPermission(true)
        def services = new AccountSasService().setBlobAccess(true)
        def resourceTypes = new AccountSasResourceType().setService(true)

        when:
        anonymousClient.generateAccountSas(new AccountSasSignatureValues(expiryTime, permissions, services, resourceTypes))

        then:
        thrown(IllegalStateException)
    }

    def "Builder cpk validation"() {
        setup:
        String endpoint = BlobUrlParts.parse(primaryBlobServiceClient.getAccountUrl()).setScheme("http").toUrl()
        def builder = new BlobServiceClientBuilder()
            .customerProvidedKey(new CustomerProvidedKey(Base64.getEncoder().encodeToString(getRandomByteArray(256))))
            .endpoint(endpoint)

        when:
        builder.buildClient()

        then:
        thrown(IllegalArgumentException)
    }

    def "Builder bearer token validation"() {
        setup:
        String endpoint = BlobUrlParts.parse(primaryBlobServiceClient.getAccountUrl()).setScheme("http").toUrl()
        def builder = new BlobServiceClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint(endpoint)

        when:
        builder.buildClient()

        then:
        thrown(IllegalArgumentException)
    }


    def "Restore Container"() {
        given:
        def cc1 = primaryBlobServiceClient.getBlobContainerClient(generateContainerName())
        cc1.create()
        def blobName = generateBlobName()
        cc1.getBlobClient(blobName).upload(defaultInputStream.get(), 7)
        cc1.delete()
        def blobContainerItem = primaryBlobServiceClient.listBlobContainers(
            new ListBlobContainersOptions()
                .setPrefix(cc1.getBlobContainerName())
                .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true)),
            null).first()

        if (!playbackMode()) {
            Thread.sleep(30000)
        }

        when:
        def restoredContainerClient = primaryBlobServiceClient
            .undeleteBlobContainer(blobContainerItem.getName(), blobContainerItem.getVersion())

        then:
        restoredContainerClient.listBlobs().size() == 1
        restoredContainerClient.listBlobs().first().getName() == blobName
    }

    def "Restore Container into other container"() {
        given:
        def cc1 = primaryBlobServiceClient.getBlobContainerClient(generateContainerName())
        cc1.create()
        def blobName = generateBlobName()
        cc1.getBlobClient(blobName).upload(defaultInputStream.get(), 7)
        cc1.delete()
        def blobContainerItem = primaryBlobServiceClient.listBlobContainers(
            new ListBlobContainersOptions()
                .setPrefix(cc1.getBlobContainerName())
                .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true)),
            null).first()

        if (!playbackMode()) {
            Thread.sleep(30000)
        }

        when:
        def restoredContainerClient = primaryBlobServiceClient.undeleteBlobContainer(
            blobContainerItem.getName(), blobContainerItem.getVersion(), generateContainerName())

        then:
        restoredContainerClient.listBlobs().size() == 1
        restoredContainerClient.listBlobs().first().getName() == blobName
    }

    def "Restore Container with response"() {
        given:
        def cc1 = primaryBlobServiceClient.getBlobContainerClient(generateContainerName())
        cc1.create()
        def blobName = generateBlobName()
        cc1.getBlobClient(blobName).upload(defaultInputStream.get(), 7)
        cc1.delete()
        def blobContainerItem = primaryBlobServiceClient.listBlobContainers(
            new ListBlobContainersOptions()
                .setPrefix(cc1.getBlobContainerName())
                .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true)),
            null).first()

        if (!playbackMode()) {
            Thread.sleep(30000)
        }

        when:
        def response = primaryBlobServiceClient.undeleteBlobContainerWithResponse(
            blobContainerItem.getName(), blobContainerItem.getVersion(),
            Duration.ofMinutes(1), Context.NONE)
        def restoredContainerClient = response.getValue()

        then:
        response != null
        response.getStatusCode() == 201
        restoredContainerClient.listBlobs().size() == 1
        restoredContainerClient.listBlobs().first().getName() == blobName
    }

    def "Restore Container async"() {
        given:
        def cc1 = primaryBlobServiceAsyncClient.getBlobContainerAsyncClient(generateContainerName())
        def blobName = generateBlobName()
        def delay = playbackMode() ? 0L : 30000L

        def blobContainerItemMono = cc1.create()
        .then(cc1.getBlobAsyncClient(blobName).upload(defaultFlux, new ParallelTransferOptions()))
        .then(cc1.delete())
        .then(Mono.delay(Duration.ofMillis(delay)))
        .then(primaryBlobServiceAsyncClient.listBlobContainers(
            new ListBlobContainersOptions()
                .setPrefix(cc1.getBlobContainerName())
                .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true))
        ).next())

        when:
        def restoredContainerClientMono = blobContainerItemMono.flatMap {
            blobContainerItem -> primaryBlobServiceAsyncClient.undeleteBlobContainer(blobContainerItem.getName(), blobContainerItem.getVersion())
        }

        then:
        StepVerifier.create(restoredContainerClientMono.flatMap {restoredContainerClient -> restoredContainerClient.listBlobs().collectList() })
        .assertNext( {
            assert it.size() == 1
            assert it.first().getName() == blobName
        })
        .verifyComplete()
    }

    def "Restore Container async with response"() {
        given:
        def cc1 = primaryBlobServiceAsyncClient.getBlobContainerAsyncClient(generateContainerName())
        def blobName = generateBlobName()
        def delay = playbackMode() ? 0L : 30000L

        def blobContainerItemMono = cc1.create()
            .then(cc1.getBlobAsyncClient(blobName).upload(defaultFlux, new ParallelTransferOptions()))
            .then(cc1.delete())
            .then(Mono.delay(Duration.ofMillis(delay)))
            .then(primaryBlobServiceAsyncClient.listBlobContainers(
                new ListBlobContainersOptions()
                    .setPrefix(cc1.getBlobContainerName())
                    .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true))
            ).next())

        when:
        def responseMono = blobContainerItemMono.flatMap {
            blobContainerItem -> primaryBlobServiceAsyncClient.undeleteBlobContainerWithResponse(blobContainerItem.getName(), blobContainerItem.getVersion())
        }

        then:
        StepVerifier.create(responseMono)
        .assertNext({
            assert it != null
            assert it.getStatusCode() == 201
            assert it.getValue() != null
        })
        .verifyComplete()

        StepVerifier.create(responseMono.flatMap {r -> r.getValue().listBlobs().collectList()})
            .assertNext({
                assert it.size() == 1
                assert it.first().getName() == blobName
            })
            .verifyComplete()
    }

    def "Restore Container error"() {
        when:
        primaryBlobServiceClient.undeleteBlobContainer(generateContainerName(), "01D60F8BB59A4652")

        then:
        thrown(BlobStorageException.class)
    }

    def "Restore Container into existing container error"() {
        given:
        def cc1 = primaryBlobServiceClient.getBlobContainerClient(generateContainerName())
        cc1.create()
        def blobName = generateBlobName()
        cc1.getBlobClient(blobName).upload(defaultInputStream.get(), 7)
        cc1.delete()
        def blobContainerItem = primaryBlobServiceClient.listBlobContainers(
            new ListBlobContainersOptions()
                .setPrefix(cc1.getBlobContainerName())
                .setDetails(new BlobContainerListDetails().setRetrieveDeleted(true)),
            null).first()

        if (!playbackMode()) {
            Thread.sleep(30000)
        }

        when:
        def cc2 = primaryBlobServiceClient.createBlobContainer(generateContainerName())
        primaryBlobServiceClient.undeleteBlobContainer(blobContainerItem.getName(), blobContainerItem.getVersion(), cc2.getBlobContainerName())

        then:
        thrown(BlobStorageException.class)
    }
}
