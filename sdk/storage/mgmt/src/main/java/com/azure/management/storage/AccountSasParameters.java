// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The AccountSasParameters model.
 */
@Fluent
public final class AccountSasParameters {
    /*
     * The signed services accessible with the account SAS. Possible values
     * include: Blob (b), Queue (q), Table (t), File (f).
     */
    @JsonProperty(value = "signedServices", required = true)
    private Services services;

    /*
     * The signed resource types that are accessible with the account SAS.
     * Service (s): Access to service-level APIs; Container (c): Access to
     * container-level APIs; Object (o): Access to object-level APIs for blobs,
     * queue messages, table entities, and files.
     */
    @JsonProperty(value = "signedResourceTypes", required = true)
    private SignedResourceTypes resourceTypes;

    /*
     * The signed permissions for the account SAS. Possible values include:
     * Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update
     * (u) and Process (p).
     */
    @JsonProperty(value = "signedPermission", required = true)
    private Permissions permissions;

    /*
     * An IP address or a range of IP addresses from which to accept requests.
     */
    @JsonProperty(value = "signedIp")
    private String iPAddressOrRange;

    /*
     * The protocol permitted for a request made with the account SAS.
     */
    @JsonProperty(value = "signedProtocol")
    private HttpProtocol protocols;

    /*
     * The time at which the SAS becomes valid.
     */
    @JsonProperty(value = "signedStart")
    private OffsetDateTime sharedAccessStartTime;

    /*
     * The time at which the shared access signature becomes invalid.
     */
    @JsonProperty(value = "signedExpiry", required = true)
    private OffsetDateTime sharedAccessExpiryTime;

    /*
     * The key to sign the account SAS token with.
     */
    @JsonProperty(value = "keyToSign")
    private String keyToSign;

    /**
     * Get the services property: The signed services accessible with the
     * account SAS. Possible values include: Blob (b), Queue (q), Table (t),
     * File (f).
     * 
     * @return the services value.
     */
    public Services getServices() {
        return this.services;
    }

    /**
     * Set the services property: The signed services accessible with the
     * account SAS. Possible values include: Blob (b), Queue (q), Table (t),
     * File (f).
     * 
     * @param services the services value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setServices(Services services) {
        this.services = services;
        return this;
    }

    /**
     * Get the resourceTypes property: The signed resource types that are
     * accessible with the account SAS. Service (s): Access to service-level
     * APIs; Container (c): Access to container-level APIs; Object (o): Access
     * to object-level APIs for blobs, queue messages, table entities, and
     * files.
     * 
     * @return the resourceTypes value.
     */
    public SignedResourceTypes getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: The signed resource types that are
     * accessible with the account SAS. Service (s): Access to service-level
     * APIs; Container (c): Access to container-level APIs; Object (o): Access
     * to object-level APIs for blobs, queue messages, table entities, and
     * files.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setResourceTypes(SignedResourceTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the permissions property: The signed permissions for the account
     * SAS. Possible values include: Read (r), Write (w), Delete (d), List (l),
     * Add (a), Create (c), Update (u) and Process (p).
     * 
     * @return the permissions value.
     */
    public Permissions getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The signed permissions for the account
     * SAS. Possible values include: Read (r), Write (w), Delete (d), List (l),
     * Add (a), Create (c), Update (u) and Process (p).
     * 
     * @param permissions the permissions value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setPermissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the iPAddressOrRange property: An IP address or a range of IP
     * addresses from which to accept requests.
     * 
     * @return the iPAddressOrRange value.
     */
    public String getIPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    /**
     * Set the iPAddressOrRange property: An IP address or a range of IP
     * addresses from which to accept requests.
     * 
     * @param iPAddressOrRange the iPAddressOrRange value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setIPAddressOrRange(String iPAddressOrRange) {
        this.iPAddressOrRange = iPAddressOrRange;
        return this;
    }

    /**
     * Get the protocols property: The protocol permitted for a request made
     * with the account SAS.
     * 
     * @return the protocols value.
     */
    public HttpProtocol getProtocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: The protocol permitted for a request made
     * with the account SAS.
     * 
     * @param protocols the protocols value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setProtocols(HttpProtocol protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the sharedAccessStartTime property: The time at which the SAS
     * becomes valid.
     * 
     * @return the sharedAccessStartTime value.
     */
    public OffsetDateTime getSharedAccessStartTime() {
        return this.sharedAccessStartTime;
    }

    /**
     * Set the sharedAccessStartTime property: The time at which the SAS
     * becomes valid.
     * 
     * @param sharedAccessStartTime the sharedAccessStartTime value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setSharedAccessStartTime(OffsetDateTime sharedAccessStartTime) {
        this.sharedAccessStartTime = sharedAccessStartTime;
        return this;
    }

    /**
     * Get the sharedAccessExpiryTime property: The time at which the shared
     * access signature becomes invalid.
     * 
     * @return the sharedAccessExpiryTime value.
     */
    public OffsetDateTime getSharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime;
    }

    /**
     * Set the sharedAccessExpiryTime property: The time at which the shared
     * access signature becomes invalid.
     * 
     * @param sharedAccessExpiryTime the sharedAccessExpiryTime value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setSharedAccessExpiryTime(OffsetDateTime sharedAccessExpiryTime) {
        this.sharedAccessExpiryTime = sharedAccessExpiryTime;
        return this;
    }

    /**
     * Get the keyToSign property: The key to sign the account SAS token with.
     * 
     * @return the keyToSign value.
     */
    public String getKeyToSign() {
        return this.keyToSign;
    }

    /**
     * Set the keyToSign property: The key to sign the account SAS token with.
     * 
     * @param keyToSign the keyToSign value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters setKeyToSign(String keyToSign) {
        this.keyToSign = keyToSign;
        return this;
    }
}
