/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies details of a Job Manager Task.
 * The Job Manager Task is automatically started when the Job is created. The
 * Batch service tries to schedule the Job Manager Task before any other Tasks
 * in the Job. When shrinking a Pool, the Batch service tries to preserve Nodes
 * where Job Manager Tasks are running for as long as possible (that is,
 * Compute Nodes running 'normal' Tasks are removed before Compute Nodes
 * running Job Manager Tasks). When a Job Manager Task fails and needs to be
 * restarted, the system tries to schedule it at the highest priority. If there
 * are no idle Compute Nodes available, the system may terminate one of the
 * running Tasks in the Pool and return it to the queue in order to make room
 * for the Job Manager Task to restart. Note that a Job Manager Task in one Job
 * does not have priority over Tasks in other Jobs. Across Jobs, only Job level
 * priorities are observed. For example, if a Job Manager in a priority 0 Job
 * needs to be restarted, it will not displace Tasks of a priority 1 Job. Batch
 * will retry Tasks when a recovery operation is triggered on a Node. Examples
 * of recovery operations include (but are not limited to) when an unhealthy
 * Node is rebooted or a Compute Node disappeared due to host failure. Retries
 * due to recovery operations are independent of and are not counted against
 * the maxTaskRetryCount. Even if the maxTaskRetryCount is 0, an internal retry
 * due to a recovery operation may occur. Because of this, all Tasks should be
 * idempotent. This means Tasks need to tolerate being interrupted and
 * restarted without causing any corruption or duplicate data. The best
 * practice for long running Tasks is to use some form of checkpointing.
 */
public class JobManagerTask {
    /**
     * A string that uniquely identifies the Job Manager Task within the Job.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores and cannot contain more than 64 characters.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The display name of the Job Manager Task.
     * It need not be unique and can contain any Unicode characters up to a
     * maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The command line of the Job Manager Task.
     * The command line does not run under a shell, and therefore cannot take
     * advantage of shell features such as environment variable expansion. If
     * you want to take advantage of such features, you should invoke the shell
     * in the command line, for example using "cmd /c MyCommand" in Windows or
     * "/bin/sh -c MyCommand" in Linux. If the command line refers to file
     * paths, it should use a relative path (relative to the Task working
     * directory), or use the Batch provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /**
     * The settings for the container under which the Job Manager Task runs.
     * If the Pool that will run this Task has containerConfiguration set, this
     * must be set as well. If the Pool that will run this Task doesn't have
     * containerConfiguration set, this must not be set. When this is
     * specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR
     * (the root of Azure Batch directories on the node) are mapped into the
     * container, all Task environment variables are mapped into the container,
     * and the Task command line is executed in the container. Files produced
     * in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be
     * reflected to the host disk, meaning that Batch file APIs will not be
     * able to access those files.
     */
    @JsonProperty(value = "containerSettings")
    private TaskContainerSettings containerSettings;

    /**
     * A list of files that the Batch service will download to the Compute Node
     * before running the command line.
     * Files listed under this element are located in the Task's working
     * directory. There is a maximum size for the list of resource files.  When
     * the max size is exceeded, the request will fail and the response error
     * code will be RequestEntityTooLarge. If this occurs, the collection of
     * ResourceFiles must be reduced in size. This can be achieved using .zip
     * files, Application Packages, or Docker Containers.
     */
    @JsonProperty(value = "resourceFiles")
    private List<ResourceFile> resourceFiles;

    /**
     * A list of files that the Batch service will upload from the Compute Node
     * after running the command line.
     * For multi-instance Tasks, the files will only be uploaded from the
     * Compute Node on which the primary Task is executed.
     */
    @JsonProperty(value = "outputFiles")
    private List<OutputFile> outputFiles;

    /**
     * A list of environment variable settings for the Job Manager Task.
     */
    @JsonProperty(value = "environmentSettings")
    private List<EnvironmentSetting> environmentSettings;

    /**
     * Constraints that apply to the Job Manager Task.
     */
    @JsonProperty(value = "constraints")
    private TaskConstraints constraints;

    /**
     * Whether completion of the Job Manager Task signifies completion of the
     * entire Job.
     * If true, when the Job Manager Task completes, the Batch service marks
     * the Job as complete. If any Tasks are still running at this time (other
     * than Job Release), those Tasks are terminated. If false, the completion
     * of the Job Manager Task does not affect the Job status. In this case,
     * you should either use the onAllTasksComplete attribute to terminate the
     * Job, or have a client or user terminate the Job explicitly. An example
     * of this is if the Job Manager creates a set of Tasks but then takes no
     * further role in their execution. The default value is true. If you are
     * using the onAllTasksComplete and onTaskFailure attributes to control Job
     * lifetime, and using the Job Manager Task only to create the Tasks for
     * the Job (not to monitor progress), then it is important to set
     * killJobOnCompletion to false.
     */
    @JsonProperty(value = "killJobOnCompletion")
    private Boolean killJobOnCompletion;

