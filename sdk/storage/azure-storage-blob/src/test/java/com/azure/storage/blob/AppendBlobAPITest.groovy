// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob

import com.azure.core.http.rest.Response
import com.azure.core.exception.UnexpectedLengthException
import com.azure.storage.blob.models.AppendBlobAccessConditions
import com.azure.storage.blob.models.AppendBlobItem
import com.azure.storage.blob.models.AppendPositionAccessConditions
import com.azure.storage.blob.models.BlobAccessConditions
import com.azure.storage.blob.models.BlobHTTPHeaders
import com.azure.storage.blob.models.BlobRange
import com.azure.storage.blob.models.LeaseAccessConditions
import com.azure.storage.blob.models.Metadata
import com.azure.storage.blob.models.ModifiedAccessConditions
import com.azure.storage.blob.models.PublicAccessType
import com.azure.storage.blob.models.SourceModifiedAccessConditions
import com.azure.storage.blob.models.StorageException
import spock.lang.Unroll

import java.security.MessageDigest

class AppendBlobAPITest extends APISpec {
    AppendBlobClient bc

    def setup() {
        bc = cc.getAppendBlobClient(generateBlobName())
        bc.create()
    }

    def "Get URL"() {
        cc
    }

    def "Create defaults"() {
        when:
        Response<AppendBlobItem> createResponse = bc.createWithResponse(null, null, null, null, null)

        then:
        createResponse.getStatusCode() == 201
        validateBasicHeaders(createResponse.getHeaders())
        createResponse.getValue().getContentMD5() == null
        createResponse.getValue().isServerEncrypted()
    }

    def "Create min"() {
        expect:
        bc.createWithResponse(null, null, null, null, null).getStatusCode() == 201
    }

    def "Create error"() {
        when:
        bc.create(null, null,
            new BlobAccessConditions().setModifiedAccessConditions(new ModifiedAccessConditions().setIfMatch("garbage")),
            null)

        then:
        thrown(StorageException)
    }

    @Unroll
    def "Create headers"() {
        setup:
        BlobHTTPHeaders headers = new BlobHTTPHeaders().setBlobCacheControl(cacheControl)
            .setBlobContentDisposition(contentDisposition)
            .setBlobContentEncoding(contentEncoding)
            .setBlobContentLanguage(contentLanguage)
            .setBlobContentMD5(contentMD5)
            .setBlobContentType(contentType)

        when:
        bc.createWithResponse(headers, null, null, null, null)
        Response<BlobProperties> response = bc.getPropertiesWithResponse(null, null, null)

        // If the value isn't set the service will automatically set it
        contentType = (contentType == null) ? "application/octet-stream" : contentType

        then:
        validateBlobProperties(response, cacheControl, contentDisposition, contentEncoding, contentLanguage, contentMD5, contentType)

        where:
        cacheControl | contentDisposition | contentEncoding | contentLanguage | contentMD5                                                                                  | contentType
        null         | null               | null            | null            | null                                                                                        | null
        "control"    | "disposition"      | "encoding"      | "language"      | Base64.getEncoder().encode(MessageDigest.getInstance("MD5").digest(defaultText.getBytes())) | "type"
    }

    @Unroll
    def "Create metadata"() {
        setup:
        def metadata = new Metadata()
        if (key1 != null) {
            metadata.put(key1, value1)
        }
        if (key2 != null) {
            metadata.put(key2, value2)
        }

        when:
        bc.create(null, metadata, null, null)
        def response = bc.getProperties()

        then:
        response.getMetadata() == metadata

        where:
        key1  | value1 | key2   | value2
        null  | null   | null   | null
        "foo" | "bar"  | "fizz" | "buzz"
    }

