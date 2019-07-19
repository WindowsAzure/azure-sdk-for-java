// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob

import com.azure.core.http.rest.Response
import com.azure.core.http.rest.VoidResponse
import com.azure.storage.blob.models.AccessPolicy
import com.azure.storage.blob.models.BlobRange
import com.azure.storage.blob.models.SignedIdentifier
import com.azure.storage.blob.models.UserDelegationKey
import com.azure.storage.common.credentials.SASTokenCredential
import com.azure.storage.common.credentials.SharedKeyCredential
import spock.lang.Unroll

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

class HelperTest extends APISpec {

    // TODO (alzimmer): Turn this on when nextPageLink can be passed into listing
    /*def "responseError"() {
        when:
        cu.listBlobsFlat().iterator().hasNext()

        then:
        def e = thrown(StorageException)
        e.errorCode() == StorageErrorCode.INVALID_QUERY_PARAMETER_VALUE
        e.statusCode() == 400
        e.message().contains("Value for one of the query parameters specified in the request URI is invalid.")
        e.getMessage().contains("<?xml") // Ensure that the details in the payload are printable
    }*/

    /*
    This test is to validate the workaround for the autorest bug that forgets to set the request property on the
    response.
     */
    def "Request property"() {
        when:
        VoidResponse response = cu.delete()

        then:
        response.request() != null
    }

    @Unroll
    def "Blob range"() {
        expect:
        new BlobRange(offset, count).toHeaderValue() == result

        where:
        offset | count || result
        0      | null  || null
        0      | 5     || "bytes=0-4"
        5      | 10    || "bytes=5-14"
    }

    @Unroll
    def "Blob range IA"() {
        when:
        new BlobRange(offset, count)

        then:
        thrown(IllegalArgumentException)

        where:
        offset | count
        -1     | 5
        0      | -1
    }

    def "serviceSASSignatureValues network test blob"() {
        setup:
        String containerName = generateContainerName()
        String blobName = generateBlobName()
        ContainerClient cu = primaryServiceURL.createContainer(containerName).value()

        BlobSASPermission p = new BlobSASPermission()
            .read(true)
            .write(true)
            .create(true)
            .delete(true)
            .add(true)

        IPRange ipR = new IPRange()
            .ipMin("0.0.0.0")
            .ipMax("255.255.255.255")

        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .permissions(p.toString())
            .startTime(OffsetDateTime.now().minusDays(1))
            .expiryTime(OffsetDateTime.now().plusDays(1))
            .resource(Constants.UrlConstants.SAS_BLOB_CONSTANT)
            .canonicalName(String.format("/blob/%s/%s/%s", primaryCreds.accountName(), containerName, blobName))
            .ipRange(ipR)
            .protocol(SASProtocol.HTTPS_ONLY)
            .cacheControl("cache")
            .contentDisposition("disposition")
            .contentEncoding("encoding")
            .contentLanguage("language")
            .contentType("type")

        when:
        BlobURLParts parts = URLParser.parse(cu.getBlobClient(blobName).getBlobUrl())
        parts.sasQueryParameters(v.generateSASQueryParameters(primaryCreds)).scheme("https")
        AppendBlobClient bu = new AppendBlobClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()

        then:
        bu.create()

        and:
        Response<BlobProperties> properties = bu.getProperties()

        then:
        properties.value().cacheControl() == "cache"
        properties.value().contentDisposition() == "disposition"
        properties.value().contentEncoding() == "encoding"
        properties.value().contentLanguage() == "language"
        properties.headers().value("Content-Type") == "type"
    }

