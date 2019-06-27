/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A specification for uploading files from an Azure Batch Compute Node to
 * another location after the Batch service has finished executing the Task
 * process.
 */
public class OutputFile {
    /**
     * A pattern indicating which file(s) to upload.
     * Both relative and absolute paths are supported. Relative paths are
     * relative to the Task working directory. The following wildcards are
     * supported: * matches 0 or more characters (for example pattern abc*
     * would match abc or abcdef), ** matches any directory, ? matches any
     * single character, [abc] matches one character in the brackets, and [a-c]
     * matches one character in the range. Brackets can include a negation to
     * match any character not specified (for example [!abc] matches any
     * character but a, b, or c). If a file name starts with "." it is ignored
     * by default but may be matched by specifying it explicitly (for example
     * *.gif will not match .a.gif, but .*.gif will). A simple example:
     * **\*.txt matches any file that does not start in '.' and ends with .txt
     * in the Task working directory or any subdirectory. If the filename
     * contains a wildcard character it can be escaped using brackets (for
     * example abc[*] would match a file named abc*). Note that both \ and /
     * are treated as directory separators on Windows, but only / is on Linux.
     * Environment variables (%var% on Windows or $var on Linux) are expanded
     * prior to the pattern being applied.
     */
    @JsonProperty(value = "filePattern", required = true)
    private String filePattern;

    /**
     * The destination for the output file(s).
     */
    @JsonProperty(value = "destination", required = true)
    private OutputFileDestination destination;

    /**
     * Additional options for the upload operation, including under what
     * conditions to perform the upload.
     */
    @JsonProperty(value = "uploadOptions", required = true)
    private OutputFileUploadOptions uploadOptions;

    /**
     * Get both relative and absolute paths are supported. Relative paths are relative to the Task working directory. The following wildcards are supported: * matches 0 or more characters (for example pattern abc* would match abc or abcdef), ** matches any directory, ? matches any single character, [abc] matches one character in the brackets, and [a-c] matches one character in the range. Brackets can include a negation to match any character not specified (for example [!abc] matches any character but a, b, or c). If a file name starts with "." it is ignored by default but may be matched by specifying it explicitly (for example *.gif will not match .a.gif, but .*.gif will). A simple example: **\*.txt matches any file that does not start in '.' and ends with .txt in the Task working directory or any subdirectory. If the filename contains a wildcard character it can be escaped using brackets (for example abc[*] would match a file named abc*). Note that both \ and / are treated as directory separators on Windows, but only / is on Linux. Environment variables (%var% on Windows or $var on Linux) are expanded prior to the pattern being applied.
     *
     * @return the filePattern value
     */
    public String filePattern() {
        return this.filePattern;
    }

    /**
     * Set both relative and absolute paths are supported. Relative paths are relative to the Task working directory. The following wildcards are supported: * matches 0 or more characters (for example pattern abc* would match abc or abcdef), ** matches any directory, ? matches any single character, [abc] matches one character in the brackets, and [a-c] matches one character in the range. Brackets can include a negation to match any character not specified (for example [!abc] matches any character but a, b, or c). If a file name starts with "." it is ignored by default but may be matched by specifying it explicitly (for example *.gif will not match .a.gif, but .*.gif will). A simple example: **\*.txt matches any file that does not start in '.' and ends with .txt in the Task working directory or any subdirectory. If the filename contains a wildcard character it can be escaped using brackets (for example abc[*] would match a file named abc*). Note that both \ and / are treated as directory separators on Windows, but only / is on Linux. Environment variables (%var% on Windows or $var on Linux) are expanded prior to the pattern being applied.
     *
     * @param filePattern the filePattern value to set
     * @return the OutputFile object itself.
     */
    public OutputFile withFilePattern(String filePattern) {
        this.filePattern = filePattern;
        return this;
    }

    /**
     * Get the destination value.
     *
     * @return the destination value
     */
    public OutputFileDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination value.
     *
     * @param destination the destination value to set
     * @return the OutputFile object itself.
     */
    public OutputFile withDestination(OutputFileDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the uploadOptions value.
     *
     * @return the uploadOptions value
     */
    public OutputFileUploadOptions uploadOptions() {
        return this.uploadOptions;
    }

    /**
     * Set the uploadOptions value.
     *
     * @param uploadOptions the uploadOptions value to set
     * @return the OutputFile object itself.
     */
    public OutputFile withUploadOptions(OutputFileUploadOptions uploadOptions) {
        this.uploadOptions = uploadOptions;
        return this;
    }

}
