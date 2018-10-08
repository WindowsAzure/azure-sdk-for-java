/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.management.mediaservices.v2018_07_01.ContentKeyPolicyProperties;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.ContentKeyPolicyOption;
import java.util.UUID;

class ContentKeyPolicyPropertiesImpl extends WrapperImpl<ContentKeyPolicyPropertiesInner> implements ContentKeyPolicyProperties {
    private final MediaManager manager;
    ContentKeyPolicyPropertiesImpl(ContentKeyPolicyPropertiesInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
    }

    @Override
    public List<ContentKeyPolicyOption> options() {
        return this.inner().options();
    }

    @Override
    public UUID policyId() {
        return this.inner().policyId();
    }

}
