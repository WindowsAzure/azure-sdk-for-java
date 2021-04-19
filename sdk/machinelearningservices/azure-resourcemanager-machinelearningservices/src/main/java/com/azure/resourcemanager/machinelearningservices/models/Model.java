// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An Azure Machine Learning Model. */
@Fluent
public final class Model {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Model.class);

    /*
     * The Model Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The Model name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The Model framework.
     */
    @JsonProperty(value = "framework")
    private String framework;

    /*
     * The Model framework version.
     */
    @JsonProperty(value = "frameworkVersion")
    private String frameworkVersion;

    /*
     * The Model version assigned by Model Management Service.
     */
    @JsonProperty(value = "version")
    private Long version;

    /*
     * The list of datasets associated with the model.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetReference> datasets;

    /*
     * The URL of the Model. Usually a SAS URL.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * The MIME type of Model content. For more details about MIME type, please
     * open https://www.iana.org/assignments/media-types/media-types.xhtml
     */
    @JsonProperty(value = "mimeType", required = true)
    private String mimeType;

    /*
     * The Model description text.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The Model creation time (UTC).
     */
    @JsonProperty(value = "createdTime")
    private OffsetDateTime createdTime;

    /*
     * The Model last modified time (UTC).
     */
    @JsonProperty(value = "modifiedTime")
    private OffsetDateTime modifiedTime;

    /*
     * Indicates whether we need to unpack the Model during docker Image
     * creation.
     */
    @JsonProperty(value = "unpack")
    private Boolean unpack;

    /*
     * The Parent Model Id.
     */
    @JsonProperty(value = "parentModelId")
    private String parentModelId;

    /*
     * The RunId that created this model.
     */
    @JsonProperty(value = "runId")
    private String runId;

    /*
     * The name of the experiment where this model was created.
     */
    @JsonProperty(value = "experimentName")
    private String experimentName;

    /*
     * The Model tag dictionary. Items are mutable.
     */
    @JsonProperty(value = "kvTags")
    private Map<String, String> kvTags;

    /*
     * The Model property dictionary. Properties are immutable.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /*
     * Models derived from this model
     */
    @JsonProperty(value = "derivedModelIds")
    private List<String> derivedModelIds;

    /*
     * Sample Input Data for the Model. A reference to a dataset in the
     * workspace in the format aml://dataset/{datasetId}
     */
    @JsonProperty(value = "sampleInputData")
    private String sampleInputData;

    /*
     * Sample Output Data for the Model. A reference to a dataset in the
     * workspace in the format aml://dataset/{datasetId}
     */
    @JsonProperty(value = "sampleOutputData")
    private String sampleOutputData;

    /*
     * Resource requirements for the model
     */
    @JsonProperty(value = "resourceRequirements")
    private ContainerResourceRequirements resourceRequirements;

    /**
     * Get the id property: The Model Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Model Id.
     *
     * @param id the id value to set.
     * @return the Model object itself.
     */
    public Model withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The Model name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Model name.
     *
     * @param name the name value to set.
     * @return the Model object itself.
     */
    public Model withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the framework property: The Model framework.
     *
     * @return the framework value.
     */
    public String framework() {
        return this.framework;
    }

    /**
     * Set the framework property: The Model framework.
     *
     * @param framework the framework value to set.
     * @return the Model object itself.
     */
    public Model withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * Get the frameworkVersion property: The Model framework version.
     *
     * @return the frameworkVersion value.
     */
    public String frameworkVersion() {
        return this.frameworkVersion;
    }

    /**
     * Set the frameworkVersion property: The Model framework version.
     *
     * @param frameworkVersion the frameworkVersion value to set.
     * @return the Model object itself.
     */
    public Model withFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
        return this;
    }

    /**
     * Get the version property: The Model version assigned by Model Management Service.
     *
     * @return the version value.
     */
    public Long version() {
        return this.version;
    }

    /**
     * Set the version property: The Model version assigned by Model Management Service.
     *
     * @param version the version value to set.
     * @return the Model object itself.
     */
    public Model withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the datasets property: The list of datasets associated with the model.
     *
     * @return the datasets value.
     */
    public List<DatasetReference> datasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: The list of datasets associated with the model.
     *
     * @param datasets the datasets value to set.
     * @return the Model object itself.
     */
    public Model withDatasets(List<DatasetReference> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get the url property: The URL of the Model. Usually a SAS URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the Model. Usually a SAS URL.
     *
     * @param url the url value to set.
     * @return the Model object itself.
     */
    public Model withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the mimeType property: The MIME type of Model content. For more details about MIME type, please open
     * https://www.iana.org/assignments/media-types/media-types.xhtml.
     *
     * @return the mimeType value.
     */
    public String mimeType() {
        return this.mimeType;
    }

    /**
     * Set the mimeType property: The MIME type of Model content. For more details about MIME type, please open
     * https://www.iana.org/assignments/media-types/media-types.xhtml.
     *
     * @param mimeType the mimeType value to set.
     * @return the Model object itself.
     */
    public Model withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Get the description property: The Model description text.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The Model description text.
     *
     * @param description the description value to set.
     * @return the Model object itself.
     */
    public Model withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdTime property: The Model creation time (UTC).
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: The Model creation time (UTC).
     *
     * @param createdTime the createdTime value to set.
     * @return the Model object itself.
     */
    public Model withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the modifiedTime property: The Model last modified time (UTC).
     *
     * @return the modifiedTime value.
     */
    public OffsetDateTime modifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Set the modifiedTime property: The Model last modified time (UTC).
     *
     * @param modifiedTime the modifiedTime value to set.
     * @return the Model object itself.
     */
    public Model withModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get the unpack property: Indicates whether we need to unpack the Model during docker Image creation.
     *
     * @return the unpack value.
     */
    public Boolean unpack() {
        return this.unpack;
    }

    /**
     * Set the unpack property: Indicates whether we need to unpack the Model during docker Image creation.
     *
     * @param unpack the unpack value to set.
     * @return the Model object itself.
     */
    public Model withUnpack(Boolean unpack) {
        this.unpack = unpack;
        return this;
    }

    /**
     * Get the parentModelId property: The Parent Model Id.
     *
     * @return the parentModelId value.
     */
    public String parentModelId() {
        return this.parentModelId;
    }

    /**
     * Set the parentModelId property: The Parent Model Id.
     *
     * @param parentModelId the parentModelId value to set.
     * @return the Model object itself.
     */
    public Model withParentModelId(String parentModelId) {
        this.parentModelId = parentModelId;
        return this;
    }

    /**
     * Get the runId property: The RunId that created this model.
     *
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the runId property: The RunId that created this model.
     *
     * @param runId the runId value to set.
     * @return the Model object itself.
     */
    public Model withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the experimentName property: The name of the experiment where this model was created.
     *
     * @return the experimentName value.
     */
    public String experimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName property: The name of the experiment where this model was created.
     *
     * @param experimentName the experimentName value to set.
     * @return the Model object itself.
     */
    public Model withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the kvTags property: The Model tag dictionary. Items are mutable.
     *
     * @return the kvTags value.
     */
    public Map<String, String> kvTags() {
        return this.kvTags;
    }

    /**
     * Set the kvTags property: The Model tag dictionary. Items are mutable.
     *
     * @param kvTags the kvTags value to set.
     * @return the Model object itself.
     */
    public Model withKvTags(Map<String, String> kvTags) {
        this.kvTags = kvTags;
        return this;
    }

    /**
     * Get the properties property: The Model property dictionary. Properties are immutable.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The Model property dictionary. Properties are immutable.
     *
     * @param properties the properties value to set.
     * @return the Model object itself.
     */
    public Model withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the derivedModelIds property: Models derived from this model.
     *
     * @return the derivedModelIds value.
     */
    public List<String> derivedModelIds() {
        return this.derivedModelIds;
    }

    /**
     * Set the derivedModelIds property: Models derived from this model.
     *
     * @param derivedModelIds the derivedModelIds value to set.
     * @return the Model object itself.
     */
    public Model withDerivedModelIds(List<String> derivedModelIds) {
        this.derivedModelIds = derivedModelIds;
        return this;
    }

    /**
     * Get the sampleInputData property: Sample Input Data for the Model. A reference to a dataset in the workspace in
     * the format aml://dataset/{datasetId}.
     *
     * @return the sampleInputData value.
     */
    public String sampleInputData() {
        return this.sampleInputData;
    }

    /**
     * Set the sampleInputData property: Sample Input Data for the Model. A reference to a dataset in the workspace in
     * the format aml://dataset/{datasetId}.
     *
     * @param sampleInputData the sampleInputData value to set.
     * @return the Model object itself.
     */
    public Model withSampleInputData(String sampleInputData) {
        this.sampleInputData = sampleInputData;
        return this;
    }

    /**
     * Get the sampleOutputData property: Sample Output Data for the Model. A reference to a dataset in the workspace in
     * the format aml://dataset/{datasetId}.
     *
     * @return the sampleOutputData value.
     */
    public String sampleOutputData() {
        return this.sampleOutputData;
    }

    /**
     * Set the sampleOutputData property: Sample Output Data for the Model. A reference to a dataset in the workspace in
     * the format aml://dataset/{datasetId}.
     *
     * @param sampleOutputData the sampleOutputData value to set.
     * @return the Model object itself.
     */
    public Model withSampleOutputData(String sampleOutputData) {
        this.sampleOutputData = sampleOutputData;
        return this;
    }

    /**
     * Get the resourceRequirements property: Resource requirements for the model.
     *
     * @return the resourceRequirements value.
     */
    public ContainerResourceRequirements resourceRequirements() {
        return this.resourceRequirements;
    }

    /**
     * Set the resourceRequirements property: Resource requirements for the model.
     *
     * @param resourceRequirements the resourceRequirements value to set.
     * @return the Model object itself.
     */
    public Model withResourceRequirements(ContainerResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Model"));
        }
        if (datasets() != null) {
            datasets().forEach(e -> e.validate());
        }
        if (url() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property url in model Model"));
        }
        if (mimeType() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property mimeType in model Model"));
        }
        if (resourceRequirements() != null) {
            resourceRequirements().validate();
        }
    }
}
