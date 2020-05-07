/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation.ApplicationGroupInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation.DesktopVirtualizationManager;
import java.util.Map;

/**
 * Type representing WorkspaceApplicationGroup.
 */
public interface WorkspaceApplicationGroup extends HasInner<ApplicationGroupInner>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the applicationGroupType value.
     */
    ApplicationGroupType applicationGroupType();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the hostPoolArmPath value.
     */
    String hostPoolArmPath();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the workspaceArmPath value.
     */
    String workspaceArmPath();

}
