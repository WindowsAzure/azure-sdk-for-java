// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file

import com.azure.storage.common.credentials.SharedKeyCredential
import com.azure.storage.file.models.FileHTTPHeaders
import com.azure.storage.file.models.StorageErrorCode
import com.azure.storage.file.models.StorageException
import spock.lang.Ignore
import spock.lang.Unroll

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

class DirectoryAPITests extends APISpec {
    DirectoryClient primaryDirectoryClient
    String directoryPath
    String shareName
    static def testMetadata = Collections.singletonMap("testmetadata", "value")

    def setup() {
        shareName = generateResourceName()
        directoryPath = generateResourceName()
        def shareClient = setupShareClientBuilder(shareName).buildClient()
        shareClient.create()
        primaryDirectoryClient = setupFileClientBuilder(shareName, directoryPath).buildDirectoryClient()
    }

    def "Get directory URL"() {
        given:
        def accountName = SharedKeyCredential.fromConnectionString(connectionString).accountName()
        def expectURL = String.format("https://%s.file.core.windows.net", accountName)

        when:
        def directoryURL = primaryDirectoryClient.getDirectoryUrl().toString()

        then:
        expectURL == directoryURL
    }

    def "Get sub directory client"() {
        given:
        def subDirectoryClient = primaryDirectoryClient.getSubDirectoryClient("testSubDirectory")

        expect:
        subDirectoryClient instanceof DirectoryClient
    }

    def "Get file client"() {
        given:
        def fileClient = primaryDirectoryClient.getFileClient("testFile")

        expect:
        fileClient instanceof FileClient
    }

    def "Create directory"() {
        expect:
        assertResponseStatusCode(primaryDirectoryClient.createWithResponse(null, null), 201)
    }

