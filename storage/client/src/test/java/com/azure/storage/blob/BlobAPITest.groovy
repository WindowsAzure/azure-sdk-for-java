// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob

import com.azure.core.http.HttpHeaders
import com.azure.core.http.rest.Response
import com.azure.core.http.rest.VoidResponse
import com.azure.core.implementation.util.ImplUtils
import com.azure.storage.blob.models.*
import spock.lang.Unroll

import java.nio.ByteBuffer
import java.security.MessageDigest
import java.time.OffsetDateTime

class BlobAPITest extends APISpec {
    BlobClient bu

    def setup() {
        bu = cu.getBlockBlobClient(generateBlobName())
        bu.upload(defaultInputStream.get(), defaultDataSize)
    }

    def "Download all null"() {
        when:
        ByteArrayOutputStream stream = new ByteArrayOutputStream()
        VoidResponse response = bu.download(stream)
        ByteBuffer body = ByteBuffer.wrap(stream.toByteArray())
        HttpHeaders headers = response.headers()

        then:
        body == defaultData
        ImplUtils.isNullOrEmpty(getMetadataFromHeaders(headers))
        headers.value("Content-Length") != null
        headers.value("Content-Type") != null
        headers.value("Content-Range") == null
        headers.value("Content-MD5") != null
        headers.value("Content-Encoding") == null
        headers.value("Cache-Control") == null
        headers.value("Content-Disposition") == null
        headers.value("Content-Language") == null
        headers.value("x-ms-blob-sequence-number") == null
        headers.value("x-ms-blob-type") == BlobType.BLOCK_BLOB.toString()
        headers.value("x-ms-copy-completion-time") == null
        headers.value("x-ms-copy-status-description") == null
        headers.value("x-ms-copy-id") == null
        headers.value("x-ms-copy-progress") == null
        headers.value("x-ms-copy-source") == null
        headers.value("x-ms-copy-status") == null
        headers.value("x-ms-lease-duration") == null
        headers.value("x-ms-lease-state") == LeaseStateType.AVAILABLE.toString()
        headers.value("x-ms-lease-status") == LeaseStatusType.UNLOCKED.toString()
        headers.value("Accept-Ranges") == "bytes"
        headers.value("x-ms-blob-committed-block-count") == null
        headers.value("x-ms-server-encrypted") != null
        headers.value("x-ms-blob-content-md5") == null
    }

    def "Download empty file"() {
        setup:
        bu = cu.getAppendBlobClient("emptyAppendBlob")
        bu.create()

        when:
        def outStream = new ByteArrayOutputStream()
        bu.download(outStream)
        def result = outStream.toByteArray()

        then:
        notThrown(StorageException)
        result.length == 0
    }

    /*
    This is to test the appropriate integration of DownloadResponse, including setting the correct range values on
    HTTPGetterInfo.
     */
//    def "Download with retry range"() {
//        /*
//        We are going to make a request for some range on a blob. The Flux returned will throw an exception, forcing
//        a retry per the ReliableDownloadOptions. The next request should have the same range header, which was generated
//        from the count and offset values in HTTPGetterInfo that was constructed on the initial call to download. We
//        don't need to check the data here, but we want to ensure that the correct range is set each time. This will
//        test the correction of a bug that was found which caused HTTPGetterInfo to have an incorrect offset when it was
//        constructed in BlobClient.download().
//         */
//        setup:
//        def mockPolicy = Mock(HttpPipelinePolicy) {
//            process(_ as HttpPipelineCallContext, _ as HttpPipelineNextPolicy) >> {
//                HttpPipelineCallContext context, HttpPipelineNextPolicy next ->
//                    HttpRequest request = context.httpRequest()
//                    if (request.headers().value("x-ms-range") != "bytes=2-6") {
//                        return Mono.error(new IllegalArgumentException("The range header was not set correctly on retry."))
//                    }
//                    else {
//                        // ETag can be a dummy value. It's not validated, but DownloadResponse requires one
//                        // return Mono.just(getStubResponseForBlobDownload(206, Flux.error(new IOException()), "etag"))
//                    }
//            }
//        }
//
//        def pipeline = HttpPipeline.builder().policies(mockPolicy).build()
//        bu = bu.pipeline(pipeline)
//
//        when:
//        def range = new BlobRange(2, 5L)
//        def options = new ReliableDownloadOptions().maxretryrequests(3)
//        bu.download(null, options, range, null, false, null)
//
//        then:
//        /*
//        Because the dummy Flux always throws an error. This will also validate that an IllegalArgumentException is
//        NOT thrown because the types would not match.
//         */
//        def e = thrown(RuntimeException)
//        e.getCause() instanceof IOException
//    }

    def "Download min"() {
        when:
        def outStream = new ByteArrayOutputStream()
        bu.download(outStream)
        byte[] result = outStream.toByteArray()

        then:
        result == defaultData.array()
    }

