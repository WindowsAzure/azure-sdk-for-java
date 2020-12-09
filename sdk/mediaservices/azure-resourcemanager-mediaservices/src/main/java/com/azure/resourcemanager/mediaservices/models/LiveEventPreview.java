// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Live event preview settings. */
@Fluent
public final class LiveEventPreview {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LiveEventPreview.class);

    /*
     * The endpoints for preview. Do not share the preview URL with the live
     * event audience.
     */
    @JsonProperty(value = "endpoints")
    private List<LiveEventEndpoint> endpoints;

    /*
     * The access control for live event preview.
     */
    @JsonProperty(value = "accessControl")
    private LiveEventPreviewAccessControl accessControl;

    /*
     * The identifier of the preview locator in Guid format. Specifying this at
     * creation time allows the caller to know the preview locator url before
     * the event is created. If omitted, the service will generate a random
     * identifier. This value cannot be updated once the live event is created.
     */
    @JsonProperty(value = "previewLocator")
    private String previewLocator;

    /*
     * The name of streaming policy used for the live event preview. This value
     * is specified at creation time and cannot be updated.
     */
    @JsonProperty(value = "streamingPolicyName")
    private String streamingPolicyName;

    /*
     * An alternative media identifier associated with the streaming locator
     * created for the preview. This value is specified at creation time and
     * cannot be updated. The identifier can be used in the
     * CustomLicenseAcquisitionUrlTemplate or the
     * CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the
     * StreamingPolicyName field.
     */
    @JsonProperty(value = "alternativeMediaId")
    private String alternativeMediaId;

    /**
     * Get the endpoints property: The endpoints for preview. Do not share the preview URL with the live event audience.
     *
     * @return the endpoints value.
     */
    public List<LiveEventEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints for preview. Do not share the preview URL with the live event audience.
     *
     * @param endpoints the endpoints value to set.
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withEndpoints(List<LiveEventEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the accessControl property: The access control for live event preview.
     *
     * @return the accessControl value.
     */
    public LiveEventPreviewAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the accessControl property: The access control for live event preview.
     *
     * @param accessControl the accessControl value to set.
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withAccessControl(LiveEventPreviewAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get the previewLocator property: The identifier of the preview locator in Guid format. Specifying this at
     * creation time allows the caller to know the preview locator url before the event is created. If omitted, the
     * service will generate a random identifier. This value cannot be updated once the live event is created.
     *
     * @return the previewLocator value.
     */
    public String previewLocator() {
        return this.previewLocator;
    }

    /**
     * Set the previewLocator property: The identifier of the preview locator in Guid format. Specifying this at
     * creation time allows the caller to know the preview locator url before the event is created. If omitted, the
     * service will generate a random identifier. This value cannot be updated once the live event is created.
     *
     * @param previewLocator the previewLocator value to set.
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withPreviewLocator(String previewLocator) {
        this.previewLocator = previewLocator;
        return this;
    }

    /**
     * Get the streamingPolicyName property: The name of streaming policy used for the live event preview. This value is
     * specified at creation time and cannot be updated.
     *
     * @return the streamingPolicyName value.
     */
    public String streamingPolicyName() {
        return this.streamingPolicyName;
    }

    /**
     * Set the streamingPolicyName property: The name of streaming policy used for the live event preview. This value is
     * specified at creation time and cannot be updated.
     *
     * @param streamingPolicyName the streamingPolicyName value to set.
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withStreamingPolicyName(String streamingPolicyName) {
        this.streamingPolicyName = streamingPolicyName;
        return this;
    }

    /**
     * Get the alternativeMediaId property: An alternative media identifier associated with the streaming locator
     * created for the preview. This value is specified at creation time and cannot be updated. The identifier can be
     * used in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy
     * specified in the StreamingPolicyName field.
     *
     * @return the alternativeMediaId value.
     */
    public String alternativeMediaId() {
        return this.alternativeMediaId;
    }

    /**
     * Set the alternativeMediaId property: An alternative media identifier associated with the streaming locator
     * created for the preview. This value is specified at creation time and cannot be updated. The identifier can be
     * used in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy
     * specified in the StreamingPolicyName field.
     *
     * @param alternativeMediaId the alternativeMediaId value to set.
     * @return the LiveEventPreview object itself.
     */
    public LiveEventPreview withAlternativeMediaId(String alternativeMediaId) {
        this.alternativeMediaId = alternativeMediaId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (accessControl() != null) {
            accessControl().validate();
        }
    }
}
