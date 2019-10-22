// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.models;

/**
 * This class contains values which will restrict the successful operation of a variety of requests to the conditions
 * present. These conditions are entirely optional. The entire object or any of its properties may be set to null when
 * passed to a method to indicate that those conditions are not desired. Please refer to the type of each field for more
 * information on those particular access conditions.
 */
public class FileSystemAccessConditions {
    private ModifiedAccessConditions modifiedAccessConditions;
    private LeaseAccessConditions leaseAccessConditions;

    /**
     * Creates an instance which has fields set to non-null, empty values.
     */
    public FileSystemAccessConditions() {
    }

    /**
     * Standard HTTP Access conditions related to the modification of data. ETag and LastModifiedTime are used to
     * construct conditions related to when the blob was changed relative to the given request. The request
     * will fail if the specified condition is not satisfied.
     *
     * @return the modified access conditions
     */
    public ModifiedAccessConditions getModifiedAccessConditions() {
        return modifiedAccessConditions;
    }

    /**
     * Standard HTTP Access conditions related to the modification of data. ETag and LastModifiedTime are used to
     * construct conditions related to when the blob was changed relative to the given request. The request
     * will fail if the specified condition is not satisfied.
     *
     * @param modifiedAccessConditions the modified access conditions to set
     * @return the updated FileSystemAccessConditions object
     */
    public FileSystemAccessConditions setModifiedAccessConditions(ModifiedAccessConditions modifiedAccessConditions) {
        this.modifiedAccessConditions = modifiedAccessConditions;
        return this;
    }

    /**
     * By setting lease access conditions, requests will fail if the provided lease does not match the active lease on
     * the path.
     *
     * @return the lease access conditions
     */
    public LeaseAccessConditions getLeaseAccessConditions() {
        return leaseAccessConditions;
    }

    /**
     * By setting lease access conditions, requests will fail if the provided lease does not match the active lease on
     * the path.
     *
     * @param leaseID the lease access conditions to set
     * @return the updated FileSystemAccessConditions object
     */
    public FileSystemAccessConditions setLeaseAccessConditions(LeaseAccessConditions leaseID) {
        this.leaseAccessConditions = leaseID;
        return this;
    }
}
