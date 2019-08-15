package com.azure.storage.file.spock

import com.azure.storage.common.credentials.SharedKeyCredential
import com.azure.storage.file.DirectoryClient
import com.azure.storage.file.FileClient
import com.azure.storage.file.models.FileHTTPHeaders
import com.azure.storage.file.models.StorageErrorCode
import com.azure.storage.file.models.StorageErrorException
import spock.lang.Unroll

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

class DirectoryAPITests extends APISpec {
    def shareClient
    def primaryDirectoryClient
    def directoryPath
    def shareName
    static def testMetadata

    def setup() {
        shareName = testResourceName.randomName(methodName, 60)
        directoryPath = testResourceName.randomName(methodName, 60)
        shareClient = shareBuilderHelper(interceptorManager, shareName).buildClient()
        shareClient.create()
        primaryDirectoryClient = directoryBuilderHelper(interceptorManager, shareName, directoryPath).buildClient()
        testMetadata = Collections.singletonMap("testmetadata", "value")
    }

    def "Get directory URL"() {
        given:
        def accoutName = SharedKeyCredential.fromConnectionString(connectionString).accountName()
        def expectURL = String.format("https://%s.file.core.windows.net", accoutName)
        when:
        def directoryURL = primaryDirectoryClient.getDirectoryUrl().toString()
        then:
        expectURL.equals(directoryURL)
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
        FileTestHelper.assertResponseStatusCode(primaryDirectoryClient.create(), 201)
    }

