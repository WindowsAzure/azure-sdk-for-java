// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.models;

import com.azure.core.implementation.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Properties of a file system.
 */
public final class FileSystemProperties {
    /*
     * The lastModified property.
     */
    private DateTimeRfc1123 lastModified;

    /*
     * The etag property.
     */
    private String etag;

    /*
     * Possible values include: 'locked', 'unlocked'
     */
    private LeaseStatusType leaseStatus;

    /*
     * Possible values include: 'available', 'leased', 'expired', 'breaking',
     * 'broken'
     */
    private LeaseStateType leaseState;

    /*
     * Possible values include: 'infinite', 'fixed'
     */
    private LeaseDurationType leaseDuration;

    /*
     * Possible values include: 'container', 'blob'
     */
    private PublicAccessType publicAccess;

    /*
     * The hasImmutabilityPolicy property.
     */
    private Boolean hasImmutabilityPolicy;

    /*
     * The hasLegalHold property.
     */
    private Boolean hasLegalHold;

    /**
     * Get the lastModified property: The lastModified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The lastModified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the etag property: The etag property.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag property.
     *
     * @param etag the etag value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the leaseStatus property: Possible values include: 'locked',
     * 'unlocked'.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatusType getLeaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus property: Possible values include: 'locked',
     * 'unlocked'.
     *
     * @param leaseStatus the leaseStatus value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the leaseState property: Possible values include: 'available',
     * 'leased', 'expired', 'breaking', 'broken'.
     *
     * @return the leaseState value.
     */
    public LeaseStateType getLeaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState property: Possible values include: 'available',
     * 'leased', 'expired', 'breaking', 'broken'.
     *
     * @param leaseState the leaseState value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseDuration property: Possible values include: 'infinite',
     * 'fixed'.
     *
     * @return the leaseDuration value.
     */
    public LeaseDurationType getLeaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: Possible values include: 'infinite',
     * 'fixed'.
     *
     * @param leaseDuration the leaseDuration value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the publicAccess property: Possible values include: 'container',
     * 'blob'.
     *
     * @return the publicAccess value.
     */
    public PublicAccessType getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * Set the publicAccess property: Possible values include: 'container',
     * 'blob'.
     *
     * @param publicAccess the publicAccess value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setPublicAccess(PublicAccessType publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * Get the hasImmutabilityPolicy property: The hasImmutabilityPolicy
     * property.
     *
     * @return the hasImmutabilityPolicy value.
     */
    public Boolean isHasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }

    /**
     * Set the hasImmutabilityPolicy property: The hasImmutabilityPolicy
     * property.
     *
     * @param hasImmutabilityPolicy the hasImmutabilityPolicy value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setHasImmutabilityPolicy(Boolean hasImmutabilityPolicy) {
        this.hasImmutabilityPolicy = hasImmutabilityPolicy;
        return this;
    }

    /**
     * Get the hasLegalHold property: The hasLegalHold property.
     *
     * @return the hasLegalHold value.
     */
    public Boolean isHasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Set the hasLegalHold property: The hasLegalHold property.
     *
     * @param hasLegalHold the hasLegalHold value to set.
     * @return the FileSystemProperties object itself.
     */
    public FileSystemProperties setHasLegalHold(Boolean hasLegalHold) {
        this.hasLegalHold = hasLegalHold;
        return this;
    }
}
