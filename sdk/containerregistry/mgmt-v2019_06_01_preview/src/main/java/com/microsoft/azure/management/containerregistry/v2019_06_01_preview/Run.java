/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation.RunInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation.ContainerRegistryManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Run.
 */
public interface Run extends HasInner<RunInner>, Indexable, Refreshable<Run>, Updatable<Run.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the agentConfiguration value.
     */
    AgentProperties agentConfiguration();

    /**
     * @return the agentPoolName value.
     */
    String agentPoolName();

    /**
     * @return the createTime value.
     */
    DateTime createTime();

    /**
     * @return the customRegistries value.
     */
    List<String> customRegistries();

    /**
     * @return the finishTime value.
     */
    DateTime finishTime();

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
     * @return the logArtifact value.
     */
    ImageDescriptor logArtifact();

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
     * @return the runErrorMessage value.
     */
    String runErrorMessage();

    /**
     * @return the runId value.
     */
    String runId();

    /**
     * @return the runType value.
     */
    RunType runType();

    /**
     * @return the sourceRegistryAuth value.
     */
    String sourceRegistryAuth();

    /**
     * @return the sourceTrigger value.
     */
    SourceTriggerDescriptor sourceTrigger();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    RunStatus status();

    /**
     * @return the task value.
     */
    String task();

    /**
     * @return the timerTrigger value.
     */
    TimerTriggerDescriptor timerTrigger();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updateTriggerToken value.
     */
    String updateTriggerToken();

    /**
     * The template for a Run update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Run>, UpdateStages.WithIsArchiveEnabled {
    }

    /**
     * Grouping of Run update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the run update allowing to specify IsArchiveEnabled.
         */
        interface WithIsArchiveEnabled {
            /**
             * Specifies isArchiveEnabled.
             * @param isArchiveEnabled The value that indicates whether archiving is enabled or not
             * @return the next update stage
             */
            Update withIsArchiveEnabled(Boolean isArchiveEnabled);
        }

    }
}
