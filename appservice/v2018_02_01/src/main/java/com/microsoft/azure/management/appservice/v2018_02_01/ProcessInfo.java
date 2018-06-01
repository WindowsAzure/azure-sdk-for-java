/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.ProcessInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing ProcessInfo.
 */
public interface ProcessInfo extends HasInner<ProcessInfoInner>, Indexable, Refreshable<ProcessInfo>, HasManager<AppServiceManager> {
    /**
     * @return the children value.
     */
    List<String> children();

    /**
     * @return the commandLine value.
     */
    String commandLine();

    /**
     * @return the deploymentName value.
     */
    String deploymentName();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the environmentVariables value.
     */
    Map<String, String> environmentVariables();

    /**
     * @return the fileName value.
     */
    String fileName();

    /**
     * @return the handleCount value.
     */
    Integer handleCount();

    /**
     * @return the href value.
     */
    String href();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identifier value.
     */
    Integer identifier();

    /**
     * @return the iisProfileTimeoutInSeconds value.
     */
    Double iisProfileTimeoutInSeconds();

    /**
     * @return the isIisProfileRunning value.
     */
    Boolean isIisProfileRunning();

    /**
     * @return the isProfileRunning value.
     */
    Boolean isProfileRunning();

    /**
     * @return the isScmSite value.
     */
    Boolean isScmSite();

    /**
     * @return the isWebjob value.
     */
    Boolean isWebjob();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the minidump value.
     */
    String minidump();

    /**
     * @return the moduleCount value.
     */
    Integer moduleCount();

    /**
     * @return the modules value.
     */
    List<ProcessModuleInfo> modules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nonPagedSystemMemory value.
     */
    Long nonPagedSystemMemory();

    /**
     * @return the openFileHandles value.
     */
    List<String> openFileHandles();

    /**
     * @return the pagedMemory value.
     */
    Long pagedMemory();

    /**
     * @return the pagedSystemMemory value.
     */
    Long pagedSystemMemory();

    /**
     * @return the parent value.
     */
    String parent();

    /**
     * @return the peakPagedMemory value.
     */
    Long peakPagedMemory();

    /**
     * @return the peakVirtualMemory value.
     */
    Long peakVirtualMemory();

    /**
     * @return the peakWorkingSet value.
     */
    Long peakWorkingSet();

    /**
     * @return the privateMemory value.
     */
    Long privateMemory();

    /**
     * @return the privilegedCpuTime value.
     */
    String privilegedCpuTime();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the threadCount value.
     */
    Integer threadCount();

    /**
     * @return the threads value.
     */
    List<ProcessThreadInfo> threads();

    /**
     * @return the timeStamp value.
     */
    DateTime timeStamp();

    /**
     * @return the totalCpuTime value.
     */
    String totalCpuTime();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userCpuTime value.
     */
    String userCpuTime();

    /**
     * @return the userName value.
     */
    String userName();

    /**
     * @return the virtualMemory value.
     */
    Long virtualMemory();

    /**
     * @return the workingSet value.
     */
    Long workingSet();

}
