// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SearchIndexerDataSource model. */
@Fluent
public final class SearchIndexerDataSource {
    /*
     * The name of the datasource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The description of the datasource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The type of the datasource.
     */
    @JsonProperty(value = "type", required = true)
    private SearchIndexerDataSourceType type;

    /*
     * Credentials for the datasource.
     */
    @JsonProperty(value = "credentials", required = true)
    private DataSourceCredentials credentials;

    /*
     * The data container for the datasource.
     */
    @JsonProperty(value = "container", required = true)
    private SearchIndexerDataContainer container;

    /*
     * The data change detection policy for the datasource.
     */
    @JsonProperty(value = "dataChangeDetectionPolicy")
    private DataChangeDetectionPolicy dataChangeDetectionPolicy;

    /*
     * The data deletion detection policy for the datasource.
     */
    @JsonProperty(value = "dataDeletionDetectionPolicy")
    private DataDeletionDetectionPolicy dataDeletionDetectionPolicy;

    /*
     * The ETag of the data source.
     */
    @JsonProperty(value = "@odata.etag")
    private String eTag;

<<<<<<< HEAD
    /** Creates an instance of SearchIndexerDataSource class. */
    @JsonCreator
    public SearchIndexerDataSource(
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "type") SearchIndexerDataSourceType type,
            @JsonProperty(value = "credentials") DataSourceCredentials credentials,
            @JsonProperty(value = "container") SearchIndexerDataContainer container) {
        this.name = name;
        this.type = type;
        this.credentials = credentials;
        this.container = container;
    }
=======
    /*
     * A description of an encryption key that you create in Azure Key Vault.
     * This key is used to provide an additional level of encryption-at-rest
     * for your datasource definition when you want full assurance that no one,
     * not even Microsoft, can decrypt your data source definition in Azure
     * Cognitive Search. Once you have encrypted your data source definition,
     * it will always remain encrypted. Azure Cognitive Search will ignore
     * attempts to set this property to null. You can change this property as
     * needed if you want to rotate your encryption key; Your datasource
     * definition will be unaffected. Encryption with customer-managed keys is
     * not available for free search services, and is only available for paid
     * services created on or after January 1, 2019.
     */
    @JsonProperty(value = "encryptionKey")
    private SearchResourceEncryptionKey encryptionKey;
>>>>>>> bfd056a1647f7232e7d7cb82ca2a5ad85b9bb6ec

    /**
     * Get the name property: The name of the datasource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the datasource.
     *
     * @param name the name value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    /**
     * Get the description property: The description of the datasource.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the datasource.
     *
     * @param description the description value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    public SearchIndexerDataSource setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the type property: The type of the datasource.
     *
     * @return the type value.
     */
    public SearchIndexerDataSourceType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the datasource.
     *
     * @param type the type value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    /**
     * Get the credentials property: Credentials for the datasource.
     *
     * @return the credentials value.
     */
    public DataSourceCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Credentials for the datasource.
     *
     * @param credentials the credentials value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    /**
     * Get the container property: The data container for the datasource.
     *
     * @return the container value.
     */
    public SearchIndexerDataContainer getContainer() {
        return this.container;
    }

    /**
     * Set the container property: The data container for the datasource.
     *
     * @param container the container value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    /**
     * Get the dataChangeDetectionPolicy property: The data change detection policy for the datasource.
     *
     * @return the dataChangeDetectionPolicy value.
     */
    public DataChangeDetectionPolicy getDataChangeDetectionPolicy() {
        return this.dataChangeDetectionPolicy;
    }

    /**
     * Set the dataChangeDetectionPolicy property: The data change detection policy for the datasource.
     *
     * @param dataChangeDetectionPolicy the dataChangeDetectionPolicy value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    public SearchIndexerDataSource setDataChangeDetectionPolicy(DataChangeDetectionPolicy dataChangeDetectionPolicy) {
        this.dataChangeDetectionPolicy = dataChangeDetectionPolicy;
        return this;
    }

    /**
     * Get the dataDeletionDetectionPolicy property: The data deletion detection policy for the datasource.
     *
     * @return the dataDeletionDetectionPolicy value.
     */
    public DataDeletionDetectionPolicy getDataDeletionDetectionPolicy() {
        return this.dataDeletionDetectionPolicy;
    }

    /**
     * Set the dataDeletionDetectionPolicy property: The data deletion detection policy for the datasource.
     *
     * @param dataDeletionDetectionPolicy the dataDeletionDetectionPolicy value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    public SearchIndexerDataSource setDataDeletionDetectionPolicy(
            DataDeletionDetectionPolicy dataDeletionDetectionPolicy) {
        this.dataDeletionDetectionPolicy = dataDeletionDetectionPolicy;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the data source.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the data source.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    public SearchIndexerDataSource setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
<<<<<<< HEAD
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model SearchIndexerDataSource");
        }
        if (getType() == null) {
            throw new IllegalArgumentException("Missing required property type in model SearchIndexerDataSource");
        }
        if (getCredentials() == null) {
            throw new IllegalArgumentException(
                    "Missing required property credentials in model SearchIndexerDataSource");
        } else {
            getCredentials().validate();
        }
        if (getContainer() == null) {
            throw new IllegalArgumentException("Missing required property container in model SearchIndexerDataSource");
        } else {
            getContainer().validate();
        }
        if (getDataChangeDetectionPolicy() != null) {
            getDataChangeDetectionPolicy().validate();
        }
        if (getDataDeletionDetectionPolicy() != null) {
            getDataDeletionDetectionPolicy().validate();
        }
=======
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your datasource definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your data source definition in Azure Cognitive Search.
     * Once you have encrypted your data source definition, it will always remain encrypted. Azure Cognitive Search will
     * ignore attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your datasource definition will be unaffected. Encryption with customer-managed keys is not
     * available for free search services, and is only available for paid services created on or after January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your datasource definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your data source definition in Azure Cognitive Search.
     * Once you have encrypted your data source definition, it will always remain encrypted. Azure Cognitive Search will
     * ignore attempts to set this property to null. You can change this property as needed if you want to rotate your
     * encryption key; Your datasource definition will be unaffected. Encryption with customer-managed keys is not
     * available for free search services, and is only available for paid services created on or after January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SearchIndexerDataSource object itself.
     */
    public SearchIndexerDataSource setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
>>>>>>> bfd056a1647f7232e7d7cb82ca2a5ad85b9bb6ec
    }
}