    /**
     * The user identity under which the Job Manager Task runs.
     * If omitted, the Task runs as a non-administrative user unique to the
     * Task.
     */
    @JsonProperty(value = "userIdentity")
    private UserIdentity userIdentity;

    /**
     * Whether the Job Manager Task requires exclusive use of the Compute Node
     * where it runs.
     * If true, no other Tasks will run on the same Node for as long as the Job
     * Manager is running. If false, other Tasks can run simultaneously with
     * the Job Manager on a Compute Node. The Job Manager Task counts normally
     * against the Compute Node's concurrent Task limit, so this is only
     * relevant if the Compute Node allows multiple concurrent Tasks. The
     * default value is true.
     */
    @JsonProperty(value = "runExclusive")
    private Boolean runExclusive;

    /**
     * A list of Application Packages that the Batch service will deploy to the
     * Compute Compute Node before running the command line.
     * Application Packages are downloaded and deployed to a shared directory,
     * not the Task working directory. Therefore, if a referenced Application
     * Package is already on the Compute Node, and is up to date, then it is
     * not re-downloaded; the existing copy on the Compute Compute Node is
     * used. If a referenced Application Package cannot be installed, for
     * example because the package has been deleted or because download failed,
     * the Task fails.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The settings for an authentication token that the Task can use to
     * perform Batch service operations.
     * If this property is set, the Batch service provides the Task with an
     * authentication token which can be used to authenticate Batch service
     * operations without requiring an Account access key. The token is
     * provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The
     * operations that the Task can carry out using the token depend on the
     * settings. For example, a Task can request Job permissions in order to
     * add other Tasks to the Job, or check the status of the Job or of other
     * Tasks under the Job.
     */
    @JsonProperty(value = "authenticationTokenSettings")
    private AuthenticationTokenSettings authenticationTokenSettings;

    /**
     * Whether the Job Manager Task may run on a low-priority Compute Node.
     * The default value is true.
     */
    @JsonProperty(value = "allowLowPriorityNode")
    private Boolean allowLowPriorityNode;