    def "serviceSASSignatureValues network test blob snapshot"() {
        setup:
        String containerName = generateContainerName()
        String blobName = generateBlobName()
        ContainerClient cu = primaryServiceURL.createContainer(containerName).value()
        BlockBlobClient bu = cu.getBlockBlobClient(blobName)
        bu.upload(defaultInputStream.get(), defaultDataSize) // need something to snapshot
        String snapshotId = bu.createSnapshot().value()

        BlobSASPermission p = new BlobSASPermission()
            .read(true)
            .write(true)
            .create(true)
            .delete(true)
            .add(true)

        IPRange ipR = new IPRange()
            .ipMin("0.0.0.0")
            .ipMax("255.255.255.255")

        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .permissions(p.toString())
            .startTime(OffsetDateTime.now().minusDays(1))
            .expiryTime(OffsetDateTime.now().plusDays(1))
            .resource(Constants.UrlConstants.SAS_BLOB_SNAPSHOT_CONSTANT)
            .canonicalName(String.format("/blob/%s/%s/%s", primaryCreds.accountName(), containerName, blobName))
            .snapshotId(snapshotId)
            .ipRange(ipR)
            .protocol(SASProtocol.HTTPS_ONLY)
            .cacheControl("cache")
            .contentDisposition("disposition")
            .contentEncoding("encoding")
            .contentLanguage("language")
            .contentType("type")

        when:
        BlobURLParts parts = URLParser.parse(bu.getBlobUrl())
        parts.sasQueryParameters(v.generateSASQueryParameters(primaryCreds)).scheme("https")
        // base blob with snapshot SAS
        AppendBlobClient bsu = new AppendBlobClientBuilder()
            .endpoint(parts.toURL().toString())
            .buildClient()

        bsu.download(new ByteArrayOutputStream())

        then:
        // snapshot-level SAS shouldn't be able to access base blob
        thrown(StorageException)

        when:
        // blob snapshot with snapshot SAS
        parts.snapshot(snapshotId)
        bsu = new AppendBlobClientBuilder()
            .endpoint(parts.toURL().toString())
            .credential(new SASTokenCredential())
            .buildClient()

        ByteArrayOutputStream data = new ByteArrayOutputStream()
        bsu.download(data)

        then:
        notThrown(StorageException)
        data.toByteArray() == defaultData.array()

        and:
        Response<BlobProperties> properties = bsu.getProperties()

        then:
        properties.value().cacheControl() == "cache"
        properties.value().contentDisposition() == "disposition"
        properties.value().contentEncoding() == "encoding"
        properties.value().contentLanguage() == "language"
        properties.headers().value("Content-Type") == "type"
    }

    def "serviceSASSignatureValues network test container"() {
        setup:
        String containerName = generateContainerName()
        ContainerClient cu = primaryServiceURL.createContainer(containerName).value()
        SignedIdentifier id = new SignedIdentifier()
            .id("0000")
            .accessPolicy(new AccessPolicy().permission("racwdl")
                .expiry(OffsetDateTime.now().plusDays(1)))
        cu.setAccessPolicy(null, Arrays.asList(id))

        // Check id field
        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .identifier("0000")
            .resource(Constants.UrlConstants.SAS_CONTAINER_CONSTANT)
            .canonicalName(String.format("/blob/%s/%s", primaryCreds.accountName(), containerName))
            .protocol(SASProtocol.HTTPS_ONLY)

        // Check containerSASPermissions
        ContainerSASPermission p = new ContainerSASPermission()
            .read(true)
            .write(true)
            .create(true)
            .delete(true)
            .add(true)
            .list(true)
        ServiceSASSignatureValues v2 = new ServiceSASSignatureValues()
            .permissions(p.toString())
            .expiryTime(OffsetDateTime.now().plusDays(1))
            .resource(containerName)

        when:
        BlobURLParts parts = URLParser.parse(cu.getContainerUrl())
            .sasQueryParameters(v.generateSASQueryParameters(primaryCreds))
            .scheme("https")
        ContainerClient cuSAS = new ContainerClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()

        parts.sasQueryParameters(v2.generateSASQueryParameters(primaryCreds))
        ContainerClient cuSAS2 = new ContainerClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()

        then:
        cuSAS.getProperties()
        cuSAS2.getProperties()
        notThrown(StorageException)
    }

    def "serviceSASSignatureValues network test blob user delegation"() {
        setup:
        String containerName = generateContainerName()
        String blobName = generateBlobName()
        ContainerClient cu = primaryServiceURL.createContainer(containerName).value()

        BlobSASPermission p = new BlobSASPermission()
            .read(true)
            .write(true)
            .create(true)
            .delete(true)
            .add(true)

        IPRange ipR = new IPRange()
            .ipMin("0.0.0.0")
            .ipMax("255.255.255.255")

        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .permissions(p.toString())
            .startTime(OffsetDateTime.now().minusDays(1))
            .expiryTime(OffsetDateTime.now().plusDays(1))
            .resource(Constants.UrlConstants.SAS_BLOB_CONSTANT)
            .canonicalName(String.format("/blob/%s/%s/%s", primaryCreds.accountName(), containerName, blobName))
            .ipRange(ipR)
            .protocol(SASProtocol.HTTPS_ONLY)
            .cacheControl("cache")
            .contentDisposition("disposition")
            .contentEncoding("encoding")
            .contentLanguage("language")
            .contentType("type")

        UserDelegationKey key = getOAuthServiceURL().getUserDelegationKey(null, OffsetDateTime.now().plusDays(1)).value()

        when:
        BlobURLParts parts = URLParser.parse(cu.getBlobClient(blobName).getBlobUrl())
        parts.sasQueryParameters(v.generateSASQueryParameters(key)).scheme("https")
        AppendBlobClient bu = new AppendBlobClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()

        then:
        bu.create()

        and:
        Response<BlobProperties> properties = bu.getProperties()

        then:
        properties.value().cacheControl() == "cache"
        properties.value().contentDisposition() == "disposition"
        properties.value().contentEncoding() == "encoding"
        properties.value().contentLanguage() == "language"
        properties.headers().value("Content-Type") == "type"
    }

