// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.AccessRightsDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.SharedAccessSignatureAuthorizationRuleAccessRightsDescription;

public final class SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionImpl
    implements SharedAccessSignatureAuthorizationRuleAccessRightsDescription {
    private SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner innerObject;

    private final IotDpsManager serviceManager;

    public SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionImpl(
        SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner innerObject, IotDpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public AccessRightsDescription rights() {
        return this.innerModel().rights();
    }

    public SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner innerModel() {
        return this.innerObject;
    }

    private IotDpsManager manager() {
        return this.serviceManager;
    }
}
