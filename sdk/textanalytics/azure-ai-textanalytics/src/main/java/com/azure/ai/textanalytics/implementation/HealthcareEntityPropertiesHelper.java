// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.implementation;

import com.azure.ai.textanalytics.models.EntityDataSource;
import com.azure.ai.textanalytics.models.HealthcareEntity;
import com.azure.ai.textanalytics.models.HealthcareEntityRelationType;
import com.azure.core.util.IterableStream;

import java.util.Map;

/**
 * The helper class to set the non-public properties of an {@link HealthcareEntity} instance.
 */
public final class HealthcareEntityPropertiesHelper {
    private static HealthcareEntityAccessor accessor;

    private HealthcareEntityPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link HealthcareEntity} instance.
     */
    public interface HealthcareEntityAccessor {
        void setText(HealthcareEntity healthcareEntity, String text);
        void setCategory(HealthcareEntity healthcareEntity, String category);
        void setSubcategory(HealthcareEntity healthcareEntity, String subcategory);
        void setConfidenceScore(HealthcareEntity healthcareEntity, double confidenceScore);
        void setOffset(HealthcareEntity healthcareEntity, int offset);
        void setNegated(HealthcareEntity healthcareEntity, boolean negated);
        void setDataSources(HealthcareEntity healthcareEntity, IterableStream<EntityDataSource> dataSources);
        void setRelatedEntities(HealthcareEntity healthcareEntity,
            Map<HealthcareEntity, HealthcareEntityRelationType> relatedEntities);
    }

    /**
     * The method called from {@link HealthcareEntity} to set it's accessor.
     *
     * @param healthcareEntityAccessor The accessor.
     */
    public static void setAccessor(final HealthcareEntityAccessor healthcareEntityAccessor) {
        accessor = healthcareEntityAccessor;
    }

    public static void setText(HealthcareEntity healthcareEntity, String text) {
        accessor.setText(healthcareEntity, text);
    }

    public static void setCategory(HealthcareEntity healthcareEntity, String category) {
        accessor.setCategory(healthcareEntity, category);
    }

    public static void setSubcategory(HealthcareEntity healthcareEntity, String subcategory) {
        accessor.setSubcategory(healthcareEntity, subcategory);
    }

    public static void setConfidenceScore(HealthcareEntity healthcareEntity, double confidenceScore) {
        accessor.setConfidenceScore(healthcareEntity, confidenceScore);
    }

    public static void setOffset(HealthcareEntity healthcareEntity, int offset) {
        accessor.setOffset(healthcareEntity, offset);
    }

    public static void setNegated(HealthcareEntity healthcareEntity, boolean negated) {
        accessor.setNegated(healthcareEntity, negated);
    }

    public static void setDataSources(HealthcareEntity healthcareEntity,
        IterableStream<EntityDataSource> dataSources) {
        accessor.setDataSources(healthcareEntity, dataSources);
    }

    public static void setRelatedEntities(HealthcareEntity healthcareEntity,
        Map<HealthcareEntity, HealthcareEntityRelationType> relatedEntities) {
        accessor.setRelatedEntities(healthcareEntity, relatedEntities);
    }
}