    def "serviceSASSignatureValues network test blob snapshot user delegation"() {
        setup:
        String containerName = generateContainerName()
        String blobName = generateBlobName()
        ContainerClient cu = primaryServiceURL.createContainer(containerName).value()
        BlockBlobClient bu = cu.getBlockBlobClient(blobName)
        bu.upload(defaultInputStream.get(), defaultDataSize) // need something to snapshot
        String snapshotId = bu.createSnapshot().value()

        BlobSASPermission p = new BlobSASPermission()
            .read(true)
            .write(true)
            .create(true)
            .delete(true)
            .add(true)

        def ipR = new IPRange()
            .ipMin("0.0.0.0")
            .ipMax("255.255.255.255")

        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .permissions(p.toString())
            .startTime(OffsetDateTime.now().minusDays(1))
            .expiryTime(OffsetDateTime.now().plusDays(1))
            .resource(Constants.UrlConstants.SAS_BLOB_SNAPSHOT_CONSTANT)
            .canonicalName(String.format("/blob/%s/%s/%s", primaryCreds.accountName(), containerName, blobName))
            .snapshotId(snapshotId)
            .ipRange(ipR)
            .protocol(SASProtocol.HTTPS_ONLY)
            .cacheControl("cache")
            .contentDisposition("disposition")
            .contentEncoding("encoding")
            .contentLanguage("language")
            .contentType("type")

        UserDelegationKey key = getOAuthServiceURL().getUserDelegationKey(null, OffsetDateTime.now().plusDays(1)).value()

        when:
        BlobURLParts parts = URLParser.parse(bu.getBlobUrl())
        parts.sasQueryParameters(v.generateSASQueryParameters(key)).scheme("https")
        // base blob with snapshot SAS
        AppendBlobClient bsu = new AppendBlobClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()
        bsu.download(new ByteArrayOutputStream())

        then:
        // snapshot-level SAS shouldn't be able to access base blob
        thrown(StorageException)

        when:
        // blob snapshot with snapshot SAS
        parts.snapshot(snapshotId)
        bsu = new AppendBlobClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()

        ByteArrayOutputStream data = new ByteArrayOutputStream()
        bsu.download(data)

        then:
        notThrown(StorageException)
        data.toByteArray() == defaultData.array()

        and:
        Response<BlobProperties> properties = bsu.getProperties()

        then:
        properties.value().cacheControl() == "cache"
        properties.value().contentDisposition() == "disposition"
        properties.value().contentEncoding() == "encoding"
        properties.value().contentLanguage() == "language"
        properties.headers().value("Content-Type") == "type"
    }

    def "serviceSASSignatureValues network test container user delegation"() {
        setup:
        String containerName = generateContainerName()
        ContainerClient cu = primaryServiceURL.createContainer(containerName).value()

        ContainerSASPermission p = new ContainerSASPermission()
            .read(true)
            .write(true)
            .create(true)
            .delete(true)
            .add(true)
            .list(true)

        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .resource(Constants.UrlConstants.SAS_CONTAINER_CONSTANT)
            .canonicalName(String.format("/blob/%s/%s", primaryCreds.accountName(), containerName))
            .protocol(SASProtocol.HTTPS_HTTP)
            .expiryTime(OffsetDateTime.now().plusHours(5))
            .permissions(p.toString())

        UserDelegationKey key = getOAuthServiceURL().getUserDelegationKey(null, OffsetDateTime.now().plusDays(1)).value()

        when:
        BlobURLParts parts = URLParser.parse(cu.getContainerUrl())
            .sasQueryParameters(v.generateSASQueryParameters(key))
            .scheme("http")

        ContainerClient cuSAS = new ContainerClientBuilder()
            .endpoint(parts.toURL().toString())
            .anonymousCredential()
            .buildClient()

        then:
        cuSAS.getProperties()
        notThrown(StorageException)
    }

