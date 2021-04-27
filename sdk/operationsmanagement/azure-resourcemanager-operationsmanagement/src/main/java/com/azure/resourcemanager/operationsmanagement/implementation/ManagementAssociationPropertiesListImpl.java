// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.implementation;

import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationInner;
import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationPropertiesListInner;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociation;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociationPropertiesList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ManagementAssociationPropertiesListImpl implements ManagementAssociationPropertiesList {
    private ManagementAssociationPropertiesListInner innerObject;

    private final com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager;

    ManagementAssociationPropertiesListImpl(
        ManagementAssociationPropertiesListInner innerObject,
        com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ManagementAssociation> value() {
        List<ManagementAssociationInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ManagementAssociationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ManagementAssociationPropertiesListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationsmanagement.OperationsManagementManager manager() {
        return this.serviceManager;
    }
}
