/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.authorization.v2015_07_01.implementation.AuthorizationManager;
import com.microsoft.azure.management.authorization.v2015_07_01.implementation.ClassicAdministratorInner;

/**
 * Type representing ClassicAdministrator.
 */
public interface ClassicAdministrator extends HasInner<ClassicAdministratorInner>, HasManager<AuthorizationManager> {
    /**
     * @return the emailAddress value.
     */
    String emailAddress();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the role value.
     */
    String role();

    /**
     * @return the type value.
     */
    String type();

}