    @Unroll
    def "Download range"() {
        setup:
        BlobRange range = (count == null) ? new BlobRange(offset) : new BlobRange(offset, count)

        when:
        def outStream = new ByteArrayOutputStream()
        bu.download(outStream, null, range, null, false, null)
        String bodyStr = outStream.toString()

        then:
        bodyStr == expectedData

        where:
        offset | count || expectedData
        0      | null  || defaultText
        0      | 5L     || defaultText.substring(0, 5)
        3      | 2L    || defaultText.substring(3, 3 + 2)
    }

    @Unroll
    def "Download AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        leaseID = setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions().ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        def response = bu.download(new ByteArrayOutputStream(), null, null, bac, false, null)

        then:
        response.statusCode() == 200

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
    def "Download AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu.download(new ByteArrayOutputStream(), null, null, bac, false, null).statusCode() == 206

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

    def "Download md5"() {
        when:
        VoidResponse response = bu.download(new ByteArrayOutputStream(), null, new BlobRange(0 ,3), null, true, null)
        byte[] contentMD5 = response.headers().value("content-md5").getBytes()

        then:
        contentMD5 == Base64.getEncoder().encode(MessageDigest.getInstance("MD5").digest(defaultText.substring(0, 3).getBytes()))
    }

    def "Download error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.download(null, null, null, null, false, null)

        then:
        thrown(StorageException)
    }

    /*def "Download context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(206, BlobDownloadHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        bu.download(null)

        then:
        notThrown(RuntimeException)
    }*/

    def "Get properties default"() {
        when:
        Response<BlobProperties> response = bu.getProperties(null, null)
        HttpHeaders headers = response.headers()

        then:
        validateBasicHeaders(headers)
        ImplUtils.isNullOrEmpty(getMetadataFromHeaders(headers))
        headers.value("x-ms-blob-type") == BlobType.BLOCK_BLOB.toString()
        headers.value("x-ms-copy-completion-time") == null // tested in "copy"
        headers.value("x-ms-copy-status-description") == null // only returned when the service has errors; cannot validate.
        headers.value("x-ms-copy-id") == null // tested in "abort copy"
        headers.value("x-ms-copy-progress") == null // tested in "copy"
        headers.value("x-ms-copy-source") == null // tested in "copy"
        headers.value("x-ms-copy-status") == null // tested in "copy"
        headers.value("x-ms-incremental-copy") == null // tested in PageBlob."start incremental copy"
        headers.value("x-ms-copy-destination-snapshot") == null // tested in PageBlob."start incremental copy"
        headers.value("x-ms-lease-duration") == null // tested in "acquire lease"
        headers.value("x-ms-lease-state") == LeaseStateType.AVAILABLE.toString()
        headers.value("x-ms-lease-status") == LeaseStatusType.UNLOCKED.toString()
        headers.value("Content-Length") != null
        headers.value("Content-Type") != null
        headers.value("Content-MD5") != null
        headers.value("Content-Encoding") == null // tested in "set HTTP headers"
        headers.value("Content-Disposition") == null // tested in "set HTTP headers"
        headers.value("Content-Language") == null // tested in "set HTTP headers"
        headers.value("Cache-Control") == null // tested in "set HTTP headers"
        headers.value("x-ms-blob-sequence-number") == null // tested in PageBlob."create sequence number"
        headers.value("Accept-Ranges") == "bytes"
        headers.value("x-ms-blob-committed-block-count") == null // tested in AppendBlob."append block"
        Boolean.parseBoolean(headers.value("x-ms-server-encrypted"))
        headers.value("x-ms-access-tier") == AccessTier.HOT.toString()
        Boolean.parseBoolean(headers.value("x-ms-access-tier-inferred"))
        headers.value("x-ms-archive-status") == null
        headers.value("x-ms-creation-time") != null
    }

    def "Get properties min"() {
        expect:
        bu.getProperties().statusCode() == 200
    }

    @Unroll
    def "Get properties AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        leaseID = setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        expect:
        bu.getProperties(bac, null).statusCode() == 200

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
    def "Get properties AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu.getProperties(bac, null)

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

    def "Get properties error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.getProperties(null, null)

        then:
        thrown(StorageException)
    }

//    def "Get properties context"() {
//        setup:
//        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobProperties)))
//
//        bu = bu.pipeline(pipeline)
//
//        when:
//        bu.getProperties()
//
//        then:
//        notThrown(RuntimeException)
//    }

    def "Set HTTP headers null"() {
        setup:
        VoidResponse response = bu.setHTTPHeaders(null, null, null)

        expect:
        response.statusCode() == 200
        validateBasicHeaders(response.headers())
    }

    // TODO: Doesn't work
