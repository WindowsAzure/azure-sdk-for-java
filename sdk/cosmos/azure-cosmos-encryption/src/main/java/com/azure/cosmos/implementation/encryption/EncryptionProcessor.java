// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.encryption;

import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.encryption.CosmosEncryptionType;
import com.azure.cosmos.encryption.EncryptionBridgeInternal;
import com.azure.cosmos.encryption.EncryptionCosmosAsyncClient;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.apachecommons.lang.tuple.Pair;
import com.azure.cosmos.models.ClientEncryptionIncludedPath;
import com.azure.cosmos.models.ClientEncryptionPolicy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.microsoft.data.encryption.cryptography.EncryptionKeyStoreProvider;
import com.microsoft.data.encryption.cryptography.EncryptionType;
import com.microsoft.data.encryption.cryptography.MicrosoftDataEncryptionException;
import com.microsoft.data.encryption.cryptography.ProtectedDataEncryptionKey;
import com.microsoft.data.encryption.cryptography.SqlSerializerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.retry.Retry;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class EncryptionProcessor {
    private final static Logger LOGGER = LoggerFactory.getLogger(EncryptionProcessor.class);
    private EncryptionCosmosAsyncClient encryptionCosmosClient;
    private CosmosAsyncContainer cosmosAsyncContainer;
    private EncryptionKeyStoreProvider encryptionKeyStoreProvider;
    private EncryptionSettings encryptionSettings;
    private boolean isEncryptionSettingsInitDone;
    private ClientEncryptionPolicy clientEncryptionPolicy;
    private final static int STRING_SIZE_ENCRYPTION_LIMIT = 1024;

    public EncryptionProcessor(CosmosAsyncContainer cosmosAsyncContainer,
                               EncryptionCosmosAsyncClient encryptionCosmosClient) {
        if (cosmosAsyncContainer == null) {
            throw new IllegalStateException("encryptionCosmosContainer is null");
        }

        if (encryptionCosmosClient == null) {
            throw new IllegalStateException("encryptionCosmosClient is null");
        }
        this.cosmosAsyncContainer = cosmosAsyncContainer;
        this.encryptionCosmosClient = encryptionCosmosClient;
        this.isEncryptionSettingsInitDone = false;
        this.encryptionSettings = new EncryptionSettings();
        this.encryptionKeyStoreProvider = this.encryptionCosmosClient.getEncryptionKeyStoreProvider();
    }

    /**
     * Builds up and caches the Encryption Setting by getting the cached entries of Client Encryption Policy and the
     * corresponding keys.
     * Sets up the MDE Algorithm for encryption and decryption by initializing the KeyEncryptionKey and
     * ProtectedDataEncryptionKey.
     *
     * @return Mono
     */
    public Mono<Void> initializeEncryptionSettingsAsync() {
        // update the property level setting.
        if (this.isEncryptionSettingsInitDone) {
            throw new IllegalStateException("The Encrypton Processor has already been initialized. ");
        }
        Map<String, EncryptionSettings> settingsByDekId = new HashMap<>();
        return EncryptionBridgeInternal.getClientEncryptionPolicyAsync(this.encryptionCosmosClient,
            this.cosmosAsyncContainer, false).flatMap(clientEncryptionPolicy ->
        {
            if (clientEncryptionPolicy == null) {
                this.isEncryptionSettingsInitDone = true;
                return Mono.empty();
            }
            this.clientEncryptionPolicy = clientEncryptionPolicy;
            AtomicReference<Mono<List<Object>>> sequentialList = new AtomicReference<>();
            List<Mono<Object>> monoList = new ArrayList<>();
            this.clientEncryptionPolicy.getIncludedPaths().stream().map(clientEncryptionIncludedPath -> clientEncryptionIncludedPath.clientEncryptionKeyId).distinct().forEach(clientEncryptionKeyId -> {
                AtomicBoolean forceRefreshClientEncryptionKey = new AtomicBoolean(false);
                Mono<Object> clientEncryptionPropertiesMono =
                    EncryptionBridgeInternal.getClientEncryptionPropertiesAsync(this.encryptionCosmosClient,
                        clientEncryptionKeyId, this.cosmosAsyncContainer, forceRefreshClientEncryptionKey.get())
                        .publishOn(Schedulers.elastic())
                        .flatMap(keyProperties -> {
                            ProtectedDataEncryptionKey protectedDataEncryptionKey;
                            try {
                                // we pull out the Encrypted Client Encryption Key and Build the Protected Data
                                // Encryption key
                                // Here a request is sent out to unwrap using the Master Key configured via the Key
                                // Encryption Key.
                                protectedDataEncryptionKey =
                                    this.encryptionSettings.buildProtectedDataEncryptionKey(keyProperties,
                                        this.encryptionKeyStoreProvider,
                                        clientEncryptionKeyId);
                            } catch (Exception ex) {
                                return Mono.error(ex);
                            }
                            EncryptionSettings encryptionSettings = new EncryptionSettings();
                            encryptionSettings.setEncryptionSettingTimeToLive(Instant.now().plus(Duration.ofMinutes(Constants.CACHED_ENCRYPTION_SETTING_DEFAULT_DEFAULT_TTL_IN_MINUTES)));
                            encryptionSettings.setClientEncryptionKeyId(clientEncryptionKeyId);
                            encryptionSettings.setDataEncryptionKey(protectedDataEncryptionKey);
                            settingsByDekId.put(clientEncryptionKeyId, encryptionSettings);
                            return Mono.empty();
                        }).retryWhen(Retry.withThrowable((throwableFlux -> throwableFlux.flatMap(throwable -> {
                        //TODO DO we need to check for MicrosoftDataEncryptionException too ?
                        // ProtectedDataEncryptionKey.getOrCreate throws Exception object and not specific
                        // exceptions

                        // The access to master key was revoked. Try to fetch the latest ClientEncryptionKeyProperties
                        // from the backend.
                        // This will succeed provided the user has rewraped the Client Encryption Key with right set of
                        // meta data.
                        // This is based on the AKV provider implementaion so we expect a RequestFailedException in case
                        // other providers are used in unwrap implementation.
                        InvalidKeyException invalidKeyException = Utils.as(throwable, InvalidKeyException.class);
                        if (invalidKeyException != null) {
                            forceRefreshClientEncryptionKey.set(true);
                            return Mono.empty();
                        }
                        return Flux.error(throwable);
                    }))));
                monoList.add(clientEncryptionPropertiesMono);
                sequentialList.set(Flux.mergeSequential(monoList).collectList());
            });
            return sequentialList.get().map(objects -> {
                return Mono.empty();
            });
        }).flatMap(ignoreVoid -> {
            for (ClientEncryptionIncludedPath propertyToEncrypt : clientEncryptionPolicy.getIncludedPaths()) {
                EncryptionType encryptionType = EncryptionType.Plaintext;
                switch (propertyToEncrypt.encryptionType) {
                    case CosmosEncryptionType.DETERMINISTIC:
                        encryptionType = EncryptionType.Deterministic;
                        break;
                    case CosmosEncryptionType.RANDOMIZED:
                        encryptionType = EncryptionType.Randomized;
                        break;
                    default:
                        LOGGER.debug("Invalid encryption type {}", propertyToEncrypt.encryptionType);
                        break;
                }
                String propertyName = propertyToEncrypt.path.substring(1);
                try {
                    this.encryptionSettings.setEncryptionSettingForProperty(propertyName,
                        EncryptionSettings.create(settingsByDekId.get(propertyToEncrypt.clientEncryptionKeyId),
                            encryptionType),
                        settingsByDekId.get(propertyToEncrypt.clientEncryptionKeyId).getEncryptionSettingTimeToLive());
                } catch (MicrosoftDataEncryptionException ex) {
                    return Mono.error(ex);
                }
            }
            this.isEncryptionSettingsInitDone = true;
            return Mono.empty();
        });
    }

    public Mono<Void> initEncryptionSettingsIfNotInitializedAsync() {
        if (!this.isEncryptionSettingsInitDone) {
            return initializeEncryptionSettingsAsync().then(Mono.empty());
        }
        return Mono.empty();
    }

    ClientEncryptionPolicy getClientEncryptionPolicy() {
        return clientEncryptionPolicy;
    }

    private void setClientEncryptionPolicy(ClientEncryptionPolicy clientEncryptionPolicy) {
        this.clientEncryptionPolicy = clientEncryptionPolicy;
    }

    /**
     * Gets the container that has items which are to be encrypted.
     *
     * @return the CosmosContainer
     */
    public CosmosAsyncContainer getCosmosAsyncContainer() {
        return this.cosmosAsyncContainer;
    }

    /**
     * Gets the encrypted cosmos client.
     *
     * @return encryptionCosmosClient
     */
    public EncryptionCosmosAsyncClient getEncryptionCosmosClient() {
        return encryptionCosmosClient;
    }

    /**
     * Gets the provider that allows interaction with the master keys.
     *
     * @return encryptionKeyStoreProvider
     */
    public EncryptionKeyStoreProvider getEncryptionKeyStoreProvider() {
        return encryptionKeyStoreProvider;
    }

    public EncryptionSettings getEncryptionSettings() {
        return encryptionSettings;
    }

    public Mono<byte[]> encrypt(byte[] payload) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Encrypting byte[] of size [{}] on thread [{}]",
                payload == null ? null : payload.length,
                Thread.currentThread().getName());
        }
        ObjectNode itemJObj = Utils.parse(payload, ObjectNode.class);

        assert (itemJObj != null);
        return initEncryptionSettingsIfNotInitializedAsync().then(Mono.defer(() -> {
            for (ClientEncryptionIncludedPath includedPath : this.clientEncryptionPolicy.getIncludedPaths()) {
                if (StringUtils.isEmpty(includedPath.path) || includedPath.path.charAt(0) != '/' || includedPath.path.lastIndexOf('/') != 0) {
                    return Mono.error(new IllegalArgumentException("Invalid encryption path: " + includedPath.path));
                }
            }
            List<Mono<Void>> encryptionMonoList = new ArrayList<>();
            for (ClientEncryptionIncludedPath includedPath : this.clientEncryptionPolicy.getIncludedPaths()) {
                String propertyName = includedPath.path.substring(1);
                JsonNode propertyValueHolder = itemJObj.get(propertyName);

                // Even null in the JSON is a JToken with Type Null, this null check is just a sanity check
                if (propertyValueHolder != null && !propertyValueHolder.isNull()) {
                    Mono<Void> voidMono = this.encryptionSettings.getEncryptionSettingForPropertyAsync(propertyName,
                        this).flatMap(settings -> {
                        try {
                            encryptAndSerializeProperty(settings, itemJObj, propertyValueHolder, propertyName);
                        } catch (MicrosoftDataEncryptionException ex) {
                            return Mono.error(ex);
                        }
                        return Mono.empty();
                    });
                    encryptionMonoList.add(voidMono);
                }
            }
            Mono<List<Void>> listMono = Flux.mergeSequential(encryptionMonoList).collectList();
            return listMono.flatMap(ignoreVoid -> Mono.just(EncryptionUtils.serializeJsonToByteArray(Utils.getSimpleObjectMapper(), itemJObj)));
        }));
    }

    public void encryptAndSerializeProperty(EncryptionSettings encryptionSettings, ObjectNode objectNode,
                                            JsonNode propertyValueHolder, String propertyName) throws MicrosoftDataEncryptionException {

        if (propertyValueHolder.isObject()) {
            for (Iterator<Map.Entry<String, JsonNode>> it = propertyValueHolder.fields(); it.hasNext(); ) {
                Map.Entry<String, JsonNode> child = it.next();
                if (child.getValue().isObject() || child.getValue().isArray()) {
                    encryptAndSerializeProperty(encryptionSettings, (ObjectNode) propertyValueHolder,
                        child.getValue(), propertyName);
                } else if (!child.getValue().isNull()) {
                    encryptAndSerializeValue(encryptionSettings, (ObjectNode) propertyValueHolder, child.getValue(),
                        child.getKey());
                }
            }
        } else if (propertyValueHolder.isArray()) {
            ArrayNode arrayNode = (ArrayNode) propertyValueHolder;
            if (arrayNode.elements().next().isObject() || arrayNode.elements().next().isArray()) {
                for (Iterator<JsonNode> arrayIterator = arrayNode.elements(); arrayIterator.hasNext(); ) {
                    JsonNode nodeInArray = arrayIterator.next();
                    if (nodeInArray.isArray()) {
                        encryptAndSerializeProperty(encryptionSettings, (ObjectNode) null,
                            nodeInArray, StringUtils.EMPTY);
                    } else {
                        for (Iterator<Map.Entry<String, JsonNode>> it = nodeInArray.fields(); it.hasNext(); ) {
                            Map.Entry<String, JsonNode> child = it.next();
                            if (child.getValue().isObject() || child.getValue().isArray()) {
                                encryptAndSerializeProperty(encryptionSettings, (ObjectNode) nodeInArray,
                                    child.getValue(), propertyName);
                            } else if (!child.getValue().isNull()) {
                                encryptAndSerializeValue(encryptionSettings, (ObjectNode) nodeInArray, child.getValue(),
                                    child.getKey());
                            }
                        }
                    }
                }
            } else {
                List<byte[]> encryptedArray = new ArrayList<>();
                for (Iterator<JsonNode> it = arrayNode.elements(); it.hasNext(); ) {
                    encryptedArray.add(encryptAndSerializeValue(encryptionSettings, null, it.next(),
                        StringUtils.EMPTY));
                }
                arrayNode.removeAll();
                for (byte[] encryptedValue : encryptedArray) {
                    arrayNode.add(encryptedValue);
                }
            }
        } else {
            encryptAndSerializeValue(encryptionSettings, objectNode, propertyValueHolder, propertyName);
        }
    }

    public byte[] encryptAndSerializeValue(EncryptionSettings encryptionSettings, ObjectNode objectNode,
                                           JsonNode propertyValueHolder, String propertyName) throws MicrosoftDataEncryptionException {
        byte[] cipherText;
        byte[] cipherTextWithTypeMarker;
        Pair<TypeMarker, byte[]> typeMarkerPair = toByteArray(propertyValueHolder);
        cipherText =
            encryptionSettings.getAeadAes256CbcHmac256EncryptionAlgorithm().encrypt(typeMarkerPair.getRight());
        cipherTextWithTypeMarker = new byte[cipherText.length + 1];
        cipherTextWithTypeMarker[0] = (byte) typeMarkerPair.getLeft().getValue();
        System.arraycopy(cipherText, 0, cipherTextWithTypeMarker, 1, cipherText.length);
        if (objectNode != null && !objectNode.isNull()) {
            objectNode.put(propertyName, cipherTextWithTypeMarker);
        }
        return cipherTextWithTypeMarker;
    }

    public Mono<byte[]> decrypt(byte[] input) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Encrypting byte[] of size [{}] on thread [{}]",
                input == null ? null : input.length,
                Thread.currentThread().getName());
        }
        ObjectNode itemJObj = Utils.parse(input, ObjectNode.class);

        assert (itemJObj != null);

        for (ClientEncryptionIncludedPath includedPath : this.clientEncryptionPolicy.getIncludedPaths()) {
            if (StringUtils.isEmpty(includedPath.path) || includedPath.path.charAt(0) != '/' || includedPath.path.lastIndexOf('/') != 0) {
                return Mono.error(new IllegalArgumentException("Invalid encryption path: " + includedPath.path));
            }
        }
        List<Mono<Void>> encryptionMonoList = new ArrayList<>();
        for (ClientEncryptionIncludedPath includedPath : this.clientEncryptionPolicy.getIncludedPaths()) {
            String propertyName = includedPath.path.substring(1);
            // TODO: moderakh should support JPath
            JsonNode propertyValueHolder = itemJObj.get(propertyName);

            // Even null in the JSON is a JToken with Type Null, this null check is just a sanity check
            if (propertyValueHolder != null && !propertyValueHolder.isNull()) {
                // itemJObj.remove(propertyName);

                Mono<Void> voidMono = this.encryptionSettings.getEncryptionSettingForPropertyAsync(propertyName,
                    this).flatMap(settings -> {
                    try {
                        decryptAndSerializeProperty(settings, itemJObj, propertyValueHolder, propertyName);
                    } catch (MicrosoftDataEncryptionException | JsonProcessingException ex) {
                        return Mono.error(ex);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return Mono.empty();
                });
                encryptionMonoList.add(voidMono);
            }
        }
        Mono<List<Void>> listMono = Flux.mergeSequential(encryptionMonoList).collectList();
        return listMono.flatMap(aVoid -> Mono.just(EncryptionUtils.serializeJsonToByteArray(Utils.getSimpleObjectMapper(), itemJObj)));
    }

    public void decryptAndSerializeProperty(EncryptionSettings encryptionSettings, ObjectNode objectNode,
                                            JsonNode propertyValueHolder, String propertyName) throws MicrosoftDataEncryptionException, IOException {

        if (propertyValueHolder.isObject()) {
            for (Iterator<Map.Entry<String, JsonNode>> it = propertyValueHolder.fields(); it.hasNext(); ) {
                Map.Entry<String, JsonNode> child = it.next();
                if (child.getValue().isObject()) {
                    decryptAndSerializeProperty(encryptionSettings, (ObjectNode) propertyValueHolder,
                        child.getValue(), propertyName);
                } else if (!child.getValue().isNull()) {
                    decryptAndSerializeValue(encryptionSettings, (ObjectNode) propertyValueHolder, child.getValue(),
                        child.getKey());
                }
            }
        } else if (propertyValueHolder.isArray()) {
            ArrayNode arrayNode = (ArrayNode) propertyValueHolder;
            if (arrayNode.elements().next().isObject() || arrayNode.elements().next().isArray()) {
                for (Iterator<JsonNode> arrayIterator = arrayNode.elements(); arrayIterator.hasNext(); ) {
                    JsonNode nodeInArray = arrayIterator.next();
                    if (nodeInArray.isArray()) {
                        decryptAndSerializeProperty(encryptionSettings, (ObjectNode) null,
                            nodeInArray, StringUtils.EMPTY);
                    } else {
                        for (Iterator<Map.Entry<String, JsonNode>> it = nodeInArray.fields(); it.hasNext(); ) {
                            Map.Entry<String, JsonNode> child = it.next();
                            if (child.getValue().isObject() || child.getValue().isArray()) {
                                decryptAndSerializeProperty(encryptionSettings, (ObjectNode) nodeInArray,
                                    child.getValue(), propertyName);
                            } else if (!child.getValue().isNull()) {
                                decryptAndSerializeValue(encryptionSettings, (ObjectNode) nodeInArray, child.getValue(),
                                    child.getKey());
                            }
                        }
                    }
                }
            } else {
                List<JsonNode> decryptedArray = new ArrayList<>();
                for (Iterator<JsonNode> it = arrayNode.elements(); it.hasNext(); ) {
                    decryptedArray.add(decryptAndSerializeValue(encryptionSettings, null, it.next(),
                        StringUtils.EMPTY));
                }
                arrayNode.removeAll();
                for (JsonNode encryptedValue : decryptedArray) {
                    arrayNode.add(encryptedValue);
                }
            }

        } else {
            decryptAndSerializeValue(encryptionSettings, objectNode, propertyValueHolder, propertyName);
        }
    }

    public JsonNode decryptAndSerializeValue(EncryptionSettings encryptionSettings, ObjectNode objectNode,
                                             JsonNode propertyValueHolder, String propertyName) throws MicrosoftDataEncryptionException, IOException {
        byte[] cipherText;
        byte[] cipherTextWithTypeMarker;

        cipherTextWithTypeMarker = propertyValueHolder.binaryValue();
        cipherText = new byte[cipherTextWithTypeMarker.length - 1];
        System.arraycopy(cipherTextWithTypeMarker, 1, cipherText, 0,
            cipherTextWithTypeMarker.length - 1);
        byte[] plainText = encryptionSettings.getAeadAes256CbcHmac256EncryptionAlgorithm().decrypt(cipherText);
        if (objectNode != null && !objectNode.isNull()) {
            objectNode.set(propertyName, toJsonNode(plainText,
                TypeMarker.valueOf(cipherTextWithTypeMarker[0]).get()));
        }
        return toJsonNode(plainText,
            TypeMarker.valueOf(cipherTextWithTypeMarker[0]).get());
    }

    public static Pair<TypeMarker, byte[]> toByteArray(JsonNode jsonNode) {
        try {
            SqlSerializerFactory sqlSerializerFactory = new SqlSerializerFactory();
            switch (jsonNode.getNodeType()) {
                case BOOLEAN:
                    return Pair.of(TypeMarker.BOOLEAN,
                        sqlSerializerFactory.getDefaultSerializer(Boolean.FALSE).serialize(jsonNode.asBoolean()));
                case NUMBER:
                    if (jsonNode.isInt() || jsonNode.isLong()) {
                        return Pair.of(TypeMarker.LONG,
                            sqlSerializerFactory.getDefaultSerializer(0l).serialize(jsonNode.asLong()));
                    } else if (jsonNode.isFloat() || jsonNode.isDouble()) {
                        return Pair.of(TypeMarker.DOUBLE,
                            sqlSerializerFactory.getDefaultSerializer(0d).serialize(jsonNode.asDouble()));
                    }
                case STRING:
                    if (jsonNode.asText().length() > STRING_SIZE_ENCRYPTION_LIMIT) {
                        LOGGER.error("{} length is greater than allowed encryption string length {}",
                            jsonNode.asText(), STRING_SIZE_ENCRYPTION_LIMIT);
                    }

                    return Pair.of(TypeMarker.STRING,
                        SqlSerializerFactory.getOrCreate("varchar", STRING_SIZE_ENCRYPTION_LIMIT, 0, 0).serialize(jsonNode.asText()));
                case OBJECT:
                    return Pair.of(TypeMarker.OBJECT,
                        SqlSerializerFactory.getOrCreate("varchar", STRING_SIZE_ENCRYPTION_LIMIT, 0, 0).serialize(jsonNode.toString()));
                case ARRAY:
                    return Pair.of(TypeMarker.ARRAY,
                        SqlSerializerFactory.getOrCreate("varchar", STRING_SIZE_ENCRYPTION_LIMIT, 0, 0).serialize(jsonNode.toString()));
            }
        } catch (MicrosoftDataEncryptionException ex) {
            throw new IllegalStateException("Unable to convert JSON to byte[]", ex);
        }
        throw new IncompatibleClassChangeError("Invalid or Unsupported Data Type Passed " + jsonNode.getNodeType());
    }

    public static JsonNode toJsonNode(byte[] serializedBytes, TypeMarker typeMarker) {
        try {
            SqlSerializerFactory sqlSerializerFactory = new SqlSerializerFactory();
            switch (typeMarker) {
                case BOOLEAN:
                    return BooleanNode.valueOf((boolean) sqlSerializerFactory.getDefaultSerializer(Boolean.FALSE).deserialize(serializedBytes));
                case LONG:
                    return LongNode.valueOf((long) sqlSerializerFactory.getDefaultSerializer(0l).deserialize(serializedBytes));
                case DOUBLE:
                    return DoubleNode.valueOf((double) sqlSerializerFactory.getDefaultSerializer(0d).deserialize(serializedBytes));
                case STRING:
                    return TextNode.valueOf((String) SqlSerializerFactory.getOrCreate("varchar",
                        STRING_SIZE_ENCRYPTION_LIMIT, 0, 0).deserialize(serializedBytes));
                case OBJECT:
                    return TextNode.valueOf((String) SqlSerializerFactory.getOrCreate("varchar",
                        STRING_SIZE_ENCRYPTION_LIMIT, 0, 0).deserialize(serializedBytes));
                case ARRAY:
                    return TextNode.valueOf((String) SqlSerializerFactory.getOrCreate("varchar",
                        STRING_SIZE_ENCRYPTION_LIMIT, 0, 0).deserialize(serializedBytes));
            }
        } catch (MicrosoftDataEncryptionException ex) {
            throw new IllegalStateException("Unable to convert byte[] to JSON", ex);
        }
        throw new IncompatibleClassChangeError("Invalid or Unsupported Data Type Passed " + typeMarker);
    }


    public enum TypeMarker {
        NULL(1), // not used
        BOOLEAN(2),
        DOUBLE(3),
        LONG(4),
        STRING(5),
        ARRAY(5),
        OBJECT(6);
        private final int value;

        public static Optional<TypeMarker> valueOf(int value) {
            return Arrays.stream(values())
                .filter(legNo -> legNo.value == value)
                .findFirst();
        }

        TypeMarker(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
