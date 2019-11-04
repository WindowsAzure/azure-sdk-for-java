// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob

import com.azure.storage.blob.models.BlobStorageException
import com.azure.storage.blob.specialized.BlobClientBase
import com.azure.storage.blob.specialized.BlobLeaseClientBuilder
import com.azure.storage.blob.specialized.SpecializedBlobClientBuilder
import com.azure.storage.common.StorageSharedKeyCredential
import spock.lang.Unroll

class AzuriteTest extends APISpec {
    String azuriteEndpoint = "http://127.0.0.1:10000/devstoreaccount1"
    StorageSharedKeyCredential azuriteCredential = new StorageSharedKeyCredential("devstoreaccount1", "Eby8vdM02xNOcqFlqUwJPLlmEtlCDXJ1OUzFT50uSRZ6IFsuFq2UVErCz4I6tq/K1SZFPTOtr/KBHBeksoGMGw==")

    private BlobServiceClient getAzuriteServiceClient() {
        return getServiceClient(azuriteCredential, azuriteEndpoint)
    }

    private static void validateBlobClient(BlobClientBase client, String accountName, String containerName, String blobName, String blobUrl) {
        assert client.getAccountName() == accountName
        assert client.getContainerName() == containerName
        assert client.getBlobName() == blobName
        assert client.getBlobUrl() == blobUrl
    }

    @Unroll
    def "Azurite URLParser"() {
        when:
        BlobUrlParts parts = BlobUrlParts.parse(new URL(endpoint))

        then:
        parts.getScheme() == scheme
        parts.getHost() == host
        parts.getAccountName() == accountName
        parts.getBlobContainerName() == blobContainerName
        parts.getBlobName() == blobName

        where:
        endpoint                                                                 | scheme | host              | accountName        | blobContainerName | blobName
        "http://127.0.0.1:10000/devstoreaccount1"                                | "http" | "127.0.0.1:10000" | "devstoreaccount1" | null              | null
        "http://127.0.0.1:10000/devstoreaccount1/container"                      | "http" | "127.0.0.1:10000" | "devstoreaccount1" | "container"       | null
        "http://127.0.0.1:10000/devstoreaccount1/container/blob"                 | "http" | "127.0.0.1:10000" | "devstoreaccount1" | "container"       | "blob"
        "http://localhost:10000/devstoreaccount1"                                | "http" | "localhost:10000" | "devstoreaccount1" | null              | null
        "http://localhost:10000/devstoreaccount1/container"                      | "http" | "localhost:10000" | "devstoreaccount1" | "container"       | null
        "http://localhost:10000/devstoreaccount1/container/blob"                 | "http" | "localhost:10000" | "devstoreaccount1" | "container"       | "blob"
        "http://localhost:10000/devstoreaccount1/container/path/to]a blob"       | "http" | "localhost:10000" | "devstoreaccount1" | "container"       | "path/to]a blob"
        "http://localhost:10000/devstoreaccount1/container/path%2Fto%5Da%20blob" | "http" | "localhost:10000" | "devstoreaccount1" | "container"       | "path/to]a blob"
        "http://localhost:10000/devstoreaccount1/container/斑點"                 | "http" | "localhost:10000" | "devstoreaccount1" | "container"       | "斑點"
        "http://localhost:10000/devstoreaccount1/container/%E6%96%91%E9%BB%9E"   | "http" | "localhost:10000" | "devstoreaccount1" | "container"       | "斑點"
    }

    def "Azurite URL constructing service client"() {
        when:
        def serviceClient = getAzuriteServiceClient()

        then:
        serviceClient.getAccountName() == "devstoreaccount1"
        serviceClient.getAccountUrl() == "http://127.0.0.1:10000/devstoreaccount1"
    }

    def "Azurite URL get container client"() {
        when:
        def containerClient = getAzuriteServiceClient().getBlobContainerClient("container")

        then:
        containerClient.getAccountName() == "devstoreaccount1"
        containerClient.getBlobContainerName() == "container"
        containerClient.getBlobContainerUrl() == "http://127.0.0.1:10000/devstoreaccount1/container"
    }