    @Unroll
    def "Create AC"() {
        setup:
        match = setupBlobMatchCondition(bc, match)
        leaseID = setupBlobLeaseCondition(bc, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .setLeaseAccessConditions(new LeaseAccessConditions().setLeaseId(leaseID))
            .setModifiedAccessConditions(new ModifiedAccessConditions().setIfModifiedSince(modified)
                .setIfUnmodifiedSince(unmodified)
                .setIfMatch(match)
                .setIfNoneMatch(noneMatch))


        expect:
        bc.createWithResponse(null, null, bac, null, null).getStatusCode() == 201

        where:
        modified | unmodified | match        | noneMatch   | leaseID
        null     | null       | null         | null        | null
        oldDate  | null       | null         | null        | null
        null     | newDate    | null         | null        | null
        null     | null       | receivedEtag | null        | null
        null     | null       | null         | garbageEtag | null
        null     | null       | null         | null        | receivedLeaseID
    }

    @Unroll
    def "Create AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bc, noneMatch)
        setupBlobLeaseCondition(bc, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .setLeaseAccessConditions(new LeaseAccessConditions().setLeaseId(leaseID))
            .setModifiedAccessConditions(new ModifiedAccessConditions().setIfModifiedSince(modified)
                .setIfUnmodifiedSince(unmodified)
                .setIfMatch(match)
                .setIfNoneMatch(noneMatch))

        when:
        bc.create(null, null, bac, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch    | leaseID
        newDate  | null       | null        | null         | null
        null     | oldDate    | null        | null         | null
        null     | null       | garbageEtag | null         | null
        null     | null       | null        | receivedEtag | null
        null     | null       | null        | null         | garbageLeaseID
    }

    def "Append block defaults"() {
        setup:
        Response<AppendBlobItem> appendResponse = bc.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, null, null, null)

        when:
        ByteArrayOutputStream downloadStream = new ByteArrayOutputStream()
        bc.download(downloadStream)

        then:
        downloadStream.toByteArray() == defaultData.array()
        validateBasicHeaders(appendResponse.getHeaders())
        appendResponse.getHeaders().value("x-ms-content-crc64") != null
        appendResponse.getValue().getBlobAppendOffset() != null
        appendResponse.getValue().getBlobCommittedBlockCount() != null

        expect:
        bc.getProperties().getCommittedBlockCount() == 1
    }

    def "Append block min"() {
        bc.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, null, null, null).getStatusCode() == 201
    }

    @Unroll
    def "Append block IA"() {
        when:
        bc.appendBlock(data, dataSize)

        then:
        thrown(exceptionType)

        where:
        data                     | dataSize            | exceptionType
        null                     | defaultDataSize     | NullPointerException
        defaultInputStream.get() | defaultDataSize + 1 | UnexpectedLengthException
        defaultInputStream.get() | defaultDataSize - 1 | UnexpectedLengthException
    }

    def "Append block empty body"() {
        when:
        bc.appendBlock(new ByteArrayInputStream(new byte[0]), 0)

        then:
        thrown(StorageException)
    }

    def "Append block null body"() {
        when:
        bc.appendBlock(new ByteArrayInputStream(null), 0)

        then:
        thrown(NullPointerException)
    }

    @Unroll
    def "Append block AC"() {
        setup:
        match = setupBlobMatchCondition(bc, match)
        leaseID = setupBlobLeaseCondition(bc, leaseID)
        AppendBlobAccessConditions bac = new AppendBlobAccessConditions()
            .setLeaseAccessConditions(new LeaseAccessConditions().setLeaseId(leaseID))
            .setAppendPositionAccessConditions(new AppendPositionAccessConditions()
                .setAppendPosition(appendPosE)
                .setMaxSize(maxSizeLTE))
            .setModifiedAccessConditions(new ModifiedAccessConditions()
                .setIfModifiedSince(modified)
                .setIfUnmodifiedSince(unmodified)
                .setIfMatch(match)
                .setIfNoneMatch(noneMatch))


        expect:
        bc.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, bac, null, null).getStatusCode() == 201