    def "Create directory error"() {
        given:
        def testShareName = generateResourceName()

        when:
        setupFileClientBuilder(testShareName, directoryPath).buildDirectoryClient().create()

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.SHARE_NOT_FOUND)
    }

    def "Create directory with metadata"() {
        expect:
        assertResponseStatusCode(primaryDirectoryClient.createWithResponse(testMetadata, null), 201)
    }

    def "Create directory error with metadata"() {
        given:
        def errorMetadata = Collections.singletonMap("testMeta", "value")

        when:
        primaryDirectoryClient.createWithResponse(errorMetadata, null)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 403, StorageErrorCode.AUTHENTICATION_FAILED)
    }

    def "Delete directory"() {
        given:
        primaryDirectoryClient.create()

        expect:
        assertResponseStatusCode(primaryDirectoryClient.deleteWithResponse(null), 202)
    }

    def "Delete directory error"() {
        when:
        primaryDirectoryClient.delete()

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Get properties"() {
        given:
        primaryDirectoryClient.create()
        def getPropertiesResponse = primaryDirectoryClient.getPropertiesWithResponse(null)

        expect:
        assertResponseStatusCode(getPropertiesResponse, 200)
        getPropertiesResponse.value().eTag()
    }

    def "Get properties error"() {
        when:
        primaryDirectoryClient.getPropertiesWithResponse(null)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Set metadata"() {
        given:
        primaryDirectoryClient.createWithResponse(testMetadata, null)
        def updatedMetadata = Collections.singletonMap("update", "value")

        when:
        def getPropertiesBefore = primaryDirectoryClient.getProperties()
        def setPropertiesResponse = primaryDirectoryClient.setMetadataWithResponse(updatedMetadata, null)
        def getPropertiesAfter = primaryDirectoryClient.getProperties()

        then:
        testMetadata == getPropertiesBefore.metadata()
        assertResponseStatusCode(setPropertiesResponse, 200)
        updatedMetadata == getPropertiesAfter.metadata()
    }

    def "Set metadata error"() {
        given:
        primaryDirectoryClient.create()
        def errorMetadata = Collections.singletonMap("", "value")

        when:
        primaryDirectoryClient.setMetadata(errorMetadata)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.EMPTY_METADATA_KEY)
    }

    @Unroll
    def "List files and directories"() {
        given:
        primaryDirectoryClient.create()

        for (def expectedFile : expectedFiles) {
            primaryDirectoryClient.createFile(expectedFile, 2)
        }

        for (def expectedDirectory : expectedDirectories) {
            primaryDirectoryClient.createSubDirectory(expectedDirectory)
        }

        when:
        def foundFiles = [] as Set
        def foundDirectories = [] as Set
        for (def fileRef : primaryDirectoryClient.listFilesAndDirectories()) {
            if (fileRef.isDirectory()) {
                foundDirectories << fileRef.name()
            } else {
                foundFiles << fileRef.name()
            }
        }

        then:
        expectedFiles == foundFiles
        expectedDirectories == foundDirectories

        where:
        expectedFiles          | expectedDirectories
        ["a", "b", "c"] as Set | ["d", "e"] as Set
        ["a", "c", "e"] as Set | ["b", "d"] as Set
    }

    /**
     * The listing hierarchy:
     * share -> dir -> listOp0 (dir) -> listOp3 (file)
     *                               -> listOp4 (file)
     *              -> listOp1 (dir) -> listOp5 (file)
     *                               -> listOp6 (file)
     *              -> listOp2 (file)
     */
    @Unroll
    def "List files and directories args"() {
        given:
        primaryDirectoryClient.create()
        def nameList = new LinkedList()
        def dirPrefix = generateResourceName()
        for (int i = 0; i < 2; i++) {
            def subDirClient = primaryDirectoryClient.getSubDirectoryClient(dirPrefix + i)
            subDirClient.create()
            for (int j = 0; j < 2; j++) {
                def num = i * 2 + j + 3
                subDirClient.createFile(dirPrefix + num, 1024)
            }
        }
        primaryDirectoryClient.createFile(dirPrefix + 2, 1024)
        for (int i = 0; i < 3; i++) {
            nameList.add(dirPrefix + i)
        }

        when:
        def fileRefIter = primaryDirectoryClient.listFilesAndDirectories(dirPrefix + prefixAddition, maxResults).iterator()

        then:
        for (int i = 0; i < numOfResults; i++) {
            Objects.equals(nameList.pop(), fileRefIter.next().name())
        }
        !fileRefIter.hasNext()

        where:
        prefixAddition | maxResults | numOfResults
        ""             | null       | 3
        ""             | 1          | 3
        "failure"      | 1          | 0
    }

    @Unroll
    def "List handles"() {
        given:
        primaryDirectoryClient.create()

        expect:
        primaryDirectoryClient.listHandles(maxResult, recursive).size() == 0

        where:
        maxResult | recursive
        2         | true
        null      | false
    }

    def "List handles error"() {
        when:
        primaryDirectoryClient.listHandles(null, true).iterator().hasNext()

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    @Ignore
    def "Force close handles"() {
        // TODO: Need to find a way of mocking handles.
    }

    def "Force close handles error"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.forceCloseHandles("handleId", true).iterator().hasNext()

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.INVALID_HEADER_VALUE)
    }

    def "Create sub directory"() {
        given:
        primaryDirectoryClient.create()

        expect:
        assertResponseStatusCode(
            primaryDirectoryClient.createSubDirectoryWithResponse("testCreateSubDirectory", null, null), 201)
    }

    def "Create sub directory invalid name"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.createSubDirectory("test/subdirectory")

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.PARENT_NOT_FOUND)
    }

    def "Create sub directory metadata"() {
        given:
        primaryDirectoryClient.create()

        expect:
        assertResponseStatusCode(
            primaryDirectoryClient.createSubDirectoryWithResponse("testCreateSubDirectory", testMetadata, null), 201)
    }

    def "Create sub directory metadata error"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.createSubDirectoryWithResponse("testsubdirectory", Collections.singletonMap("", "value"), null)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.EMPTY_METADATA_KEY)
    }

    def "Delete sub directory"() {
        given:
        def subDirectoryName = "testSubCreateDirectory"
        primaryDirectoryClient.create()
        primaryDirectoryClient.createSubDirectory(subDirectoryName)

        expect:
        assertResponseStatusCode(primaryDirectoryClient.deleteSubDirectoryWithResponse(subDirectoryName, null), 202)
    }

    def "Delete sub directory error"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.deleteSubDirectory("testsubdirectory")

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }


    def "Create file"() {
        given:
        primaryDirectoryClient.create()

        expect:
        assertResponseStatusCode(
            primaryDirectoryClient.createFileWithResponse("testCreateFile", 1024, null, null, null), 201)
    }

    @Unroll
    def "Create file invalid args"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.createFileWithResponse(fileName, maxSize, null, null, null)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, statusCode, errMsg)

        where:
        fileName    | maxSize | statusCode | errMsg
        "testfile:" | 1024    | 400        | StorageErrorCode.INVALID_RESOURCE_NAME
        "fileName"  | -1      | 400        | StorageErrorCode.OUT_OF_RANGE_INPUT

    }

    def "Create file maxOverload"() {
        given:
        primaryDirectoryClient.create()
        FileHTTPHeaders httpHeaders = new FileHTTPHeaders()
            .fileContentType("txt")

        expect:
        assertResponseStatusCode(
            primaryDirectoryClient.createFileWithResponse("testCreateFile", 1024, httpHeaders, testMetadata, null), 201)
    }

    @Unroll
    def "Create file maxOverload invalid args"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.createFileWithResponse(fileName, maxSize, httpHeaders, metadata, null)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, errMsg)

        where:
        fileName    | maxSize | httpHeaders                                       | metadata                              | errMsg
        "testfile:" | 1024    | new FileHTTPHeaders()                             | testMetadata                          | StorageErrorCode.INVALID_RESOURCE_NAME
        "fileName"  | -1      | new FileHTTPHeaders()                             | testMetadata                          | StorageErrorCode.OUT_OF_RANGE_INPUT
        "fileName"  | 1024    | new FileHTTPHeaders().fileContentMD5(new byte[0]) | testMetadata                          | StorageErrorCode.INVALID_HEADER_VALUE
        "fileName"  | 1024    | new FileHTTPHeaders()                             | Collections.singletonMap("", "value") | StorageErrorCode.EMPTY_METADATA_KEY

    }

    def "Delete file"() {
        given:
        def fileName = "testCreateFile"
        primaryDirectoryClient.create()
        primaryDirectoryClient.createFile(fileName, 1024)

        expect:
        assertResponseStatusCode(primaryDirectoryClient.deleteFileWithResponse(fileName, null), 202)
    }

    def "Delete file error"() {
        given:
        primaryDirectoryClient.create()

        when:
        primaryDirectoryClient.deleteFileWithResponse("testfile", null)

        then:
        def e = thrown(StorageException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Get snapshot id"() {
        given:
        def snapshot = OffsetDateTime.of(LocalDateTime.of(2000, 1, 1, 1, 1), ZoneOffset.UTC).toString()

        when:
        def shareSnapshotClient = setupFileClientBuilder(shareName, directoryPath)
            .snapshot(snapshot)
            .buildDirectoryClient()

        then:
        snapshot == shareSnapshotClient.getShareSnapshotId()
    }

}
