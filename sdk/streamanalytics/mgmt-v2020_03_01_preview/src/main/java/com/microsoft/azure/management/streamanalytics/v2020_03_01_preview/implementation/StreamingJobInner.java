/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.StreamingJobSku;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.JobType;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.OutputStartMode;
import org.joda.time.DateTime;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.EventsOutOfOrderPolicy;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.OutputErrorPolicy;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.CompatibilityLevel;
import java.util.List;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.JobStorageAccount;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ContentStoragePolicy;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.External;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ClusterInfo;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Identity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A streaming job object, containing all information associated with the named
 * streaming job.
 */
@JsonFlatten
@SkipParentValidation
public class StreamingJobInner extends Resource {
    /**
     * Describes the SKU of the streaming job. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sku")
    private StreamingJobSku sku;

    /**
     * A GUID uniquely identifying the streaming job. This GUID is generated
     * upon creation of the streaming job.
     */
    @JsonProperty(value = "properties.jobId", access = JsonProperty.Access.WRITE_ONLY)
    private String jobId;

    /**
     * Describes the provisioning status of the streaming job.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Describes the state of the streaming job.
     */
    @JsonProperty(value = "properties.jobState", access = JsonProperty.Access.WRITE_ONLY)
    private String jobState;

    /**
     * Describes the type of the job. Valid modes are `Cloud` and 'Edge'.
     * Possible values include: 'Cloud', 'Edge'.
     */
    @JsonProperty(value = "properties.jobType")
    private JobType jobType;

    /**
     * This property should only be utilized when it is desired that the job be
     * started immediately upon creation. Value may be JobStartTime,
     * CustomTime, or LastOutputEventTime to indicate whether the starting
     * point of the output event stream should start whenever the job is
     * started, start at a custom user time stamp specified via the
     * outputStartTime property, or start from the last event output time.
     * Possible values include: 'JobStartTime', 'CustomTime',
     * 'LastOutputEventTime'.
     */
    @JsonProperty(value = "properties.outputStartMode")
    private OutputStartMode outputStartMode;

    /**
     * Value is either an ISO-8601 formatted time stamp that indicates the
     * starting point of the output event stream, or null to indicate that the
     * output event stream will start whenever the streaming job is started.
     * This property must have a value if outputStartMode is set to CustomTime.
     */
    @JsonProperty(value = "properties.outputStartTime")
    private DateTime outputStartTime;

