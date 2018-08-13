/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Live Event preview.
 */
public class LiveEventPreview {
    /**
     * The endpoints for preview.
     */
    @JsonProperty(value = "endpoints")
    private List<LiveEventEndpoint> endpoints;

    /**
     * The access control for LiveEvent preview.
     */
    @JsonProperty(value = "accessControl")
    private LiveEventPreviewAccessControl accessControl;

    /**
     * The preview locator Guid.
     */
    @JsonProperty(value = "previewLocator")
    private String previewLocator;

    /**
     * The name of streaming policy used for LiveEvent preview.
     */
    @JsonProperty(value = "streamingPolicyName")
    private String streamingPolicyName;

    /**
     * An Alternative Media Identifier associated with the preview url.  This
     * identifier can be used to distinguish the preview of different live
     * events for authorization purposes in the
     * CustomLicenseAcquisitionUrlTemplate or the
     * CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the
     * StreamingPolicyName field.
     */
    @JsonProperty(value = "alternativeMediaId")
    private String alternativeMediaId;

    /**
     * Get the endpoints for preview.
     *
     * @return the endpoints value
     */
    public List<LiveEventEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints for preview.
     *
     * @param endpoints the endpoints value to set
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withEndpoints(List<LiveEventEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the access control for LiveEvent preview.
     *
     * @return the accessControl value
     */
    public LiveEventPreviewAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the access control for LiveEvent preview.
     *
     * @param accessControl the accessControl value to set
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withAccessControl(LiveEventPreviewAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get the preview locator Guid.
     *
     * @return the previewLocator value
     */
    public String previewLocator() {
        return this.previewLocator;
    }

    /**
     * Set the preview locator Guid.
     *
     * @param previewLocator the previewLocator value to set
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withPreviewLocator(String previewLocator) {
        this.previewLocator = previewLocator;
        return this;
    }

    /**
     * Get the name of streaming policy used for LiveEvent preview.
     *
     * @return the streamingPolicyName value
     */
    public String streamingPolicyName() {
        return this.streamingPolicyName;
    }

    /**
     * Set the name of streaming policy used for LiveEvent preview.
     *
     * @param streamingPolicyName the streamingPolicyName value to set
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withStreamingPolicyName(String streamingPolicyName) {
        this.streamingPolicyName = streamingPolicyName;
        return this;
    }

    /**
     * Get an Alternative Media Identifier associated with the preview url.  This identifier can be used to distinguish the preview of different live events for authorization purposes in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the StreamingPolicyName field.
     *
     * @return the alternativeMediaId value
     */
    public String alternativeMediaId() {
        return this.alternativeMediaId;
    }

    /**
     * Set an Alternative Media Identifier associated with the preview url.  This identifier can be used to distinguish the preview of different live events for authorization purposes in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the StreamingPolicyName field.
     *
     * @param alternativeMediaId the alternativeMediaId value to set
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withAlternativeMediaId(String alternativeMediaId) {
        this.alternativeMediaId = alternativeMediaId;
        return this;
    }

}
