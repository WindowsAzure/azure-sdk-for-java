/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.TriggeredWebJobInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;
import java.util.Map;

/**
 * Type representing TriggeredWebJob.
 */
public interface TriggeredWebJob extends HasInner<TriggeredWebJobInner>, Indexable, Refreshable<TriggeredWebJob>, HasManager<AppServiceManager> {
    /**
     * @return the error value.
     */
    String error();

    /**
     * @return the extraInfoUrl value.
     */
    String extraInfoUrl();

    /**
     * @return the historyUrl value.
     */
    String historyUrl();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the latestRun value.
     */
    TriggeredJobRun latestRun();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the runCommand value.
     */
    String runCommand();

    /**
     * @return the schedulerLogsUrl value.
     */
    String schedulerLogsUrl();

    /**
     * @return the settings value.
     */
    Map<String, Object> settings();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the url value.
     */
    String url();

    /**
     * @return the usingSdk value.
     */
    Boolean usingSdk();

    /**
     * @return the webJobType value.
     */
    WebJobType webJobType();

}
