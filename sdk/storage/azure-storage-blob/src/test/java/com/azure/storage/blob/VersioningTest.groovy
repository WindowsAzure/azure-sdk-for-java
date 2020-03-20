// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob

import com.azure.core.util.Context
import com.azure.storage.blob.models.BlobListDetails
import com.azure.storage.blob.models.ListBlobsOptions
import com.azure.storage.blob.models.PageRange
import com.azure.storage.blob.models.PublicAccessType
import com.azure.storage.blob.specialized.PageBlobClient
import org.apache.commons.lang3.StringUtils

import java.nio.charset.StandardCharsets
import java.time.Duration

class VersioningTest extends APISpec {

    BlobContainerClient blobContainerClient
    BlobClient blobClient
    String blobName
    String containerName
    String contentV1 = "contentV1"
    String contentV2 = "contentV2"

    def setup() {
        blobName = generateBlobName()
        containerName = generateContainerName()
        blobContainerClient = versionedBlobServiceClient.createBlobContainer(containerName)
        blobClient = blobContainerClient.getBlobClient(blobName)
    }

    def cleanup() {
        blobContainerClient.delete();
    }

    def "Create Block Blob with Version"() {
        when:
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        def blobItemV2 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize, true)

        then:
        blobItemV1.getVersionId() != null
        blobItemV2.getVersionId() != null
        !StringUtils.equals(blobItemV1.getVersionId(), blobItemV2.getVersionId())
    }

    def "Create Page Blob with Version"() {
        when:
        def blobItemV1 = blobClient.getPageBlobClient().create(512)
        def blobItemV2 = blobClient.getPageBlobClient().create(512, true)

        then:
        blobItemV1.getVersionId() != null
        blobItemV2.getVersionId() != null
        !StringUtils.equals(blobItemV1.getVersionId(), blobItemV2.getVersionId())
    }

    def "Create Append Blob with Version"() {
        when:
        def blobItemV1 = blobClient.getAppendBlobClient().create();
        def blobItemV2 = blobClient.getAppendBlobClient().create(true);

        then:
        blobItemV1.getVersionId() != null
        blobItemV2.getVersionId() != null
        !StringUtils.equals(blobItemV1.getVersionId(), blobItemV2.getVersionId())
    }

    def "Retrieve Block Blob by Version"() {
        given:
        def inputV1 = new ByteArrayInputStream(contentV1.getBytes(StandardCharsets.UTF_8))
        def inputV2 = new ByteArrayInputStream(contentV2.getBytes(StandardCharsets.UTF_8))
        def blobItemV1 = blobClient.getBlockBlobClient().upload(inputV1, inputV1.available())
        def blobItemV2 = blobClient.getBlockBlobClient().upload(inputV2, inputV2.available(), true)

        when:
        def outputV1 = new ByteArrayOutputStream()
        def outputV2 = new ByteArrayOutputStream()
        blobClient.getVersionClient(blobItemV1.getVersionId()).getBlockBlobClient().download(outputV1)
        blobClient.getVersionClient(blobItemV2.getVersionId()).getBlockBlobClient().download(outputV2)

        then:
        outputV1.toByteArray() == contentV1.getBytes(StandardCharsets.UTF_8)
        outputV2.toByteArray() == contentV2.getBytes(StandardCharsets.UTF_8)
    }

    def "Retrieve Page Blob by Version"() {
        given:
        def contentV1 = getRandomByteArray(PageBlobClient.PAGE_BYTES)
        def contentV2 = getRandomByteArray(PageBlobClient.PAGE_BYTES)
        def inputV1 = new ByteArrayInputStream(contentV1)
        def inputV2 = new ByteArrayInputStream(contentV2)
        def blobItemV1 = blobClient.getPageBlobClient().create(PageBlobClient.PAGE_BYTES)
        blobClient.getPageBlobClient().uploadPages(new PageRange().setStart(0).setEnd(PageBlobClient.PAGE_BYTES-1), inputV1)
        def blobItemV2 = blobClient.getPageBlobClient().create(PageBlobClient.PAGE_BYTES, true)
        blobClient.getPageBlobClient().uploadPages(new PageRange().setStart(0).setEnd(PageBlobClient.PAGE_BYTES-1), inputV2)

        when:
        def outputV1 = new ByteArrayOutputStream()
        def outputV2 = new ByteArrayOutputStream()
        blobClient.getVersionClient(blobItemV1.getVersionId()).getPageBlobClient().download(outputV1)
        blobClient.getVersionClient(blobItemV2.getVersionId()).getPageBlobClient().download(outputV2)

        then:
        Arrays.equals(contentV1, outputV1.toByteArray())
        Arrays.equals(contentV2, outputV2.toByteArray())
    }

    def "Retrieve Append Blob by Version"() {
        given:
        def inputV1 = new ByteArrayInputStream(contentV1.getBytes(StandardCharsets.UTF_8))
        def inputV2 = new ByteArrayInputStream(contentV2.getBytes(StandardCharsets.UTF_8))
        def blobItemV1 = blobClient.getAppendBlobClient().create()
        blobClient.getAppendBlobClient().appendBlock(inputV1, inputV1.available())
        def blobItemV2 = blobClient.getAppendBlobClient().create(true)
        blobClient.getAppendBlobClient().appendBlock(inputV2, inputV2.available())

        when:
        def outputV1 = new ByteArrayOutputStream()
        def outputV2 = new ByteArrayOutputStream()
        blobClient.getVersionClient(blobItemV1.getVersionId()).getAppendBlobClient().download(outputV1)
        blobClient.getVersionClient(blobItemV2.getVersionId()).getAppendBlobClient().download(outputV2)

        then:
        outputV1.toByteArray() == contentV1.getBytes(StandardCharsets.UTF_8)
        outputV2.toByteArray() == contentV2.getBytes(StandardCharsets.UTF_8)
    }

    def "Delete Block Blob by Version"() {
        given:
        def inputV1 = new ByteArrayInputStream(contentV1.getBytes(StandardCharsets.UTF_8))
        def inputV2 = new ByteArrayInputStream(contentV2.getBytes(StandardCharsets.UTF_8))
        def blobItemV1 = blobClient.getBlockBlobClient().upload(inputV1, inputV1.available())
        def blobItemV2 = blobClient.getBlockBlobClient().upload(inputV2, inputV2.available(), true)

        when:
        blobClient.getVersionClient(blobItemV1.getVersionId()).getBlockBlobClient().delete()

        then:
        !blobClient.getVersionClient(blobItemV1.getVersionId()).exists()
        blobClient.getVersionClient(blobItemV2.getVersionId()).exists()
    }

    def "Delete Page Blob by Version"() {
        given:
        def contentV1 = getRandomByteArray(PageBlobClient.PAGE_BYTES)
        def contentV2 = getRandomByteArray(PageBlobClient.PAGE_BYTES)
        def inputV1 = new ByteArrayInputStream(contentV1)
        def inputV2 = new ByteArrayInputStream(contentV2)
        def blobItemV1 = blobClient.getPageBlobClient().create(PageBlobClient.PAGE_BYTES)
        blobClient.getPageBlobClient().uploadPages(new PageRange().setStart(0).setEnd(PageBlobClient.PAGE_BYTES-1), inputV1)
        def blobItemV2 = blobClient.getPageBlobClient().create(PageBlobClient.PAGE_BYTES, true)
        blobClient.getPageBlobClient().uploadPages(new PageRange().setStart(0).setEnd(PageBlobClient.PAGE_BYTES-1), inputV2)

        when:
        blobClient.getVersionClient(blobItemV1.getVersionId()).getPageBlobClient().delete()

        then:
        !blobClient.getVersionClient(blobItemV1.getVersionId()).exists()
        blobClient.getVersionClient(blobItemV2.getVersionId()).exists()
    }

    def "Delete Append Blob by Version"() {
        given:
        def inputV1 = new ByteArrayInputStream(contentV1.getBytes(StandardCharsets.UTF_8))
        def inputV2 = new ByteArrayInputStream(contentV2.getBytes(StandardCharsets.UTF_8))
        def blobItemV1 = blobClient.getAppendBlobClient().create()
        blobClient.getAppendBlobClient().appendBlock(inputV1, inputV1.available())
        def blobItemV2 = blobClient.getAppendBlobClient().create(true)
        blobClient.getAppendBlobClient().appendBlock(inputV2, inputV2.available())

        when:
        blobClient.getVersionClient(blobItemV1.getVersionId()).getAppendBlobClient().delete()

        then:
        !blobClient.getVersionClient(blobItemV1.getVersionId()).exists()
        blobClient.getVersionClient(blobItemV2.getVersionId()).exists()
    }

    def "Retrieve Block Blob Properties by Version"() {
        given:
        def key = "key"
        def valV2 = "val2"
        def valV3 = "val3"
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        def responseV2 = blobClient.getBlockBlobClient().setMetadataWithResponse(Collections.singletonMap(key, valV2), null, null, Context.NONE);
        def responseV3 = blobClient.getBlockBlobClient().setMetadataWithResponse(Collections.singletonMap(key, valV3), null, null, Context.NONE);
        def versionId1 = blobItemV1.getVersionId()
        def versionId2 = responseV2.getHeaders().getValue("x-ms-version-id")
        def versionId3 = responseV3.getHeaders().getValue("x-ms-version-id")

        when:
        def receivedValV1 = blobClient.getVersionClient(versionId1).getBlockBlobClient().getProperties().getMetadata().get(key)
        def receivedValV2 = blobClient.getVersionClient(versionId2).getBlockBlobClient().getProperties().getMetadata().get(key)
        def receivedValV3 = blobClient.getVersionClient(versionId3).getBlockBlobClient().getProperties().getMetadata().get(key)

        then:
        receivedValV1 == null
        valV2 == receivedValV2
        valV3 == receivedValV3
    }

    def "Retrieve Page Blob Properties by Version"() {
        given:
        def key = "key"
        def valV2 = "val2"
        def valV3 = "val3"
        def blobItemV1 = blobClient.getPageBlobClient().create(512)
        def responseV2 = blobClient.getPageBlobClient().setMetadataWithResponse(Collections.singletonMap(key, valV2), null, null, Context.NONE);
        def responseV3 = blobClient.getPageBlobClient().setMetadataWithResponse(Collections.singletonMap(key, valV3), null, null, Context.NONE);
        def versionId1 = blobItemV1.getVersionId()
        def versionId2 = responseV2.getHeaders().getValue("x-ms-version-id")
        def versionId3 = responseV3.getHeaders().getValue("x-ms-version-id")

        when:
        def receivedValV1 = blobClient.getVersionClient(versionId1).getPageBlobClient().getProperties().getMetadata().get(key)
        def receivedValV2 = blobClient.getVersionClient(versionId2).getPageBlobClient().getProperties().getMetadata().get(key)
        def receivedValV3 = blobClient.getVersionClient(versionId3).getPageBlobClient().getProperties().getMetadata().get(key)

        then:
        receivedValV1 == null
        valV2 == receivedValV2
        valV3 == receivedValV3
    }

    def "Retrieve Append Blob Properties by Version"() {
        given:
        def key = "key"
        def valV2 = "val2"
        def valV3 = "val3"
        def blobItemV1 = blobClient.getAppendBlobClient().create()
        def responseV2 = blobClient.getAppendBlobClient().setMetadataWithResponse(Collections.singletonMap(key, valV2), null, null, Context.NONE);
        def responseV3 = blobClient.getAppendBlobClient().setMetadataWithResponse(Collections.singletonMap(key, valV3), null, null, Context.NONE);
        def versionId1 = blobItemV1.getVersionId()
        def versionId2 = responseV2.getHeaders().getValue("x-ms-version-id")
        def versionId3 = responseV3.getHeaders().getValue("x-ms-version-id")

        when:
        def receivedValV1 = blobClient.getVersionClient(versionId1).getAppendBlobClient().getProperties().getMetadata().get(key)
        def receivedValV2 = blobClient.getVersionClient(versionId2).getAppendBlobClient().getProperties().getMetadata().get(key)
        def receivedValV3 = blobClient.getVersionClient(versionId3).getAppendBlobClient().getProperties().getMetadata().get(key)

        then:
        receivedValV1 == null
        valV2 == receivedValV2
        valV3 == receivedValV3
    }

    def "List Blobs with Version"() {
        given:
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        def blobItemV2 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize, true)
        def blobItemV3 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize, true)

        when:
        def blobs = blobContainerClient.listBlobs(new ListBlobsOptions().setDetails(new BlobListDetails().setRetrieveVersions(true)), null)

        then:
        blobs.size() == 3
        blobs[0].getVersionId() == blobItemV1.getVersionId()
        blobs[1].getVersionId() == blobItemV2.getVersionId()
        blobs[2].getVersionId() == blobItemV3.getVersionId()
        blobs[0].isCurrentVersion() == null
        blobs[1].isCurrentVersion() == null
        blobs[2].isCurrentVersion()
    }

    def "List Blobs without Version"() {
        given:
        blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize, true)
        def blobItemV3 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize, true)

        when:
        def blobs = blobContainerClient.listBlobs(new ListBlobsOptions().setDetails(new BlobListDetails().setRetrieveVersions(false)), null)

        then:
        blobs.size() == 1
        blobs[0].getVersionId() == blobItemV3.getVersionId()
    }

    def "Begin Copy Blobs with Version"() {
        given:
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        def sourceBlob = blobContainerClient.getBlobClient(generateBlobName())
        sourceBlob.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)

        when:
        def pooler = blobClient.beginCopy(sourceBlob.getBlobUrl(), Duration.ofSeconds(1))
        def copyInfo = pooler.waitForCompletion().getValue()

        then:
        copyInfo.getVersionId() != null
        copyInfo.getVersionId() != blobItemV1.getVersionId()
    }

    def "Copy From Url Blobs with Version"() {
        given:
        blobContainerClient.setAccessPolicy(PublicAccessType.CONTAINER, null)
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        def sourceBlob = blobContainerClient.getBlobClient(generateBlobName())
        sourceBlob.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)

        when:
        def response = blobClient.copyFromUrlWithResponse(sourceBlob.getBlobUrl(), null, null, null, null, null, Context.NONE)
        def versionIdAfterCopy = response.getHeaders().getValue("x-ms-version-id")

        then:
        versionIdAfterCopy != null
        versionIdAfterCopy != blobItemV1.getVersionId()
    }

    def "Blob Properties should contain Version information"() {
        given:
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)
        def blobItemV2 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize, true)

        when:
        def propertiesV1 = blobClient.getVersionClient(blobItemV1.getVersionId()).getProperties()
        def propertiesV2 = blobClient.getVersionClient(blobItemV2.getVersionId()).getProperties()

        then:
        propertiesV1.getVersionId() == blobItemV1.getVersionId()
        propertiesV2.getVersionId() == blobItemV2.getVersionId()
        !propertiesV1.isCurrentVersion()
        propertiesV2.isCurrentVersion()
    }

    def "Do not look for snapshot of version"() {
        given:
        blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)

        when:
        blobClient.getVersionClient("a").getSnapshotClient("b")

        then:
        thrown IllegalArgumentException
    }

    def "Do not look for version of snapshot"() {
        given:
        blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)

        when:
        blobClient.getSnapshotClient("a").getVersionClient("b")

        then:
        thrown IllegalArgumentException
    }

    def "Snapshot creates new Version"() {
        given:
        def blobItemV1 = blobClient.getBlockBlobClient().upload(defaultInputStream.get(), defaultDataSize)

        when:
        def versionIdAfterSnapshot = blobClient.createSnapshotWithResponse(null, null, null, Context.NONE)
            .getHeaders().getValue("x-ms-version-id")

        then:
        versionIdAfterSnapshot != null
        versionIdAfterSnapshot != blobItemV1.getVersionId()
    }
}
