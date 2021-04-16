// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.ObjectDataTypesClient;
import com.azure.resourcemanager.automation.fluent.models.TypeFieldInner;
import com.azure.resourcemanager.automation.models.ObjectDataTypes;
import com.azure.resourcemanager.automation.models.TypeField;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ObjectDataTypesImpl implements ObjectDataTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectDataTypesImpl.class);

    private final ObjectDataTypesClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public ObjectDataTypesImpl(
        ObjectDataTypesClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TypeField> listFieldsByModuleAndType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName) {
        PagedIterable<TypeFieldInner> inner =
            this
                .serviceClient()
                .listFieldsByModuleAndType(resourceGroupName, automationAccountName, moduleName, typeName);
        return Utils.mapPage(inner, inner1 -> new TypeFieldImpl(inner1, this.manager()));
    }

    public PagedIterable<TypeField> listFieldsByModuleAndType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName, Context context) {
        PagedIterable<TypeFieldInner> inner =
            this
                .serviceClient()
                .listFieldsByModuleAndType(resourceGroupName, automationAccountName, moduleName, typeName, context);
        return Utils.mapPage(inner, inner1 -> new TypeFieldImpl(inner1, this.manager()));
    }

    public PagedIterable<TypeField> listFieldsByType(
        String resourceGroupName, String automationAccountName, String typeName) {
        PagedIterable<TypeFieldInner> inner =
            this.serviceClient().listFieldsByType(resourceGroupName, automationAccountName, typeName);
        return Utils.mapPage(inner, inner1 -> new TypeFieldImpl(inner1, this.manager()));
    }

    public PagedIterable<TypeField> listFieldsByType(
        String resourceGroupName, String automationAccountName, String typeName, Context context) {
        PagedIterable<TypeFieldInner> inner =
            this.serviceClient().listFieldsByType(resourceGroupName, automationAccountName, typeName, context);
        return Utils.mapPage(inner, inner1 -> new TypeFieldImpl(inner1, this.manager()));
    }

    private ObjectDataTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
