/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.CommandPropertiesInner;
import java.util.List;

/**
 * Type representing CommandProperties.
 */
public interface CommandProperties extends HasInner<CommandPropertiesInner>, HasManager<DataMigrationManager> {
    /**
     * @return the errors value.
     */
    List<ODataError> errors();

    /**
     * @return the state value.
     */
    CommandState state();

}
