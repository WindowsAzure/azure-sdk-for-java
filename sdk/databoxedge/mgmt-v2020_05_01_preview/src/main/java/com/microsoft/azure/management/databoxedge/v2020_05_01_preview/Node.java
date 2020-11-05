/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation.NodeInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation.DataBoxEdgeManager;

/**
 * Type representing Node.
 */
public interface Node extends HasInner<NodeInner>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nodeChassisSerialNumber value.
     */
    String nodeChassisSerialNumber();

    /**
     * @return the nodeDisplayName value.
     */
    String nodeDisplayName();

    /**
     * @return the nodeFriendlySoftwareVersion value.
     */
    String nodeFriendlySoftwareVersion();

    /**
     * @return the nodeHcsVersion value.
     */
    String nodeHcsVersion();

    /**
     * @return the nodeInstanceId value.
     */
    String nodeInstanceId();

    /**
     * @return the nodeSerialNumber value.
     */
    String nodeSerialNumber();

    /**
     * @return the nodeStatus value.
     */
    NodeStatus nodeStatus();

    /**
     * @return the type value.
     */
    String type();

}