    /*
     This test will ensure that each field gets placed into the proper location within the string to sign and that null
     values are handled correctly. We will validate the whole SAS with service calls as well as correct serialization of
     individual parts later.
     */

    @Unroll
    def "serviceSasSignatures string to sign"() {
        when:
        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
        if (permissions != null) {
            v.permissions(new BlobSASPermission().read(true).toString())
        } else {
            v.permissions("")
        }

        if (snapId != null) {
            v.resource(Constants.UrlConstants.SAS_BLOB_SNAPSHOT_CONSTANT)
        } else {
            v.resource(Constants.UrlConstants.SAS_BLOB_CONSTANT)
        }

        v.startTime(startTime)
            .expiryTime(expiryTime)
            .canonicalName(String.format("/blob/%s/containerName/blobName", primaryCreds.accountName()))
            .snapshotId(snapId)

        if (ipRange != null) {
            v.ipRange(new IPRange().ipMin("ip"))
        }

        v.identifier(identifier)
            .protocol(protocol)
            .cacheControl(cacheControl)
            .contentDisposition(disposition)
            .contentEncoding(encoding)
            .contentLanguage(language)
            .contentType(type)

        SASQueryParameters token = v.generateSASQueryParameters(primaryCreds)

        if (startTime != null) {
            expectedStringToSign = String.format(expectedStringToSign,
                Utility.ISO_8601_UTC_DATE_FORMATTER.format(startTime),
                Utility.ISO_8601_UTC_DATE_FORMATTER.format(expiryTime),
                primaryCreds.accountName())
        } else {
            expectedStringToSign = String.format(expectedStringToSign,
                Utility.ISO_8601_UTC_DATE_FORMATTER.format(expiryTime),
                primaryCreds.accountName())
        }

        then:
        token.signature() == primaryCreds.computeHmac256(expectedStringToSign)

        /*
        We don't test the blob or containerName properties because canonicalized resource is always added as at least
        /blob/accountName. We test canonicalization of resources later. Again, this is not to test a fully functional
        sas but the construction of the string to sign.
        Signed resource is tested elsewhere, as we work some minor magic in choosing which value to use.
         */
        where:
        permissions             | startTime                                             | expiryTime                                           | identifier | ipRange       | protocol               | snapId   | cacheControl | disposition   | encoding   | language   | type   || expectedStringToSign
        new BlobSASPermission() | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | null          | null       | null       | null   || "r\n\n%s\n" + "/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | OffsetDateTime.now(ZoneOffset.UTC).minusDays(1) | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | null          | null       | null       | null   || "\n%s\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | "id"       | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\nid\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | new IPRange() | null                   | null     | null         | null          | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\nip\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | SASProtocol.HTTPS_ONLY | null     | null         | null          | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n" + SASProtocol.HTTPS_ONLY + "\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | "snapId" | null         | null          | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nbs\nsnapId\n\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | "control"    | null          | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\ncontrol\n\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | "disposition" | null       | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\ndisposition\n\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | null          | "encoding" | null       | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\nencoding\n\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | null          | null       | "language" | null   || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\nlanguage\n"
        null                    | null                                                  | OffsetDateTime.now(ZoneOffset.UTC).plusDays(1) | null       | null          | null                   | null     | null         | null          | null       | null       | "type" || "\n\n%s\n/blob/%s/containerName/blobName\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\ntype"
    }

