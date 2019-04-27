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
 * Request body for taking snapshot operation.
 */
public class TakeSnapshotRequest {
    /**
     * User specified type for the source object to take snapshot from.
     * Currently FaceList, PersonGroup, LargeFaceList and LargePersonGroup are
     * supported. Possible values include: 'FaceList', 'LargeFaceList',
     * 'LargePersonGroup', 'PersonGroup'.
     */
    @JsonProperty(value = "type", required = true)
    private SnapshotObjectType type;

    /**
     * User specified source object id to take snapshot from.
     */
    @JsonProperty(value = "objectId", required = true)
    private String objectId;

    /**
     * User specified array of target Face subscription ids for the snapshot.
     * For each snapshot, only subscriptions included in the applyScope of
     * Snapshot - Take can apply it.
     */
    @JsonProperty(value = "applyScope", required = true)
    private List<UUID> applyScope;

    /**
     * User specified data about the snapshot for any purpose. Length should
     * not exceed 16KB.
     */
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Get user specified type for the source object to take snapshot from. Currently FaceList, PersonGroup, LargeFaceList and LargePersonGroup are supported. Possible values include: 'FaceList', 'LargeFaceList', 'LargePersonGroup', 'PersonGroup'.
     *
     * @return the type value
     */
    public SnapshotObjectType type() {
        return this.type;
    }

    /**
     * Set user specified type for the source object to take snapshot from. Currently FaceList, PersonGroup, LargeFaceList and LargePersonGroup are supported. Possible values include: 'FaceList', 'LargeFaceList', 'LargePersonGroup', 'PersonGroup'.
     *
     * @param type the type value to set
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest withType(SnapshotObjectType type) {
        this.type = type;
        return this;
    }

    /**
     * Get user specified source object id to take snapshot from.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set user specified source object id to take snapshot from.
     *
     * @param objectId the objectId value to set
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get user specified array of target Face subscription ids for the snapshot. For each snapshot, only subscriptions included in the applyScope of Snapshot - Take can apply it.
     *
     * @return the applyScope value
     */
    public List<UUID> applyScope() {
        return this.applyScope;
    }

    /**
     * Set user specified array of target Face subscription ids for the snapshot. For each snapshot, only subscriptions included in the applyScope of Snapshot - Take can apply it.
     *
     * @param applyScope the applyScope value to set
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest withApplyScope(List<UUID> applyScope) {
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
     * @return the TakeSnapshotRequest object itself.
     */
    public TakeSnapshotRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

}
