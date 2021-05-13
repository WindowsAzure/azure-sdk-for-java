// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The update operation for a Video Analyzer account. */
@JsonFlatten
@Fluent
public class VideoAnalyzerUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoAnalyzerUpdate.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The identities associated to the Video Analyzer resource.
     */
    @JsonProperty(value = "identity")
    private VideoAnalyzerIdentity identity;

    /*
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<StorageAccount> storageAccounts;

    /*
     * The list of endpoints associated with this resource.
     */
    @JsonProperty(value = "properties.endpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<Endpoint> endpoints;

    /*
     * The account encryption properties.
     */
    @JsonProperty(value = "properties.encryption")
    private AccountEncryption encryption;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the VideoAnalyzerUpdate object itself.
     */
    public VideoAnalyzerUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identities associated to the Video Analyzer resource.
     *
     * @return the identity value.
     */
    public VideoAnalyzerIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identities associated to the Video Analyzer resource.
     *
     * @param identity the identity value to set.
     * @return the VideoAnalyzerUpdate object itself.
     */
    public VideoAnalyzerUpdate withIdentity(VideoAnalyzerIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the storageAccounts property: The storage accounts for this resource.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: The storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the VideoAnalyzerUpdate object itself.
     */
    public VideoAnalyzerUpdate withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the endpoints property: The list of endpoints associated with this resource.
     *
     * @return the endpoints value.
     */
    public List<Endpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Get the encryption property: The account encryption properties.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The account encryption properties.
     *
     * @param encryption the encryption value to set.
     * @return the VideoAnalyzerUpdate object itself.
     */
    public VideoAnalyzerUpdate withEncryption(AccountEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
