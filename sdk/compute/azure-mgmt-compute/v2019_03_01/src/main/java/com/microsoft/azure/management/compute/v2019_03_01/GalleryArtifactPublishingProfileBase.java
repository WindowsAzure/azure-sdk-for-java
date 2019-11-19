/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the basic gallery artifact publishing profile.
 */
public class GalleryArtifactPublishingProfileBase {
    /**
     * The target regions where the Image Version is going to be replicated to.
     * This property is updatable.
     */
    @JsonProperty(value = "targetRegions")
    private List<TargetRegion> targetRegions;

    /**
     * The number of replicas of the Image Version to be created per region.
     * This property would take effect for a region when regionalReplicaCount
     * is not specified. This property is updatable.
     */
    @JsonProperty(value = "replicaCount")
    private Integer replicaCount;

    /**
     * If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     */
    @JsonProperty(value = "excludeFromLatest")
    private Boolean excludeFromLatest;

    /**
     * The timestamp for when the gallery Image Version is published.
     */
    @JsonProperty(value = "publishedDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime publishedDate;

    /**
     * The end of life date of the gallery Image Version. This property can be
     * used for decommissioning purposes. This property is updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private DateTime endOfLifeDate;

    /**
     * Specifies the storage account type to be used to store the image. This
     * property is not updatable. Possible values include: 'Standard_LRS',
     * 'Standard_ZRS'.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /**
     * Get the target regions where the Image Version is going to be replicated to. This property is updatable.
     *
     * @return the targetRegions value
     */
    public List<TargetRegion> targetRegions() {
        return this.targetRegions;
    }

    /**
     * Set the target regions where the Image Version is going to be replicated to. This property is updatable.
     *
     * @param targetRegions the targetRegions value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withTargetRegions(List<TargetRegion> targetRegions) {
        this.targetRegions = targetRegions;
        return this;
    }

    /**
     * Get the number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     *
     * @return the replicaCount value
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     *
     * @param replicaCount the replicaCount value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get if set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     *
     * @return the excludeFromLatest value
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Set if set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     *
     * @param excludeFromLatest the excludeFromLatest value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Get the timestamp for when the gallery Image Version is published.
     *
     * @return the publishedDate value
     */
    public DateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Get the end of life date of the gallery Image Version. This property can be used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value
     */
    public DateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the end of life date of the gallery Image Version. This property can be used for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withEndOfLifeDate(DateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get specifies the storage account type to be used to store the image. This property is not updatable. Possible values include: 'Standard_LRS', 'Standard_ZRS'.
     *
     * @return the storageAccountType value
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set specifies the storage account type to be used to store the image. This property is not updatable. Possible values include: 'Standard_LRS', 'Standard_ZRS'.
     *
     * @param storageAccountType the storageAccountType value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

}
