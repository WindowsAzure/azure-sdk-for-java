// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Manifest attributes details. */
@JsonFlatten
@Immutable
public final class ArtifactManifestProperties {
    /*
     * Repository name
     */
    @JsonProperty(value = "imageName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositoryName;

    /*
     * Manifest
     */
    @JsonProperty(value = "manifest.digest", access = JsonProperty.Access.WRITE_ONLY)
    private String digest;

    /*
     * Image size
     */
    @JsonProperty(value = "manifest.imageSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long size;

    /*
     * Created time
     */
    @JsonProperty(value = "manifest.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Last update time
     */
    @JsonProperty(value = "manifest.lastUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
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
     * List of manifest attributes details
     */
    @JsonProperty(value = "manifest.references", access = JsonProperty.Access.WRITE_ONLY)
    private List<ArtifactManifestProperties> manifests;
    /*
     * List of tags
     */
    @JsonProperty(value = "manifest.tags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> tags;

    /*
     * Writeable properties of the resource
     */
    @JsonProperty(value = "manifest.changeableAttributes", access = JsonProperty.Access.WRITE_ONLY)
    private ContentProperties writeableProperties;

    /**
     * Needed to keep the serializer happy.
     */
    private ArtifactManifestProperties() { }

    /**
     * Create an instance of RegistryArtifactProperties class.
     * @param repository repository associated with the artifacts.
     * @param digest digest associated with the registry artifact properties.
     * @param writeableProperties writeable properties.
     * @param registryArtifacts the artifacts associated with the registry.
     * @param cpuArchitecture cpu architecture of the image.
     * @param operatingSystem operation system associated with the image.
     * @param createdOn the date on which the artifact was created.
     * @param lastUpdatedOn the date on which the artifact was last updated.
     * @param tags tags associated with the artifacts.
     * @param size size associated with the artifacts.
     */
    public ArtifactManifestProperties(
        String repository,
        String digest,
        ContentProperties writeableProperties,
        List<ArtifactManifestProperties> registryArtifacts,
        ArtifactArchitecture cpuArchitecture,
        ArtifactOperatingSystem operatingSystem,
        OffsetDateTime createdOn,
        OffsetDateTime lastUpdatedOn,
        List<String> tags,
        Long size) {
        this.repositoryName = repository;
        this.digest = digest;
        this.writeableProperties = writeableProperties;
        this.manifests = registryArtifacts;
        this.architecture = cpuArchitecture;
        this.operatingSystem = operatingSystem;
        this.createdOn = createdOn;
        this.lastUpdatedOn = lastUpdatedOn;
        this.size = size;
        this.tags = tags;
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
     * Get the references property: List of manifest attributes details.
     *
     * @return the references value.
     */
    public List<ArtifactManifestProperties> getManifests() {
        return this.manifests;
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
     * Get the writeableProperties property: Writeable properties of the resource.
     *
     * @return the writeableProperties value.
     */
    public ContentProperties getWriteableProperties() {
        return this.writeableProperties;
    }
}
