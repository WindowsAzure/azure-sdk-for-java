// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.nio

import com.azure.storage.common.sas.AccountSasPermission
import com.azure.storage.common.sas.AccountSasResourceType
import com.azure.storage.common.sas.AccountSasService
import com.azure.storage.common.sas.AccountSasSignatureValues
import reactor.core.publisher.Flux
import spock.lang.Unroll

import java.nio.file.FileStore
import java.nio.file.FileSystemAlreadyExistsException
import java.nio.file.FileSystemNotFoundException
import java.nio.file.InvalidPathException
import java.time.OffsetDateTime

class AzureFileSystemSpec extends APISpec {
    def config = new HashMap<String, String>()

    def setup() {
        config = initializeConfigMap()
    }

    // We do not have a meaningful way of testing the configurations for the ServiceClient.
    @Unroll
    def "FileSystem create"() {
        setup:
        def containerNames = Flux.range(0, numContainers).map { i -> generateContainerName() }.cache()
            .toIterable()
        config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = String.join(",", containerNames)
        if (!sasToken) {
            config[AzureFileSystem.AZURE_STORAGE_ACCOUNT_KEY] = getAccountKey(PRIMARY_STORAGE)
        } else {
            config[AzureFileSystem.AZURE_STORAGE_SAS_TOKEN] = primaryBlobServiceClient.generateAccountSas(
                new AccountSasSignatureValues(OffsetDateTime.now().plusDays(2),
                    AccountSasPermission.parse("rwcdl"), new AccountSasService().setBlobAccess(true),
                    new AccountSasResourceType().setContainer(true)))
        }

        when:
        def fileSystem = new AzureFileSystem(new AzureFileSystemProvider(), primaryCredential.getAccountName(),
            config)

        then:
        Flux.fromIterable(fileSystem.getFileStores()).count().block().intValue() == containerNames.size()
        for (def containerName : containerNames) {
            assert Flux.fromIterable(fileSystem.getFileStores()).map { store -> store.name() }
                .hasElement(containerName)
            assert primaryBlobServiceClient.getBlobContainerClient(containerName).exists()
        }
        fileSystem.getFileSystemName() == primaryCredential.getAccountName()

        where:
        numContainers | createContainers | sasToken
        1             | false            | false
        3             | false            | true
        3             | true             | false
        3             | true             | true
    }

    @Unroll
    def "FileSystem create fail IA"() {
        setup:
        if (containers) {
            config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = generateContainerName()
        }
        if (credential) {
            config[AzureFileSystem.AZURE_STORAGE_ACCOUNT_KEY] = getAccountKey(PRIMARY_STORAGE)
        }

        when:
        new AzureFileSystem(new AzureFileSystemProvider(), getAccountName(PRIMARY_STORAGE), config)

        then:
        thrown(IllegalArgumentException)

        where:
        credential | containers
        true       | false
        false      | true
    }

    def "FileSystem create fail container check"() {
        setup:
        config[AzureFileSystem.AZURE_STORAGE_SAS_TOKEN] = primaryBlobServiceClient.generateAccountSas(
            new AccountSasSignatureValues(OffsetDateTime.now().plusDays(2),
                AccountSasPermission.parse("d"), new AccountSasService().setBlobAccess(true),
                new AccountSasResourceType().setContainer(true)))
        config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = generateContainerName()

        when:
        new AzureFileSystem(new AzureFileSystemProvider(), getAccountName(PRIMARY_STORAGE), config)

        then:
        thrown(IOException)
    }

    def "FileSystem close"() {
        setup:
        def provider = new AzureFileSystemProvider()
        def uri = getAccountUri()
        config[AzureFileSystem.AZURE_STORAGE_FILE_STORES] = generateContainerName()
        config[AzureFileSystem.AZURE_STORAGE_ACCOUNT_KEY] = getAccountKey(PRIMARY_STORAGE)
        def fileSystem = provider.newFileSystem(uri, config)

        when:
        fileSystem.close()

        then:
        !fileSystem.isOpen()

        when:
        provider.getFileSystem(uri)

        then:
        thrown(FileSystemNotFoundException)

        when:
        fileSystem.close() // Closing twice should have no effect

        then:
        notThrown(Exception)

        // Creating a file system with the same ID after the old one is closed should work.
        when:
        provider.newFileSystem(uri, config)

        then:
        notThrown(FileSystemAlreadyExistsException)
        provider.getFileSystem(uri) != null
    }

    @Unroll
    def "FileSystem getPath"() {
        setup:
        def fs = createFS(config)
        def arr = pathArr == null ? null : Arrays.copyOf(pathArr.toArray(), pathArr.size(), String[].class)

        expect:
        fs.getPath(path0, arr).toString() == resultStr

        where:
        path0               | pathArr                    || resultStr
        "foo"               | null                       || "foo"
        "foo/bar"           | null                       || "foo/bar"
        "/foo/"             | null                       || "foo"
        "/foo/bar/"         | null                       || "foo/bar"
        "foo"               | ["bar"]                    || "foo/bar"
        "foo/bar/fizz/buzz" | null                       || "foo/bar/fizz/buzz"
        "foo"               | ["bar", "fizz", "buzz"]    || "foo/bar/fizz/buzz"
        "foo"               | ["bar/fizz", "buzz"]       || "foo/bar/fizz/buzz"
        "foo"               | ["bar", "fizz/buzz"]       || "foo/bar/fizz/buzz"
        "root:/foo"         | null                       || "root:/foo"
        "root:/foo"         | ["bar"]                    || "root:/foo/bar"
        "///root:////foo"   | ["//bar///fizz//", "buzz"] || "root:/foo/bar/fizz/buzz"
        "root:/"            | null                       || "root:"
        ""                  | null                       || ""
    }

    @Unroll
    def "FileSystem getPath fail"() {
        when:
        createFS(config).getPath(path)

        then:
        thrown(InvalidPathException)

        where:
        path                  | _
        "root1:/dir1:"        | _
        "root1:/d:ir"         | _
        ":root1:/dir"         | _
        "root1::/dir"         | _
        "root:1/dir"          | _
        "root1/dir:"          | _
        "root1:/foo/bar/dir:" | _
    }

    def "FileSystem isReadOnly getSeparator"() {
        setup:
        def fs = createFS(config)

        expect:
        !fs.isReadOnly()
        fs.getSeparator() == "/"
    }

    def "FileSystem getRootDirs getFileStores"() {
        setup:
        def fs = createFS(config)
        def containers = ((String) config[AzureFileSystem.AZURE_STORAGE_FILE_STORES]).split(",")
        def fileStoreNames = []
        for (FileStore store : fs.getFileStores()) {
            fileStoreNames.add(store.name())
        }

        expect:
        fs.getRootDirectories().size() == containers.size()
        fs.getFileStores().size() == containers.size()
        for (String container : containers) {
            assert fs.getRootDirectories().contains(fs.getPath(container + ":"))
            assert fileStoreNames.contains(container)
        }
    }

    @Unroll
    def "FileSystem supportsFileAttributeView"() {
        setup:
        def fs = createFS(config)

        expect:
        fs.supportedFileAttributeViews().contains(view) == supports

        where:
        view           | supports
        "basic"        | true
        "user"         | true
        "azureStorage" | true
        "posix"        | false
    }

    def "FileSystem getDefaultDirectory"() {
        setup:
        def fs = createFS(config)

        expect:
        fs.getDefaultDirectory().toString() ==
            config[AzureFileSystem.AZURE_STORAGE_FILE_STORES].split(",")[0] + AzurePath.ROOT_DIR_SUFFIX
    }
}