    @Unroll
    def "serviceSasSignatures string to sign user delegation key"() {
        when:
        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
        if (permissions != null) {
            v.permissions(new BlobSASPermission().read(true).toString())
        }

        v.startTime(startTime)
            .expiryTime(expiryTime)
            .canonicalName(String.format("/blob/%s/containerName/blobName", primaryCreds.accountName()))
            .snapshotId(snapId)

        if (snapId != null) {
            v.resource(Constants.UrlConstants.SAS_BLOB_SNAPSHOT_CONSTANT)
        } else {
            v.resource(Constants.UrlConstants.SAS_BLOB_CONSTANT)
        }

        if (ipRange != null) {
            v.ipRange(new IPRange().ipMin("ip"))
        }

        v.protocol(protocol)
            .cacheControl(cacheControl)
            .contentDisposition(disposition)
            .contentEncoding(encoding)
            .contentLanguage(language)
            .contentType(type)

        UserDelegationKey key = new UserDelegationKey()
            .signedOid(keyOid)
            .signedTid(keyTid)
            .signedStart(keyStart)
            .signedExpiry(keyExpiry)
            .signedService(keyService)
            .signedVersion(keyVersion)
            .value(keyValue)

        SASQueryParameters token = v.generateSASQueryParameters(key)

        expectedStringToSign = String.format(expectedStringToSign, primaryCreds.accountName())

        then:
        token.signature() == Utility.delegateComputeHmac256(key, expectedStringToSign)

        /*
        We test string to sign functionality directly related to user delegation sas specific parameters
         */
        where:
        permissions             | startTime                                                 | expiryTime                                                | keyOid                                 | keyTid                                 | keyStart                                                              | keyExpiry                                                             | keyService | keyVersion   | keyValue                                       | ipRange       | protocol               | snapId   | cacheControl | disposition   | encoding   | language   | type   || expectedStringToSign
        new BlobSASPermission() | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "r\n\n\n" + "/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC) | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n" + Utility.ISO_8601_UTC_DATE_FORMATTER.format(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)) + "\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC) | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n" + Utility.ISO_8601_UTC_DATE_FORMATTER.format(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)) + "\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | "11111111-1111-1111-1111-111111111111" | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n11111111-1111-1111-1111-111111111111\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | "22222222-2222-2222-2222-222222222222" | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n22222222-2222-2222-2222-222222222222\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | OffsetDateTime.of(LocalDateTime.of(2018, 1, 1, 0, 0), ZoneOffset.UTC) | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n2018-01-01T00:00:00Z\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | OffsetDateTime.of(LocalDateTime.of(2018, 1, 1, 0, 0), ZoneOffset.UTC) | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n2018-01-01T00:00:00Z\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | "b"        | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\nb\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | "2018-06-17" | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n2018-06-17\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | new IPRange() | null                   | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\nip\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | SASProtocol.HTTPS_ONLY | null     | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n" + SASProtocol.HTTPS_ONLY + "\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | "snapId" | null         | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nbs\nsnapId\n\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | "control"    | null          | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\ncontrol\n\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | "disposition" | null       | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\ndisposition\n\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | "encoding" | null       | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\nencoding\n\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | "language" | null   || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\nlanguage\n"
        null                    | null                                                      | null                                                      | null                                   | null                                   | null                                                                  | null                                                                  | null       | null         | "3hd4LRwrARVGbeMRQRfTLIsGMkCPuZJnvxZDU7Gak8c=" | null          | null                   | null     | null         | null          | null       | null       | "type" || "\n\n\n/blob/%s/containerName/blobName\n\n\n\n\n\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\ntype"
    }

    @Unroll
    def "serviceSASSignatureValues canonicalizedResource"() {
        setup:
        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .expiryTime(expiryTime)
            .permissions(new BlobSASPermission().toString())
            .resource(expectedResource)
            .canonicalName(String.format("/blob/%s/%s", primaryCreds.accountName(), containerName))
            .snapshotId(snapId)

        if (blobName != null) {
            v.canonicalName(v.canonicalName() + "/" + blobName)
        }

        expectedStringToSign = String.format(expectedStringToSign,
            Utility.ISO_8601_UTC_DATE_FORMATTER.format(expiryTime),
            primaryCreds.accountName())

        when:
        SASQueryParameters token = v.generateSASQueryParameters(primaryCreds)

        then:
        token.signature() == primaryCreds.computeHmac256(expectedStringToSign)
        token.resource() == expectedResource

        where:
        containerName | blobName | snapId | expiryTime           || expectedResource | expectedStringToSign
        "c"           | "b"      | "id"   | OffsetDateTime.now() || "bs"             | "\n\n%s\n" + "/blob/%s/c/b\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nbs\nid\n\n\n\n\n"
        "c"           | "b"      | null   | OffsetDateTime.now() || "b"              | "\n\n%s\n" + "/blob/%s/c/b\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nb\n\n\n\n\n\n"
        "c"           | null     | null   | OffsetDateTime.now() || "c"              | "\n\n%s\n" + "/blob/%s/c\n\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\nc\n\n\n\n\n\n"

    }

    @Unroll
    def "serviceSasSignatureValues IA"() {
        setup:
        ServiceSASSignatureValues v = new ServiceSASSignatureValues()
            .permissions(new AccountSASPermission().toString())
            .expiryTime(OffsetDateTime.now())
            .resource(containerName)
            .canonicalName(blobName)
            .snapshotId("2018-01-01T00:00:00.0000000Z")
            .version(version)

        when:
        v.generateSASQueryParameters((SharedKeyCredential)creds)

        then:
        def e = thrown(IllegalArgumentException)
        e.getMessage().contains(parameter)

        where:
        containerName | version | creds        | blobName || parameter
        "c"           | null    | primaryCreds | "b"       | "version"
        "c"           | "v"     | null         | "b"       | "sharedKeyCredentials"
        "c"           | "v"     | primaryCreds | null      | "canonicalName"
    }

    @Unroll
    def "BlobSASPermissions toString"() {
        setup:
        BlobSASPermission perms = new BlobSASPermission()
            .read(read)
            .write(write)
            .delete(delete)
            .create(create)
            .add(add)

        expect:
        perms.toString() == expectedString

        where:
        read  | write | delete | create | add   || expectedString
        true  | false | false  | false  | false || "r"
        false | true  | false  | false  | false || "w"
        false | false | true   | false  | false || "d"
        false | false | false  | true   | false || "c"
        false | false | false  | false  | true  || "a"
        true  | true  | true   | true   | true  || "racwd"
    }

    @Unroll
    def "BlobSASPermissions parse"() {
        when:
        BlobSASPermission perms = BlobSASPermission.parse(permString)

        then:
        perms.read() == read
        perms.write() == write
        perms.delete() == delete
        perms.create() == create
        perms.add() == add

        where:
        permString || read  | write | delete | create | add
        "r"        || true  | false | false  | false  | false
        "w"        || false | true  | false  | false  | false
        "d"        || false | false | true   | false  | false
        "c"        || false | false | false  | true   | false
        "a"        || false | false | false  | false  | true
        "racwd"    || true  | true  | true   | true   | true
        "dcwra"    || true  | true  | true   | true   | true
    }

    def "BlobSASPermissions parse IA"() {
        when:
        BlobSASPermission.parse("rwaq")

        then:
        thrown(IllegalArgumentException)
    }

    @Unroll
    def "ContainerSASPermissions toString"() {
        setup:
        ContainerSASPermission perms = new ContainerSASPermission()
            .read(read)
            .write(write)
            .delete(delete)
            .create(create)
            .add(add)
            .list(list)

        expect:
        perms.toString() == expectedString

        where:
        read  | write | delete | create | add   | list  || expectedString
        true  | false | false  | false  | false | false || "r"
        false | true  | false  | false  | false | false || "w"
        false | false | true   | false  | false | false || "d"
        false | false | false  | true   | false | false || "c"
        false | false | false  | false  | true  | false || "a"
        false | false | false  | false  | false | true  || "l"
        true  | true  | true   | true   | true  | true  || "racwdl"
    }

    @Unroll
    def "ContainerSASPermissions parse"() {
        when:
        ContainerSASPermission perms = ContainerSASPermission.parse(permString)

        then:
        perms.read() == read
        perms.write() == write
        perms.delete() == delete
        perms.create() == create
        perms.add() == add
        perms.list() == list

        where:
        permString || read  | write | delete | create | add   | list
        "r"        || true  | false | false  | false  | false | false
        "w"        || false | true  | false  | false  | false | false
        "d"        || false | false | true   | false  | false | false
        "c"        || false | false | false  | true   | false | false
        "a"        || false | false | false  | false  | true  | false
        "l"        || false | false | false  | false  | false | true
        "racwdl"   || true  | true  | true   | true   | true  | true
        "dcwrla"   || true  | true  | true   | true   | true  | true
    }

    def "ContainerSASPermissions parse IA"() {
        when:
        ContainerSASPermission.parse("rwaq")

        then:
        thrown(IllegalArgumentException)
    }

    @Unroll
    def "IPRange toString"() {
        setup:
        def ip = new IPRange()
            .ipMin(min)
            .ipMax(max)

        expect:
        ip.toString() == expectedString

        where:
        min  | max  || expectedString
        "a"  | "b"  || "a-b"
        "a"  | null || "a"
        null | "b"  || ""
    }

    @Unroll
    def "IPRange parse"() {
        when:
        IPRange ip = IPRange.parse(rangeStr)

        then:
        ip.ipMin() == min
        ip.ipMax() == max

        where:
        rangeStr || min | max
        "a-b"    || "a" | "b"
        "a"      || "a" | null
        ""       || ""  | null
    }

    @Unroll
    def "SASProtocol parse"() {
        expect:
        SASProtocol.parse(protocolStr) == protocol

        where:
        protocolStr  || protocol
        "https"      || SASProtocol.HTTPS_ONLY
        "https,http" || SASProtocol.HTTPS_HTTP
    }

    /*
     This test will ensure that each field gets placed into the proper location within the string to sign and that null
     values are handled correctly. We will validate the whole SAS with service calls as well as correct serialization of
     individual parts later.
     */

    @Unroll
    def "accountSasSignatures string to sign"() {
        when:
        AccountSASSignatureValues v = new AccountSASSignatureValues()
            .permissions(new AccountSASPermission().read(true).toString())
            .services("b")
            .resourceTypes("o")
            .startTime(startTime)
            .expiryTime(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC))
            .protocol(protocol)

        if (ipRange != null) {
            v.ipRange(new IPRange().ipMin("ip"))
        }

        def token = v.generateSASQueryParameters(primaryCreds)

        then:
        token.signature() == primaryCreds.computeHmac256(expectedStringToSign)

        where:
        startTime                                                 | ipRange       | protocol               || expectedStringToSign
        OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC) | null          | null                   || primaryCreds.accountName() + "\nr\nb\no\n" + Utility.ISO_8601_UTC_DATE_FORMATTER.format(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)) + "\n" + Utility.ISO_8601_UTC_DATE_FORMATTER.format(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)) + "\n\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\n"
        null                                                      | new IPRange() | null                   || primaryCreds.accountName() + "\nr\nb\no\n\n" + Utility.ISO_8601_UTC_DATE_FORMATTER.format(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)) + "\nip\n\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\n"
        null                                                      | null          | SASProtocol.HTTPS_ONLY || primaryCreds.accountName() + "\nr\nb\no\n\n" + Utility.ISO_8601_UTC_DATE_FORMATTER.format(OffsetDateTime.of(2017, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)) + "\n\n" + SASProtocol.HTTPS_ONLY + "\n" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "\n"
    }

    @Unroll
    def "accountSasSignatureValues IA"() {
        setup:
        AccountSASSignatureValues v = new AccountSASSignatureValues()
            .permissions(permissions)
            .services(service)
            .resourceTypes(resourceType)
            .expiryTime(expiryTime)
            .version(version)

        when:
        v.generateSASQueryParameters(creds)

        then:
        def e = thrown(IllegalArgumentException)
        e.getMessage().contains(parameter)

        where:
        permissions | service | resourceType | expiryTime           | version | creds        || parameter
        null        | "b"     | "c"          | OffsetDateTime.now() | "v"     | primaryCreds || "permissions"
        "c"         | null    | "c"          | OffsetDateTime.now() | "v"     | primaryCreds || "services"
        "c"         | "b"     | null         | OffsetDateTime.now() | "v"     | primaryCreds || "resourceTypes"
        "c"         | "b"     | "c"          | null                 | "v"     | primaryCreds || "expiryTime"
        "c"         | "b"     | "c"          | OffsetDateTime.now() | null    | primaryCreds || "version"
        "c"         | "b"     | "c"          | OffsetDateTime.now() | "v"     | null         || "SharedKeyCredential"
    }

    @Unroll
    def "AccountSASPermissions toString"() {
        setup:
        AccountSASPermission perms = new AccountSASPermission()
            .read(read)
            .write(write)
            .delete(delete)
            .list(list)
            .add(add)
            .create(create)
            .update(update)
            .processMessages(process)

        expect:
        perms.toString() == expectedString

        where:
        read  | write | delete | list  | add   | create | update | process || expectedString
        true  | false | false  | false | false | false  | false  | false   || "r"
        false | true  | false  | false | false | false  | false  | false   || "w"
        false | false | true   | false | false | false  | false  | false   || "d"
        false | false | false  | true  | false | false  | false  | false   || "l"
        false | false | false  | false | true  | false  | false  | false   || "a"
        false | false | false  | false | false | true   | false  | false   || "c"
        false | false | false  | false | false | false  | true   | false   || "u"
        false | false | false  | false | false | false  | false  | true    || "p"
        true  | true  | true   | true  | true  | true   | true   | true    || "rwdlacup"
    }

    @Unroll
    def "AccountSASPermissions parse"() {
        when:
        AccountSASPermission perms = AccountSASPermission.parse(permString)

        then:
        perms.read() == read
        perms.write() == write
        perms.delete() == delete
        perms.list() == list
        perms.add() == add
        perms.create() == create
        perms.update() == update
        perms.processMessages() == process

        where:
        permString || read  | write | delete | list  | add   | create | update | process
        "r"        || true  | false | false  | false | false | false  | false  | false
        "w"        || false | true  | false  | false | false | false  | false  | false
        "d"        || false | false | true   | false | false | false  | false  | false
        "l"        || false | false | false  | true  | false | false  | false  | false
        "a"        || false | false | false  | false | true  | false  | false  | false
        "c"        || false | false | false  | false | false | true   | false  | false
        "u"        || false | false | false  | false | false | false  | true   | false
        "p"        || false | false | false  | false | false | false  | false  | true
        "rwdlacup" || true  | true  | true   | true  | true  | true   | true   | true
        "lwrupcad" || true  | true  | true   | true  | true  | true   | true   | true
    }

    def "AccountSASPermissions parse IA"() {
        when:
        AccountSASPermission.parse("rwaq")

        then:
        thrown(IllegalArgumentException)
    }

    @Unroll
    def "AccountSASResourceType toString"() {
        setup:
        AccountSASResourceType resourceTypes = new AccountSASResourceType()
            .service(service)
            .container(container)
            .object(object)

        expect:
        resourceTypes.toString() == expectedString

        where:
        service | container | object || expectedString
        true    | false     | false  || "s"
        false   | true      | false  || "c"
        false   | false     | true   || "o"
        true    | true      | true   || "sco"
    }

    @Unroll
    def "AccountSASResourceType parse"() {
        when:
        AccountSASResourceType resourceTypes = AccountSASResourceType.parse(resourceTypeString)

        then:
        resourceTypes.service() == service
        resourceTypes.container() == container
        resourceTypes.object() == object

        where:
        resourceTypeString || service | container | object
        "s"                || true    | false     | false
        "c"                || false   | true      | false
        "o"                || false   | false     | true
        "sco"              || true    | true      | true
    }

    @Unroll
    def "AccountSASResourceType IA"() {
        when:
        AccountSASResourceType.parse("scq")

        then:
        thrown(IllegalArgumentException)
    }

    def "BlobURLParts"() {
        setup:
        BlobURLParts parts = new BlobURLParts()
            .scheme("http")
            .host("host")
            .containerName("container")
            .blobName("blob")
            .snapshot("snapshot")

        ServiceSASSignatureValues sasValues = new ServiceSASSignatureValues()
            .expiryTime(OffsetDateTime.now(ZoneOffset.UTC).plusDays(1))
            .permissions("r")
            .canonicalName(String.format("/blob/%s/container/blob", primaryCreds.accountName()))
            .resource(Constants.UrlConstants.SAS_BLOB_SNAPSHOT_CONSTANT)

        parts.sasQueryParameters(sasValues.generateSASQueryParameters(primaryCreds))

        when:
        String[] splitParts = parts.toURL().toString().split("\\?")

        then:
        splitParts.size() == 2 // Ensure that there is only one question mark even when sas and snapshot are present
        splitParts[0] == "http://host/container/blob"
        splitParts[1].contains("snapshot=snapshot")
        splitParts[1].contains("sp=r")
        splitParts[1].contains("sig=")
        splitParts[1].split("&").size() == 6 // snapshot & sv & sr & sp & sig & se
    }

    def "URLParser"() {
        when:
        BlobURLParts parts = URLParser.parse(new URL("http://host/container/blob?snapshot=snapshot&sv=" + Constants.HeaderConstants.TARGET_STORAGE_VERSION + "&sr=c&sp=r&sig=Ee%2BSodSXamKSzivSdRTqYGh7AeMVEk3wEoRZ1yzkpSc%3D"))

        then:
        parts.scheme() == "http"
        parts.host() == "host"
        parts.containerName() == "container"
        parts.blobName() == "blob"
        parts.snapshot() == "snapshot"
        parts.sasQueryParameters().permissions() == "r"
        parts.sasQueryParameters().version() == Constants.HeaderConstants.TARGET_STORAGE_VERSION
        parts.sasQueryParameters().resource() == "c"
        parts.sasQueryParameters().signature() == Utility.safeURLDecode("Ee%2BSodSXamKSzivSdRTqYGh7AeMVEk3wEoRZ1yzkpSc%3D")
    }
}
