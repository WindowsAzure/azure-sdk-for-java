/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.PushSettingsInner;

/**
 * Type representing PushSettings.
 */
public interface PushSettings extends HasInner<PushSettingsInner>, HasManager<AppServiceManager> {
    /**
     * @return the dynamicTagsJson value.
     */
    String dynamicTagsJson();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isPushEnabled value.
     */
    boolean isPushEnabled();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tagsRequiringAuth value.
     */
    String tagsRequiringAuth();

    /**
     * @return the tagWhitelistJson value.
     */
    String tagWhitelistJson();

    /**
     * @return the type value.
     */
    String type();

}
