/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.devspaces.v2018_06_01_preview.ControllerConnectionDetailsList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.devspaces.v2018_06_01_preview.ControllerConnectionDetails;

class ControllerConnectionDetailsListImpl extends WrapperImpl<ControllerConnectionDetailsListInner> implements ControllerConnectionDetailsList {
    private final DevSpacesManager manager;
    ControllerConnectionDetailsListImpl(ControllerConnectionDetailsListInner inner, DevSpacesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevSpacesManager manager() {
        return this.manager;
    }

    @Override
    public List<ControllerConnectionDetails> connectionDetailsList() {
        return this.inner().connectionDetailsList();
    }

}