        where:
        modified | unmodified | match        | noneMatch   | leaseID         | appendPosE | maxSizeLTE
        null     | null       | null         | null        | null            | null       | null
        oldDate  | null       | null         | null        | null            | null       | null
        null     | newDate    | null         | null        | null            | null       | null
        null     | null       | receivedEtag | null        | null            | null       | null
        null     | null       | null         | garbageEtag | null            | null       | null
        null     | null       | null         | null        | receivedLeaseID | null       | null
        null     | null       | null         | null        | null            | 0          | null
        null     | null       | null         | null        | null            | null       | 100
    }

    @Unroll
    def "Append block AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bc, noneMatch)
        setupBlobLeaseCondition(bc, leaseID)

        AppendBlobAccessConditions bac = new AppendBlobAccessConditions()
            .setLeaseAccessConditions(new LeaseAccessConditions().setLeaseId(leaseID))
            .setAppendPositionAccessConditions(new AppendPositionAccessConditions()
                .setAppendPosition(appendPosE)
                .setMaxSize(maxSizeLTE))
            .setModifiedAccessConditions(new ModifiedAccessConditions()
                .setIfModifiedSince(modified)
                .setIfUnmodifiedSince(unmodified)
                .setIfMatch(match)
                .setIfNoneMatch(noneMatch))

        when:
        bc.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, bac, null, null)

        then:
        thrown(StorageException)

        cleanup:
        defaultInputStream.get().reset()

        where:
        modified | unmodified | match       | noneMatch    | leaseID        | appendPosE | maxSizeLTE
        newDate  | null       | null        | null         | null           | null       | null
        null     | oldDate    | null        | null         | null           | null       | null
        null     | null       | garbageEtag | null         | null           | null       | null
        null     | null       | null        | receivedEtag | null           | null       | null
        null     | null       | null        | null         | garbageLeaseID | null       | null
        null     | null       | null        | null         | null           | 1          | null
        null     | null       | null        | null         | null           | null       | 1

    }

    def "Append block error"() {
        setup:
        bc = cc.getAppendBlobClient(generateBlobName())

        when:
        bc.appendBlock(defaultInputStream.get(), defaultDataSize)

        then:
        thrown(StorageException)
    }

    def "Append block from URL min"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)
        byte[] data = getRandomByteArray(1024)
        bc.appendBlock(new ByteArrayInputStream(data), data.length)

        AppendBlobClient destURL = cc.getAppendBlobClient(generateBlobName())
        destURL.create()

        BlobRange blobRange = new BlobRange(0, (long) PageBlobClient.PAGE_BYTES)

        when:
        Response<AppendBlobItem> response = destURL.appendBlockFromUrlWithResponse(bc.getBlobUrl(), blobRange, null, null, null, null, null)

        then:
        response.getStatusCode() == 201
        validateBasicHeaders(response.getHeaders())
    }

    def "Append block from URL range"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)
        byte[] data = getRandomByteArray(4 * 1024)
        bc.appendBlock(new ByteArrayInputStream(data), data.length)

        AppendBlobClient destURL = cc.getAppendBlobClient(generateBlobName())
        destURL.create()

        when:
        destURL.appendBlockFromUrl(bc.getBlobUrl(), new BlobRange(2 * 1024, 1024))

        then:
        ByteArrayOutputStream downloadStream = new ByteArrayOutputStream(1024)
        destURL.download(downloadStream)
        downloadStream.toByteArray() == Arrays.copyOfRange(data, 2 * 1024, 3 * 1024)
    }

    def "Append block from URL MD5"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)
        byte[] data = getRandomByteArray(1024)
        bc.appendBlock(new ByteArrayInputStream(data), data.length)

        AppendBlobClient destURL = cc.getAppendBlobClient(generateBlobName())
        destURL.create()

        when:
        destURL.appendBlockFromUrl(bc.getBlobUrl(), null, MessageDigest.getInstance("MD5").digest(data),
            null, null, null)

        then:
        notThrown(StorageException)
    }

    def "Append block from URL MD5 fail"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)
        byte[] data = getRandomByteArray(1024)
        bc.appendBlock(new ByteArrayInputStream(data), data.length)

        def destURL = cc.getAppendBlobClient(generateBlobName())
        destURL.create()

        when:
        destURL.appendBlockFromUrl(bc.getBlobUrl(), null, MessageDigest.getInstance("MD5").digest("garbage".getBytes()),
            null, null, null)

        then:
        thrown(StorageException)
    }

    @Unroll
    def "Append block from URL destination AC"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)
        match = setupBlobMatchCondition(bc, match)
        leaseID = setupBlobLeaseCondition(bc, leaseID)
        def bac = new AppendBlobAccessConditions()
            .setLeaseAccessConditions(new LeaseAccessConditions().setLeaseId(leaseID))
            .setAppendPositionAccessConditions(new AppendPositionAccessConditions()
                .setAppendPosition(appendPosE)
                .setMaxSize(maxSizeLTE))
            .setModifiedAccessConditions(new ModifiedAccessConditions()
                .setIfModifiedSince(modified)
                .setIfUnmodifiedSince(unmodified)
                .setIfMatch(match)
                .setIfNoneMatch(noneMatch))

        def sourceURL = cc.getAppendBlobClient(generateBlobName())
        sourceURL.create()
        sourceURL.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, null, null, null).getStatusCode()

        expect:
        bc.appendBlockFromUrlWithResponse(sourceURL.getBlobUrl(), null, null, bac, null, null, null).getStatusCode() == 201

        where:
        modified | unmodified | match        | noneMatch   | leaseID         | appendPosE | maxSizeLTE
        null     | null       | null         | null        | null            | null       | null
        oldDate  | null       | null         | null        | null            | null       | null
        null     | newDate    | null         | null        | null            | null       | null
        null     | null       | receivedEtag | null        | null            | null       | null
        null     | null       | null         | garbageEtag | null            | null       | null
        null     | null       | null         | null        | receivedLeaseID | null       | null
        null     | null       | null         | null        | null            | 0          | null
        null     | null       | null         | null        | null            | null       | 100
    }

    @Unroll
    def "Append block from URL AC destination fail"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)
        noneMatch = setupBlobMatchCondition(bc, noneMatch)
        setupBlobLeaseCondition(bc, leaseID)

        def bac = new AppendBlobAccessConditions()
            .setLeaseAccessConditions(new LeaseAccessConditions().setLeaseId(leaseID))
            .setAppendPositionAccessConditions(new AppendPositionAccessConditions()
                .setAppendPosition(appendPosE)
                .setMaxSize(maxSizeLTE))
            .setModifiedAccessConditions(new ModifiedAccessConditions()
                .setIfModifiedSince(modified)
                .setIfUnmodifiedSince(unmodified)
                .setIfMatch(match)
                .setIfNoneMatch(noneMatch))

        def sourceURL = cc.getAppendBlobClient(generateBlobName())
        sourceURL.create()
        sourceURL.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, null, null, null).getStatusCode()

        when:
        bc.appendBlockFromUrl(sourceURL.getBlobUrl(), null, null, bac, null, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch    | leaseID        | appendPosE | maxSizeLTE
        newDate  | null       | null        | null         | null           | null       | null
        null     | oldDate    | null        | null         | null           | null       | null
        null     | null       | garbageEtag | null         | null           | null       | null
        null     | null       | null        | receivedEtag | null           | null       | null
        null     | null       | null        | null         | garbageLeaseID | null       | null
        null     | null       | null        | null         | null           | 1          | null
        null     | null       | null        | null         | null           | null       | 1
    }

    @Unroll
    def "Append block from URL source AC"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)

        def sourceURL = cc.getAppendBlobClient(generateBlobName())
        sourceURL.create()
        sourceURL.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, null, null, null).getStatusCode()

        def smac = new SourceModifiedAccessConditions()
            .setSourceIfModifiedSince(sourceIfModifiedSince)
            .setSourceIfUnmodifiedSince(sourceIfUnmodifiedSince)
            .setSourceIfMatch(setupBlobMatchCondition(sourceURL, sourceIfMatch))
            .setSourceIfNoneMatch(sourceIfNoneMatch)

        expect:
        bc.appendBlockFromUrlWithResponse(sourceURL.getBlobUrl(), null, null, null, smac, null, null).getStatusCode() == 201

        where:
        sourceIfModifiedSince | sourceIfUnmodifiedSince | sourceIfMatch | sourceIfNoneMatch
        null                  | null                    | null          | null
        oldDate               | null                    | null          | null
        null                  | newDate                 | null          | null
        null                  | null                    | receivedEtag  | null
        null                  | null                    | null          | garbageEtag
    }

    @Unroll
    def "Append block from URL AC source fail"() {
        setup:
        cc.setAccessPolicy(PublicAccessType.CONTAINER, null)

        def sourceURL = cc.getAppendBlobClient(generateBlobName())
        sourceURL.create()
        sourceURL.appendBlockWithResponse(defaultInputStream.get(), defaultDataSize, null, null, null).getStatusCode()

        def smac = new SourceModifiedAccessConditions()
            .setSourceIfModifiedSince(sourceIfModifiedSince)
            .setSourceIfUnmodifiedSince(sourceIfUnmodifiedSince)
            .setSourceIfMatch(sourceIfMatch)
            .setSourceIfNoneMatch(setupBlobMatchCondition(sourceURL, sourceIfNoneMatch))

        when:
        bc.appendBlockFromUrl(sourceURL.getBlobUrl(), null, null, null, smac, null)

        then:
        thrown(StorageException)

        where:
        sourceIfModifiedSince | sourceIfUnmodifiedSince | sourceIfMatch | sourceIfNoneMatch
        newDate               | null                    | null          | null
        null                  | oldDate                 | null          | null
        null                  | null                    | garbageEtag   | null
        null                  | null                    | null          | receivedEtag
    }
}