    /**
     * Value is either an ISO-8601 formatted timestamp indicating the last
     * output event time of the streaming job or null indicating that output
     * has not yet been produced. In case of multiple outputs or multiple
     * streams, this shows the latest value in that set.
     */
    @JsonProperty(value = "properties.lastOutputEventTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastOutputEventTime;

    /**
     * Indicates the policy to apply to events that arrive out of order in the
     * input event stream. Possible values include: 'Adjust', 'Drop'.
     */
    @JsonProperty(value = "properties.eventsOutOfOrderPolicy")
    private EventsOutOfOrderPolicy eventsOutOfOrderPolicy;

    /**
     * Indicates the policy to apply to events that arrive at the output and
     * cannot be written to the external storage due to being malformed
     * (missing column values, column values of wrong type or size). Possible
     * values include: 'Stop', 'Drop'.
     */
    @JsonProperty(value = "properties.outputErrorPolicy")
    private OutputErrorPolicy outputErrorPolicy;

    /**
     * The maximum tolerable delay in seconds where out-of-order events can be
     * adjusted to be back in order.
     */
    @JsonProperty(value = "properties.eventsOutOfOrderMaxDelayInSeconds")
    private Integer eventsOutOfOrderMaxDelayInSeconds;

    /**
     * The maximum tolerable delay in seconds where events arriving late could
     * be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1
     * is used to specify wait indefinitely. If the property is absent, it is
     * interpreted to have a value of -1.
     */
    @JsonProperty(value = "properties.eventsLateArrivalMaxDelayInSeconds")
    private Integer eventsLateArrivalMaxDelayInSeconds;

    /**
     * The data locale of the stream analytics job. Value should be the name of
     * a supported .NET Culture from the set
     * https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx.
     * Defaults to 'en-US' if none specified.
     */
    @JsonProperty(value = "properties.dataLocale")
    private String dataLocale;

    /**
     * Controls certain runtime behaviors of the streaming job. Possible values
     * include: '1.0'.
     */
    @JsonProperty(value = "properties.compatibilityLevel")
    private CompatibilityLevel compatibilityLevel;

    /**
     * Value is an ISO-8601 formatted UTC timestamp indicating when the
     * streaming job was created.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * A list of one or more inputs to the streaming job. The name property for
     * each input is required when specifying this property in a PUT request.
     * This property cannot be modify via a PATCH operation. You must use the
     * PATCH API available for the individual input.
     */
    @JsonProperty(value = "properties.inputs")
    private List<InputInner> inputs;

    /**
     * Indicates the query and the number of streaming units to use for the
     * streaming job. The name property of the transformation is required when
     * specifying this property in a PUT request. This property cannot be
     * modify via a PATCH operation. You must use the PATCH API available for
     * the individual transformation.
     */
    @JsonProperty(value = "properties.transformation")
    private TransformationInner transformation;

    /**
     * A list of one or more outputs for the streaming job. The name property
     * for each output is required when specifying this property in a PUT
     * request. This property cannot be modify via a PATCH operation. You must
     * use the PATCH API available for the individual output.
     */
    @JsonProperty(value = "properties.outputs")
    private List<OutputInner> outputs;

    /**
     * A list of one or more functions for the streaming job. The name property
     * for each function is required when specifying this property in a PUT
     * request. This property cannot be modify via a PATCH operation. You must
     * use the PATCH API available for the individual transformation.
     */
    @JsonProperty(value = "properties.functions")
    private List<FunctionInner> functions;

    /**
     * The current entity tag for the streaming job. This is an opaque string.
     * You can use it to detect whether the resource has changed between
     * requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     */
    @JsonProperty(value = "properties.etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * The jobStorageAccount property.
     */
    @JsonProperty(value = "properties.jobStorageAccount")
    private JobStorageAccount jobStorageAccount;

    /**
     * Valid values are JobStorageAccount and SystemAccount. If set to
     * JobStorageAccount, this requires the user to also specify
     * jobStorageAccount property. Possible values include: 'SystemAccount',
     * 'JobStorageAccount'.
     */
    @JsonProperty(value = "properties.contentStoragePolicy")
    private ContentStoragePolicy contentStoragePolicy;

    /**
     * The storage account where the custom code artifacts are located.
     */
    @JsonProperty(value = "properties.externals")
    private External externals;

    /**
     * The cluster which streaming jobs will run on.
     */
    @JsonProperty(value = "properties.cluster")
    private ClusterInfo cluster;

    /**
     * Describes the system-assigned managed identity assigned to this job that
     * can be used to authenticate with inputs and outputs.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sku value
     */
    public StreamingJobSku sku() {
        return this.sku;
    }

    /**
     * Set describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     *
     * @param sku the sku value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withSku(StreamingJobSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get a GUID uniquely identifying the streaming job. This GUID is generated upon creation of the streaming job.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Get describes the provisioning status of the streaming job.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get describes the state of the streaming job.
     *
     * @return the jobState value
     */
    public String jobState() {
        return this.jobState;
    }

    /**
     * Get describes the type of the job. Valid modes are `Cloud` and 'Edge'. Possible values include: 'Cloud', 'Edge'.
     *
     * @return the jobType value
     */
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Set describes the type of the job. Valid modes are `Cloud` and 'Edge'. Possible values include: 'Cloud', 'Edge'.
     *
     * @param jobType the jobType value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withJobType(JobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get this property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time. Possible values include: 'JobStartTime', 'CustomTime', 'LastOutputEventTime'.
     *
     * @return the outputStartMode value
     */
    public OutputStartMode outputStartMode() {
        return this.outputStartMode;
    }

    /**
     * Set this property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time. Possible values include: 'JobStartTime', 'CustomTime', 'LastOutputEventTime'.
     *
     * @param outputStartMode the outputStartMode value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputStartMode(OutputStartMode outputStartMode) {
        this.outputStartMode = outputStartMode;
        return this;
    }

    /**
     * Get value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     *
     * @return the outputStartTime value
     */
    public DateTime outputStartTime() {
        return this.outputStartTime;
    }

    /**
     * Set value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     *
     * @param outputStartTime the outputStartTime value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputStartTime(DateTime outputStartTime) {
        this.outputStartTime = outputStartTime;
        return this;
    }

    /**
     * Get value is either an ISO-8601 formatted timestamp indicating the last output event time of the streaming job or null indicating that output has not yet been produced. In case of multiple outputs or multiple streams, this shows the latest value in that set.
     *
     * @return the lastOutputEventTime value
     */
    public DateTime lastOutputEventTime() {
        return this.lastOutputEventTime;
    }

    /**
     * Get indicates the policy to apply to events that arrive out of order in the input event stream. Possible values include: 'Adjust', 'Drop'.
     *
     * @return the eventsOutOfOrderPolicy value
     */
    public EventsOutOfOrderPolicy eventsOutOfOrderPolicy() {
        return this.eventsOutOfOrderPolicy;
    }

    /**
     * Set indicates the policy to apply to events that arrive out of order in the input event stream. Possible values include: 'Adjust', 'Drop'.
     *
     * @param eventsOutOfOrderPolicy the eventsOutOfOrderPolicy value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withEventsOutOfOrderPolicy(EventsOutOfOrderPolicy eventsOutOfOrderPolicy) {
        this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
        return this;
    }

    /**
     * Get indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size). Possible values include: 'Stop', 'Drop'.
     *
     * @return the outputErrorPolicy value
     */
    public OutputErrorPolicy outputErrorPolicy() {
        return this.outputErrorPolicy;
    }

    /**
     * Set indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size). Possible values include: 'Stop', 'Drop'.
     *
     * @param outputErrorPolicy the outputErrorPolicy value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputErrorPolicy(OutputErrorPolicy outputErrorPolicy) {
        this.outputErrorPolicy = outputErrorPolicy;
        return this;
    }

    /**
     * Get the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     *
     * @return the eventsOutOfOrderMaxDelayInSeconds value
     */
    public Integer eventsOutOfOrderMaxDelayInSeconds() {
        return this.eventsOutOfOrderMaxDelayInSeconds;
    }

    /**
     * Set the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     *
     * @param eventsOutOfOrderMaxDelayInSeconds the eventsOutOfOrderMaxDelayInSeconds value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withEventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds) {
        this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
        return this;
    }

    /**
     * Get the maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     *
     * @return the eventsLateArrivalMaxDelayInSeconds value
     */
    public Integer eventsLateArrivalMaxDelayInSeconds() {
        return this.eventsLateArrivalMaxDelayInSeconds;
    }

    /**
     * Set the maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     *
     * @param eventsLateArrivalMaxDelayInSeconds the eventsLateArrivalMaxDelayInSeconds value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withEventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds) {
        this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
        return this;
    }

    /**
     * Get the data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     *
     * @return the dataLocale value
     */
    public String dataLocale() {
        return this.dataLocale;
    }

    /**
     * Set the data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     *
     * @param dataLocale the dataLocale value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withDataLocale(String dataLocale) {
        this.dataLocale = dataLocale;
        return this;
    }

    /**
     * Get controls certain runtime behaviors of the streaming job. Possible values include: '1.0'.
     *
     * @return the compatibilityLevel value
     */
    public CompatibilityLevel compatibilityLevel() {
        return this.compatibilityLevel;
    }

    /**
     * Set controls certain runtime behaviors of the streaming job. Possible values include: '1.0'.
     *
     * @param compatibilityLevel the compatibilityLevel value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withCompatibilityLevel(CompatibilityLevel compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
        return this;
    }

    /**
     * Get value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was created.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get a list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     *
     * @return the inputs value
     */
    public List<InputInner> inputs() {
        return this.inputs;
    }

    /**
     * Set a list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     *
     * @param inputs the inputs value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withInputs(List<InputInner> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     *
     * @return the transformation value
     */
    public TransformationInner transformation() {
        return this.transformation;
    }

    /**
     * Set indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     *
     * @param transformation the transformation value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withTransformation(TransformationInner transformation) {
        this.transformation = transformation;
        return this;
    }

    /**
     * Get a list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     *
     * @return the outputs value
     */
    public List<OutputInner> outputs() {
        return this.outputs;
    }

    /**
     * Set a list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     *
     * @param outputs the outputs value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputs(List<OutputInner> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get a list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     *
     * @return the functions value
     */
    public List<FunctionInner> functions() {
        return this.functions;
    }

    /**
     * Set a list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     *
     * @param functions the functions value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withFunctions(List<FunctionInner> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the current entity tag for the streaming job. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the jobStorageAccount value.
     *
     * @return the jobStorageAccount value
     */
    public JobStorageAccount jobStorageAccount() {
        return this.jobStorageAccount;
    }

    /**
     * Set the jobStorageAccount value.
     *
     * @param jobStorageAccount the jobStorageAccount value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withJobStorageAccount(JobStorageAccount jobStorageAccount) {
        this.jobStorageAccount = jobStorageAccount;
        return this;
    }

    /**
     * Get valid values are JobStorageAccount and SystemAccount. If set to JobStorageAccount, this requires the user to also specify jobStorageAccount property. Possible values include: 'SystemAccount', 'JobStorageAccount'.
     *
     * @return the contentStoragePolicy value
     */
    public ContentStoragePolicy contentStoragePolicy() {
        return this.contentStoragePolicy;
    }

    /**
     * Set valid values are JobStorageAccount and SystemAccount. If set to JobStorageAccount, this requires the user to also specify jobStorageAccount property. Possible values include: 'SystemAccount', 'JobStorageAccount'.
     *
     * @param contentStoragePolicy the contentStoragePolicy value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withContentStoragePolicy(ContentStoragePolicy contentStoragePolicy) {
        this.contentStoragePolicy = contentStoragePolicy;
        return this;
    }

    /**
     * Get the storage account where the custom code artifacts are located.
     *
     * @return the externals value
     */
    public External externals() {
        return this.externals;
    }

    /**
     * Set the storage account where the custom code artifacts are located.
     *
     * @param externals the externals value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withExternals(External externals) {
        this.externals = externals;
        return this;
    }

    /**
     * Get the cluster which streaming jobs will run on.
     *
     * @return the cluster value
     */
    public ClusterInfo cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster which streaming jobs will run on.
     *
     * @param cluster the cluster value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withCluster(ClusterInfo cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get describes the system-assigned managed identity assigned to this job that can be used to authenticate with inputs and outputs.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set describes the system-assigned managed identity assigned to this job that can be used to authenticate with inputs and outputs.
     *
     * @param identity the identity value to set
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

}
