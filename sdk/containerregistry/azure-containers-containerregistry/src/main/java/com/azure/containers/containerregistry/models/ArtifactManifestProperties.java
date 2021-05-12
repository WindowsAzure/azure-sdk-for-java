// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.containers.containerregistry.implementation.ArtifactManifestPropertiesHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Manifest attributes details.
 */
@JsonFlatten
@Fluent
public class ArtifactManifestProperties {
    /*
     * Registry login server name.  This is likely to be similar to
     * {registry-name}.azurecr.io
     */
    @JsonProperty(value = "registry", access = JsonProperty.Access.WRITE_ONLY)
    private String registryLoginServer;

    /*
     * Repository name
     */
    @JsonProperty(value = "imageName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositoryName;

    /*
     * Manifest
     */
    @JsonProperty(value = "manifest.digest", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String digest;

    /*
     * Image size
     */
    @JsonProperty(value = "manifest.imageSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long size;

    /*
     * Created time
     */
    @JsonProperty(value = "manifest.createdTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Last update time
     */
    @JsonProperty(value = "manifest.lastUpdateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * CPU architecture
     */
    @JsonProperty(value = "manifest.architecture", access = JsonProperty.Access.WRITE_ONLY)
    private ArtifactArchitecture architecture;

    /*
     * Operating system
     */
    @JsonProperty(value = "manifest.os", access = JsonProperty.Access.WRITE_ONLY)
    private ArtifactOperatingSystem operatingSystem;

    /*
     * List of manifests referenced by this manifest list.  List will be empty
     * if this manifest is not a manifest list.
     */
    @JsonProperty(value = "manifest.references", access = JsonProperty.Access.WRITE_ONLY)
    private List<ArtifactManifestReference> manifestReferences;

    /*
     * List of tags
     */
    @JsonProperty(value = "manifest.tags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> tags;

    /*
     * Delete enabled
     */
    @JsonProperty(value = "manifest.changeableAttributes.deleteEnabled")
    private Boolean deleteEnabled;

    /*
     * Write enabled
     */
    @JsonProperty(value = "manifest.changeableAttributes.writeEnabled")
    private Boolean writeEnabled;

    /*
     * List enabled
     */
    @JsonProperty(value = "manifest.changeableAttributes.listEnabled")
    private Boolean listEnabled;

    static {
        ArtifactManifestPropertiesHelper.setAccessor(new ArtifactManifestPropertiesHelper.ArtifactManifestPropertiesAccessor() {
            @Override
            public void setRepositoryName(ArtifactManifestProperties manifestProperties, String repositoryName) {
                manifestProperties.setRepositoryName(repositoryName);
            }

            @Override
            public void setDigest(ArtifactManifestProperties manifestProperties, String digest) {
                manifestProperties.setDigest(digest);
            }

            @Override
            public void setManifestReferences(ArtifactManifestProperties manifestProperties, List<ArtifactManifestReference> manifestReferences) {
                manifestProperties.setManifestReferences(manifestReferences);
            }

            @Override
            public void setCpuArchitecture(ArtifactManifestProperties manifestProperties, ArtifactArchitecture architecture) {
                manifestProperties.setCpuArchitecture(architecture);
            }

            @Override
            public void setOperatingSystem(ArtifactManifestProperties manifestProperties, ArtifactOperatingSystem operatingSystem) {
                manifestProperties.setOperatingSystem(operatingSystem);
            }

            @Override
            public void setTags(ArtifactManifestProperties manifestProperties, List<String> tags) {
                manifestProperties.setTags(tags);
            }

            @Override
            public void setSize(ArtifactManifestProperties manifestProperties, Long size) {
                manifestProperties.setSize(size);
            }

            @Override
            public void setCreatedOn(ArtifactManifestProperties manifestProperties, OffsetDateTime createdOn) {
                manifestProperties.setCreatedOn(createdOn);
            }

            @Override
            public void setlastUpdatedOn(ArtifactManifestProperties manifestProperties, OffsetDateTime lastUpdatedOn) {
                manifestProperties.setlastUpdatedOn(lastUpdatedOn);
            }
        });
    }

    private ArtifactManifestProperties setCpuArchitecture(ArtifactArchitecture architecture) {
        this.architecture = architecture;
        return this;
    }

    private ArtifactManifestProperties setManifestReferences(List<ArtifactManifestReference> manifestReferences) {
        this.manifestReferences = manifestReferences;
        return this;
    }

    private ArtifactManifestProperties setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    private ArtifactManifestProperties setOperatingSystem(ArtifactOperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    private ArtifactManifestProperties setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    private ArtifactManifestProperties setSize(Long size) {
        this.size = size;
        return this;
    }

    private ArtifactManifestProperties setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    private ArtifactManifestProperties setlastUpdatedOn(OffsetDateTime lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
        return this;
    }

    private ArtifactManifestProperties setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /*
     * Read enabled
     */
    @JsonProperty(value = "manifest.changeableAttributes.readEnabled")
    private Boolean readEnabled;

    /**
     * Initializes an instance of {@link ArtifactManifestProperties}.
     */
    public ArtifactManifestProperties() { }

    /**
     * Get the registryLoginServer property: Registry login server name. This is likely to be similar to
     * {registry-name}.azurecr.io.
     *
     * @return the registryLoginServer value.
     */
    public String getRegistryLoginServer() {
        return this.registryLoginServer;
    }

    /**
     * Get the repositoryName property: Repository name.
     *
     * @return the repositoryName value.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Get the digest property: Manifest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Get the size property: Image size.
     *
     * @return the size value.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Get the createdOn property: Created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the architecture property: CPU architecture.
     *
     * @return the architecture value.
     */
    public ArtifactArchitecture getArchitecture() {
        return this.architecture;
    }

    /**
     * Get the operatingSystem property: Operating system.
     *
     * @return the operatingSystem value.
     */
    public ArtifactOperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Get the manifestReferences property: List of manifests referenced by this manifest list. List will be empty if
     * this manifest is not a manifest list.
     *
     * @return the manifestReferences value.
     */
    public List<ArtifactManifestReference> getManifestReferences() {
        return this.manifestReferences;
    }

    /**
     * Get the tags property: List of tags.
     *
     * @return the tags value.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Get the deleteEnabled property: Delete enabled.
     *
     * @return the deleteEnabled value.
     */
    public Boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    /**
     * Set the deleteEnabled property: Delete enabled.
     *
     * @param deleteEnabled the deleteEnabled value to set.
     * @return the ArtifactManifestProperties object itself.
     */
    public ArtifactManifestProperties setDeleteEnabled(Boolean deleteEnabled) {
        this.deleteEnabled = deleteEnabled;
        return this;
    }

    /**
     * Get the writeEnabled property: Write enabled.
     *
     * @return the writeEnabled value.
     */
    public Boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    /**
     * Set the writeEnabled property: Write enabled.
     *
     * @param writeEnabled the writeEnabled value to set.
     * @return the ArtifactManifestProperties object itself.
     */
    public ArtifactManifestProperties setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
        return this;
    }

    /**
     * Get the listEnabled property: List enabled.
     *
     * @return the listEnabled value.
     */
    public Boolean isListEnabled() {
        return this.listEnabled;
    }

    /**
     * Set the listEnabled property: List enabled.
     *
     * @param listEnabled the listEnabled value to set.
     * @return the ArtifactManifestProperties object itself.
     */
    public ArtifactManifestProperties setListEnabled(Boolean listEnabled) {
        this.listEnabled = listEnabled;
        return this;
    }

    /**
     * Get the readEnabled property: Read enabled.
     *
     * @return the readEnabled value.
     */
    public Boolean isReadEnabled() {
        return this.readEnabled;
    }

    /**
     * Set the readEnabled property: Read enabled.
     *
     * @param readEnabled the readEnabled value to set.
     * @return the ArtifactManifestProperties object itself.
     */
    public ArtifactManifestProperties setReadEnabled(Boolean readEnabled) {
        this.readEnabled = readEnabled;
        return this;
    }
}
