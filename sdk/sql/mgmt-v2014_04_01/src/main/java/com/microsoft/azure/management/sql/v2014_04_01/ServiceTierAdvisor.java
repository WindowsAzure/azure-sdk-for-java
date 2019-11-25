/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ServiceTierAdvisorInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing ServiceTierAdvisor.
 */
public interface ServiceTierAdvisor extends HasInner<ServiceTierAdvisorInner>, Indexable, Refreshable<ServiceTierAdvisor>, HasManager<SqlManager> {
    /**
     * @return the activeTimeRatio value.
     */
    Double activeTimeRatio();

    /**
     * @return the avgDtu value.
     */
    Double avgDtu();

    /**
     * @return the confidence value.
     */
    double confidence();

    /**
     * @return the currentServiceLevelObjective value.
     */
    String currentServiceLevelObjective();

    /**
     * @return the currentServiceLevelObjectiveId value.
     */
    UUID currentServiceLevelObjectiveId();

    /**
     * @return the databaseSizeBasedRecommendationServiceLevelObjective value.
     */
    String databaseSizeBasedRecommendationServiceLevelObjective();

    /**
     * @return the databaseSizeBasedRecommendationServiceLevelObjectiveId value.
     */
    UUID databaseSizeBasedRecommendationServiceLevelObjectiveId();

    /**
     * @return the disasterPlanBasedRecommendationServiceLevelObjective value.
     */
    String disasterPlanBasedRecommendationServiceLevelObjective();

    /**
     * @return the disasterPlanBasedRecommendationServiceLevelObjectiveId value.
     */
    UUID disasterPlanBasedRecommendationServiceLevelObjectiveId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the maxDtu value.
     */
    Double maxDtu();

    /**
     * @return the maxSizeInGB value.
     */
    Double maxSizeInGB();

    /**
     * @return the minDtu value.
     */
    Double minDtu();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the observationPeriodEnd value.
     */
    DateTime observationPeriodEnd();

    /**
     * @return the observationPeriodStart value.
     */
    DateTime observationPeriodStart();

    /**
     * @return the overallRecommendationServiceLevelObjective value.
     */
    String overallRecommendationServiceLevelObjective();

    /**
     * @return the overallRecommendationServiceLevelObjectiveId value.
     */
    UUID overallRecommendationServiceLevelObjectiveId();

    /**
     * @return the serviceLevelObjectiveUsageMetrics value.
     */
    List<SloUsageMetric> serviceLevelObjectiveUsageMetrics();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageBasedRecommendationServiceLevelObjective value.
     */
    String usageBasedRecommendationServiceLevelObjective();

    /**
     * @return the usageBasedRecommendationServiceLevelObjectiveId value.
     */
    UUID usageBasedRecommendationServiceLevelObjectiveId();

}