    /**
     * Get the ID can contain any combination of alphanumeric characters including hyphens and underscores and cannot contain more than 64 characters.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID can contain any combination of alphanumeric characters including hyphens and underscores and cannot contain more than 64 characters.
     *
     * @param id the id value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get it need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set it need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the command line does not run under a shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use a relative path (relative to the Task working directory), or use the Batch provided environment variable (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the command line does not run under a shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use a relative path (relative to the Task working directory), or use the Batch provided environment variable (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @param commandLine the commandLine value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get if the Pool that will run this Task has containerConfiguration set, this must be set as well. If the Pool that will run this Task doesn't have containerConfiguration set, this must not be set. When this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all Task environment variables are mapped into the container, and the Task command line is executed in the container. Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to access those files.
     *
     * @return the containerSettings value
     */
    public TaskContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set if the Pool that will run this Task has containerConfiguration set, this must be set as well. If the Pool that will run this Task doesn't have containerConfiguration set, this must not be set. When this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all Task environment variables are mapped into the container, and the Task command line is executed in the container. Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to access those files.
     *
     * @param containerSettings the containerSettings value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withContainerSettings(TaskContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get files listed under this element are located in the Task's working directory. There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @return the resourceFiles value
     */
    public List<ResourceFile> resourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set files listed under this element are located in the Task's working directory. There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @param resourceFiles the resourceFiles value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get for multi-instance Tasks, the files will only be uploaded from the Compute Node on which the primary Task is executed.
     *
     * @return the outputFiles value
     */
    public List<OutputFile> outputFiles() {
        return this.outputFiles;
    }

    /**
     * Set for multi-instance Tasks, the files will only be uploaded from the Compute Node on which the primary Task is executed.
     *
     * @param outputFiles the outputFiles value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withOutputFiles(List<OutputFile> outputFiles) {
        this.outputFiles = outputFiles;
        return this;
    }

    /**
     * Get the environmentSettings value.
     *
     * @return the environmentSettings value
     */
    public List<EnvironmentSetting> environmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings value.
     *
     * @param environmentSettings the environmentSettings value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public TaskConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withConstraints(TaskConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get if true, when the Job Manager Task completes, the Batch service marks the Job as complete. If any Tasks are still running at this time (other than Job Release), those Tasks are terminated. If false, the completion of the Job Manager Task does not affect the Job status. In this case, you should either use the onAllTasksComplete attribute to terminate the Job, or have a client or user terminate the Job explicitly. An example of this is if the Job Manager creates a set of Tasks but then takes no further role in their execution. The default value is true. If you are using the onAllTasksComplete and onTaskFailure attributes to control Job lifetime, and using the Job Manager Task only to create the Tasks for the Job (not to monitor progress), then it is important to set killJobOnCompletion to false.
     *
     * @return the killJobOnCompletion value
     */
    public Boolean killJobOnCompletion() {
        return this.killJobOnCompletion;
    }

    /**
     * Set if true, when the Job Manager Task completes, the Batch service marks the Job as complete. If any Tasks are still running at this time (other than Job Release), those Tasks are terminated. If false, the completion of the Job Manager Task does not affect the Job status. In this case, you should either use the onAllTasksComplete attribute to terminate the Job, or have a client or user terminate the Job explicitly. An example of this is if the Job Manager creates a set of Tasks but then takes no further role in their execution. The default value is true. If you are using the onAllTasksComplete and onTaskFailure attributes to control Job lifetime, and using the Job Manager Task only to create the Tasks for the Job (not to monitor progress), then it is important to set killJobOnCompletion to false.
     *
     * @param killJobOnCompletion the killJobOnCompletion value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withKillJobOnCompletion(Boolean killJobOnCompletion) {
        this.killJobOnCompletion = killJobOnCompletion;
        return this;
    }

    /**
     * Get if omitted, the Task runs as a non-administrative user unique to the Task.
     *
     * @return the userIdentity value
     */
    public UserIdentity userIdentity() {
        return this.userIdentity;
    }

    /**
     * Set if omitted, the Task runs as a non-administrative user unique to the Task.
     *
     * @param userIdentity the userIdentity value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    /**
     * Get if true, no other Tasks will run on the same Node for as long as the Job Manager is running. If false, other Tasks can run simultaneously with the Job Manager on a Compute Node. The Job Manager Task counts normally against the Compute Node's concurrent Task limit, so this is only relevant if the Compute Node allows multiple concurrent Tasks. The default value is true.
     *
     * @return the runExclusive value
     */
    public Boolean runExclusive() {
        return this.runExclusive;
    }

    /**
     * Set if true, no other Tasks will run on the same Node for as long as the Job Manager is running. If false, other Tasks can run simultaneously with the Job Manager on a Compute Node. The Job Manager Task counts normally against the Compute Node's concurrent Task limit, so this is only relevant if the Compute Node allows multiple concurrent Tasks. The default value is true.
     *
     * @param runExclusive the runExclusive value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withRunExclusive(Boolean runExclusive) {
        this.runExclusive = runExclusive;
        return this;
    }

    /**
     * Get application Packages are downloaded and deployed to a shared directory, not the Task working directory. Therefore, if a referenced Application Package is already on the Compute Node, and is up to date, then it is not re-downloaded; the existing copy on the Compute Compute Node is used. If a referenced Application Package cannot be installed, for example because the package has been deleted or because download failed, the Task fails.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set application Packages are downloaded and deployed to a shared directory, not the Task working directory. Therefore, if a referenced Application Package is already on the Compute Node, and is up to date, then it is not re-downloaded; the existing copy on the Compute Compute Node is used. If a referenced Application Package cannot be installed, for example because the package has been deleted or because download failed, the Task fails.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get if this property is set, the Batch service provides the Task with an authentication token which can be used to authenticate Batch service operations without requiring an Account access key. The token is provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The operations that the Task can carry out using the token depend on the settings. For example, a Task can request Job permissions in order to add other Tasks to the Job, or check the status of the Job or of other Tasks under the Job.
     *
     * @return the authenticationTokenSettings value
     */
    public AuthenticationTokenSettings authenticationTokenSettings() {
        return this.authenticationTokenSettings;
    }

    /**
     * Set if this property is set, the Batch service provides the Task with an authentication token which can be used to authenticate Batch service operations without requiring an Account access key. The token is provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The operations that the Task can carry out using the token depend on the settings. For example, a Task can request Job permissions in order to add other Tasks to the Job, or check the status of the Job or of other Tasks under the Job.
     *
     * @param authenticationTokenSettings the authenticationTokenSettings value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withAuthenticationTokenSettings(AuthenticationTokenSettings authenticationTokenSettings) {
        this.authenticationTokenSettings = authenticationTokenSettings;
        return this;
    }

    /**
     * Get the default value is true.
     *
     * @return the allowLowPriorityNode value
     */
    public Boolean allowLowPriorityNode() {
        return this.allowLowPriorityNode;
    }

    /**
     * Set the default value is true.
     *
     * @param allowLowPriorityNode the allowLowPriorityNode value to set
     * @return the JobManagerTask object itself.
     */
    public JobManagerTask withAllowLowPriorityNode(Boolean allowLowPriorityNode) {
        this.allowLowPriorityNode = allowLowPriorityNode;
        return this;
    }

}
