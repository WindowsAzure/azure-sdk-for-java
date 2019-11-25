/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.RunbookInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;
import java.util.Map;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.RunbookDraftInner;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Runbook.
 */
public interface Runbook extends HasInner<RunbookInner>, Indexable, Refreshable<Runbook>, Updatable<Runbook.Update>, HasManager<AutomationManager> {
    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the draft value.
     */
    RunbookDraft draft();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the jobCount value.
     */
    Integer jobCount();

    /**
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the logActivityTrace value.
     */
    Integer logActivityTrace();

    /**
     * @return the logProgress value.
     */
    Boolean logProgress();

    /**
     * @return the logVerbose value.
     */
    Boolean logVerbose();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputTypes value.
     */
    List<String> outputTypes();

    /**
     * @return the parameters value.
     */
    Map<String, RunbookParameter> parameters();

    /**
     * @return the provisioningState value.
     */
    RunbookProvisioningState provisioningState();

    /**
     * @return the publishContentLink value.
     */
    ContentLink publishContentLink();

    /**
     * @return the runbookType value.
     */
    RunbookTypeEnum runbookType();

    /**
     * @return the state value.
     */
    RunbookState state();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Runbook definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithAutomationAccount, DefinitionStages.WithRunbookType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Runbook definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Runbook definition.
         */
        interface Blank extends WithAutomationAccount {
        }

        /**
         * The stage of the runbook definition allowing to specify AutomationAccount.
         */
        interface WithAutomationAccount {
           /**
            * Specifies resourceGroupName, automationAccountName.
            */
            WithRunbookType withExistingAutomationAccount(String resourceGroupName, String automationAccountName);
        }

        /**
         * The stage of the runbook definition allowing to specify RunbookType.
         */
        interface WithRunbookType {
           /**
            * Specifies runbookType.
            */
            WithCreate withRunbookType(RunbookTypeEnum runbookType);
        }

        /**
         * The stage of the runbook definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the runbook definition allowing to specify Draft.
         */
        interface WithDraft {
            /**
             * Specifies draft.
             */
            WithCreate withDraft(RunbookDraftInner draft);
        }

        /**
         * The stage of the runbook definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the runbook definition allowing to specify LogActivityTrace.
         */
        interface WithLogActivityTrace {
            /**
             * Specifies logActivityTrace.
             */
            WithCreate withLogActivityTrace(Integer logActivityTrace);
        }

        /**
         * The stage of the runbook definition allowing to specify LogProgress.
         */
        interface WithLogProgress {
            /**
             * Specifies logProgress.
             */
            WithCreate withLogProgress(Boolean logProgress);
        }

        /**
         * The stage of the runbook definition allowing to specify LogVerbose.
         */
        interface WithLogVerbose {
            /**
             * Specifies logVerbose.
             */
            WithCreate withLogVerbose(Boolean logVerbose);
        }

        /**
         * The stage of the runbook definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the runbook definition allowing to specify PublishContentLink.
         */
        interface WithPublishContentLink {
            /**
             * Specifies publishContentLink.
             */
            WithCreate withPublishContentLink(ContentLink publishContentLink);
        }

        /**
         * The stage of the runbook definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Runbook>, DefinitionStages.WithDescription, DefinitionStages.WithDraft, DefinitionStages.WithLocation, DefinitionStages.WithLogActivityTrace, DefinitionStages.WithLogProgress, DefinitionStages.WithLogVerbose, DefinitionStages.WithName, DefinitionStages.WithPublishContentLink, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Runbook update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Runbook>, UpdateStages.WithDescription, UpdateStages.WithLocation, UpdateStages.WithLogActivityTrace, UpdateStages.WithLogProgress, UpdateStages.WithLogVerbose, UpdateStages.WithName, UpdateStages.WithTags {
    }

    /**
     * Grouping of Runbook update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the runbook update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the runbook update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the runbook update allowing to specify LogActivityTrace.
         */
        interface WithLogActivityTrace {
            /**
             * Specifies logActivityTrace.
             */
            Update withLogActivityTrace(Integer logActivityTrace);
        }

        /**
         * The stage of the runbook update allowing to specify LogProgress.
         */
        interface WithLogProgress {
            /**
             * Specifies logProgress.
             */
            Update withLogProgress(Boolean logProgress);
        }

        /**
         * The stage of the runbook update allowing to specify LogVerbose.
         */
        interface WithLogVerbose {
            /**
             * Specifies logVerbose.
             */
            Update withLogVerbose(Boolean logVerbose);
        }

        /**
         * The stage of the runbook update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the runbook update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
