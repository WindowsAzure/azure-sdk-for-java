/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.PublicAccess;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseStatus;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseState;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseDuration;
import java.util.Map;
import com.microsoft.azure.management.storage.v2019_06_01.ImmutabilityPolicyProperties;
import com.microsoft.azure.management.storage.v2019_06_01.LegalHoldProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.storage.v2019_06_01.AzureEntityResource;

/**
 * The blob container properties be listed out.
 */
@JsonFlatten
public class ListContainerItemInner extends AzureEntityResource {
    /**
     * Default the container to use specified encryption scope for all writes.
     */
    @JsonProperty(value = "properties.defaultEncryptionScope")
    private String defaultEncryptionScope;

    /**
     * Block override of encryption scope from the container default.
     */
    @JsonProperty(value = "properties.denyEncryptionScopeOverride")
    private Boolean denyEncryptionScopeOverride;

    /**
     * Specifies whether data in the container may be accessed publicly and the
     * level of access. Possible values include: 'Container', 'Blob', 'None'.
     */
    @JsonProperty(value = "properties.publicAccess")
    private PublicAccess publicAccess;

    /**
     * Returns the date and time the container was last modified.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * The lease status of the container. Possible values include: 'Locked',
     * 'Unlocked'.
     */
    @JsonProperty(value = "properties.leaseStatus", access = JsonProperty.Access.WRITE_ONLY)
    private LeaseStatus leaseStatus;

    /**
     * Lease state of the container. Possible values include: 'Available',
     * 'Leased', 'Expired', 'Breaking', 'Broken'.
     */
    @JsonProperty(value = "properties.leaseState", access = JsonProperty.Access.WRITE_ONLY)
    private LeaseState leaseState;

    /**
     * Specifies whether the lease on a container is of infinite or fixed
     * duration, only when the container is leased. Possible values include:
     * 'Infinite', 'Fixed'.
     */
    @JsonProperty(value = "properties.leaseDuration", access = JsonProperty.Access.WRITE_ONLY)
    private LeaseDuration leaseDuration;

    /**
     * A name-value pair to associate with the container as metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /**
     * The ImmutabilityPolicy property of the container.
     */
    @JsonProperty(value = "properties.immutabilityPolicy", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyProperties immutabilityPolicy;

    /**
     * The LegalHold property of the container.
     */
    @JsonProperty(value = "properties.legalHold", access = JsonProperty.Access.WRITE_ONLY)
    private LegalHoldProperties legalHold;

    /**
     * The hasLegalHold public property is set to true by SRP if there are at
     * least one existing tag. The hasLegalHold public property is set to false
     * by SRP if all existing legal hold tags are cleared out. There can be a
     * maximum of 1000 blob containers with hasLegalHold=true for a given
     * account.
     */
    @JsonProperty(value = "properties.hasLegalHold", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasLegalHold;

    /**
     * The hasImmutabilityPolicy public property is set to true by SRP if
     * ImmutabilityPolicy has been created for this container. The
     * hasImmutabilityPolicy public property is set to false by SRP if
     * ImmutabilityPolicy has not been created for this container.
     */
    @JsonProperty(value = "properties.hasImmutabilityPolicy", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasImmutabilityPolicy;

    /**
     * Get default the container to use specified encryption scope for all writes.
     *
     * @return the defaultEncryptionScope value
     */
    public String defaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }

    /**
     * Set default the container to use specified encryption scope for all writes.
     *
     * @param defaultEncryptionScope the defaultEncryptionScope value to set
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withDefaultEncryptionScope(String defaultEncryptionScope) {
        this.defaultEncryptionScope = defaultEncryptionScope;
        return this;
    }

    /**
     * Get block override of encryption scope from the container default.
     *
     * @return the denyEncryptionScopeOverride value
     */
    public Boolean denyEncryptionScopeOverride() {
        return this.denyEncryptionScopeOverride;
    }

    /**
     * Set block override of encryption scope from the container default.
     *
     * @param denyEncryptionScopeOverride the denyEncryptionScopeOverride value to set
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride) {
        this.denyEncryptionScopeOverride = denyEncryptionScopeOverride;
        return this;
    }

    /**
     * Get specifies whether data in the container may be accessed publicly and the level of access. Possible values include: 'Container', 'Blob', 'None'.
     *
     * @return the publicAccess value
     */
    public PublicAccess publicAccess() {
        return this.publicAccess;
    }

    /**
     * Set specifies whether data in the container may be accessed publicly and the level of access. Possible values include: 'Container', 'Blob', 'None'.
     *
     * @param publicAccess the publicAccess value to set
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withPublicAccess(PublicAccess publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * Get returns the date and time the container was last modified.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the lease status of the container. Possible values include: 'Locked', 'Unlocked'.
     *
     * @return the leaseStatus value
     */
    public LeaseStatus leaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Get lease state of the container. Possible values include: 'Available', 'Leased', 'Expired', 'Breaking', 'Broken'.
     *
     * @return the leaseState value
     */
    public LeaseState leaseState() {
        return this.leaseState;
    }

    /**
     * Get specifies whether the lease on a container is of infinite or fixed duration, only when the container is leased. Possible values include: 'Infinite', 'Fixed'.
     *
     * @return the leaseDuration value
     */
    public LeaseDuration leaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Get a name-value pair to associate with the container as metadata.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set a name-value pair to associate with the container as metadata.
     *
     * @param metadata the metadata value to set
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the ImmutabilityPolicy property of the container.
     *
     * @return the immutabilityPolicy value
     */
    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.immutabilityPolicy;
    }

    /**
     * Get the LegalHold property of the container.
     *
     * @return the legalHold value
     */
    public LegalHoldProperties legalHold() {
        return this.legalHold;
    }

    /**
     * Get the hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Get the hasImmutabilityPolicy public property is set to true by SRP if ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false by SRP if ImmutabilityPolicy has not been created for this container.
     *
     * @return the hasImmutabilityPolicy value
     */
    public Boolean hasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }

}
