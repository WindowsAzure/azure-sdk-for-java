// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.resourcemanager.avs.fluent.models.ScriptCmdletInner;
import java.util.List;

/** An immutable client-side representation of ScriptCmdlet. */
public interface ScriptCmdlet {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the description property: Description of the scripts functionality.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the timeout property: Recommended time limit for execution.
     *
     * @return the timeout value.
     */
    String timeout();

    /**
     * Gets the parameters property: Parameters the script will accept.
     *
     * @return the parameters value.
     */
    List<ScriptParameter> parameters();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.ScriptCmdletInner object.
     *
     * @return the inner object.
     */
    ScriptCmdletInner innerModel();
}
