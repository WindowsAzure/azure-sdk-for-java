/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * HDInsight streaming activity type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightStreaming")
@JsonFlatten
public class HDInsightStreamingActivity extends ExecutionActivity {
    /**
     * Storage linked service references.
     */
    @JsonProperty(value = "typeProperties.storageLinkedServices")
    private List<LinkedServiceReference> storageLinkedServices;

    /**
     * User specified arguments to HDInsightActivity.
     */
    @JsonProperty(value = "typeProperties.arguments")
    private List<Object> arguments;

    /**
     * Debug info option. Possible values include: 'None', 'Always', 'Failure'.
     */
    @JsonProperty(value = "typeProperties.getDebugInfo")
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /**
     * Mapper executable name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.mapper", required = true)
    private Object mapper;

    /**
     * Reducer executable name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.reducer", required = true)
    private Object reducer;

    /**
     * Input blob path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.input", required = true)
    private Object input;

    /**
     * Output blob path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.output", required = true)
    private Object output;

    /**
     * Paths to streaming job files. Can be directories.
     */
    @JsonProperty(value = "typeProperties.filePaths", required = true)
    private List<Object> filePaths;

    /**
     * Linked service reference where the files are located.
     */
    @JsonProperty(value = "typeProperties.fileLinkedService")
    private LinkedServiceReference fileLinkedService;

    /**
     * Combiner executable name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.combiner")
    private Object combiner;

    /**
     * Command line environment values.
     */
    @JsonProperty(value = "typeProperties.commandEnvironment")
    private List<Object> commandEnvironment;

    /**
     * Allows user to specify defines for streaming job request.
     */
    @JsonProperty(value = "typeProperties.defines")
    private Map<String, Object> defines;

    /**
     * Get storage linked service references.
     *
     * @return the storageLinkedServices value
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.storageLinkedServices;
    }

    /**
     * Set storage linked service references.
     *
     * @param storageLinkedServices the storageLinkedServices value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        this.storageLinkedServices = storageLinkedServices;
        return this;
    }

    /**
     * Get user specified arguments to HDInsightActivity.
     *
     * @return the arguments value
     */
    public List<Object> arguments() {
        return this.arguments;
    }

    /**
     * Set user specified arguments to HDInsightActivity.
     *
     * @param arguments the arguments value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withArguments(List<Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @return the getDebugInfo value
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @param getDebugInfo the getDebugInfo value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get mapper executable name. Type: string (or Expression with resultType string).
     *
     * @return the mapper value
     */
    public Object mapper() {
        return this.mapper;
    }

    /**
     * Set mapper executable name. Type: string (or Expression with resultType string).
     *
     * @param mapper the mapper value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withMapper(Object mapper) {
        this.mapper = mapper;
        return this;
    }

    /**
     * Get reducer executable name. Type: string (or Expression with resultType string).
     *
     * @return the reducer value
     */
    public Object reducer() {
        return this.reducer;
    }

    /**
     * Set reducer executable name. Type: string (or Expression with resultType string).
     *
     * @param reducer the reducer value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withReducer(Object reducer) {
        this.reducer = reducer;
        return this;
    }

    /**
     * Get input blob path. Type: string (or Expression with resultType string).
     *
     * @return the input value
     */
    public Object input() {
        return this.input;
    }

    /**
     * Set input blob path. Type: string (or Expression with resultType string).
     *
     * @param input the input value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * Get output blob path. Type: string (or Expression with resultType string).
     *
     * @return the output value
     */
    public Object output() {
        return this.output;
    }

    /**
     * Set output blob path. Type: string (or Expression with resultType string).
     *
     * @param output the output value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * Get paths to streaming job files. Can be directories.
     *
     * @return the filePaths value
     */
    public List<Object> filePaths() {
        return this.filePaths;
    }

    /**
     * Set paths to streaming job files. Can be directories.
     *
     * @param filePaths the filePaths value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withFilePaths(List<Object> filePaths) {
        this.filePaths = filePaths;
        return this;
    }

    /**
     * Get linked service reference where the files are located.
     *
     * @return the fileLinkedService value
     */
    public LinkedServiceReference fileLinkedService() {
        return this.fileLinkedService;
    }

    /**
     * Set linked service reference where the files are located.
     *
     * @param fileLinkedService the fileLinkedService value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withFileLinkedService(LinkedServiceReference fileLinkedService) {
        this.fileLinkedService = fileLinkedService;
        return this;
    }

    /**
     * Get combiner executable name. Type: string (or Expression with resultType string).
     *
     * @return the combiner value
     */
    public Object combiner() {
        return this.combiner;
    }

    /**
     * Set combiner executable name. Type: string (or Expression with resultType string).
     *
     * @param combiner the combiner value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withCombiner(Object combiner) {
        this.combiner = combiner;
        return this;
    }

    /**
     * Get command line environment values.
     *
     * @return the commandEnvironment value
     */
    public List<Object> commandEnvironment() {
        return this.commandEnvironment;
    }

    /**
     * Set command line environment values.
     *
     * @param commandEnvironment the commandEnvironment value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withCommandEnvironment(List<Object> commandEnvironment) {
        this.commandEnvironment = commandEnvironment;
        return this;
    }

    /**
     * Get allows user to specify defines for streaming job request.
     *
     * @return the defines value
     */
    public Map<String, Object> defines() {
        return this.defines;
    }

    /**
     * Set allows user to specify defines for streaming job request.
     *
     * @param defines the defines value to set
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withDefines(Map<String, Object> defines) {
        this.defines = defines;
        return this;
    }

}
