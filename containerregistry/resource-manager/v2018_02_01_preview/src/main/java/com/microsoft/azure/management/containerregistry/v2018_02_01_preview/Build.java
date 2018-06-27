/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.BuildInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.ContainerRegistryManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Build.
 */
public interface Build extends HasInner<BuildInner>, Indexable, Refreshable<Build>, Updatable<Build.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the buildId value.
     */
    String buildId();

    /**
     * @return the buildTask value.
     */
    String buildTask();

    /**
     * @return the buildType value.
     */
    BuildType buildType();

    /**
     * @return the createTime value.
     */
    DateTime createTime();

    /**
     * @return the finishTime value.
     */
    DateTime finishTime();

    /**
     * @return the gitCommitTrigger value.
     */
    GitCommitTrigger gitCommitTrigger();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the imageUpdateTrigger value.
     */
    ImageUpdateTrigger imageUpdateTrigger();

    /**
     * @return the isArchiveEnabled value.
     */
    Boolean isArchiveEnabled();

    /**
     * @return the lastUpdatedTime value.
     */
    DateTime lastUpdatedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputImages value.
     */
    List<ImageDescriptor> outputImages();

    /**
     * @return the platform value.
     */
    PlatformProperties platform();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    BuildStatus status();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a Build update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Build> {
    }

    /**
     * Grouping of Build update stages.
     */
    interface UpdateStages {
    }
}
