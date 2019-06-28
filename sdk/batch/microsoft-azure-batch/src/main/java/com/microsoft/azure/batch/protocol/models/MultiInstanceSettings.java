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
 * Settings which specify how to run a multi-instance Task.
 * Multi-instance Tasks are commonly used to support MPI Tasks. In the MPI
 * case, if any of the subtasks fail (for example due to exiting with a
 * non-zero exit code) the entire multi-instance Task fails. The multi-instance
 * Task is then terminated and retried, up to its retry limit.
 */
public class MultiInstanceSettings {
    /**
     * The number of Compute Nodes required by the Task.
     * If omitted, the default is 1.
     */
    @JsonProperty(value = "numberOfInstances")
    private Integer numberOfInstances;

    /**
     * The command line to run on all the Compute Nodes to enable them to
     * coordinate when the primary runs the main Task command.
     * A typical coordination command line launches a background service and
     * verifies that the service is ready to process inter-node messages.
     */
    @JsonProperty(value = "coordinationCommandLine", required = true)
    private String coordinationCommandLine;

    /**
     * A list of files that the Batch service will download before running the
     * coordination command line.
     * The difference between common resource files and Task resource files is
     * that common resource files are downloaded for all subtasks including the
     * primary, whereas Task resource files are downloaded only for the
     * primary. Also note that these resource files are not downloaded to the
     * Task working directory, but instead are downloaded to the Task root
     * directory (one directory above the working directory).  There is a
     * maximum size for the list of resource files.  When the max size is
     * exceeded, the request will fail and the response error code will be
     * RequestEntityTooLarge. If this occurs, the collection of ResourceFiles
     * must be reduced in size. This can be achieved using .zip files,
     * Application Packages, or Docker Containers.
     */
    @JsonProperty(value = "commonResourceFiles")
    private List<ResourceFile> commonResourceFiles;

    /**
     * Get if omitted, the default is 1.
     *
     * @return the numberOfInstances value
     */
    public Integer numberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * Set if omitted, the default is 1.
     *
     * @param numberOfInstances the numberOfInstances value to set
     * @return the MultiInstanceSettings object itself.
     */
    public MultiInstanceSettings withNumberOfInstances(Integer numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
        return this;
    }

    /**
     * Get a typical coordination command line launches a background service and verifies that the service is ready to process inter-node messages.
     *
     * @return the coordinationCommandLine value
     */
    public String coordinationCommandLine() {
        return this.coordinationCommandLine;
    }

    /**
     * Set a typical coordination command line launches a background service and verifies that the service is ready to process inter-node messages.
     *
     * @param coordinationCommandLine the coordinationCommandLine value to set
     * @return the MultiInstanceSettings object itself.
     */
    public MultiInstanceSettings withCoordinationCommandLine(String coordinationCommandLine) {
        this.coordinationCommandLine = coordinationCommandLine;
        return this;
    }

    /**
     * Get the difference between common resource files and Task resource files is that common resource files are downloaded for all subtasks including the primary, whereas Task resource files are downloaded only for the primary. Also note that these resource files are not downloaded to the Task working directory, but instead are downloaded to the Task root directory (one directory above the working directory).  There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @return the commonResourceFiles value
     */
    public List<ResourceFile> commonResourceFiles() {
        return this.commonResourceFiles;
    }

    /**
     * Set the difference between common resource files and Task resource files is that common resource files are downloaded for all subtasks including the primary, whereas Task resource files are downloaded only for the primary. Also note that these resource files are not downloaded to the Task working directory, but instead are downloaded to the Task root directory (one directory above the working directory).  There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @param commonResourceFiles the commonResourceFiles value to set
     * @return the MultiInstanceSettings object itself.
     */
    public MultiInstanceSettings withCommonResourceFiles(List<ResourceFile> commonResourceFiles) {
        this.commonResourceFiles = commonResourceFiles;
        return this;
    }

}
