/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for updating a snapshot, with a combination of user defined
 * apply scope and user specified data.
 */
public class UpdateSnapshotRequest {
    /**
     * Array of the target Face subscription ids for the snapshot, specified by
     * the user who created the snapshot when calling Snapshot - Take. For each
     * snapshot, only subscriptions included in the applyScope of Snapshot -
     * Take can apply it.
     */
    @JsonProperty(value = "applyScope")
    private List<UUID> applyScope;

    /**
     * User specified data about the snapshot for any purpose. Length should
     * not exceed 16KB.
     */
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Get array of the target Face subscription ids for the snapshot, specified by the user who created the snapshot when calling Snapshot - Take. For each snapshot, only subscriptions included in the applyScope of Snapshot - Take can apply it.
     *
     * @return the applyScope value
     */
    public List<UUID> applyScope() {
        return this.applyScope;
    }

    /**
     * Set array of the target Face subscription ids for the snapshot, specified by the user who created the snapshot when calling Snapshot - Take. For each snapshot, only subscriptions included in the applyScope of Snapshot - Take can apply it.
     *
     * @param applyScope the applyScope value to set
     * @return the UpdateSnapshotRequest object itself.
     */
    public UpdateSnapshotRequest withApplyScope(List<UUID> applyScope) {
        this.applyScope = applyScope;
        return this;
    }

    /**
     * Get user specified data about the snapshot for any purpose. Length should not exceed 16KB.
     *
     * @return the userData value
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set user specified data about the snapshot for any purpose. Length should not exceed 16KB.
     *
     * @param userData the userData value to set
     * @return the UpdateSnapshotRequest object itself.
     */
    public UpdateSnapshotRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

}