    def "Create directory error"() {
        given:
        def testShareName = testResourceName.randomName(methodName, 60)
        when:
        directoryBuilderHelper(interceptorManager, testShareName, directoryPath).buildClient().create()
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.SHARE_NOT_FOUND)
    }

    def "Create directory with metadata"() {
        expect:
        FileTestHelper.assertResponseStatusCode(primaryDirectoryClient.create(testMetadata), 201)
    }

    def "Create directory error with metadata"() {
        given:
        def errorMetadata = Collections.singletonMap("testMeta", "value")
        when:
        primaryDirectoryClient.create(errorMetadata)
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 403, StorageErrorCode.AUTHENTICATION_FAILED)
    }

    def "Delete directory"() {
        given:
        primaryDirectoryClient.create()
        expect:
        FileTestHelper.assertResponseStatusCode(primaryDirectoryClient.delete(), 202)
    }

    def "Delete directory error"() {
        when:
        primaryDirectoryClient.delete()
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Get properties"() {
        given:
        primaryDirectoryClient.create()
        def getPropertiesResponse = primaryDirectoryClient.getProperties()
        expect:
        FileTestHelper.assertResponseStatusCode(getPropertiesResponse, 200)
        getPropertiesResponse.value().eTag()
    }

    def "Get properties error"() {
        when:
        primaryDirectoryClient.getProperties()
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Set metadata"() {
        given:
        primaryDirectoryClient.create(testMetadata)
        def updatedMetadata = Collections.singletonMap("update", "value")
        when:
        def getPropertiesBefore = primaryDirectoryClient.getProperties().value()
        def setPropertiesResponse = primaryDirectoryClient.setMetadata(updatedMetadata)
        def getPropertiesAfter = primaryDirectoryClient.getProperties().value()
        then:
        testMetadata.equals(getPropertiesBefore.metadata())
        FileTestHelper.assertResponseStatusCode(setPropertiesResponse, 200)
        updatedMetadata.equals(getPropertiesAfter.metadata())
    }

    def "Set metadata error"() {
        given:
        primaryDirectoryClient.create()
        def errorMetadata = Collections.singletonMap("", "value")
        when:
        primaryDirectoryClient.setMetadata(errorMetadata)
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.EMPTY_METADATA_KEY)
    }

    /**
     * The listing hierarchy:
     * share -> dir -> listOp0 (dir) -> listOp3 (file)
     *                               -> listOp4 (file)
     *              -> listOp1 (dir) -> listOp5 (file)
     *                               -> listOp6 (file)
     *              -> listOp2 (file)
     */
    def "List files and directories"() {
        given:
        primaryDirectoryClient.create()
        def nameList = new LinkedList()
        def dirPrefix = testResourceName.randomName(methodName, 60)
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
        def fileRefIter = primaryDirectoryClient.listFilesAndDirectories().iterator()
        then:
        while (fileRefIter.hasNext()) {
            Objects.equals(nameList.pop(), fileRefIter.next().name())
        }
        nameList.isEmpty()
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
        def dirPrefix = testResourceName.randomName(methodName, 60)
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
        def fileRefIter = primaryDirectoryClient.listFilesAndDirectories(prefix, maxResults).iterator()

        then:
        for (int i = 0; i < numOfResults; i++) {
            Objects.equals(nameList.pop(), fileRefIter.next().name())
        }
        !fileRefIter.hasNext()

        where:
        prefix                                         | maxResults | numOfResults
        null                                           | null       | 3
        "directoryapitestslistfilesanddirectoriesargs" | 1          | 3
        "noOp"                                         | 3          | 0
    }

    @Unroll
    def "List handles"() {
        given:
        primaryDirectoryClient.create()
        expect:
        primaryDirectoryClient.getHandles(maxResult, recursive).size() == 0
        where:
        maxResult | recursive
        2         | true
        null      | false
    }

    def "List handles error"() {
        when:
        primaryDirectoryClient.getHandles(null, true)
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Force close handles"() {
        // TODO: Need to find a way of mocking handles.
    }

    def "Force close handles error"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.forceCloseHandles("handleId", true)
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.INVALID_HEADER_VALUE)
    }

    def "Create sub directory"() {
        given:
        primaryDirectoryClient.create()
        expect:
        FileTestHelper.assertResponseStatusCode(
            primaryDirectoryClient.createSubDirectory("testCreateSubDirectory"), 201)
    }

    def "Create sub directory invalid name"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.createSubDirectory("test/subdirectory")
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.PARENT_NOT_FOUND)
    }

    def "Create sub directory metadata"() {
        given:
        primaryDirectoryClient.create()
        expect:
        FileTestHelper.assertResponseStatusCode(
            primaryDirectoryClient.createSubDirectory("testCreateSubDirectory", testMetadata), 201)
    }

    def "Create sub directory metadata error"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.createSubDirectory("testsubdirectory", Collections.singletonMap("", "value"))
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.EMPTY_METADATA_KEY)
    }

    def "Delete sub directory"() {
        given:
        def subDirectoryName = "testSubCreateDirectory"
        primaryDirectoryClient.create()
        primaryDirectoryClient.createSubDirectory(subDirectoryName)
        expect:
        FileTestHelper.assertResponseStatusCode(primaryDirectoryClient.deleteSubDirectory(subDirectoryName), 202)
    }

    def "Delete sub directory error"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.deleteSubDirectory("testsubdirectory")
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }


    def "Create file"() {
        given:
        primaryDirectoryClient.create()
        expect:
        FileTestHelper.assertResponseStatusCode(
            primaryDirectoryClient.createFile("testCreateFile", 1024), 201)
    }

    @Unroll
    def "Create file invalid args"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.createFile(fileName, maxSize)
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, statusCode, errMsg)
        where:
        fileName    | maxSize | statusCode | errMsg
        "test\file" | 1024    | 400        | "Bad Request"
        "fileName"  | -1      | 400        | StorageErrorCode.OUT_OF_RANGE_INPUT

    }

    def "Create file maxOverload"() {
        given:
        primaryDirectoryClient.create()
        FileHTTPHeaders httpHeaders = new FileHTTPHeaders()
            .fileContentType("txt")
        expect:
        FileTestHelper.assertResponseStatusCode(
            primaryDirectoryClient.createFile("testCreateFile", 1024, httpHeaders, testMetadata), 201)
    }

    @Unroll
    def "Create file maxOverload invalid args"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.createFile("test\file", maxSize)
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 400, "Bad Request")
        where:
        fileName    | maxSize | httpHeaders                                       | metadata
        "test\file" | 1024    | new FileHTTPHeaders()                             | testMetadata
        "fileName"  | -1      | new FileHTTPHeaders()                             | testMetadata
        "fileName"  | 1024    | new FileHTTPHeaders().fileContentMD5(new byte[0]) | testMetadata
        "fileName"  | 1024    | new FileHTTPHeaders()                             | Collections.singletonMap("", "value")

    }

    def "Delete file"() {
        given:
        def fileName = "testCreateFile"
        primaryDirectoryClient.create()
        primaryDirectoryClient.createFile(fileName, 1024)
        expect:
        FileTestHelper.assertResponseStatusCode(
            primaryDirectoryClient.deleteFile(fileName), 202)
    }

    def "Delete file error"() {
        given:
        primaryDirectoryClient.create()
        when:
        primaryDirectoryClient.deleteFile("testfile")
        then:
        def e = thrown(StorageErrorException)
        FileTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.RESOURCE_NOT_FOUND)
    }

    def "Get snapshot id"() {
        given:
        def snapshot = OffsetDateTime.of(LocalDateTime.of(2000, 1, 1,
            1, 1), ZoneOffset.UTC).toString()
        when:
        def shareSnapshotClient = directoryBuilderHelper(interceptorManager, shareName, directoryPath).snapshot(snapshot).buildClient()
        then:
        snapshot.equals(shareSnapshotClient.getShareSnapshotId())
    }

}
