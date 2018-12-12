/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.RecommendedActionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import java.util.Map;
import java.util.List;

/**
 * Type representing RecommendedAction.
 */
public interface RecommendedAction extends HasInner<RecommendedActionInner>, Indexable, Refreshable<RecommendedAction>, Updatable<RecommendedAction.Update>, HasManager<SqlManager> {
    /**
     * @return the details value.
     */
    Map<String, Object> details();

    /**
     * @return the errorDetails value.
     */
    RecommendedActionErrorInfo errorDetails();

    /**
     * @return the estimatedImpact value.
     */
    List<RecommendedActionImpactRecord> estimatedImpact();

    /**
     * @return the executeActionDuration value.
     */
    String executeActionDuration();

    /**
     * @return the executeActionInitiatedBy value.
     */
    RecommendedActionInitiatedBy executeActionInitiatedBy();

    /**
     * @return the executeActionInitiatedTime value.
     */
    DateTime executeActionInitiatedTime();

    /**
     * @return the executeActionStartTime value.
     */
    DateTime executeActionStartTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the implementationDetails value.
     */
    RecommendedActionImplementationInfo implementationDetails();

    /**
     * @return the isArchivedAction value.
     */
    Boolean isArchivedAction();

    /**
     * @return the isExecutableAction value.
     */
    Boolean isExecutableAction();

    /**
     * @return the isRevertableAction value.
     */
    Boolean isRevertableAction();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastRefresh value.
     */
    DateTime lastRefresh();

    /**
     * @return the linkedObjects value.
     */
    List<String> linkedObjects();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the observedImpact value.
     */
    List<RecommendedActionImpactRecord> observedImpact();

    /**
     * @return the recommendationReason value.
     */
    String recommendationReason();

    /**
     * @return the revertActionDuration value.
     */
    String revertActionDuration();

    /**
     * @return the revertActionInitiatedBy value.
     */
    RecommendedActionInitiatedBy revertActionInitiatedBy();

    /**
     * @return the revertActionInitiatedTime value.
     */
    DateTime revertActionInitiatedTime();

    /**
     * @return the revertActionStartTime value.
     */
    DateTime revertActionStartTime();

    /**
     * @return the score value.
     */
    Integer score();

    /**
     * @return the state value.
     */
    RecommendedActionStateInfo state();

    /**
     * @return the timeSeries value.
     */
    List<RecommendedActionMetricInfo> timeSeries();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the validSince value.
     */
    DateTime validSince();

    /**
     * The template for a RecommendedAction update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RecommendedAction>, UpdateStages.WithState {
    }

    /**
     * Grouping of RecommendedAction update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the recommendedaction update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            Update withState(RecommendedActionStateInfo state);
        }

    }
}
