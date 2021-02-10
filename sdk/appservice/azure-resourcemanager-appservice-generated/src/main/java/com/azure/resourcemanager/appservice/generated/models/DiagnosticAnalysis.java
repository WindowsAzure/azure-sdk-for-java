// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticAnalysisInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of DiagnosticAnalysis. */
public interface DiagnosticAnalysis {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the startTime property: Start time of the period.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: End time of the period.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the abnormalTimePeriods property: List of time periods.
     *
     * @return the abnormalTimePeriods value.
     */
    List<AbnormalTimePeriod> abnormalTimePeriods();

    /**
     * Gets the payload property: Data by each detector.
     *
     * @return the payload value.
     */
    List<AnalysisData> payload();

    /**
     * Gets the nonCorrelatedDetectors property: Data by each detector for detectors that did not corelate.
     *
     * @return the nonCorrelatedDetectors value.
     */
    List<DetectorDefinition> nonCorrelatedDetectors();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticAnalysisInner object.
     *
     * @return the inner object.
     */
    DiagnosticAnalysisInner innerModel();
}