//    def "Set HTTP headers min"() {
//        when:
//        bu.setHTTPHeaders(new BlobHTTPHeaders().blobContentType("type"))
//
//        then:
//        bu.getProperties().headers().value("x-ms-blob-content-type") == "type"
//    }
//
    @Unroll
    def "Set HTTP headers headers"() {
        setup:
        BlobHTTPHeaders putHeaders = new BlobHTTPHeaders().blobCacheControl(cacheControl)
            .blobContentDisposition(contentDisposition)
            .blobContentEncoding(contentEncoding)
            .blobContentLanguage(contentLanguage)
            .blobContentMD5(contentMD5)
            .blobContentType(contentType)
        bu.setHTTPHeaders(putHeaders, null, null)

        HttpHeaders receivedHeaders = bu.getProperties(null, null).headers()

        expect:
        validateBlobHeaders(receivedHeaders, cacheControl, contentDisposition, contentEncoding, contentLanguage,
            contentMD5, contentType)

        where:
        cacheControl | contentDisposition | contentEncoding | contentLanguage | contentMD5                                                                               | contentType
        null         | null               | null            | null            | null                                                                                     | null
        // TODO: Doesn't work, double base 64 encoding
//        "control"    | "disposition"      | "encoding"      | "language"      | Base64.getEncoder().encode(MessageDigest.getInstance("MD5").digest(defaultData.array())) | "type"

    }


    @Unroll
    def "Set HTTP headers AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        leaseID = setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        expect:
        bu.setHTTPHeaders(null, bac, null).statusCode() == 200

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
    def "Set HTTP headers AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu.setHTTPHeaders(null, bac, null)

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

    def "Set HTTP headers error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.setHTTPHeaders(null, null, null)

        then:
        thrown(StorageException)
    }

    /*def "Set HTTP headers context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobSetHTTPHeadersHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        bu.setHTTPHeaders(null)

        then:
        notThrown(RuntimeException)
    }*/

    def "Set metadata all null"() {
        setup:
        VoidResponse response = bu.setMetadata(null, null, null)

        expect:
        bu.getProperties(null, null).value().metadata().size() == 0
        response.statusCode() == 200
        validateBasicHeaders(response.headers())
        Boolean.parseBoolean(response.headers().value("x-ms-request-server-encrypted"))
    }

    def "Set metadata min"() {
        setup:
        Metadata metadata = new Metadata()
        metadata.put("foo", "bar")

        when:
        bu.setMetadata(metadata)

        then:
        bu.getProperties().value().metadata() == metadata
    }

    @Unroll
    def "Set metadata metadata"() {
        setup:
        Metadata metadata = new Metadata()
        if (key1 != null && value1 != null) {
            metadata.put(key1, value1)
        }
        if (key2 != null && value2 != null) {
            metadata.put(key2, value2)
        }

        expect:
        bu.setMetadata(metadata, null, null).statusCode() == statusCode
        bu.getProperties(null, null).value().metadata() == metadata

        where:
        key1  | value1 | key2   | value2 || statusCode
        null  | null   | null   | null   || 200
        "foo" | "bar"  | "fizz" | "buzz" || 200
    }

    @Unroll
    def "Set metadata AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        leaseID = setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        expect:
        bu.setMetadata(null, bac, null).statusCode() == 200

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
    def "Set metadata AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, leaseID)

        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu.setMetadata(null, bac, null)

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

    def "Set metadata error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.setMetadata(null, null, null)

        then:
        thrown(StorageException)
    }

    /*def "Set metadata context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobSetMetadataHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        bu.setMetadata(null)

        then:
        notThrown(RuntimeException)
    }*/

    @Unroll
    def "Acquire lease"() {
        setup:
        String leaseId = bu.acquireLease(proposedID, leaseTime, null, null).value()

        when:
        HttpHeaders headers = bu.getProperties(null, null).headers()

        then:
        headers.value("x-ms-lease-state") == leaseState.toString()
        headers.value("x-ms-lease-duration") == leaseDuration.toString()
        leaseId != null
        validateBasicHeaders(headers)

        where:
        proposedID                   | leaseTime || leaseState            | leaseDuration
        null                         | -1        || LeaseStateType.LEASED | LeaseDurationType.INFINITE
        null                         | 25        || LeaseStateType.LEASED | LeaseDurationType.FIXED
        UUID.randomUUID().toString() | -1        || LeaseStateType.LEASED | LeaseDurationType.INFINITE
    }

    def "Acquire lease min"() {
        setup:
        bu.acquireLease(null, -1).statusCode() == 201
    }

    @Unroll
    def "Acquire lease AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu.acquireLease(null, -1, mac, null).statusCode() == 201

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Acquire lease AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu.acquireLease(null, -1, mac, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    def "Acquire lease error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.acquireLease(null, 20, null, null)

        then:
        thrown(StorageException)
    }

    /*def "Acquire lease context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(201, BlobAcquireLeaseHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        bu.acquireLease(null, 20)

        then:
        notThrown(RuntimeException)
    }*/

    def "Renew lease"() {
        setup:
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)

        Thread.sleep(16000) // Wait for the lease to expire to ensure we are actually renewing it
        Response<String> renewLeaseResponse = bu.renewLease(leaseID, null, null)

        expect:
        bu.getProperties(null, null).headers().value("x-ms-lease-state") == LeaseStateType.LEASED.toString()
        validateBasicHeaders(renewLeaseResponse.headers())
        renewLeaseResponse.value() != null
    }

    def "Renew lease min"() {
        setup:
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)

        expect:
        bu.renewLease(leaseID).statusCode() == 200
    }

    @Unroll
    def "Renew lease AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu.renewLease(leaseID, mac, null).statusCode() == 200

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Renew lease AC fail"() {
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu.renewLease(leaseID, mac, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    def "Renew lease error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.renewLease("id", null, null)

        then:
        thrown(StorageException)
    }

    /*def "Renew lease context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobRenewLeaseHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.renewLease("id")

        then:
        notThrown(RuntimeException)
    }*/

    def "Release lease"() {
        setup:
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)

        HttpHeaders headers = bu.releaseLease(leaseID, null, null).headers()

        expect:
        bu.getProperties(null, null).headers().value("x-ms-lease-state") == LeaseStateType.AVAILABLE.toString()
        validateBasicHeaders(headers)
    }

    def "Release lease min"() {
        setup:
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)

        expect:
        bu.releaseLease(leaseID).statusCode() == 200
    }

    @Unroll
    def "Release lease AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu.releaseLease(leaseID, mac, null).statusCode() == 200

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Release lease AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu.releaseLease(leaseID, mac, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    def "Release lease error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.releaseLease("id", null, null)

        then:
        thrown(StorageException)
    }

    /*def "Release lease context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobReleaseLeaseHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.releaseLease("id")

        then:
        notThrown(RuntimeException)
    }*/

    @Unroll
    def "Break lease"() {
        setup:
        bu.acquireLease(UUID.randomUUID().toString(), leaseTime, null, null)

        Response<Integer> breakLeaseResponse = bu.breakLease(breakPeriod, null, null)
        String leaseState = bu.getProperties(null, null).headers().value("x-ms-lease-state")

        expect:
        leaseState == LeaseStateType.BROKEN.toString() || leaseState == LeaseStateType.BREAKING.toString()
        breakLeaseResponse.value() <= remainingTime
        validateBasicHeaders(breakLeaseResponse.headers())

        where:
        leaseTime | breakPeriod | remainingTime
            -1        | null        | 0
            -1        | 20          | 25
            20        | 15          | 16
    }

    def "Break lease min"() {
        setup:
        setupBlobLeaseCondition(bu, receivedLeaseID)

        expect:
        bu.breakLease().statusCode() == 202
    }

    @Unroll
    def "Break lease AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu.breakLease(null, mac, null).statusCode() == 202

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Break lease AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu.breakLease(null, mac, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    def "Break lease error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.breakLease(null, null, null)

        then:
        thrown(StorageException)
    }

    /*def "Break lease context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(202, BlobBreakLeaseHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.breakLease(18, null, null)

        then:
        notThrown(RuntimeException)
    }*/

    def "Change lease"() {
        setup:
        Response<String> acquireLeaseResponse = bu.acquireLease(UUID.randomUUID().toString(), 15)
        Response<String> changeLeaseResponse = bu.changeLease(acquireLeaseResponse.value(), UUID.randomUUID().toString())

        expect:
        bu.releaseLease(changeLeaseResponse.value(), null, null).statusCode() == 200
        validateBasicHeaders(changeLeaseResponse.headers())
    }

    def "Change lease min"() {
        setup:
        def leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)

        expect:
        bu.changeLease(leaseID, UUID.randomUUID().toString()).statusCode() == 200
    }

    @Unroll
    def "Change lease AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu.changeLease(leaseID, UUID.randomUUID().toString(), mac, null).statusCode() == 200

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Change lease AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        String leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu.changeLease(leaseID, UUID.randomUUID().toString(), mac, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    def "Change lease error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.changeLease("id", "id", null, null)

        then:
        thrown(StorageException)
    }

    /*def "Change lease context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobChangeLeaseHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.changeLease("id", "newId")

        then:
        notThrown(RuntimeException)
    }*/

    /*def "Snapshot"() {
        when:
        String snapshot = bu.createSnapshot(null, null, null)

        then:
        bu.snapshot(snapshot).getProperties(null, null).blockingGet().statusCode() == 200
        validateBasicHeaders(headers)
    }*/

    def "Snapshot min"() {
        expect:
        bu.createSnapshot().statusCode() == 201
    }

    /*@Unroll
    def "Snapshot metadata"() {
        setup:
        Metadata metadata = new Metadata()
        if (key1 != null && value1 != null) {
            metadata.put(key1, value1)
        }
        if (key2 != null && value2 != null) {
            metadata.put(key2, value2)
        }

        BlobsCreateSnapshotResponse response = bu.createSnapshot(metadata, null, null)

        expect:
        response.statusCode() == 201
        bu.snapshot(response.headers().snapshot())
            .getProperties(null, null).blockingGet().headers().metadata() == metadata

        where:
        key1  | value1 | key2   | value2
        null  | null   | null   | null
        "foo" | "bar"  | "fizz" | "buzz"
    }*/

    @Unroll
    def "Snapshot AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        leaseID = setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions().leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(
                new ModifiedAccessConditions()
                    .ifModifiedSince(modified)
                    .ifUnmodifiedSince(unmodified)
                    .ifMatch(match)
                    .ifNoneMatch(noneMatch))

        expect:
        bu.createSnapshot(null, bac, null).statusCode() == 201

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
    def "Snapshot AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))


        when:
        bu.createSnapshot(null, bac, null)

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

    def "Snapshot error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.createSnapshot(null, null, null)

        then:
        thrown(StorageException)
    }

    /*def "Snapshot context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(201, BlobCreateSnapshotHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.createSnapshot()

        then:
        notThrown(RuntimeException)
    }*/

    def "Copy"() {
        setup:
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        HttpHeaders headers =
            bu2.startCopyFromURL(bu.getBlobUrl(), null, null, null, null).headers()

        when:
        while (bu2.getProperties(null, null).headers().value("x-ms-copy-status") == CopyStatusType.PENDING.toString()) {
            sleep(1000)
        }
        HttpHeaders headers2 = bu2.getProperties(null, null).headers()

        then:
        headers2.value("x-ms-copy-status") == CopyStatusType.SUCCESS.toString()
        headers2.value("x-ms-copy-completion-time") != null
        headers2.value("x-ms-copy-progress") != null
        headers2.value("x-ms-copy-source") != null
        validateBasicHeaders(headers)
        headers.value("x-ms-copy-id") != null
    }

    def "Copy min"() {
        expect:
        bu.startCopyFromURL(bu.getBlobUrl()).statusCode() == 202
    }

    @Unroll
    def "Copy metadata"() {
        setup:
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        Metadata metadata = new Metadata()
        if (key1 != null && value1 != null) {
            metadata.put(key1, value1)
        }
        if (key2 != null && value2 != null) {
            metadata.put(key2, value2)
        }

        String status =
            bu2.startCopyFromURL(bu.getBlobUrl(), metadata, null, null, null)
                .headers().value("x-ms-copy-status")

        OffsetDateTime start = OffsetDateTime.now()
        while (status != CopyStatusType.SUCCESS.toString()) {
            sleep(1000)
            status = bu2.getProperties().headers().value("x-ms-copy-status")
            OffsetDateTime currentTime = OffsetDateTime.now()
            if (status == CopyStatusType.FAILED.toString() || currentTime.minusMinutes(1) == start) {
                throw new Exception("Copy failed or took too long")
            }
        }

        expect:
        getMetadataFromHeaders(bu2.getProperties().headers()) == metadata

        where:
        key1  | value1 | key2   | value2
        null  | null   | null   | null
        "foo" | "bar"  | "fizz" | "buzz"
    }

    @Unroll
    def "Copy source AC"() {
        setup:
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        match = setupBlobMatchCondition(bu, match)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu2.startCopyFromURL(bu.getBlobUrl(), null, mac, null, null).statusCode() == 202

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Copy source AC fail"() {
        setup:
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu2.startCopyFromURL(bu.getBlobUrl(), null, mac, null, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    @Unroll
    def "Copy dest AC"() {
        setup:
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)
        match = setupBlobMatchCondition(bu2, match)
        leaseID = setupBlobLeaseCondition(bu2, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))


        expect:
        bu2.startCopyFromURL(bu.getBlobUrl(), null, null, bac, null).statusCode() == 202

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
    def "Copy dest AC fail"() {
        setup:
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)
        noneMatch = setupBlobMatchCondition(bu2, noneMatch)
        setupBlobLeaseCondition(bu2, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu2.startCopyFromURL(bu.getBlobUrl(), null, null, bac, null)

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

    def "Abort copy lease fail"() {
        // Data has to be large enough and copied between accounts to give us enough time to abort
        bu.asBlockBlobClient()
            .upload(new ByteArrayInputStream(getRandomByteArray(8 * 1024 * 1024)), 8 * 1024 * 1024)
        // So we don't have to create a SAS.
        cu.setAccessPolicy(PublicAccessType.BLOB, null)

        ContainerClient cu2 = alternateServiceURL.getContainerClient(generateBlobName())
        cu2.create()
        BlockBlobClient bu2 = cu2.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)
        String leaseID = setupBlobLeaseCondition(bu2, receivedLeaseID)

        when:
        String copyID =
            bu2.startCopyFromURL(bu.getBlobUrl(), null, null,
                new BlobAccessConditions()
                    .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID)), null).value()
        bu2.abortCopyFromURL(copyID, new LeaseAccessConditions().leaseId(garbageLeaseID), null)

        then:
        def e = thrown(StorageException)
        e.statusCode() == 412
        cu2.delete()
    }

    /*def "Copy context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(202, BlobStartCopyFromURLHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.startCopyFromURL(new URL("http://www.example.com"))

        then:
        notThrown(RuntimeException)
    }*/

    def "Abort copy"() {
        setup:
        // Data has to be large enough and copied between accounts to give us enough time to abort
        bu.asBlockBlobClient().upload(new ByteArrayInputStream(getRandomByteArray(8 * 1024 * 1024)), 8 * 1024 * 1024)
        // So we don't have to create a SAS.
        cu.setAccessPolicy(PublicAccessType.BLOB, null)

        ContainerClient cu2 = alternateServiceURL.getContainerClient(generateBlobName())
        cu2.create()
        BlobClient bu2 = cu2.getBlobClient(generateBlobName())

        when:
        String copyID = bu2.startCopyFromURL(bu.getBlobUrl()).value()
        VoidResponse response = bu2.abortCopyFromURL(copyID)
        HttpHeaders headers = response.headers()

        then:
        response.statusCode() == 204
        headers.value("x-ms-request-id") != null
        headers.value("x-ms-version") != null
        headers.value("Date") != null
        // Normal test cleanup will not clean up containers in the alternate account.
        cu2.delete().statusCode() == 202
    }

    def "Abort copy min"() {
        setup:
        // Data has to be large enough and copied between accounts to give us enough time to abort
        bu.asBlockBlobClient().upload(new ByteArrayInputStream(getRandomByteArray(8 * 1024 * 1024)), 8 * 1024 * 1024)
        // So we don't have to create a SAS.
        cu.setAccessPolicy(PublicAccessType.BLOB, null)

        ContainerClient cu2 = alternateServiceURL.getContainerClient(generateBlobName())
        cu2.create()
        BlobClient bu2 = cu2.getBlobClient(generateBlobName())

        when:
        String copyID =
            bu2.startCopyFromURL(bu.getBlobUrl()).value()

        then:
        bu2.abortCopyFromURL(copyID).statusCode() == 204
    }

    def "Abort copy lease"() {
        setup:
        // Data has to be large enough and copied between accounts to give us enough time to abort
        bu.asBlockBlobClient().upload(new ByteArrayInputStream(getRandomByteArray(8 * 1024 * 1024)), 8 * 1024 * 1024)
        // So we don't have to create a SAS.
        cu.setAccessPolicy(PublicAccessType.BLOB, null)

        ContainerClient cu2 = alternateServiceURL.getContainerClient(generateContainerName())
        cu2.create()
        BlockBlobClient bu2 = cu2.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)
        String leaseID = setupBlobLeaseCondition(bu2, receivedLeaseID)

        when:
        String copyID =
            bu2.startCopyFromURL(bu.getBlobUrl(), null, null,
                new BlobAccessConditions().leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID)), null).value()

        then:
        bu2.abortCopyFromURL(copyID, new LeaseAccessConditions().leaseId(leaseID), null).statusCode() == 204
        // Normal test cleanup will not clean up containers in the alternate account.
        cu2.delete()
    }

    def "Copy error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.startCopyFromURL(new URL("http://www.error.com"))

        then:
        thrown(StorageException)
    }

    def "Abort copy error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.abortCopyFromURL("id")

        then:
        thrown(StorageException)
    }

    /*def "Abort copy context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(204, BlobAbortCopyFromURLHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.abortCopyFromURL("id")

        then:
        notThrown(RuntimeException)
    }*/

    def "Sync copy"() {
        setup:
        // Sync copy is a deep copy, which requires either sas or public access.
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        HttpHeaders headers = bu2.copyFromURL(bu.getBlobUrl(), null, null,null, null).headers()

        expect:
        headers.value("x-ms-copy-status") == SyncCopyStatusType.SUCCESS.toString()
        headers.value("x-ms-copy-id") != null
        validateBasicHeaders(headers)
    }

    def "Sync copy min"() {
        setup:
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())

        expect:
        bu2.copyFromURL(bu.getBlobUrl()).statusCode() == 202
    }

    @Unroll
    def "Sync copy metadata"() {
        setup:
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        Metadata metadata = new Metadata()
        if (key1 != null && value1 != null) {
            metadata.put(key1, value1)
        }
        if (key2 != null && value2 != null) {
            metadata.put(key2, value2)
        }

        when:
        bu2.copyFromURL(bu.getBlobUrl(), metadata, null, null, null)

        then:
        getMetadataFromHeaders(bu2.getProperties().headers()) == metadata

        where:
        key1  | value1 | key2   | value2
        null  | null   | null   | null
        "foo" | "bar"  | "fizz" | "buzz"
    }

    @Unroll
    def "Sync copy source AC"() {
        setup:
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        match = setupBlobMatchCondition(bu, match)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        expect:
        bu2.copyFromURL(bu.getBlobUrl(), null, mac, null, null).statusCode() == 202

        where:
        modified | unmodified | match        | noneMatch
        null     | null       | null         | null
        oldDate  | null       | null         | null
        null     | newDate    | null         | null
        null     | null       | receivedEtag | null
        null     | null       | null         | garbageEtag
    }

    @Unroll
    def "Sync copy source AC fail"() {
        setup:
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        def mac = new ModifiedAccessConditions()
            .ifModifiedSince(modified)
            .ifUnmodifiedSince(unmodified)
            .ifMatch(match)
            .ifNoneMatch(noneMatch)

        when:
        bu2.copyFromURL(bu.getBlobUrl(), null, mac, null, null)

        then:
        thrown(StorageException)

        where:
        modified | unmodified | match       | noneMatch
        newDate  | null       | null        | null
        null     | oldDate    | null        | null
        null     | null       | garbageEtag | null
        null     | null       | null        | receivedEtag
    }

    @Unroll
    def "Sync copy dest AC"() {
        setup:
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)
        match = setupBlobMatchCondition(bu2, match)
        leaseID = setupBlobLeaseCondition(bu2, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        expect:
        bu2.copyFromURL(bu.getBlobUrl(), null, null, bac, null).statusCode() == 202

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
    def "Sync copy dest AC fail"() {
        setup:
        cu.setAccessPolicy(PublicAccessType.CONTAINER, null)
        BlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)
        noneMatch = setupBlobMatchCondition(bu2, noneMatch)
        setupBlobLeaseCondition(bu2, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu2.copyFromURL(bu.getBlobUrl(), null, null, bac, null)

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

    def "Sync copy error"() {
        setup:
        def bu2 = cu.getBlockBlobClient(generateBlobName())

        when:
        bu2.copyFromURL(bu.getBlobUrl())

        then:
        thrown(StorageException)
    }

    /*def "Sync copy context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(202, BlobCopyFromURLHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.syncCopyFromURL(new URL("http://www.example.com"))

        then:
        notThrown(RuntimeException)
    }*/

    def "Delete"() {
        when:
        VoidResponse response = bu.delete()
        HttpHeaders headers = response.headers()

        then:
        response.statusCode() == 202
        headers.value("x-ms-request-id") != null
        headers.value("x-ms-version") != null
        headers.value("Date") != null
    }

    def "Delete min"() {
        expect:
        bu.delete().statusCode() == 202
    }

    @Unroll
    def "Delete options"() {
        setup:
        bu.createSnapshot()
        // Create an extra blob so the list isn't empty (null) when we delete base blob, too
        BlockBlobClient bu2 = cu.getBlockBlobClient(generateBlobName())
        bu2.upload(defaultInputStream.get(), defaultDataSize)

        when:
        bu.delete(option, null, null)

        then:
        Iterator<BlobItem> blobs = cu.listBlobsFlat().iterator()

        int blobCount = 0
        for ( ; blobs.hasNext(); blobCount++ )
            blobs.next()

        blobCount == blobsRemaining

        where:
        option                            | blobsRemaining
        DeleteSnapshotsOptionType.INCLUDE | 1
        DeleteSnapshotsOptionType.ONLY    | 2
    }

    @Unroll
    def "Delete AC"() {
        setup:
        match = setupBlobMatchCondition(bu, match)
        leaseID = setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        expect:
        bu.delete(DeleteSnapshotsOptionType.INCLUDE, bac, null).statusCode() == 202

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
    def "Delete AC fail"() {
        setup:
        noneMatch = setupBlobMatchCondition(bu, noneMatch)
        setupBlobLeaseCondition(bu, leaseID)
        BlobAccessConditions bac = new BlobAccessConditions()
            .leaseaccessconditions(new LeaseAccessConditions().leaseId(leaseID))
            .modifiedaccessconditions(new ModifiedAccessConditions()
                .ifModifiedSince(modified)
                .ifUnmodifiedSince(unmodified)
                .ifMatch(match)
                .ifNoneMatch(noneMatch))

        when:
        bu.delete(DeleteSnapshotsOptionType.INCLUDE, bac, null)

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

    def "Blob delete error"() {
        setup:
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.delete(null, null, null)

        then:
        thrown(StorageException)
    }

    /*def "Delete context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(202, BlobDeleteHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.delete()

        then:
        notThrown(RuntimeException)
    }*/

    @Unroll
    def "Set tier block blob"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateContainerName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create()
        bu.upload(defaultInputStream.get(), defaultData.remaining())

        when:
        VoidResponse initialResponse = bu.setTier(tier)
        HttpHeaders headers = initialResponse.headers()

        then:
        initialResponse.statusCode() == 200 || initialResponse.statusCode() == 202
        headers.value("x-ms-version") != null
        headers.value("x-ms-request-id") != null
        bu.getProperties().headers().value("x-ms-access-tier") == tier.toString()
        cu.listBlobsFlat().iterator().next().properties().accessTier() == tier

        where:
        tier               | _
        AccessTier.HOT     | _
        AccessTier.COOL    | _
        AccessTier.ARCHIVE | _
    }

    @Unroll
    def "Set tier page blob"() {
        setup:
        ContainerClient cu = premiumServiceURL.getContainerClient(generateContainerName())
        cu.create()

        PageBlobClient bu = cu.getPageBlobClient(generateBlobName())
        bu.create(512)

        when:
        bu.setTier(tier, null, null)

        then:
        bu.getProperties().headers().value("x-ms-access-tier") == tier.toString()
        cu.listBlobsFlat().iterator().next().properties().accessTier() == tier
        cu.delete()

        where:
        tier           | _
        AccessTier.P4  | _
        AccessTier.P6  | _
        AccessTier.P10 | _
        AccessTier.P20 | _
        AccessTier.P30 | _
        AccessTier.P40 | _
        AccessTier.P50 | _
    }

    def "Set tier min"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateContainerName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create()
        bu.upload(defaultInputStream.get(), defaultData.remaining())

        when:
        int statusCode = bu.setTier(AccessTier.HOT).statusCode()

        then:
        statusCode == 200 || statusCode == 202
    }

    def "Set tier inferred"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateBlobName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create()
        bu.upload(defaultInputStream.get(), defaultDataSize)

        when:
        boolean inferred1 = Boolean.parseBoolean(bu.getProperties().headers().value("x-ms-access-tier-inferred"))
        Boolean inferredList1 = cu.listBlobsFlat().iterator().next().properties().accessTierInferred()

        bu.setTier(AccessTier.HOT)

        boolean inferred2 = Boolean.parseBoolean(bu.getProperties().headers().value("x-ms-access-tier-inferred"))
        Boolean inferredList2 = cu.listBlobsFlat().iterator().next().properties().accessTierInferred()

        then:
        inferred1
        inferredList1
        !inferred2
        inferredList2 == null
    }

    @Unroll
    def "Set tier archive status"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateBlobName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create(null, null, null, defaultContext)
        bu.upload(defaultInputStream.get(), defaultDataSize)

        when:
        bu.setTier(sourceTier)
        bu.setTier(destTier)

        then:
        bu.getProperties().headers().value("x-ms-archive-status") == status.toString()
        cu.listBlobsFlat().iterator().next().properties().archiveStatus() == status

        where:
        sourceTier         | destTier        | status
        AccessTier.ARCHIVE | AccessTier.COOL | ArchiveStatus.REHYDRATE_PENDING_TO_COOL
        AccessTier.ARCHIVE | AccessTier.HOT  | ArchiveStatus.REHYDRATE_PENDING_TO_HOT
    }

    def "Set tier error"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateBlobName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create()
        bu.upload(defaultInputStream.get(), defaultDataSize)

        when:
        bu.setTier(AccessTier.fromString("garbage"))

        then:
        def e = thrown(StorageException)
        e.errorCode() == StorageErrorCode.INVALID_HEADER_VALUE
    }

    def "Set tier illegal argument"() {
        when:
        bu.setTier(null)

        then:
        thrown(IllegalArgumentException)
    }

    def "Set tier lease"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateBlobName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create()
        bu.upload(defaultInputStream.get(), defaultDataSize)
        def leaseID = setupBlobLeaseCondition(bu, receivedLeaseID)

        when:
        bu.setTier(AccessTier.HOT, new LeaseAccessConditions().leaseId(leaseID), null)

        then:
        notThrown(StorageException)
    }

    def "Set tier lease fail"() {
        setup:
        ContainerClient cu = blobStorageServiceURL.getContainerClient(generateBlobName())
        BlockBlobClient bu = cu.getBlockBlobClient(generateBlobName())
        cu.create()
        bu.upload(defaultInputStream.get(), defaultDataSize)

        when:
        bu.setTier(AccessTier.HOT, new LeaseAccessConditions().leaseId("garbage"), null)

        then:
        thrown(StorageException)
    }

    /*def "Set tier context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(202, BlobSetTierHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.setTier(AccessTier.HOT)

        then:
        notThrown(RuntimeException)
    }*/

    def "Undelete"() {
        setup:
        enableSoftDelete()
        bu.delete()

        when:
        HttpHeaders headers = bu.undelete().headers()
        bu.getProperties()

        then:
        notThrown(StorageException)
        headers.value("x-ms-request-id") != null
        headers.value("x-ms-version") != null
        headers.value("Date") != null

        disableSoftDelete() == null
    }

    def "Undelete min"() {
        setup:
        enableSoftDelete()
        bu.delete()

        expect:
        bu.undelete().statusCode() == 200
    }

    def "Undelete error"() {
        bu = cu.getBlockBlobClient(generateBlobName())

        when:
        bu.undelete()

        then:
        thrown(StorageException)
    }

    /*def "Undelete context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobUndeleteHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.undelete(null)

        then:
        notThrown(RuntimeException)
    }*/

    def "Get account info"() {
        when:
        Response<StorageAccountInfo> response = primaryServiceURL.getAccountInfo()

        then:
        response.headers().value("Date") != null
        response.headers().value("x-ms-request-id") != null
        response.headers().value("x-ms-version") != null
        response.value().accountKind() != null
        response.value().skuName() != null
    }

    def "Get account info min"() {
        expect:
        bu.getAccountInfo().statusCode() == 200
    }

    def "Get account info error"() {
        when:
        StorageClient serviceURL = StorageClient.storageClientBuilder()
            .endpoint(primaryServiceURL.getAccountUrl().toString())
            .buildClient()
        serviceURL.getContainerClient(generateContainerName()).getBlobClient(generateBlobName())
            .getAccountInfo(null)

        then:
        thrown(StorageException)
    }

    /*def "Get account info context"() {
        setup:
        def pipeline = HttpPipeline.build(getStubFactory(getContextStubPolicy(200, BlobGetAccountInfoHeaders)))

        bu = bu.pipeline(pipeline)

        when:
        // No service call is made. Just satisfy the parameters.
        bu.getAccountInfo(null)

        then:
        notThrown(RuntimeException)
    }*/
}
