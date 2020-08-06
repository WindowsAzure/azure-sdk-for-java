/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.RecommendationRuleInner;
import java.util.List;
import java.util.UUID;

/**
 * Type representing RecommendationRule.
 */
public interface RecommendationRule extends HasInner<RecommendationRuleInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the actionName value.
     */
    String actionName();

    /**
     * @return the bladeName value.
     */
    String bladeName();

    /**
     * @return the categoryTags value.
     */
    List<String> categoryTags();

    /**
     * @return the channels value.
     */
    Channels channels();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the extensionName value.
     */
    String extensionName();

    /**
     * @return the forwardLink value.
     */
    String forwardLink();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isDynamic value.
     */
    Boolean isDynamic();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the level value.
     */
    NotificationLevel level();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recommendationId value.
     */
    UUID recommendationId();

    /**
     * @return the recommendationName value.
     */
    String recommendationName();

    /**
     * @return the type value.
     */
    String type();

}
