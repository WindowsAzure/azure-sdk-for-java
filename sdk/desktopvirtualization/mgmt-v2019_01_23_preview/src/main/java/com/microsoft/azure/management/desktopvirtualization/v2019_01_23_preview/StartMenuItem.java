/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation.StartMenuItemInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation.DesktopVirtualizationManager;

/**
 * Type representing StartMenuItem.
 */
public interface StartMenuItem extends HasInner<StartMenuItemInner>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the appAlias value.
     */
    String appAlias();

    /**
     * @return the commandLineArguments value.
     */
    String commandLineArguments();

    /**
     * @return the filePath value.
     */
    String filePath();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the iconIndex value.
     */
    Integer iconIndex();

    /**
     * @return the iconPath value.
     */
    String iconPath();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
