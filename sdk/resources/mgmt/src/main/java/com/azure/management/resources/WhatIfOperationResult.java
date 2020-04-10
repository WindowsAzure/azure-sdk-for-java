// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.fluentcore.model.HasInner;
import com.azure.management.resources.models.WhatIfOperationResultInner;

import java.util.List;

/**
 * An immutable client-side representation of an Azure deployment What-if operation result.
 */
@Fluent
public interface WhatIfOperationResult extends
        HasInner<WhatIfOperationResultInner> {

    /**
     * @return status of the What-If operation.
     */
    String status();

    /*
     * List of resource changes predicted by What-If operation.
     */
    List<WhatIfChange> changes();

    /**
     * @return error when What-If operation fails.
     */
    ErrorResponse error();
}
