// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.fluent.models.StreamingPolicyInner;
import com.azure.resourcemanager.mediaservices.models.CommonEncryptionCbcs;
import com.azure.resourcemanager.mediaservices.models.CommonEncryptionCenc;
import com.azure.resourcemanager.mediaservices.models.EnvelopeEncryption;
import com.azure.resourcemanager.mediaservices.models.NoEncryption;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicy;
import java.time.OffsetDateTime;

public final class StreamingPolicyImpl implements StreamingPolicy, StreamingPolicy.Definition {
    private StreamingPolicyInner innerObject;

    private final MediaservicesManager serviceManager;

    public StreamingPolicyImpl(StreamingPolicyInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public String defaultContentKeyPolicyName() {
        return this.innerModel().defaultContentKeyPolicyName();
    }

    public EnvelopeEncryption envelopeEncryption() {
        return this.innerModel().envelopeEncryption();
    }

    public CommonEncryptionCenc commonEncryptionCenc() {
        return this.innerModel().commonEncryptionCenc();
    }

    public CommonEncryptionCbcs commonEncryptionCbcs() {
        return this.innerModel().commonEncryptionCbcs();
    }

    public NoEncryption noEncryption() {
        return this.innerModel().noEncryption();
    }

    public StreamingPolicyInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String streamingPolicyName;

    public StreamingPolicyImpl withExistingMediaService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public StreamingPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingPolicies()
                .createWithResponse(
                    resourceGroupName, accountName, streamingPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public StreamingPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingPolicies()
                .createWithResponse(resourceGroupName, accountName, streamingPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public StreamingPolicyImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new StreamingPolicyInner();
        this.serviceManager = serviceManager;
        this.streamingPolicyName = name;
    }

    public StreamingPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingPolicies()
                .getWithResponse(resourceGroupName, accountName, streamingPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public StreamingPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingPolicies()
                .getWithResponse(resourceGroupName, accountName, streamingPolicyName, context)
                .getValue();
        return this;
    }

    public StreamingPolicyImpl withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.innerModel().withDefaultContentKeyPolicyName(defaultContentKeyPolicyName);
        return this;
    }

    public StreamingPolicyImpl withEnvelopeEncryption(EnvelopeEncryption envelopeEncryption) {
        this.innerModel().withEnvelopeEncryption(envelopeEncryption);
        return this;
    }

    public StreamingPolicyImpl withCommonEncryptionCenc(CommonEncryptionCenc commonEncryptionCenc) {
        this.innerModel().withCommonEncryptionCenc(commonEncryptionCenc);
        return this;
    }

    public StreamingPolicyImpl withCommonEncryptionCbcs(CommonEncryptionCbcs commonEncryptionCbcs) {
        this.innerModel().withCommonEncryptionCbcs(commonEncryptionCbcs);
        return this;
    }

    public StreamingPolicyImpl withNoEncryption(NoEncryption noEncryption) {
        this.innerModel().withNoEncryption(noEncryption);
        return this;
    }
}