    def "Azurite URL construct container client"() {
        when:
        def containerClient = new BlobContainerClientBuilder()
            .endpoint("http://127.0.0.1:10000/devstoreaccount1/container")
            .credential(azuriteCredential)
            .buildClient()

        then:
        containerClient.getAccountName() == "devstoreaccount1"
        containerClient.getBlobContainerName() == "container"
        containerClient.getBlobContainerUrl() == "http://127.0.0.1:10000/devstoreaccount1/container"
    }

    def "Azurite URL get blob client"() {
        when:
        def blobClient = getAzuriteServiceClient()
            .getBlobContainerClient("container")
            .getBlobClient("blob")

        then:
        validateBlobClient(blobClient, "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
    }

    def "Azurite URL construct blob client"() {
        when:
        def blobClient = new BlobClientBuilder()
            .endpoint("http://127.0.0.1:10000/devstoreaccount1/container/blob")
            .credential(azuriteCredential)
            .buildClient()

        then:
        validateBlobClient(blobClient, "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
    }

    def "Azurite URL get specialized clients"() {
        when:
        def blobClient = getAzuriteServiceClient()
            .getBlobContainerClient("container")
            .getBlobClient("blob")

        then:
        validateBlobClient(blobClient.getAppendBlobClient(), "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
        validateBlobClient(blobClient.getBlockBlobClient(), "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
        validateBlobClient(blobClient.getPageBlobClient(), "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
    }

    def "Azurite URL construct specialized client"() {
        when:
        def specializedClientBuilder = new SpecializedBlobClientBuilder()
            .endpoint("http://127.0.0.1:10000/devstoreaccount1/container/blob")
            .credential(azuriteCredential)

        then:
        validateBlobClient(specializedClientBuilder.buildAppendBlobClient(), "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
        validateBlobClient(specializedClientBuilder.buildBlockBlobClient(), "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
        validateBlobClient(specializedClientBuilder.buildPageBlobClient(), "devstoreaccount1", "container", "blob", "http://127.0.0.1:10000/devstoreaccount1/container/blob")
    }

    def "Azurite URL get lease client"() {
        setup:
        def containerClient = getAzuriteServiceClient().getBlobContainerClient("container")
        def blobClient = containerClient.getBlobClient("blob")

        when:
        def containerLeaseClient = new BlobLeaseClientBuilder()
            .containerClient(containerClient)
            .buildClient()

        then:
        containerLeaseClient.getAccountName() == "devstoreaccount1"
        containerLeaseClient.getResourceUrl() == "http://127.0.0.1:10000/devstoreaccount1/container"

        when:
        def blobLeaseClient = new BlobLeaseClientBuilder()
            .blobClient(blobClient)
            .buildClient()

        then:
        blobLeaseClient.getAccountName() == "devstoreaccount1"
        blobLeaseClient.getResourceUrl() == "http://127.0.0.1:10000/devstoreaccount1/container/blob"
    }

    def "Connect to Azurite"() {
        setup:
        def serviceClient = new BlobServiceClientBuilder()
            .endpoint(azuriteEndpoint)
            .credential(azuriteCredential)
            .buildClient()

        when:
        serviceClient.getProperties()

        then:
        notThrown(BlobStorageException)
    }

    def "Create container"() {
        setup:
        def containerClient = getAzuriteServiceClient()
            .getBlobContainerClient(generateContainerName())

        when:
        def response = containerClient.createWithResponse(null, null, null, null)

        then:
        response.getStatusCode() == 200

        cleanup:
        containerClient.delete()
    }

    def "Upload to blob"() {
        setup:
        def containerClient = getAzuriteServiceClient()
            .getBlobContainerClient(generateContainerName())
        containerClient.create()
        def blobClient = containerClient.getBlobClient(generateBlobName())

        when:
        blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)

        then:
        notThrown(BlobStorageException)
        def outputStream = new ByteArrayOutputStream()
        blobClient.download(outputStream)
        outputStream.toByteArray() == defaultData.array()

        cleanup:
        containerClient.delete()
    }
}
