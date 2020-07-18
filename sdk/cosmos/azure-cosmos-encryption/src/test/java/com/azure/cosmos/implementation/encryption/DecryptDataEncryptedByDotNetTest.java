// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.encryption;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosBridgeInternal;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.implementation.DatabaseForTest;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.encryption.api.CosmosEncryptionAlgorithm;
import com.azure.cosmos.implementation.encryption.api.DataEncryptionKey;
import com.azure.cosmos.implementation.guava25.collect.Streams;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.ThroughputProperties;
import com.azure.cosmos.rx.TestSuiteBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class DecryptDataEncryptedByDotNetTest extends TestSuiteBase {

    private final static EncryptionKeyWrapMetadata METADATA_1 = new EncryptionKeyWrapMetadata("metadata1");
    private final static EncryptionKeyWrapMetadata METADATA_2 = new EncryptionKeyWrapMetadata("metadata2");
    private final static String METADATA_UPDATE_SUFFIX = "updated";
    private final static Duration CACHE_TTL = Duration.ofDays(1);

    private final String databaseForTestId = DatabaseForTest.generateId();
    private final String itemContainerId = UUID.randomUUID().toString();
    private final String keyContainerId = UUID.randomUUID().toString();
    private CosmosAsyncClient client;
    private CosmosAsyncDatabase databaseCore;
    private CosmosAsyncContainer itemContainer;
    private CosmosAsyncContainer keyContainer;
    private CosmosDataEncryptionKeyProvider dekProvider;
    private TestKeyWrapProvider keyWrapProvider;

    @Factory(dataProvider = "clientBuilders")
    public DecryptDataEncryptedByDotNetTest(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @BeforeClass(groups = "encryption")
    public void beforeClass() {
        TestUtils.initialized();
    }

    @AfterClass(groups = "encryption")
    public void afterClass() {
        safeDeleteDatabase(databaseCore);
    }

    @AfterMethod(groups = "encryption")
    public void afterMethod() {
        safeClose(client);
    }

    @BeforeMethod(groups = "encryption")
    public void beforeMethod() {
        keyWrapProvider = new TestKeyWrapProvider();
        dekProvider = new CosmosDataEncryptionKeyProvider(keyWrapProvider);
        client = CosmosBridgeInternal.setDateKeyProvider(getClientBuilder(), dekProvider).buildAsyncClient();
        client.createDatabaseIfNotExists(databaseForTestId).block();
        databaseCore = client.getDatabase(databaseForTestId);
        databaseCore.createContainerIfNotExists(keyContainerId, "/id", ThroughputProperties.createManualThroughput(400)).block();
        keyContainer = databaseCore.getContainer(keyContainerId);
        databaseCore.createContainerIfNotExists(itemContainerId, "/PK", ThroughputProperties.createManualThroughput(400)).block();
        itemContainer = databaseCore.getContainer(itemContainerId);

        truncateCollection(itemContainer);
        truncateCollection(keyContainer);

        dekProvider.initialize(databaseCore, keyContainer.getId());
    }

    @Test(groups = "encryption")
    public void canReadKeyEncryptionKeyGeneratedByDotNet() throws Exception {
        // add key generated by dotnet
        ObjectNode dataEncryptionKeyProperties = TestUtils.loadPojo("./encryption/dotnet/DataEncryptionKeyProperties.json", ObjectNode.class);
        keyContainer.createItem(dataEncryptionKeyProperties).block();

        DataEncryptionKey loadedKey = dekProvider.getDataEncryptionKey(dataEncryptionKeyProperties.get("id").asText(), CosmosEncryptionAlgorithm.AEAes256CbcHmacSha256Randomized);

        assertThat(loadedKey.getEncryptionAlgorithm()).isEqualTo(CosmosEncryptionAlgorithm.AEAes256CbcHmacSha256Randomized);
        assertThat(loadedKey.getEncryptionAlgorithm()).isEqualTo(CosmosEncryptionAlgorithm.AEAes256CbcHmacSha256Randomized);

        EncryptionKeyWrapMetadata keyWrapMetadata = Utils.getSimpleObjectMapper().convertValue(dataEncryptionKeyProperties.get("keyWrapMetadata"), EncryptionKeyWrapMetadata.class);
        byte[] expectedWrappedKey = dataEncryptionKeyProperties.get("wrappedDataEncryptionKey").binaryValue();
        EncryptionKeyUnwrapResult expectedUnWrappedKey = keyWrapProvider.unwrapKey(expectedWrappedKey, keyWrapMetadata);

        assertThat(loadedKey.getRawKey()).isEqualTo(expectedUnWrappedKey.getDataEncryptionKey());
    }

    @Test(groups = "encryption")
    public void canDecryptDataEncryptedByDotNet() throws Exception {
        // add key generated by dotnet
        DataEncryptionKeyProperties dataEncryptionKeyProperties = TestUtils.loadPojo("./encryption/dotnet/DataEncryptionKeyProperties.json", DataEncryptionKeyProperties.class);
        keyContainer.createItem(dataEncryptionKeyProperties).block();

        // add data encrypted by dotnet
        ObjectNode objectNode = TestUtils.loadPojo("./encryption/dotnet/EncryptedPOCO.json", ObjectNode.class);
        Streams.stream(objectNode.fieldNames()).filter(fieldName -> fieldName.startsWith("_") && !fieldName.equals("_ei")).collect(Collectors.toList()).forEach(filedName -> objectNode.remove(filedName));
        itemContainer.createItem(objectNode).block();
        TestDoc expectedTestDoc = TestUtils.loadPojo("./encryption/dotnet/POCO.json", TestDoc.class);
        assertThat(expectedTestDoc.sensitive).isNotNull();

        TestDoc testDoc = itemContainer.readItem(objectNode.get("id").asText(), new PartitionKey(objectNode.get("PK").asText()), TestDoc.class).block().getItem();
        assertThat(testDoc.sensitive).isNotNull();
        assertThat(testDoc).isEqualTo(expectedTestDoc);
    }

    static public class TestDoc {
        @JsonProperty("id")
        public String id;
        @JsonProperty("PK")
        public String pk;
        @JsonProperty("NonSensitive")
        public String nonSensitive;
        @JsonProperty("Sensitive")
        public String sensitive;

        public TestDoc() {
        }

        public TestDoc(TestDoc other) {
            this.id = other.id;
            this.pk = other.pk;
            this.nonSensitive = other.nonSensitive;
            this.sensitive = other.sensitive;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestDoc testDoc = (TestDoc) o;
            return Objects.equals(id, testDoc.id) &&
                Objects.equals(pk, testDoc.pk) &&
                Objects.equals(nonSensitive, testDoc.nonSensitive) &&
                Objects.equals(sensitive, testDoc.sensitive);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, pk, nonSensitive, sensitive);
        }
    }

    private class TestKeyWrapProvider implements EncryptionKeyWrapProvider {
        public EncryptionKeyUnwrapResult unwrapKey(byte[] wrappedKey, EncryptionKeyWrapMetadata metadata) {
            int moveBy = StringUtils.equals(metadata.value, DecryptDataEncryptedByDotNetTest.METADATA_1.value + DecryptDataEncryptedByDotNetTest.METADATA_UPDATE_SUFFIX) ? 1 : 2;

            for (int i = 0; i < wrappedKey.length; i++) {
                wrappedKey[i] = (byte) (wrappedKey[i] - moveBy);
            }

            return new EncryptionKeyUnwrapResult(wrappedKey, CACHE_TTL);
        }

        public EncryptionKeyWrapResult wrapKey(byte[] key, EncryptionKeyWrapMetadata metadata) {
            EncryptionKeyWrapMetadata responseMetadata = new EncryptionKeyWrapMetadata(metadata.value + DecryptDataEncryptedByDotNetTest.METADATA_UPDATE_SUFFIX);
            int moveBy = StringUtils.equals(metadata.value, DecryptDataEncryptedByDotNetTest.METADATA_1.value) ? 1 : 2;

            for (int i = 0; i < key.length; i++) {
                key[i] = (byte) (key[i] + moveBy);
            }

            return new EncryptionKeyWrapResult(key, responseMetadata);
        }
    }
}
